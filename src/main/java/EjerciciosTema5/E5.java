package EjerciciosTema5;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        while (!sc.hasNextInt()){
            System.out.print("Introduce un número: ");
            sc.next();
        }
        numero = sc.nextInt();
        if (esPrimo(numero))
            System.out.println("El número " + numero + " es primo.");
        else
            System.out.println("El número " + numero + " no es primo.");
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}