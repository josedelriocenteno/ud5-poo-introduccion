/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosClase.Ascensor;

import java.util.Random;
import EjerciciosClase.Ascensor.Persona;

/**
 *
 * @author delcenjo
 */
public class Ascensor {
    private int piso;
    private int pisos;
    private boolean puertas;
    private boolean alarma;
    private double capacidad;
    private double ocupacion;
    
    public Ascensor(int pisos, double capacidad){
        this.pisos = pisos;
        this.capacidad = capacidad;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public boolean getPuertas() {
        return puertas;
    }

    public void setPuertas(boolean puertas) {
        this.puertas = puertas;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(double ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    public void abrirPuertas(){
        puertas = true;
    }
    
    public void cerrarPuestas(){
        puertas = false;
    }
    
    public boolean validarString(String s) {
        if (s == null) return false;
        return s.equalsIgnoreCase("entrar") || s.equalsIgnoreCase("salir");
}
    
    public void entrarSalirPersona(String s,Persona p){
        if(validarString(s) && !puertas){
            Random rd = new Random();
            double pesoPersona = rd.nextDouble(61)+35;
            if ((ocupacion + pesoPersona) <= capacidad){
                ocupacion += pesoPersona;
                p.setPeso(pesoPersona);
            }
            else{
                System.out.println("El peso de la persona supera la capacidad máxima.");
                activarAlarma(true);
            }
        }
        else System.out.println("Debes de introducir si entra o sale.");
    }
    
    public void moverAscensor(int numero) throws PisoExcepcion{
        if(numero >= 0 && numero<=pisos && !alarma) piso = numero;
        else throw new PisoExcepcion(String.format("El piso definido no existe, las plantas son de la 0 a la %d", pisos));
    }
    
    public void activarAlarma(boolean activar){
        if (activar)alarma = true;
        else alarma = false;
    }
}