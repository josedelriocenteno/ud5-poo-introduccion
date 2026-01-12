package EjerciciosTema5;

import java.util.Scanner;

public class E7 {
    private static int MCD(int numero1, int numero2){
        int mayor = 0;
        mayor = Math.max(numero1, numero2);
        int menor = Math.min(numero1, numero2);
        int resto;
        do {
            resto = mayor % menor;
            mayor = menor;
            menor = resto;
        } while (resto != 0);
        return mayor;
    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce el primer numero entero positivo: ");
            while (!sc.hasNextInt()){
                System.out.print("Introduce el primer numero entero positivo: ");
                sc.next();
            }
            a = sc.nextInt();
        }while (a<=0);
        do {
            System.out.print("Introduce el segundo numero entero positivo (debe de ser menor al primero): ");
            while (!sc.hasNextInt()){
                System.out.print("Introduce el segundo numero entero positivo (debe de ser menor al primero): ");
                sc.next();
            }
            b = sc.nextInt();
        }while (b<=0||b>a);
        System.out.println("El MCD de los números " + a + " y " + b + " es igual a " + MCD(a,b));
    }
}
