package com.gl.roadaccidents.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by gavin on 16-5-13.
 */
@Entity
@Table(name="road_surface")
public class RoadSurface extends BaseEntity{
    private static final long serialVersionUID = -1714108693729405091L;

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
        return super.toString() +"RoadSurface{" +
                "code=" + code +
                ", label='" + label + '\'' +
                '}';
    }
}
