/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.modelos;

/**
 *
 * @author USUARIO
 */
public class Medicamento {
    private String nombre;
    private String indicacionesUso;

    public Medicamento() {
    }

    public Medicamento(String nombre, String indicacionesUso) {
        this.nombre = nombre;
        this.indicacionesUso = indicacionesUso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIndicacionesUso() {
        return indicacionesUso;
    }

    public void setIndicacionesUso(String indicacionesUso) {
        this.indicacionesUso = indicacionesUso;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "nombre=" + nombre + ", indicacionesUso=" + indicacionesUso + '}';
    }
    
    
}
