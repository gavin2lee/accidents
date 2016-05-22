package com.gl.roadaccidents.service.impl;

import com.gl.roadaccidents.model.RoadAccident;
import com.gl.roadaccidents.model.WeatherCondition;
import com.gl.roadaccidents.repository.RoadAccidentRepository;
import com.gl.roadaccidents.service.RoadAccidentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by gavin on 16-5-22.
 */
@Service("restRoadAccidentService")
public class RoadAccidentServiceImpl implements RoadAccidentService {
    private static final Logger log = LoggerFactory.getLogger(RoadAccidentServiceImpl.class);

    @Autowired
    private RoadAccidentRepository roadAccidentRepository;

    public RoadAccident getRoadAccidentWithObjectId(Long id) {
        RoadAccident ra = roadAccidentRepository.findOne(id);
        return ra;
    }
}
