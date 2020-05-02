package com.weather.test.weatherapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weather.test.weatherapp.service.WeatherService;

@RestController
public class WeatherAppController {
	Logger logger = LoggerFactory.getLogger(WeatherAppController.class);
	@Autowired
	WeatherService weatherService;
	@GetMapping("/")
	public Object getWeatherForCity() {
		String city="London";
		logger.info("weather app controller for city "+city);
		return weatherService.getWeatherReportForCity(city);
	}
	@GetMapping("/weather")
	public Object getWeatherForCity(@RequestParam ("city") String city) {
		logger.info("weather app controller for city "+city);
		return weatherService.getWeatherReportForCity(city);
	}

}
