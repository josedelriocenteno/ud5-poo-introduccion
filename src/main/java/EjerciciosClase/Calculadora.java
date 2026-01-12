package EjerciciosClase;

import java.util.Scanner;

public class Calculadora {
    private static Scanner sc = new Scanner(System.in);

    public static int Menu(){
        System.out.print("""
                1. Sumar:
                2. Restar:
                3. Multiplicar
                4. Dividir
                Elige una opción:\s""");
        try{
            return sc.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static double Sumar(double a, double b){
        return a+b;
    }

    public static double Restar(double a, double b){
        return a-b;
    }

    public static double Multiplicar(double a, double b){
        return a*b;
    }

    public static double Dividir(double a, double b){
        return a/b;
    }

    public static boolean Validar(int a){
        return a > 0 && a <= 4;
    }

    public static double PedirValor(){
        do {
            System.out.print("Introduce un número: ");
        } while (!sc.hasNextDouble());
        return sc.nextDouble();
    }

    public static double PedirValorDivision(){
        double respuesta;
        do {
            do {
                System.out.print("Introduce un número: ");
            } while (!sc.hasNextDouble());
            respuesta = sc.nextDouble();
        }while (respuesta == 0);
        return respuesta;
    }

    public static void ValidarOpciones(int respuesta){
        switch (respuesta){
            case 1 -> System.out.println(Sumar(PedirValor(), PedirValor()));
            case 2 -> System.out.println(Restar(PedirValor(), PedirValor()));
            case 3 -> System.out.println(Multiplicar(PedirValor(), PedirValor()));
            case 4 -> System.out.println(Dividir(PedirValor(), PedirValorDivision()));
        }
    }

    static void main() {
        int respuesta = Menu();
        boolean validar = Validar(respuesta);
        while (!validar){
            respuesta = Menu();
            validar = Validar(respuesta);
        }
        ValidarOpciones(respuesta);
    }
}