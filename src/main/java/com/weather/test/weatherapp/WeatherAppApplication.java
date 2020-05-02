package com.weather.test.weatherapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.weather.test.weatherapp.listeners.SpringBuiltInEventsListener;

@SpringBootApplication
public class WeatherAppApplication {
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(WeatherAppApplication.class);
		app.addListeners(new SpringBuiltInEventsListener());
		app.run(args);
		
	}

}
