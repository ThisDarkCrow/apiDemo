package com.testbbva.apiDemo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testbbva.apiDemo.models.Empleado;
import com.testbbva.apiDemo.services.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoService;
 
    @GetMapping //(value="empleados")
    public ArrayList<Empleado> getEmpleados(){
        return this.empleadoService.getEmpleados();
    }

    @PostMapping //(value = "empleados")
    public Empleado saveEmpleado(@RequestBody Empleado empleado){
        return this.empleadoService.saveEmpleado(empleado);
    }

    @GetMapping(path = "/{id}")
    public Optional<Empleado> getEmpleadoById(@PathVariable long id){
        return this.empleadoService.getEmpleadoById(id);
    }

    @PutMapping(path = "/{id}")
    public Empleado updateEmpleadoById(@RequestBody Empleado empleadoModificado, @PathVariable("id") Long id){
        return this.empleadoService.updateEmpleadoById(empleadoModificado, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteEmpleadoById(@PathVariable("id") Long id){
        boolean isEliminado= this.empleadoService.deleteEmpleadoById(id);

        if(isEliminado){
            return "Usuario con id "+id+", ha sido eliminado.";
        }else{
            return "Problema con la operación de eliminación.";
        }
    }

}
