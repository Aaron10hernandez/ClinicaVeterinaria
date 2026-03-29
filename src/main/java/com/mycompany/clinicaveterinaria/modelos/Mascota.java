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
public class Mascota extends Animal {
    
    private Propietario propietario;

    public Mascota() {
    }

    public Mascota(Propietario propietario, String nombre, int edad, String raza, String tipoSangre, String sexo, ArrayList<String> alergias) {
        super(nombre, edad, raza, tipoSangre, sexo, alergias);
        this.propietario = propietario;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    
    
}
