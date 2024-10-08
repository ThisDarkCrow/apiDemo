package com.thisdarkcrow.apiDemo.repositories;

import com.thisdarkcrow.apiDemo.models.Sueldo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISueldoRepository extends JpaRepository<Sueldo, Long> {
    
}