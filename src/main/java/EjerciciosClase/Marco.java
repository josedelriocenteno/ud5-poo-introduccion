package EjerciciosClase;

import java.util.Scanner;

public class Marco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, altura;
        do {
            System.out.print("Introduce la base del marco: ");
        while (!sc.hasNextInt()){
            System.out.print("Introduce la base del marco: ");
            sc.next();
        }
            base = sc.nextInt();
        }while (base<1);
        int validar = base;
        do {
            System.out.print("Introduce la altura del marco: ");
            while (!sc.hasNextInt()){
                System.out.print("Introduce la altura del marco:");
                sc.next();
            }
            altura = sc.nextInt();
        }while (altura!=validar);

        for(int j = 1; j<=base; j++) {
            if (j==1 || j==base) {
                for (int contador = 1; contador <= base; contador++) {
                    System.out.print("%");
                }
                System.out.println();
            }
            else{
                for (int i=1; i<=base; i++){
                    if (i==1||i==base){
                        System.out.print("%");
                    }
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
