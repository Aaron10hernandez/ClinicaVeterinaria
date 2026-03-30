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
    
    private ArrayList <String> alergias= new ArrayList();
    private ArrayList <Medicamento> medicinasRecetadas = new ArrayList();
    
    public Mascota() {
    }

    public Mascota(ArrayList<String> alergias, ArrayList<Medicamento> medicinasRecetadas, String nombre, int edad, String raza, String tipoSangre, String sexo) {
        super(nombre, edad, raza, tipoSangre, sexo);
        this.alergias = alergias;
        this.medicinasRecetadas = medicinasRecetadas;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias.add(alergias);
    }

    public ArrayList<Medicamento> getMedicinasRecetadas() {
        return medicinasRecetadas;
    }

    public void setMedicinasRecetadas(Medicamento medicinasRecetadas) {
        this.medicinasRecetadas.add(medicinasRecetadas);   
    }

    @Override
    public String toString() {
        return "Mascota{" + " alergias=" + alergias + ", medicinasRecetadas=" + medicinasRecetadas + '}';
    }
    
    
    
}
