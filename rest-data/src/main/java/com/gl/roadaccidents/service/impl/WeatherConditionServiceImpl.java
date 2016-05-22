package com.gl.roadaccidents.service.impl;

import com.gl.roadaccidents.model.WeatherCondition;
import com.gl.roadaccidents.repository.WeatherConditionRepository;
import com.gl.roadaccidents.service.WeatherConditionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by gavin on 16-5-22.
 */
@Service("restWeatherConditionService")
public class WeatherConditionServiceImpl implements WeatherConditionService{

    private static final Logger log  = LoggerFactory.getLogger(WeatherConditionServiceImpl.class);

    @Autowired
    private WeatherConditionRepository weatherConditionRepository;

    public List<WeatherCondition> getWeatherConditions() {

        List<WeatherCondition> weatherConditions = weatherConditionRepository.findAll();

        return weatherConditions;
    }

    public WeatherCondition getWeatherConditionWithObjectId(Long id) {

        WeatherCondition wc = weatherConditionRepository.findOne(id);
        return wc;
    }
}
