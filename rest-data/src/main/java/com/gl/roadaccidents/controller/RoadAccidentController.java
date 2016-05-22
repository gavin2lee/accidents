package com.gl.roadaccidents.controller;

import com.gl.roadaccidents.model.RoadAccident;
import com.gl.roadaccidents.service.RoadAccidentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gavin on 16-5-22.
 */
@RestController
public class RoadAccidentController {
    private static final Logger log = LoggerFactory.getLogger(RoadAccidentController.class);

    @Autowired
    @Qualifier("restRoadAccidentService")
    private RoadAccidentService roadAccidentService;

    @RequestMapping("/road-accidents/{id}")
    public RoadAccident getRoadAccidentWithId(@PathVariable("id") Long id){
        log.debug("Id: {}", id);

        return roadAccidentService.getRoadAccidentWithObjectId(id);
    }
}