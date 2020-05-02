package com.weather.test.weatherapp.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
@Component
public class ContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
		System.out.println("*********************************************************");
		System.out.println("ContextRefreshedEvent is ");
		System.out.println("*********************************************************");
		
	}

}
