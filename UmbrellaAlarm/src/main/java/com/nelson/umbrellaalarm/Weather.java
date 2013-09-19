package com.nelson.umbrellaalarm;

import com.nelson.umbrellaalarm.Models.Forecast;
import com.nelson.umbrellaalarm.Models.WeatherLocation;

import java.util.ArrayList;

public class Weather {

    private final WeatherLocation mWeatherLocation;
    private final ArrayList<Forecast> mForecasts;

    public Weather(WeatherLocation weatherLocation, ArrayList<Forecast> forecasts) {
        mWeatherLocation = weatherLocation;
        mForecasts = forecasts;
    }

    public WeatherLocation getWeatherLocation() {
        return mWeatherLocation;
    }

    public ArrayList<Forecast> getForecasts() {
        return mForecasts;
    }
}
