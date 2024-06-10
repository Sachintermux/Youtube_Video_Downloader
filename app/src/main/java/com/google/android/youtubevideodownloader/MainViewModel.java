package com.google.android.youtubevideodownloader;

import android.os.Handler;
import android.os.Looper;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public MutableLiveData<YoutubeDataModel> youtubeDataModelMutableLiveData = new MutableLiveData<>();

    public void extractLink(String url) {
        String videoID;
        if (url.contains("&")) {

            videoID = url.substring(url.indexOf("=") + 1, url.indexOf("&"));

        } else {

            videoID = url.substring(url.indexOf("=") + 1);

        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                MakeApiCall makeApiCall = new MakeApiCall();
                makeApiCall.extractLink(videoID);
                makeApiCall.setOnYoutubeDataListener(new onYoutubeDataListener() {
                    @Override
                    public void onYoutubeData(YoutubeDataModel data) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            @Override
                            public void run() {
                              youtubeDataModelMutableLiveData.postValue(data);
                            }
                        });
                    }
                });

            }
        }).start();
    }

    public void initVideoData(YoutubeDataModel data) {

    }

}
