package com.weather.test.weatherapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.weather.test.weatherapp.client.WeatherClient;

@Component
public class WeatherService {
	Logger logger = LoggerFactory.getLogger(WeatherService.class);
	@Autowired
	WeatherClient client;
	@Value( "${weather.profile.name}" )
	private String profileName;
	
	//@Value("${weather.sample.key}")
	//private String weatherKey;
	public Object getWeatherReportForCity(String city) {
		logger.info("************weather.profile.name************"+profileName);
		return client.getWeatherReport(city);
	}

}
