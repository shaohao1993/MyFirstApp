package com.niceshao.myfirstapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by niceshao on 17-2-23.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
