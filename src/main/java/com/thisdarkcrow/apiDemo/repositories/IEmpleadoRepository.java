package com.thisdarkcrow.apiDemo.repositories;

import com.thisdarkcrow.apiDemo.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {
    
}