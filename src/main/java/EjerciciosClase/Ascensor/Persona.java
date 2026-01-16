/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosClase.Ascensor;

/**
 *
 * @author delcenjo
 */
public class Persona {
    private static int contadorPersonas = 0;
    private double peso;
    private int id;
    
    public Persona(){
        contadorPersonas++;
        peso = 0;
        id = contadorPersonas;}
    
    public Persona(double peso){
        contadorPersonas++;
        this.peso = peso;
        id = contadorPersonas;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
