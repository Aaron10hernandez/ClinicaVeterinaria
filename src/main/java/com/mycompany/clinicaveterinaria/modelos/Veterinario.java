/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.modelos;

/**
 *
 * @author USUARIO
 */
public class Veterinario extends Persona {
    
    private String tarjetaPro;
    private int consultorio;
    private boolean disponible;

    public Veterinario() {
    }

    public Veterinario(String tarjetaPro, int consultorio, boolean disponible, String nombre, int edad, int identificacion, Direccion direccion, int telefono, String correo) {
        super(nombre, edad, identificacion, direccion, telefono, correo);
        this.tarjetaPro = tarjetaPro;
        this.consultorio = consultorio;
        this.disponible = disponible;
    }

    public String getTarjetaPro() {
        return tarjetaPro;
    }

    public void setTarjetaPro(String tarjetaPro) {
        this.tarjetaPro = tarjetaPro;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void recetar(String nombre, String dosis, Mascota mascota){
        
        Medicamento m = new Medicamento();
        
        m.setNombre(nombre);
        m.setIndicacionesUso(dosis);
        
        mascota.setMedicinasRecetadas(m);
        
        System.out.println("Receta confirmada!");
    }

    @Override
    public String toString() {
        return "Veterinario{" + "tarjetaPro=" + tarjetaPro + ", consultorio=" + consultorio + ", disponible=" + disponible + '}';
    }
    
}
