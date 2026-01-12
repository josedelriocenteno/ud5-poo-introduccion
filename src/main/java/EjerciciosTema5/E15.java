package EjerciciosTema5;

public class E15 {
    private static void imprimir(int a){
        while (a!=0)
            imprimir(a-1);
        System.out.println(a);
    }

    static void main() {
        imprimir(100);
    }
}
