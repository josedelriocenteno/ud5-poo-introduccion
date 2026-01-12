package EjerciciosTema5;

import java.util.Scanner;

public class E8 {
    private static double elMayorDeDos(double a, double b){
        double mayor;
        if (a>b || a==b) mayor=a;
        else mayor=b;
        return mayor;
    }
    private static double elMayorDeTres(double a, double b, double c){
        double d = elMayorDeDos(a,b);
        return elMayorDeDos(d,c);
    }
    private static double validacion(){
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("Introduce un número: ");
        while (!sc.hasNextDouble()){
            System.out.println("Introduce un número: ");
            sc.next();
        }
        return a = sc.nextDouble();
    }
}
