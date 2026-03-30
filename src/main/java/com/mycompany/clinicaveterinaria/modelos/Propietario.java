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
public class Propietario extends Persona {
    
    private ArrayList <Mascota> mascota = new ArrayList();

    public Propietario() {
    }

    public Propietario(String nombre, int edad, int identificacion, Direccion direccion, int telefono, String correo) {
        super(nombre, edad, identificacion, direccion, telefono, correo);
    }

    public ArrayList<Mascota> getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota.add(mascota);
    }

    @Override
    public String toString() {
        return "Propietario{" + "mascota=" + mascota + '}';
    }
    
    
    
    
}