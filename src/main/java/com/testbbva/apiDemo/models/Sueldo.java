package com.testbbva.apiDemo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sueldo")
public class Sueldo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String bandasalarial;

    @Column
    private int sueldoenpesos;

    public long getId() {
        return id;
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
