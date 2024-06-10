package com.google.android.youtubevideodownloader.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "VideoInProgressDataModel")
public class VideoInProgressDataModel {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String idPrimaryKey;
    private String videoNameTitle;
    private String quality;
    private String mimeType;
    private boolean isAudio;
    private boolean isVideo;
    private String videoUrl;
    private String currentStatus;
    private String audioUrl;
    private int videoSize;
    private int audioSize;
    private int loadedVideoSize;
    private String audioPath;
    private String videoPath;
    private boolean isAudioCompleted;
    private boolean isVideoCompleted;
    private double percentage;
    private String videoThumbUrl;

    // Getters and Setters

    // Add the getters and setters from the previous code here

}


