package com.testbbva.apiDemo.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "sueldos")
public class Sueldo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idsueldo;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "sueldo")
    private List<Empleado> empleados;

    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
        empleado.setSueldo(this);
    }

    @Column
    private String bandasalarial;

    @Column
    private int sueldoenpesos;

    public long getId() {
        return idsueldo;
    }

    public String getBandasalarial() {
        return bandasalarial;
    }

    public int getSueldoenpesos() {
        return sueldoenpesos;
    }

    public void setBandasalarial(String bandasalarial) {
        this.bandasalarial = bandasalarial;
    }

    public void setSueldoenpesos(int sueldoenpesos) {
        this.sueldoenpesos = sueldoenpesos;
    }
    
}
