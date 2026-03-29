/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinicaveterinaria.visual;

import com.mycompany.clinicaveterinaria.modelos.Mascota;
import com.mycompany.clinicaveterinaria.modelos.Veterinario;

/**
 *
 * @author USUARIO
 */
public class ClinicaVeterinaria {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Veterinario v1 = new Veterinario();
        Mascota m1 = new Mascota();
        
        v1.setNombre("Aaron");
        m1.setNombre("firulais");
        
        v1.recetar("paracetamol", "1 cada dia", m1);
        
    
      //  m1.getMedicinasRecetadas();
        
        
        
    }
}
