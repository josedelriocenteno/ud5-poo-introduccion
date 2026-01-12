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
public class Calculadora {

    public static void main(String[] args) {
        iniciarMenu();
    }

    private static void iniciarMenu() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            int opcion = menu(sc);
            salir = ejecutarOpciones(sc, opcion);
        }
    }

    public static int menu(Scanner sc) {
        int opcion;
        do {
            System.out.print("""
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Dividir
                    >>\s""");
            while (!sc.hasNextInt()) {
                System.out.print("Elige una opción válida: ");
                sc.next();
            }
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    private static double validar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        while (!sc.hasNextInt()){
            System.out.print("Introduce un número: ");
        }
        return sc.nextDouble();
    }

    private static boolean ejecutarOpciones(Scanner sc, int opcion){
        double a = validar();
        double b = validar();
        boolean salir = false;
        double resultado = 0;
        switch (opcion) {
            case 1 -> resultado = a + b;
            case 2 -> resultado = a - b;
            case 3 -> resultado = a * b;
            case 4 -> resultado = a / b;
            default -> {
            }
        }
        System.out.println("Resultado: " + resultado);
        return salir;
    }
}