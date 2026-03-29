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
    private ArrayList <String> alergias;
    private ArrayList <Medicamento> medicinasRecetadas;
    
    public Mascota() {
    }

    public Mascota(Propietario propietario, ArrayList<String> alergias, ArrayList<Medicamento> medicinasRecetadas, String nombre, int edad, String raza, String tipoSangre, String sexo) {
        super(nombre, edad, raza, tipoSangre, sexo);
        this.propietario = propietario;
        this.alergias = alergias;
        this.medicinasRecetadas = medicinasRecetadas;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }

    public ArrayList<Medicamento> getMedicinasRecetadas() {
        return medicinasRecetadas;
    }

    public void setMedicinasRecetadas(Medicamento medicinasRecetadas) {
        this.medicinasRecetadas.add(medicinasRecetadas);   
    }
    
    
    
}
