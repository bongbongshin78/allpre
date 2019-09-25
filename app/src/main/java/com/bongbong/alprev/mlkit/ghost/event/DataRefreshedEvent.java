package com.bongbong.alprev.mlkit.ghost.event;

import androidx.annotation.Nullable;

import com.bongbong.alprev.mlkit.ghost.network.ApiFailure;

public class DataRefreshedEvent {

    public final ApiFailure apiFailure;

    public DataRefreshedEvent(@Nullable ApiFailure apiFailure) {
        this.apiFailure = apiFailure;
    }

}
