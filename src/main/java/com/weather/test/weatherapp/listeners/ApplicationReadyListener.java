package com.weather.test.weatherapp.listeners;

import java.util.Arrays;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationReadyListener implements ApplicationListener<ApplicationReadyEvent>{

	@Override
	public void onApplicationEvent(ApplicationReadyEvent arg0) {
		System.out.println("*********************************************************");
		System.out.println("ApplicationReadyEvent is "+Arrays.toString(arg0.getArgs()));
		System.out.println("*********************************************************");
		
	}

	
}
