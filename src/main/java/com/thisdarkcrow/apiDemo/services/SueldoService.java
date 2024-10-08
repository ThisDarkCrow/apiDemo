package com.thisdarkcrow.apiDemo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thisdarkcrow.apiDemo.models.Sueldo;
import com.thisdarkcrow.apiDemo.repositories.ISueldoRepository;

@Service
public class SueldoService {

    @Autowired
    ISueldoRepository sueldoRepository;

    public ArrayList<Sueldo> getSueldos(){
        return (ArrayList<Sueldo>) sueldoRepository.findAll();
    }

    public Sueldo saveSueldo(Sueldo sueldo){
        return sueldoRepository.save(sueldo);
    }

    public Optional<Sueldo> getSueldoById(Long Id) {
        return sueldoRepository.findById(Id);
    }

}
