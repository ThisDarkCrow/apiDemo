package com.testbbva.apiDemo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column
    private String nombre;

    @Column
    private String apellidos;

    @Column
    private String direccion;

    @Column
    private String telefono;

    @Column
    private long area;

    @Column
    private String jefeDirecto;

    @Column
    private long sueldo;

    public long getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public long getArea() {
        return area;
    }

    public String getJefeDirecto() {
        return jefeDirecto;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public void setJefeDirecto(String jefeDirecto) {
        this.jefeDirecto = jefeDirecto;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }

}
