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

    public Consulta() {
    }

    public Consulta(Mascota datosPaciente, String motivo, String diagnostico, int duracionMinutos, String fecha){
        this.datosPaciente = datosPaciente;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.duracionMinutos = duracionMinutos;
        this.fecha = fecha;
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
    
    
}
