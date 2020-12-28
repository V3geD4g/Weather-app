package com.dong.dongweather.gson;

import com.google.gson.annotations.SerializedName;



public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public class update {
        //本地时间
        public String loc;
    }

}
