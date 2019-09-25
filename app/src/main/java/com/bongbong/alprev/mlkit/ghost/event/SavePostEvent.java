package com.bongbong.alprev.mlkit.ghost.event;

import com.bongbong.alprev.mlkit.ghost.model.entity.Post;

public class SavePostEvent {

    public final Post post;
    public final boolean isAutoSave;    // was this post saved automatically or explicitly?

    public SavePostEvent(Post post, boolean isAutoSave) {
        this.post = post;
        this.isAutoSave = isAutoSave;
    }

}
