package com.finleap.weather.owp.dtos;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherDetails {
	public Instant dt;
	public Main main;
	public Weather[] weather;
	public Clouds clouds;
	public Wind wind;
	public Rain rain;
	public Snow snow;
	public Sys sys;
	public String dt_txt;
} 
