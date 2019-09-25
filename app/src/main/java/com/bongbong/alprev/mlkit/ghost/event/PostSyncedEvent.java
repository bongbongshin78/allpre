package com.bongbong.alprev.mlkit.ghost.event;

import com.bongbong.alprev.mlkit.ghost.model.entity.Post;

public class PostSyncedEvent {

    public final Post post;

    public PostSyncedEvent(Post post) {
        this.post = post;
    }

}
