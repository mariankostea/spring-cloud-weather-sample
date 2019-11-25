package com.samples.springcloud.weatherclient;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    private final RestTemplate restTemplate;

    @GetMapping("/forecast")
    public String getForecast() {

        ResponseEntity<String> response = restTemplate.getForEntity("http://weather-service/forecast", String.class);

        return response.getBody();
    }
}
