package com.weather.test.weatherapp.listeners;

import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationListener;

public class SpringBuiltInEventsListener implements ApplicationListener<SpringApplicationEvent>{

	  @Override
	  public void onApplicationEvent(SpringApplicationEvent event) {
		System.out.println("*********************************************************************");
	    System.out.println("SpringApplicationEvent called via manual registered way "+event.getClass().getCanonicalName());
	    System.out.println("*********************************************************************");
	  }
	}
