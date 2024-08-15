package com.testbbva.apiDemo.repositories;

import com.testbbva.apiDemo.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {
    
}