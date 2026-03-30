/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.modelos;

/**
 *
 * @author USUARIO
 */
public class Direccion {
    
    private String ciudad;
    private String barrio;
    private String calle;

    public Direccion() {
    }

    public Direccion(String ciudad, String barrio, String calle) {
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    @Override
    public String toString() {
        return "Direccion{" + "ciudad=" + ciudad + ", barrio=" + barrio + ", calle=" + calle + '}';
    }
    
    
    
}
