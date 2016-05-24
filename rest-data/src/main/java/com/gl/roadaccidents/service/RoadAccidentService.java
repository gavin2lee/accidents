package com.gl.roadaccidents.service;

import com.gl.roadaccidents.model.RoadAccident;

import java.util.List;

/**
 * Created by gavin on 16-5-22.
 */
public interface RoadAccidentService {
    RoadAccident getRoadAccidentWithObjectId(Long id);
    List<RoadAccident> getPageableRoadAccidentsWithYear(Integer year, Integer page);
}
