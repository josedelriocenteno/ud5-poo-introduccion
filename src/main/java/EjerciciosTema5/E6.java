package EjerciciosTema5;

public class E6 {
    public static void main(String[] args) {
        int count = 0;
        int numero = 2;
        while (count < 100) {
            if (E5.esPrimo(numero)){
                System.out.println(numero);
                count++;
            }
            numero++;
        }
    }
}