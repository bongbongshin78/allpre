package com.bongbong.alprev.mlkit.ghost.event;

public class FileUploadedEvent {

    public final String relativeUrl;

    public FileUploadedEvent(String relativeUrl) {
        this.relativeUrl = relativeUrl;
    }

}
