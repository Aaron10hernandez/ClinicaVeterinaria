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
public class Consulta {
    
    private Mascota datosPaciente;
    private String motivo;
    private String diagnostico;
    private int duracionMinutos;
    private String fecha;
    private Veterinario veterinario;
    private ArrayList <Medicamento> medicamentos = new ArrayList();

    public Consulta() {
    }

    public Consulta(Mascota datosPaciente, String motivo, String diagnostico, int duracionMinutos, String fecha, Veterinario veterinario) {
        this.datosPaciente = datosPaciente;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.duracionMinutos = duracionMinutos;
        this.fecha = fecha;
        this.veterinario = veterinario;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    
    public Mascota getDatosPaciente() {
        return datosPaciente;
    }

    public void setDatosPaciente(Mascota datosPaciente) {
        this.datosPaciente = datosPaciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Medicamento medicamentos) {
        this.medicamentos.add(medicamentos);
    }

    @Override
    public String toString() {
        return "Consulta{" + "datosPaciente=" + datosPaciente.getNombre() +","+datosPaciente.getRaza()+","+datosPaciente.getSexo()+","+datosPaciente.getTipoSangre()+ ", motivo=" + motivo + ", diagnostico=" + diagnostico + ", duracionMinutos=" + duracionMinutos + ", fecha=" + fecha + ", veterinario=" + veterinario + ", medicamentos=" + medicamentos + '}';
    }
    
    
    
}
