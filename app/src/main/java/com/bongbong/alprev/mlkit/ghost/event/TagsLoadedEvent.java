package com.bongbong.alprev.mlkit.ghost.event;

import java.util.List;

import com.bongbong.alprev.mlkit.ghost.model.entity.Tag;

public class TagsLoadedEvent {

    public final List<Tag> tags;

    public TagsLoadedEvent(List<Tag> tags) {
        this.tags = tags;
    }

}
