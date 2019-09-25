package com.bongbong.alprev.mlkit.ghost.event;

import com.bongbong.alprev.mlkit.ghost.model.entity.Post;

public final class PostConflictFoundEvent {

    public final Post localPost;
    public final Post serverPost;

    public PostConflictFoundEvent(Post localPost, Post serverPost) {
        this.localPost = localPost;
        this.serverPost = serverPost;
    }

}
