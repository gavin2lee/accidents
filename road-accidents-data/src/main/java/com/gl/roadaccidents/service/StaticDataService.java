package com.gl.roadaccidents.service;

import com.gl.roadaccidents.model.*;

import java.util.List;

/**
 * Created by gavin on 16-5-21.
 */
public interface StaticDataService {
    PoliceForce findPoliceForce(String code);

    AccidentSeverity findAccidentSeverity(String code);

    DistrictAuthority findDistrictAuthority(String code);

    LightCondition findLightCondition(String code);

    WeatherCondition findWeatherCondition(String code);

    RoadSurface findRoadSurface(String code);
}
