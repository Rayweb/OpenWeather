package com.finleap.weather.owp.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
	public Long id;
	public String name;
	public Coord coord;
	public String country;
	public String population;
}
