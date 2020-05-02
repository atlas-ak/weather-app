package com.weather.test.weatherapp.listeners;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;


public class MyApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartingEvent arg0) {
		System.out.println("*********************************************************");
		System.out.println("ApplicationStartingEvent is "+arg0);
		System.out.println("*********************************************************");
		
	}

}
