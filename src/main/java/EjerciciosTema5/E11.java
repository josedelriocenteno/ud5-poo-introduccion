package EjerciciosTema5;

public class E11 {
    public static int factor(int a, int b) {
        if (a == 0)
            return 0;
        else
            return b + factor(a - 1,b);
    }

    public static void main(String[] args) {
        System.out.println(factor(20,2));
    }
}