package com.testbbva.apiDemo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testbbva.apiDemo.models.Empleado;
import com.testbbva.apiDemo.repositories.IEmpleadoRepository;

@Service
public class EmpleadoService {

    @Autowired
    IEmpleadoRepository empleadoRepository;

    public ArrayList<Empleado> getEmpleados(){
        return (ArrayList<Empleado>) empleadoRepository.findAll();
    }

    public Empleado saveEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }

    public Optional<Empleado> getEmpleadoById(Long Id) {
        return empleadoRepository.findById(Id);
    }

    public Empleado updateEmpleadoById(Empleado empleadoModificado, Long id){
        Empleado empleadoGuardado = empleadoRepository.findById(id).get();
        
        empleadoGuardado.setNombre(empleadoModificado.getNombre());
        empleadoGuardado.setApellidos(empleadoModificado.getApellidos());
        empleadoGuardado.setDireccion(empleadoModificado.getDireccion());
        empleadoGuardado.setTelefono(empleadoModificado.getTelefono());
        empleadoGuardado.setArea(empleadoModificado.getArea());
        empleadoGuardado.setJefeDirecto(empleadoModificado.getJefeDirecto());
        empleadoGuardado.setSueldo(empleadoModificado.getSueldo());

        return empleadoGuardado;
    }

    public boolean deleteEmpleadoById(Long id){
        try{
            empleadoRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
}
