package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAApLPsO90:APA91bH8pXe86z7a4c45KjGYTIlwHrNnPQZyJCdw_tGT2ZTiukJ0pp7FyNWcTFjXnXIvHuypwXW_6K2NxuXceORX4m0U990LO3lNIUn7HWmsW6JN7nncBhrEB2xmF-muheBWQTvZz--P"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
