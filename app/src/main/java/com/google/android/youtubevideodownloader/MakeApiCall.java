package com.google.android.youtubevideodownloader;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URL;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class MakeApiCall {

    private onYoutubeDataListener onYoutubeDataListener;
    public static final MediaType JSON = MediaType.get("application/json");

    public void setOnYoutubeDataListener(onYoutubeDataListener onYoutubeDataListener) {
        this.onYoutubeDataListener = onYoutubeDataListener;
    }

    public void extractLink(String url) {

        String requestBody = "{\n" +
                "    \"context\" : {\n" +
                "        \"client\" : {\n" +
                "     \"clientName\": \"ANDROID_TESTSUITE\",\n" +
                "        \"clientVersion\": \"1.9\",\n" +
                "        \"androidSdkVersion\": 30,\n" +
                "        \"hl\": \"en\",\n" +
                "        \"gl\": \"US\",\n" +
                "        \"utcOffsetMinutes\": 0\n" +
                "        }\n" +
                "    },\n" +
                "    \"videoId\" : \"" + url + "\"\n" +
                "}";

        OkHttpClient client = new OkHttpClient();

        try {
            Request request = new Request.Builder()
                    .url(new URL("https://www.youtube.com/youtubei/v1/player?key=AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w&prettyPrint=false"))
                    .post(RequestBody.create(requestBody, JSON))
                    .build();

            Call response = client.newCall(request);
            response.enqueue(new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    if (response.isSuccessful() && response.body() != null) {
                        onYoutubeDataListener.onYoutubeData(parseData(response.body().string()));
                    } else {
                        Log.d("Hello", "extractLink: " + response.code());
                    }
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public YoutubeDataModel parseData(String data) {
        System.out.println("Data   " + data);
        Gson gson = new Gson();
        return gson.fromJson(data, YoutubeDataModel.class);


    }


}

interface onYoutubeDataListener {
    void onYoutubeData(YoutubeDataModel data);
}
