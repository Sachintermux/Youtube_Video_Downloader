package com.google.android.youtubevideodownloader;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.documentfile.provider.DocumentFile;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.youtubevideodownloader.databinding.ActivityMainBinding;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private SimpleDateFormat simpleDateFormat;
    private MainViewModel viewModel;
    private YoutubeDataModel youtubeDataModel;
    private SharedPreferences sharedPreferences;
    private VideoFormatModel videoFormatModel;


    @SuppressLint({"StaticFieldLeak", "SimpleDateFormat"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        simpleDateFormat = new SimpleDateFormat("HH:mm");
        initViews();
        allClickHandle();
        observers();

    }

    private void initViews() {
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        sharedPreferences = getSharedPreferences(GlobalConstants.MY_PREFERENCE, MODE_PRIVATE);
    }

    private void observers() {
        viewModel.youtubeDataModelMutableLiveData.observe(this, this::initVideoData);
    }

    @SuppressLint("StaticFieldLeak")
    private void allClickHandle() {
        binding.btnExtract.setOnClickListener(v -> {
            String url = binding.edtVideoLing.getText().toString();
            if (url.isEmpty()) {
                Toast.makeText(this, "Please enter video link", Toast.LENGTH_SHORT).show();
                return;
            }
            viewModel.extractLink(url);
        });

    }

    private void initVideoData(YoutubeDataModel data) {
        this.youtubeDataModel = data;
        Glide.with(MainActivity.this).load(data.getVideoDetails().getThumbnail().getThumbnails().get(data.getVideoDetails().getThumbnail().getThumbnails().size() - 1).getUrl()).into(binding.thumbnailImg);
        binding.videoTitle.setText(data.getVideoDetails().getTitle());
        binding.videoLength.setText(simpleDateFormat.format(new Date(Long.parseLong(data.getVideoDetails().getLengthSeconds()))));

        ArrayList<VideoFormatModel> audioWithVideoAr = new ArrayList<>();

        for (YoutubeDataModel.StreamingData.Formats videoFormat : data.getStreamingData().getFormats()) {

            audioWithVideoAr.add(new VideoFormatModel(videoFormat.getHeight().toString(), videoFormat.getUrl(), videoFormat.getMimeType(), "Video/Audio", videoFormat.getWidth().toString()
                    , videoFormat.getHeight().toString(), ""));

        }

        ArrayList<VideoFormatModel> vp9Arr = new ArrayList<>();
        ArrayList<VideoFormatModel> h264Arr = new ArrayList<>();
        ArrayList<VideoFormatModel> av1Arr = new ArrayList<>();
        ArrayList<VideoFormatModel> h265Arr = new ArrayList<>();

        ArrayList<VideoFormatModel> mp4aArr = new ArrayList<>();
        ArrayList<VideoFormatModel> opusArr = new ArrayList<>();


        for (YoutubeDataModel.StreamingData.AdaptiveFormats adaptiveFormats : data.getStreamingData().getAdaptiveFormats()) {

            if (adaptiveFormats.getMimeType().contains("audio")) {
                if (adaptiveFormats.getMimeType().contains("opus")) {
                    if (opusArr.stream().map(VideoFormatModel::getQuality).noneMatch(s -> s.equalsIgnoreCase(adaptiveFormats.getAudioQuality()))) {
                        opusArr.add(new VideoFormatModel(adaptiveFormats.getAudioQuality(), adaptiveFormats.getUrl(), adaptiveFormats.getMimeType(), "Audio", "0", "0", ""));
                    }
                } else {
                    mp4aArr.add(new VideoFormatModel(adaptiveFormats.getAudioQuality(), adaptiveFormats.getUrl(), adaptiveFormats.getMimeType(), "Audio", "0", "0", ""));
                }
            } else {

                if (adaptiveFormats.getMimeType().contains("vp9") || adaptiveFormats.getMimeType().contains("vp09")) {
                    vp9Arr.add(new VideoFormatModel(adaptiveFormats.getHeight().toString(), adaptiveFormats.getUrl(), adaptiveFormats.getMimeType(), "Video", adaptiveFormats.getWidth().toString(), adaptiveFormats.getHeight().toString(), ""));
                } else if (adaptiveFormats.getMimeType().contains("avc1")) {
                    h264Arr.add(new VideoFormatModel(adaptiveFormats.getHeight().toString(), adaptiveFormats.getUrl(), adaptiveFormats.getMimeType(), "Video", adaptiveFormats.getWidth().toString(), adaptiveFormats.getHeight().toString(), ""));
                } else if (adaptiveFormats.getMimeType().contains("av01")) {
                    av1Arr.add(new VideoFormatModel(adaptiveFormats.getHeight().toString(), adaptiveFormats.getUrl(), adaptiveFormats.getMimeType(), "Video", adaptiveFormats.getWidth().toString(), adaptiveFormats.getHeight().toString(), ""));
                } else {
                    h265Arr.add(new VideoFormatModel(adaptiveFormats.getHeight().toString(), adaptiveFormats.getUrl(), adaptiveFormats.getMimeType(), "Video", adaptiveFormats.getWidth().toString(), adaptiveFormats.getHeight().toString(), ""));
                }


            }

        }

        av1Arr.forEach(videoFormatModel -> {
            if (audioWithVideoAr.stream().map(VideoFormatModel::getQuality).noneMatch(s -> s.equalsIgnoreCase(videoFormatModel.getQuality()))) {
                audioWithVideoAr.add(videoFormatModel);
            }
        });

        vp9Arr.forEach(videoFormatModel -> {
            if (audioWithVideoAr.stream().map(VideoFormatModel::getQuality).noneMatch(s -> s.equalsIgnoreCase(videoFormatModel.getQuality()))) {
                audioWithVideoAr.add(videoFormatModel);
            }
        });

        h265Arr.forEach(videoFormatModel -> {
            if (audioWithVideoAr.stream().map(VideoFormatModel::getQuality).noneMatch(s -> s.equalsIgnoreCase(videoFormatModel.getQuality()))) {
                audioWithVideoAr.add(videoFormatModel);
            }
        });

        h264Arr.forEach(videoFormatModel -> {
            if (audioWithVideoAr.stream().map(VideoFormatModel::getQuality).noneMatch(s -> s.equalsIgnoreCase(videoFormatModel.getQuality()))) {
                audioWithVideoAr.add(videoFormatModel);
            }
        });

        audioWithVideoAr.sort(Comparator.comparingInt(o -> Integer.parseInt(o.getQuality())));


        audioWithVideoAr.addAll(opusArr);

        mp4aArr.forEach(videoFormatModel -> {
            if (audioWithVideoAr.stream().map(VideoFormatModel::getQuality).noneMatch(s -> s.equalsIgnoreCase(videoFormatModel.getQuality()))) {
                audioWithVideoAr.add(videoFormatModel);
            }
        });

        initRec(audioWithVideoAr, vp9Arr, h264Arr, av1Arr, h265Arr, mp4aArr, opusArr);
    }


    private void initRec(ArrayList<VideoFormatModel> videoFormatModels, ArrayList<VideoFormatModel> vp9Arr, ArrayList<VideoFormatModel> h264Arr,
                         ArrayList<VideoFormatModel> av1Arr, ArrayList<VideoFormatModel> h265Arr, ArrayList<VideoFormatModel> mp4aArr,
                         ArrayList<VideoFormatModel> opusArr) {
        VideoFormatRecAdapter adapter = new VideoFormatRecAdapter(videoFormatModels, new OnItemClick() {
            @Override
            public void onClick(Object url) {
                videoFormatModel = (VideoFormatModel) url;
                if (!checkFolderAccess()) {
                    askFolderAccess();
                    return;
                }

                String downloadFolderUriString = sharedPreferences.getString(GlobalConstants.DOWNLOAD_FOLDER_URI, "");
                Uri downloadFolderUri = Uri.parse(downloadFolderUriString);
                DocumentFile downloadDir = DocumentFile.fromTreeUri(MainActivity.this, downloadFolderUri);
                if (downloadDir != null && downloadDir.exists() && downloadDir.isDirectory()) {
                    downloadVideo();
                } else {
                    requestDownloadFolderAccess();
                }
            }
        });
        binding.linkRec.setAdapter(adapter);
        binding.linkRec.setLayoutManager(new LinearLayoutManager(this));
    }

    private void askFolderAccess() {
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.R) {

        } else {
            requestDownloadFolderAccess();
        }

    }

    private Boolean checkFolderAccess() {
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.R) {
            return ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED;
        } else {
            return !sharedPreferences.getString(GlobalConstants.DOWNLOAD_FOLDER_URI, "-1").equalsIgnoreCase("-1");
        }
    }


    public void requestDownloadFolderAccess() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Folder Access Required");
        builder.setMessage("Please grant access to the folder.");
        builder.setPositiveButton("Grant Access", (dialog, which) -> {
            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE);
            intent.addFlags(Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION);
            openDocumentTreeLauncher.launch(intent);
        });
        builder.setNegativeButton("Cancel", (dialog, which) -> {
            Toast.makeText(this, "Failed to get folder access", Toast.LENGTH_SHORT).show();
        });
        builder.show();
    }


    private final ActivityResultLauncher<Intent> openDocumentTreeLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == Activity.RESULT_OK && result.getData() != null) {
                    Uri treeUri = result.getData().getData();
                    getContentResolver().takePersistableUriPermission(treeUri,
                            Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString(GlobalConstants.DOWNLOAD_FOLDER_URI, treeUri.toString());
                    editor.apply();
                    downloadVideo();
                } else {
                    Toast.makeText(this, "Failed to get folder access", Toast.LENGTH_SHORT).show();
                }
            }
    );

    public void downloadVideo() {
        String downloadFolderUriString = sharedPreferences.getString(GlobalConstants.DOWNLOAD_FOLDER_URI, "");
        if (!downloadFolderUriString.isEmpty()) {
            Uri downloadFolderUri = Uri.parse(downloadFolderUriString);
            DocumentFile downloadDir = DocumentFile.fromTreeUri(this, downloadFolderUri);
            if (downloadDir != null && downloadDir.exists() && downloadDir.isDirectory()) {
                DocumentFile newFile = downloadDir.createFile("video/mp4", videoFormatModel.getQuality() + ".mp4");
                if (newFile != null) {
                    saveFileFromUrlToUri(videoFormatModel.getUrl(), newFile.getUri());
                }
            } else {
                Toast.makeText(this, "Failed to get download folder1", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Failed to get download folder3", Toast.LENGTH_SHORT).show();
        }
    }

    private void saveFileFromUrlToUri(String videoUrl, Uri uri) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
//                    File file = new File(uri.getPath(), "video46.mp4");
//                    file.mkdir();
                    InputStream inputStream = new BufferedInputStream(new URL(videoUrl).openStream());
                    OutputStream outputStream = getContentResolver().openOutputStream(uri);

                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
//                        System.out.println("Running " + bytesRead);
                    }
                    System.out.println("Running " + "Download Completed");

                    outputStream.close();
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();

    }
}