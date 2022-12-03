package com.WeatherAPI.thoitiet.utils;

import android.content.Context;

import com.WeatherAPI.thoitiet.utils.formatters.WeatherFormatter;

public class Formatting {

    private Context context;

    public Formatting(Context context) {
        this.context = context;
    }

    public String setWeatherIcon(int actualId, boolean day) {
        return WeatherFormatter.getWeatherIconAsText(actualId, day, context);
    }
}
