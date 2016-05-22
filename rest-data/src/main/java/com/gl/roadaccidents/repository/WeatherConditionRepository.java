package com.gl.roadaccidents.repository;

import com.gl.roadaccidents.model.WeatherCondition;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by gavin on 16-5-22.
 */
public interface WeatherConditionRepository extends JpaRepository<WeatherCondition, Long> {
}
