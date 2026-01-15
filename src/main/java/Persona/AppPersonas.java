/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import java.time.LocalDate;
import java.time.Month;
import Persona.Persona;

/**
 *
 * @author delcenjo
 */

public class AppPersonas {

    public static void main(String[] args) {

        Persona maria=null; 
        maria=new Persona("jdjdj","Maria","Perez");  
        maria.setDni("kdkddk");
        maria.setSexo('M');
        maria.setTrabaja(true);        
        maria.setFechaNac(LocalDate.of(2000,Month.JANUARY,1));
        System.out.println(maria.getEdad());
        


//        
        

    }

}
