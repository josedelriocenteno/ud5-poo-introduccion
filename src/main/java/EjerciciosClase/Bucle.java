package EjerciciosClase;

import java.util.Random;
import java.util.Scanner;

public class Bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int color;
        do {
            System.out.print("Color (1:rojo/2:verde/3:amarillo): ");
            while (!sc.hasNextInt()){
                System.out.print("Color (1:rojo/2:verde/3:amarillo): ");
                sc.next();
            }
            color = sc.nextInt();
        }while (color<1||color>3);
        String colores = null;
        switch (color){
            case 1-> colores="\033[31m";
            case 2-> colores="\033[32m";
            case 3-> colores="\033[33m";
        }
        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(3,10);
        for (int i=0; i<numeroAleatorio;i++){
            for (int j =0; j<numeroAleatorio;j++){
                if (j==i||j==(numeroAleatorio - i - 1)){
                    System.out.print(colores + "X");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}