package com.edson.studentcallroll.apidata.network;

import com.edson.studentcallroll.apidata.request.LoginRequest;
import com.edson.studentcallroll.apidata.request.TakeAssistanceRequest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface AuthApi {

    @Headers("Content-Type: application/json")
    @POST("auth/login")
    Call<ResponseBody> userLogin(@Body LoginRequest body);

    @Headers("Content-Type: application/json")
    @POST("auth/api/assistance-sheet/assistance")
    Call<ResponseBody> takeAssistance(@Header("Authorization") String token,
                                      @Body TakeAssistanceRequest body);

}
