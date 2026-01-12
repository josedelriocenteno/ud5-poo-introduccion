package EjerciciosTema5;

public class E2 {
    private static int i;
    private static int nuemroMayor;
    private static int divisorMasGrande(int numero){
        while (i<=(numero/2)){
            if (numero%i==0)
                nuemroMayor = i;
            i++;
        }
        return nuemroMayor;
    }
}
