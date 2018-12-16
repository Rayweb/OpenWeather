package com.finleap.weather.service;

import com.finleap.weather.exception.CityNotFoundException;
import com.finleap.weather.owp.dtos.WeatherAverages;

public interface WeatherService {
	public WeatherAverages getWeatherForecastByCity(String city) throws CityNotFoundException;
}
