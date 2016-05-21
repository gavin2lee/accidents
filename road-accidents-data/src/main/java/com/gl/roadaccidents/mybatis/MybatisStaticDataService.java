package com.gl.roadaccidents.mybatis;

import com.gl.roadaccidents.model.*;
import com.gl.roadaccidents.service.DataLoadService;
import com.gl.roadaccidents.service.StaticDataService;

/**
 * Created by gavin on 16-5-21.
 */
public class MybatisStaticDataService  implements StaticDataService{
    private DataLoadService service;

    public MybatisStaticDataService(DataLoadService service) {
        this.service = service;
    }

    public PoliceForce findPoliceForce(String code) {
        return service.retrievePoliceForceWithCode(Integer.valueOf(code));
    }

    public AccidentSeverity findAccidentSeverity(String code) {
        return service.retrieveAccidentSeverityWithCode(Integer.valueOf(code));
    }

    public DistrictAuthority findDistrictAuthority(String code) {
        return service.retrieveDistrictAuthorityWithCode(Integer.valueOf(code));
    }

    public LightCondition findLightCondition(String code) {
        return service.retrieveLightConditionWithCode(Integer.valueOf(code));
    }

    public WeatherCondition findWeatherCondition(String code) {
        return service.retrieveWeatherConditionWithCode(Integer.valueOf(code));
    }

    public RoadSurface findRoadSurface(String code) {
        return service.retrieveRoadSurfaceWithCode(Integer.valueOf(code));
    }
}
