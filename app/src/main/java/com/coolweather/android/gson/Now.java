package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * created by 李大辰
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
