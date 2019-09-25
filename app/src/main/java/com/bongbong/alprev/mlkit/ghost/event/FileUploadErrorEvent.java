package com.bongbong.alprev.mlkit.ghost.event;

import com.bongbong.alprev.mlkit.ghost.network.ApiFailure;

@SuppressWarnings({"WeakerAccess", "unused"})
public class FileUploadErrorEvent {

    public final ApiFailure apiFailure;

    public FileUploadErrorEvent(ApiFailure apiFailure) {
        this.apiFailure = apiFailure;
    }

}
