package com.hyrc99.projectByL.utils.http;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetWorkUtils {
    private static Retrofit retrofit;
    private static URL url;
    private static URL url2;
    //设置okhttp 对象
    private static final OkHttpClient client = new OkHttpClient.Builder().
            connectTimeout(30, TimeUnit.SECONDS).
            readTimeout(30, TimeUnit.SECONDS).
            writeTimeout(30, TimeUnit.SECONDS).build();

    /**
     * 获取 请求对象
     *HTTPAPI
     * @return Retrofit
     */
    public static URL getNetwork() {
        if (url == null) {
            retrofit = new Retrofit.Builder()
                    .client(client)
                    .baseUrl(URL.HTTPAPI)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            url = retrofit.create(URL.class);
        }
        return url;
    }

    /**
     * 获取 请求对象
     *HTTPAPI2
     * @return Retrofit
     */
    public static URL getNetwork2() {
        if (url2 == null) {
            retrofit = new Retrofit.Builder()
                    .client(client)
                    .baseUrl(URL.HTTPAPI2)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            url2 = retrofit.create(URL.class);
        }
        return url2;
    }
}
