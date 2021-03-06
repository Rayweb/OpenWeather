package com.finleap.weather.owp.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherForecast {
	public String cod;
	public String message;
	public Long cnt;
	public List<WeatherDetails> list;
	public City city;
}

