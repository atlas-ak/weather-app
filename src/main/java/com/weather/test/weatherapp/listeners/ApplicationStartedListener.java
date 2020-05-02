package com.weather.test.weatherapp.listeners;

import java.util.Arrays;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartedEvent arg0) {
		System.out.println("*********************************************************");
		System.out.println("ApplicationStartedEvent is "+Arrays.toString(arg0.getArgs()));
		System.out.println("*********************************************************");
		
	}

}
