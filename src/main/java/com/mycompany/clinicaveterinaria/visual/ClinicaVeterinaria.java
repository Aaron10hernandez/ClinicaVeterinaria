/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinicaveterinaria.visual;

import com.mycompany.clinicaveterinaria.modelos.Consulta;
import com.mycompany.clinicaveterinaria.modelos.Mascota;
import com.mycompany.clinicaveterinaria.modelos.Propietario;
import com.mycompany.clinicaveterinaria.modelos.Veterinario;

/**
 *
 * @author USUARIO
 */
public class ClinicaVeterinaria {

    public static void main(String[] args) {
        System.out.println("Aaron Hernandez");
        
        Veterinario v1 = new Veterinario();
        Mascota m1 = new Mascota();
        Propietario dueno1 = new Propietario();
        
        v1.setNombre("Scoot");
        v1.setEdad(25);
        v1.setIdentificacion(9);
        v1.setTelefono(911);
        v1.setCorreo("kyliamMbappe@gmail.com");
        v1.setDireccion("Cartagena","el pozon", "Calle de la tortuga");
        v1.setTarjetaPro("Tarjeta Profesional");
        v1.setConsultorio(1);
        v1.setDisponible(true);
        
        m1.setNombre("Firulais");
        m1.setEdad(5);
        m1.setRaza("Labrador");
        m1.setSexo("Masculino");
        m1.setTipoSangre("A+");
        m1.setAlergias("Alergia al agua"); //1)Entra en el Array de Alergias de la Mascota
        
        dueno1.setNombre("Aaron");
        dueno1.setEdad(19);
        dueno1.setIdentificacion(9);
        dueno1.setTelefono(18000);
        dueno1.setCorreo("IngenieroPro@gmail.com");
        dueno1.setDireccion("Cartagena","BocaGrander", "Principal");
        dueno1.setMascota(m1);
        
        Consulta c1 = new Consulta(m1, "rasgunos", "Peleas en el techo", 10, "26/06/2026", v1 );
        
        
        
        System.out.println("Dueno: "+dueno1.getNombre()+ ", Mascota: "+m1.getNombre());
        System.out.println(c1);
        v1.recetar("Tranquilizante", "1 antes de que quiera subir al techo", m1); //2)Entra en el array de medicinas recetadas en Mascota
        System.out.println(m1.getMedicinasRecetadas());
        
        
    }
}
