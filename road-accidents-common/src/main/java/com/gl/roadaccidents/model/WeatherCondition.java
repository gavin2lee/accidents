package com.gl.roadaccidents.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by gavin on 16-5-13.
 */
@Entity
@Table(name="weather_condition")
public class WeatherCondition extends BaseEntity{

    private static final long serialVersionUID = -5354129836392368165L;

    private Integer code;
    private String label;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    @Override
    public String toString() {
        return super.toString() + "WeatherCondition{" +
                "code=" + code +
                ", label='" + label + '\'' +
                '}';
    }
}
