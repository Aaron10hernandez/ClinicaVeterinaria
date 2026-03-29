/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.modelos;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Animal {
    private String nombre;
    private int edad;
    private String raza;
    private String tipoSangre;
    private String sexo;


    public Animal() {
    }

    public Animal(String nombre, int edad, String raza, String tipoSangre, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    
    
    
    
}
