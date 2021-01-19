package com.edson.studentcallroll.apidata.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClient {

    private static final String BASE_URL = "http://192.168.43.202:8080/";//http://192.168.43.202:8080/  |   http://localhost:8080/
    private static RetroClient RClientInstance;
    private Retrofit retrofit;

    public RetroClient() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetroClient getInstance() {
        if (RClientInstance == null) {
            RClientInstance = new RetroClient();
        }
        return RClientInstance;
    }

    public AuthApi getApi() {
        return retrofit.create(AuthApi.class);
    }
}
