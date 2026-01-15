/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author delcenjo
 */

public class AppCalculadoraTerminal {

    public static Scanner sc = null;

    public double pedirNumero(int i) {
        System.out.printf("Numero %d:", i);
        return Double.parseDouble(sc.nextLine());
    }

    public void mostrarResultado(double resultado) {
        System.out.printf("Resultado %.2f", resultado);
    }

    public void menu() {
        System.out.println("\n(+) Sumar");
        System.out.println("(-) Restar");
        System.out.println("(x) Multiplicar");
        System.out.println("(/) Dividir");
        System.out.println("(%) Resto");
        System.out.println("-----------------");
        System.out.print("Operacion: ");
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        AppCalculadoraTerminal appTerminal = new AppCalculadoraTerminal();

        while (true) {
            appTerminal.menu();
            char operacion = sc.nextLine().charAt(0);
            double a = 0;
            double b = 0;
            switch (operacion) {
                case '+' -> {
                    a = appTerminal.pedirNumero(1);
                    b = appTerminal.pedirNumero(2);
                    appTerminal.mostrarResultado(Calculadora.suma(a, b));
                }
                case '-' -> {
                    a = appTerminal.pedirNumero(1);
                    b = appTerminal.pedirNumero(2);
                    appTerminal.mostrarResultado(Calculadora.resta(a, b));
                }
                case 'x' -> {
                    a = appTerminal.pedirNumero(1);
                    b = appTerminal.pedirNumero(2);
                    appTerminal.mostrarResultado(Calculadora.producto(a, b));
                }
                case '/' -> {
                    a = appTerminal.pedirNumero(1);
                    b = appTerminal.pedirNumero(2);
                    appTerminal.mostrarResultado(Calculadora.cociente(a, b));
                }
                case '%' -> {
                    a = appTerminal.pedirNumero(1);
                    b = appTerminal.pedirNumero(2);
                    appTerminal.mostrarResultado(Calculadora.resto(a, b));
                }
                default -> System.out.println("Error. Operación no contemplada");
            }
        }

    }

}
