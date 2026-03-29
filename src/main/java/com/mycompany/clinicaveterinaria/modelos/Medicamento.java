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
    private int codigo;
    private boolean disponibilidad;
    private String indicacionesUso;

    public Medicamento() {
    }

    public Medicamento(String nombre, int codigo, boolean disponibilidad, String indicacionesUso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.disponibilidad = disponibilidad;
        this.indicacionesUso = indicacionesUso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getIndicacionesUso() {
        return indicacionesUso;
    }

    public void setIndicacionesUso(String indicacionesUso) {
        this.indicacionesUso = indicacionesUso;
    }
    
    
}
