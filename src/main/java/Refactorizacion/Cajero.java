package Refactorizacion;

import java.util.Scanner;

public class Cajero {

    private static double saldo = 0;

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
                    1. Ingresar dinero
                    2. Retirar dinero
                    3. Consultar saldo
                    4. Salir
                    Elige una opción:\s""");
            while (!sc.hasNextInt()) {
                System.out.print("Elige una opción válida: ");
                sc.next();
            }
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    public static boolean ejecutarOpciones(Scanner sc, int opcion) {
        boolean salir = false;

        switch (opcion) {
            case 1 -> {
                System.out.print("Cantidad a ingresar: ");
                double cantidad = sc.nextDouble();
                saldo += cantidad;
                System.out.println("Ingreso realizado. Saldo actual: " + saldo);
            }
            case 2 -> {
                System.out.print("Cantidad a retirar: ");
                double cantidad = sc.nextDouble();
                if (cantidad <= saldo) {
                    saldo -= cantidad;
                    System.out.println("Retirada realizada. Saldo actual: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            }
            case 3 -> System.out.println("Saldo actual: " + saldo);
            case 4 -> {
                System.out.println("Saliendo del cajero...");
                salir = true;
            }
            default -> System.out.println("Opción no reconocida: " + opcion);
        }
        return salir;
    }
}