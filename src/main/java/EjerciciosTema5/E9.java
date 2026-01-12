package EjerciciosTema5;

import java.util.Scanner;

public class E9 {
    private static Scanner sc = new Scanner(System.in);
    private static double normalizarGrados(double a) {
        double b = a % 360;
        if (b < 0)
            b += 360;
        return b;
    }
    private static double deGradosRadianes(double a){
        return Math.toRadians(a);
    }
    private static double conversionX(double a, double b){
        return a * Math.cos(b);
    }
    private static double conversionY(double a, double b){
        return a * Math.sin(b);
    }
    private static double validacionDistancias(){
        double respuesta;
        do {
            System.out.print("Introduce la distancia 'r' en cm: ");
            while (!sc.hasNextDouble()){
                System.out.print("Introduce la distancia 'r' en cm: ");
                sc.next();
            }
            respuesta = sc.nextDouble();
        }while (respuesta<=0);
        return respuesta;
    }
    private static double validacionGrados(){
        double respuesta;
            System.out.print("Introduce el ángulo en grados: ");
            while (!sc.hasNextDouble()){
                System.out.print("Introduce el ángulo en grados: ");
                sc.next();
            }
            respuesta = sc.nextDouble();
        return respuesta;
    }
    public static void main(String[] args) {
        double distancia = validacionDistancias();
        double grados = validacionGrados();
        double gradosNormalizados = normalizarGrados(grados);
        double radianes = deGradosRadianes(gradosNormalizados);
        double x = conversionX(distancia, radianes);
        double y = conversionY(distancia, radianes);
        System.out.printf("P(%.2f, %.2f)", x, y);
    }
}
