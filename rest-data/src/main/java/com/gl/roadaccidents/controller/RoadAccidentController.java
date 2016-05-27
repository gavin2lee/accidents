package com.gl.roadaccidents.controller;

import com.gl.roadaccidents.model.RoadAccident;
import com.gl.roadaccidents.service.RoadAccidentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gavin on 16-5-22.
 */
@RestController
public class RoadAccidentController {
    private static final Logger log = LoggerFactory.getLogger(RoadAccidentController.class);
    public static final String CROS = "http://localhost:8091";

    @Autowired
    @Qualifier("restRoadAccidentService")
    private RoadAccidentService roadAccidentService;

    @RequestMapping("/road-accidents/{id}")
    @CrossOrigin(origins=CROS)
    public RoadAccident getRoadAccidentWithId(@PathVariable("id") Long id) {
        log.debug("Id: {}", id);

        return roadAccidentService.getRoadAccidentWithObjectId(id);
    }

    @RequestMapping("/road-accidents")
    @CrossOrigin(origins=CROS)
    public List<RoadAccident> getRoadAccidentsWithYear(
            @RequestParam(name = "year", defaultValue = "2009") int year,
            @RequestParam(name = "page", defaultValue = "1") int page) {

        return roadAccidentService.getPageableRoadAccidentsWithYear(year, page);
    }
}
