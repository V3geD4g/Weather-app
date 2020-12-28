package com.dong.dongweather.gson;

import com.google.gson.annotations.SerializedName;


    //当天每小时天气预报
    //因为未付费，只有三个小时的数据
public class HourlyForecast {
    //天气状况
    @SerializedName("cond")
    public WeatherRegime weatherRegime;
    public class WeatherRegime {
        public String code;
        public String txt;
    }
    //时间：
    public String date;
    public String tmp;


}
