package com.gl.roadaccidents.service.impl;

import com.gl.roadaccidents.model.RoadAccident;
import com.gl.roadaccidents.model.WeatherCondition;
import com.gl.roadaccidents.repository.RoadAccidentRepository;
import com.gl.roadaccidents.service.RoadAccidentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static com.gl.roadaccidents.constants.AppConstants.PAGE_SIZE_QUERY_ROAD_ACCIDENTS;

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

    public List<RoadAccident> getPageableRoadAccidentsWithYear(Integer year, Integer page) {
        Pageable pageRequest = new PageRequest(page - 1, PAGE_SIZE_QUERY_ROAD_ACCIDENTS);
        Page<RoadAccident> pageResult =  roadAccidentRepository.findAllWithYear(year, pageRequest);

        return pageResult.getContent();
    }
}
