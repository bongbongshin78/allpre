package com.bongbong.alprev.mlkit.ghost.network.entity

import com.bongbong.alprev.mlkit.ghost.model.entity.Post

// dummy wrapper class needed for Retrofit
class PostList(var posts: MutableList<Post>) {

    operator fun contains(id: String): Boolean {
        for (post in posts) {
            if (id == post.id) {
                return true
            }
        }
        return false
    }

    fun remove(idx: Int): Post {
        return posts.removeAt(idx)
    }

}
