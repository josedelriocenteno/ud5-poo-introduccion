/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Refactorizacion;

import java.util.Scanner;

/**
 *
 * @author macarena
 */
public class NotaProgramacion {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota del examen (0-10): ");
        double examen = sc.nextDouble();

        System.out.println("Introduce la nota de  la practica (0-10): ");
        double practica = sc.nextDouble();

        System.out.println("Introduce la nota de participación en clase (0-10): ");
        double clase = sc.nextDouble();

        double media = (examen * 0.65) + (practica * 0.25) + (clase * 0.1);

        System.out.println("La nota final es: " + media);

        if (media >= 5) {
            System.out.println("¡Has aprobado! :-D");
        } else {
            System.out.println("Has suspendido. :-(" );
        }

    }
    private static double validar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        while (!sc.hasNextInt()){
            System.out.print("Introduce un número: ");
        }
        return sc.nextDouble();
    }
}
