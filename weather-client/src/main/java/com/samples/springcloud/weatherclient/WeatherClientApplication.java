package com.samples.springcloud.weatherclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WeatherClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherClientApplication.class, args);
	}

}
