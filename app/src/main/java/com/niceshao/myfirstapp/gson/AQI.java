package com.niceshao.myfirstapp.gson;

/**
 * Created by niceshao on 17-2-23.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
