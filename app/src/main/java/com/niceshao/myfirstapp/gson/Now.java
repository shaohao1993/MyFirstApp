package com.niceshao.myfirstapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by niceshao on 17-2-23.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
