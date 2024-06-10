package com.google.android.youtubevideodownloader;

public class VideoFormatModel {

    private String quality;
    private String url;
    private String format;
    private String type;
    private String width;
    private String height;
    private String size;

    public VideoFormatModel(String quality, String url, String format, String type, String width, String height, String size) {
        this.quality = quality;
        this.url = url;
        this.format = format;
        this.type = type;
        this.width = width;
        this.height = height;
        this.size = size;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
