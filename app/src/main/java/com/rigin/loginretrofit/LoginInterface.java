package com.rigin.loginretrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginInterface {

    String LOGINURL = "https://masukretrofit71.000webhostapp.com/";
    @FormUrlEncoded
    @POST("simplelogin.php")
    Call<String> getUserLogin(

            @Field("username") String uname,
            @Field("password") String password
    );
}
