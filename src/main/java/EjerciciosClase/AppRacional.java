package EjerciciosClase;

public class AppRacional {
    public static void main(String[] args) {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(1, 3);

        System.out.println("r1: " + r1);
        System.out.println("r1 decimal: " + r1.toDecimal());

        Racional suma = r1;
        System.out.println("Suma: " + suma);

        System.out.println("r1 == r2: " + r1.equals(r2));
        System.out.println("r1 > r2: " + (r1.compareTo(r2) > 0));
    }
}
