package com.samples.springcloud.weatherservice;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    private final EurekaInstanceConfigBean eurekaInstanceConfigBean;

    @GetMapping("/forecast")
    public String getForecast() {

        return "Service " + eurekaInstanceConfigBean.getInstanceId() + " says warm";
    }
}
