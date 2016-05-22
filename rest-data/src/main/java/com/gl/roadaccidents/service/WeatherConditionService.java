package com.gl.roadaccidents.service;

import com.gl.roadaccidents.model.WeatherCondition;

import java.util.List;

/**
 * Created by gavin on 16-5-22.
 */
public interface WeatherConditionService {

    List<WeatherCondition> getWeatherConditions();
    WeatherCondition getWeatherConditionWithObjectId(Long id);
}
