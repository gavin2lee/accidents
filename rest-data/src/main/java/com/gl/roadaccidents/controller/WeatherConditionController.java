package com.gl.roadaccidents.controller;

import com.gl.roadaccidents.model.WeatherCondition;
import com.gl.roadaccidents.service.WeatherConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by gavin on 16-5-22.
 */
@RestController
public class WeatherConditionController {

    @Autowired
    @Qualifier("restWeatherConditionService")
    private WeatherConditionService weatherConditionService;

    @RequestMapping("/rest-data/weather-conditions")
    public List<WeatherCondition> getWeatherConditions(){
        return weatherConditionService.getWeatherConditions();
    }

    @RequestMapping("/rest-data/weather-conditions/{id}")
    public WeatherCondition getWeatherConditionWithId(@PathVariable("id") long id){


        return weatherConditionService.getWeatherConditionWithObjectId(id);
    }
}
