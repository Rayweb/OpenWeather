package com.finleap.weather.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.finleap.weather.owp.dtos.WeatherDetails;

@Component
public class WeatherAverageCalculator {
	
	@Autowired
	DateUtil dateUtil;

	public double getDailyAveragetemperature(List<WeatherDetails> weatherDetails) {
		return weatherDetails.stream()
				.filter(wd -> dateUtil.isDateInRange(wd.getDt()))
				.filter(wd -> dateUtil.isDayTimeForecast(wd.getDt()))
				.mapToDouble(wd -> wd.main.getTemp()).summaryStatistics().getAverage();
	}

	public double getNightlyAveragetemperature(List<WeatherDetails> weatherDetails) {
		return weatherDetails.stream()
				.filter(wd -> dateUtil.isDateInRange(wd.getDt()))
				.filter(wd -> !dateUtil.isDayTimeForecast(wd.getDt()))
				.mapToDouble(wd -> wd.main.getTemp()).summaryStatistics().getAverage();
	}

	public double getPressureAverage(List<WeatherDetails> weatherDetails) {
		return weatherDetails.stream()
				.filter(wd -> dateUtil.isDateInRange(wd.getDt()))
				.mapToDouble(wd -> wd.main.getPressure())
				.summaryStatistics().getAverage();
	}

}
