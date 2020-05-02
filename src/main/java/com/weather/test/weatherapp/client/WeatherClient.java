package com.weather.test.weatherapp.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.weather.test.weatherapp.WeatherAppApplication;

@Component
public class WeatherClient {
	Logger logger = LoggerFactory.getLogger(WeatherClient.class);
	@Autowired
	private RestTemplate restTemplate;
	@Value( "${weather.report.appId}" )
	private String appId;
	@Autowired
	private Environment env;
	public Object getWeatherReport(String city) {
		//String url="http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=1a18f844e08bca392ae5abab8fa72b0d";
		String url="http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+env.getProperty("weather.report.appId");
		logger.info("property from application property file "+appId);
		logger.info("property from application property file via environment api "+appId);
		Object value= restTemplate.getForEntity(url, Object.class);
		logger.info(" value "+value);
		return value;
	}
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	@EventListener({ApplicationEvent.class})
	public void eventListenerMethod() {
		logger.info("eventListenerMethod ");
	}

}
