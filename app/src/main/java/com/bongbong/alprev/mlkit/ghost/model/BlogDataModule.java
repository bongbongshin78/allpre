package com.bongbong.alprev.mlkit.ghost.model;

import io.realm.annotations.RealmModule;
import com.bongbong.alprev.mlkit.ghost.model.entity.AuthToken;
import com.bongbong.alprev.mlkit.ghost.model.entity.ConfigurationParam;
import com.bongbong.alprev.mlkit.ghost.model.entity.ETag;
import com.bongbong.alprev.mlkit.ghost.model.entity.PendingAction;
import com.bongbong.alprev.mlkit.ghost.model.entity.Post;
import com.bongbong.alprev.mlkit.ghost.model.entity.Role;
import com.bongbong.alprev.mlkit.ghost.model.entity.Setting;
import com.bongbong.alprev.mlkit.ghost.model.entity.Tag;
import com.bongbong.alprev.mlkit.ghost.model.entity.User;

// set of classes included in the schema for blog data Realms

@RealmModule(classes = {
        AuthToken.class,
        ConfigurationParam.class,
        ETag.class,
        PendingAction.class,
        Post.class,
        Role.class,
        Setting.class,
        Tag.class,
        User.class
})
public class BlogDataModule {}
