package com.gl.roadaccidents.util;

import com.gl.roadaccidents.builder.RoadAccidentBuilder;
import com.gl.roadaccidents.model.RoadAccident;
import com.gl.roadaccidents.service.StaticDataService;
import com.gl.roadaccidents.vo.RoadAccidentVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by gavin on 16-5-21.
 */
public class RoadAccidentConverter {
    private static final Logger log = LoggerFactory.getLogger(RoadAccidentConverter.class);

    private StaticDataService staticDataService;

    public RoadAccidentConverter(StaticDataService staticDataService) {
        this.staticDataService = staticDataService;
    }

    public  RoadAccident processRoadAccidentVo(RoadAccidentVo vo){
        java.sql.Date occurOn = null;
        java.sql.Time occurAt = null;

        try {
            occurOn = new java.sql.Date(
                    new SimpleDateFormat("dd/MM/yyyy").parse(vo.getOccurOn()).getTime()
            );

        } catch (ParseException e) {
            log.warn("Malformed occurOn '{}':  '{}'" + vo.getOccurOn(), vo.toString());
            occurOn = null;
        }

        try {
            occurAt = new java.sql.Time(
                    new SimpleDateFormat("HH:mm").parse(vo.getOccurAt()).getTime()
            );
        } catch (ParseException e) {
            log.warn("Malformed occurAt '{}' : '{}'" + vo.getOccurAt(), vo.toString());
            occurAt = null;
        }

        RoadAccident ra = RoadAccidentBuilder.newBuilder().setAccidentIndex(vo.getAccidentIndex())
                .setLongitude(Double.valueOf(vo.getLongitude()))
                .setLatitude(Double.valueOf(vo.getLatitude()))
                .setDayOfWeek(Integer.valueOf(vo.getDayOfWeek()))
                .setPoliceForce(staticDataService.findPoliceForce(vo.getPoliceForce()))
                .setAccidentSeverity(staticDataService.findAccidentSeverity(vo.getAccidentSeverity()))
                .setNumberOfVehicles(Integer.valueOf(vo.getNumberOfVehicles()))
                .setNumberOfCasualties(Integer.valueOf(vo.getNumberOfCasualties()))
                .setOccurOn(occurOn)
                .setOccurAt(occurAt)
                .setDistrictAuthority(staticDataService.findDistrictAuthority(vo.getDistrictAuthority()))
                .setLightCondition(staticDataService.findLightCondition(vo.getLightCondition()))
                .setWeatherCondition(staticDataService.findWeatherCondition(vo.getWeatherCondition()))
                .setRoadSurface(staticDataService.findRoadSurface(vo.getRoadSurface()))
                .build();

        return ra;
    }
}
