package com.finleap.weather.owp.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class WeatherAverages {
	public double dailyAverageTemperature;
	public double nightlyAverageTemperature;
	public double pressureAverage;
}
