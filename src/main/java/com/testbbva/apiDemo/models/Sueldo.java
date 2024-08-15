package com.testbbva.apiDemo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sueldos")
public class Sueldo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSueldo;

    @Column
    private String bandasalarial;

    @Column
    private double sueldoenpesos;

    public long getIdSueldo() {
        return idSueldo;
    }

    public String getBandasalarial() {
        return bandasalarial;
    }

    public double getSueldoenpesos() {
        return sueldoenpesos;
    }

    public void setBandasalarial(String bandasalarial) {
        this.bandasalarial = bandasalarial;
    }

    public void setSueldoenpesos(double sueldoenpesos) {
        this.sueldoenpesos = sueldoenpesos;
    }
    
}
