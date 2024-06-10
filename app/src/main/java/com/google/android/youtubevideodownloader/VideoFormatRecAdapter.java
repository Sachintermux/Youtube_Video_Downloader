package com.google.android.youtubevideodownloader;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Objects;

public class VideoFormatRecAdapter extends RecyclerView.Adapter<VideoFormatRecAdapter.ViewHolder> {

    private ArrayList<VideoFormatModel> videoFormatModels;
    private OnItemClick onItemClick;

    public VideoFormatRecAdapter(ArrayList<VideoFormatModel> videoFormatModels, OnItemClick onItemClick) {
        this.videoFormatModels = videoFormatModels;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public VideoFormatRecAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.link_rec_layout, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull VideoFormatRecAdapter.ViewHolder holder, int position) {

        VideoFormatModel videoFormatModel = videoFormatModels.get(position);
        holder.sizeTxt.setText(videoFormatModel.getSize());
        if (videoFormatModel.getSize().isEmpty()) {
            new Thread(new Runnable() {
                @SuppressLint("DefaultLocale")
                @Override
                public void run() {
                    try {
                        URL myUrl = new URL(videoFormatModel.getUrl());
                        URLConnection urlConnection = myUrl.openConnection();
                        urlConnection.connect();
                        long file_size = urlConnection.getContentLengthLong();
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            @Override
                            public void run() {
                                videoFormatModels.get(position).setSize(String.format("%.2f MB", file_size / (1024.0 * 1024.0)));
                                holder.sizeTxt.setText(videoFormatModels.get(position).getSize());
                            }
                        });
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        holder.downloadImg.setOnClickListener(v -> onItemClick.onClick(videoFormatModel));

        if (videoFormatModel.getType().contains("Video")) {
            holder.typeImg.setImageResource(R.drawable.youtube);
            holder.title.setText(videoFormatModel.getQuality() + "p");
        } else {
            holder.typeImg.setImageResource(R.drawable.music);
            if (AudioQuality.AUDIO_QUALITY_LOW.name().equalsIgnoreCase(videoFormatModel.getQuality())) {
                holder.title.setText("Audio Low");
            } else if (AudioQuality.AUDIO_QUALITY_MEDIUM.name().equalsIgnoreCase(videoFormatModel.getQuality())) {
                holder.title.setText("Audio Medium");
            } else {
                holder.title.setText("Audio High");
            }
        }

    }

    @Override
    public int getItemCount() {
        return videoFormatModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title, sizeTxt;
        ImageView typeImg, downloadImg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.txt_quality);
            sizeTxt = itemView.findViewById(R.id.txt_size);
            typeImg = itemView.findViewById(R.id.icon_img);
            downloadImg = itemView.findViewById(R.id.btn_download);
        }
    }
}

interface OnItemClick {
    void onClick(Object url);
}