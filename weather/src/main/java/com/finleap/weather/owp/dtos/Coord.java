package com.finleap.weather.owp.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coord { 
	public Long lat;
	public Long lon;
}