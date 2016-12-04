package com.affixus.jauditor.restful;

import android.util.Log;


import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.http.GET;

public class RestApi {
    private static final String TAG = RestApi.class.getName();
    private static final String BASE_RUL = "http://104.155.212.203/";

    public static Retrofit retrofit;
    public static FirstApi firstApi;


    /** Static Initialization **/
    static {
        try{
            retrofit = new Retrofit.Builder().baseUrl(BASE_RUL)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build();

            firstApi = retrofit.create(FirstApi.class);
        } catch(Exception e){
            Log.e(TAG, e.getMessage());
            throw e;
        }
    }


    /** FIRST API SIMU **/
    public interface FirstApi {
        //@GET("pub/home/news")
        //public Call<ResponsePojo> getNews();
    }

}
