package com.bongbong.alprev.mlkit.ghost.event;

import com.bongbong.alprev.mlkit.ghost.model.entity.Post;

public class PostReplacedEvent {

    public final Post newPost;

    public PostReplacedEvent(Post newPost) {
        this.newPost = newPost;
    }

}
