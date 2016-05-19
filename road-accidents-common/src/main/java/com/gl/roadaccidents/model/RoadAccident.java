package com.gl.roadaccidents.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by gavin on 16-5-13.
 */
@Entity
@Table(name="road_accident")
public class RoadAccident extends BaseEntity{

    /*

    Accident_Index,Longitude,
    Latitude,Police_Force,Accident_Severity,
    Number_of_Vehicles,Number_of_Casualties,Date,
    Day_of_Week,Time,Local_Authority_(District),
    Light_Conditions,
    Weather_Conditions,
    Road_Surface_Conditions

     */
    private static final long serialVersionUID = 182816040115377252L;
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

    @Column(name="accident_index")
    public String getAccidentIndex() {
        return accidentIndex;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    @OneToOne
    @JoinColumn(name="police_force",referencedColumnName="oid")
    public PoliceForce getPoliceForce() {
        return policeForce;
    }

    @OneToOne
    @JoinColumn(name="accident_severity",referencedColumnName="oid")
    public AccidentSeverity getAccidentSeverity() {
        return accidentSeverity;
    }

    @Column(name="number_of_vehicles")
    public Integer getNumberOfVehicles() {
        return numberOfVehicles;
    }

    @Column(name="number_of_calsualties")
    public Integer getNumberOfCasualties() {
        return numberOfCasualties;
    }

    @Column(name="occur_on")
    public Date getOccurOn() {
        return occurOn;
    }

    @Column(name="day_of_week")
    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    @Column(name="occur_at")
    public Date getOccurAt() {
        return occurAt;
    }

    @OneToOne
    @JoinColumn(name="district_authority",referencedColumnName="oid")
    public DistrictAuthority getDistrictAuthority() {
        return districtAuthority;
    }

    @OneToOne
    @JoinColumn(name="light_condition",referencedColumnName="oid")
    public LightCondition getLightCondition() {
        return lightCondition;
    }

    @OneToOne
    @JoinColumn(name="weather_condition",referencedColumnName="oid")
    public WeatherCondition getWeatherCondition() {
        return weatherCondition;
    }

    @OneToOne
    @JoinColumn(name="road_surface",referencedColumnName="oid")
    public RoadSurface getRoadSurface() {
        return roadSurface;
    }

    public void setAccidentIndex(String accidentIndex) {
        this.accidentIndex = accidentIndex;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setPoliceForce(PoliceForce policeForce) {
        this.policeForce = policeForce;
    }

    public void setAccidentSeverity(AccidentSeverity accidentSeverity) {
        this.accidentSeverity = accidentSeverity;
    }

    public void setNumberOfVehicles(Integer numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public void setNumberOfCasualties(Integer numberOfCasualties) {
        this.numberOfCasualties = numberOfCasualties;
    }

    public void setOccurOn(Date occurOn) {
        this.occurOn = occurOn;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setOccurAt(Date occurAt) {
        this.occurAt = occurAt;
    }

    public void setDistrictAuthority(DistrictAuthority districtAuthority) {
        this.districtAuthority = districtAuthority;
    }

    public void setLightCondition(LightCondition lightCondition) {
        this.lightCondition = lightCondition;
    }

    public void setWeatherCondition(WeatherCondition weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public void setRoadSurface(RoadSurface roadSurface) {
        this.roadSurface = roadSurface;
    }

    @Override
    public String toString() {
        return super.toString() +"RoadAccident{" +
                "accidentIndex='" + accidentIndex + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", policeForce=" + policeForce +
                ", accidentSeverity=" + accidentSeverity +
                ", numberOfVehicles=" + numberOfVehicles +
                ", numberOfCasualties=" + numberOfCasualties +
                ", occurOn=" + occurOn +
                ", dayOfWeek=" + dayOfWeek +
                ", occurAt=" + occurAt +
                ", districtAuthority=" + districtAuthority +
                ", lightCondition=" + lightCondition +
                ", weatherCondition=" + weatherCondition +
                ", roadSurface=" + roadSurface +
                '}';
    }
}
