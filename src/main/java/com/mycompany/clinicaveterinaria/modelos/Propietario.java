/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.modelos;

/**
 *
 * @author USUARIO
 */
public class Propietario extends Persona {
    
    private Mascota mascota;

    public Propietario() {
    }

    public Propietario(Mascota mascota) {
        this.mascota = mascota;
    }

    public Propietario(Mascota mascota, String nombre, int edad, int identificacion, Direccion direccion, int telefono, String correo) {
        super(nombre, edad, identificacion, direccion, telefono, correo);
        this.mascota = mascota;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    
    
    
    
}
