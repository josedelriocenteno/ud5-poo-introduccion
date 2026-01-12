package EjerciciosTema5;

import java.util.Scanner;

public class E4 {
    private static double area;
    private static String circulo(double radio){
        area = Math.PI * Math.pow(radio,2);
        return ("El area es igual a: " + area);
    }
    private static String cuadrado(double lado){
        area = Math.pow(lado,2);
        return ("El area es igual a: " + area);
    }
    private static String rectangulo(double base, double altura){
        area = base*altura;
        return ("El area es igual a: " + area);
    }
    private static String triangulo(double base, double altura){
        area = (base*altura)/2;
        return ("El area es igual a: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        do {
            System.out.print("Introduce 1 para circulo, 2 para cuadrado, 3 para rectangulo y 4 para triangulo: ");
            while (!sc.hasNextInt()){
                System.out.print("Introduce 1 para circulo, 2 para cuadrado, 3 para rectangulo y 4 para triangulo: ");
                sc.next();
            }
            respuesta = sc.nextInt();
        }while (respuesta<1||respuesta>4);
        double a,b;
        switch (respuesta){
            case 1->{
                do {
                    System.out.print("Introduce el radio: ");
                    while (!sc.hasNextDouble()){
                        System.out.print("Introduce el radio: ");
                        sc.next();
                    }
                    a = sc.nextDouble();
                }while (a<0);
                System.out.println(circulo(a));
            }
            case 2->{
                do {
                    System.out.print("Introduce el lado: ");
                    while (!sc.hasNextDouble()){
                        System.out.print("Introduce el lado: ");
                        sc.next();
                    }
                    a = sc.nextDouble();
                }while (a<0);
                System.out.println(cuadrado(a));
            }
            case 3->{
                do {
                    System.out.print("Introduce la base: ");
                    while (!sc.hasNextDouble()){
                        System.out.print("Introduce la base: ");
                        sc.next();
                    }
                    a = sc.nextDouble();
                }while (a<0);
                do {
                    System.out.print("Introduce la altura: ");
                    while (!sc.hasNextDouble()){
                        System.out.print("Introduce la altura: ");
                        sc.next();
                    }
                    b = sc.nextDouble();
                }while (b<0);
                System.out.println(rectangulo(a,b));
            }
            case 4->{
                do {
                    System.out.print("Introduce la base: ");
                    while (!sc.hasNextDouble()){
                        System.out.print("Introduce la base: ");
                        sc.next();
                    }
                    a = sc.nextDouble();
                }while (a<0);
                do {
                    System.out.print("Introduce la altura: ");
                    while (!sc.hasNextDouble()){
                        System.out.print("Introduce la altura: ");
                        sc.next();
                    }
                    b = sc.nextDouble();
                }while (b<0);
                System.out.println(triangulo(a,b));
            }
            default -> System.out.println("Error al encontrar la figura geométrica.");
        }
    }
}