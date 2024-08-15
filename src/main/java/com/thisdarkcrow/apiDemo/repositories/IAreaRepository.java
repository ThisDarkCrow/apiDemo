package com.thisdarkcrow.apiDemo.repositories;

import com.thisdarkcrow.apiDemo.models.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAreaRepository extends JpaRepository<Area, Long> {
    
}