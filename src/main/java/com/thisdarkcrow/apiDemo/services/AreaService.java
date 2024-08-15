package com.thisdarkcrow.apiDemo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thisdarkcrow.apiDemo.models.Area;
import com.thisdarkcrow.apiDemo.repositories.IAreaRepository;

@Service
public class AreaService {

    @Autowired
    IAreaRepository areaRepository;

    public ArrayList<Area> getAreas(){
        return (ArrayList<Area>) areaRepository.findAll();
    }

    public Area saveArea(Area area){
        return areaRepository.save(area);
    }

    public Optional<Area> getAreaById(Long Id) {
        return areaRepository.findById(Id);
    }

    /*
    public Area updateAreaById(Area areaModificada, Long id){
        Area areaGuardada = areaRepository.findById(id).get();
        
        areaGuardada.setNombre(areaModificada.getNombre());
        areaGuardada.setUbicacion(areaModificada.getUbicacion());

        return areaGuardada;
    }
    */

    /*
    public boolean deleteAreaById(Long id){
        try{
            areaRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    */
}
