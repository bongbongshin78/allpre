package com.bongbong.alprev.mlkit.ghost.auth;

import com.bongbong.alprev.mlkit.ghost.network.ApiProvider;
import com.bongbong.alprev.mlkit.ghost.network.ApiProviderFactory;
import okhttp3.OkHttpClient;

class ProductionApiProviderFactory implements ApiProviderFactory {

    private final OkHttpClient mHttpClient;

    public ProductionApiProviderFactory(OkHttpClient httpClient) {
        mHttpClient = httpClient;
    }

    @Override
    public ApiProvider create(String blogUrl) {
        return new ProductionApiProvider(mHttpClient, blogUrl);
    }

}
