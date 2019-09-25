package com.bongbong.alprev.mlkit.ghost.event;

import com.bongbong.alprev.mlkit.ghost.model.entity.Post;

public class PostCreatedEvent {

    public final Post newPost;

    public PostCreatedEvent(Post newPost) {
        this.newPost = newPost;
    }

}
