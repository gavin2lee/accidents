package com.gl.roadaccidents.builder;

import com.gl.roadaccidents.model.*;

import java.util.Date;

/**
 * Created by gavin on 16-5-13.
 */
public class RoadAccidentBuilder {
    private String accidentIndex;
    private Double longitude;
    private Double latitude;
    private PoliceForce policeForce;
    private AccidentSeverity accidentSeverity;
    private Integer numberOfVehicles;
    private Integer numberOfCasualties;
    private Date occurOn;
    private Integer dayOfWeek;
    private Date occurAt;
    private DistrictAuthority districtAuthority;
    private LightCondition lightCondition;
    private WeatherCondition weatherCondition;
    private RoadSurface roadSurface;

    private RoadAccidentBuilder(){

    }

    public static final RoadAccidentBuilder newBuilder(){
        return new RoadAccidentBuilder();
    }

    public RoadAccidentBuilder setAccidentIndex(String accidentIndex){
        this.accidentIndex = accidentIndex;
        return this;
    }


    public RoadAccidentBuilder setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public RoadAccidentBuilder setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public RoadAccidentBuilder setPoliceForce(PoliceForce policeForce) {
        this.policeForce = policeForce;
        return this;
    }

    public RoadAccidentBuilder setAccidentSeverity(AccidentSeverity accidentSeverity) {
        this.accidentSeverity = accidentSeverity;
        return this;
    }

    public RoadAccidentBuilder setNumberOfVehicles(Integer numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
        return this;
    }

    public RoadAccidentBuilder setNumberOfCasualties(Integer numberOfCasualties) {
        this.numberOfCasualties = numberOfCasualties;
        return this;
    }

    public RoadAccidentBuilder setOccurOn(Date occurOn) {
        this.occurOn = occurOn;
        return this;
    }

    public RoadAccidentBuilder setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public RoadAccidentBuilder setOccurAt(Date occurAt) {
        this.occurAt = occurAt;
        return this;
    }

    public RoadAccidentBuilder setDistrictAuthority(DistrictAuthority districtAuthority) {
        this.districtAuthority = districtAuthority;
        return this;
    }

    public RoadAccidentBuilder setLightCondition(LightCondition lightCondition) {
        this.lightCondition = lightCondition;
        return this;
    }

    public RoadAccidentBuilder setWeatherCondition(WeatherCondition weatherCondition) {
        this.weatherCondition = weatherCondition;
        return this;
    }

    public RoadAccidentBuilder setRoadSurface(RoadSurface roadSurface) {
        this.roadSurface = roadSurface;
        return this;
    }

    public RoadAccident build(){
        if(accidentIndex ==  null){
            throw new RuntimeException();
        }
        RoadAccident ra = new RoadAccident();
        ra.setAccidentIndex(accidentIndex);
        ra.setAccidentSeverity(accidentSeverity);
        ra.setDayOfWeek(dayOfWeek);
        ra.setDistrictAuthority(districtAuthority);
        ra.setLatitude(latitude);
        ra.setLongitude(longitude);
        ra.setLightCondition(lightCondition);
        ra.setNumberOfCasualties(numberOfCasualties);
        ra.setNumberOfVehicles(numberOfVehicles);
        ra.setOccurAt(occurAt);

        ra.setPoliceForce(policeForce);
        ra.setRoadSurface(roadSurface);
        ra.setOccurOn(occurOn);
        ra.setWeatherCondition(weatherCondition);

        ra.setCreateAt(new Date());

        return ra;
    }
}
