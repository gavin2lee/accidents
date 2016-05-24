package com.gl.roadaccidents.repository;

import com.gl.roadaccidents.model.RoadAccident;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by gavin on 16-5-22.
 */
public interface RoadAccidentRepository extends JpaRepository <RoadAccident, Long>{
    @Query("from RoadAccident ra where year(ra.occurOn) = :year order by ra.oid")
    Page<RoadAccident> findAllWithYear(@Param("year") Integer year, Pageable pageable);
}
