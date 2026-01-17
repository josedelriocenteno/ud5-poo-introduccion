package EjerciciosClase.Ascensor;

public class Persona {

    private static int contadorPersonas = 0;
    private double peso;
    private int id;

    public Persona() {
        contadorPersonas++;
        this.peso = 0;
        this.id = contadorPersonas;
    }

    public Persona(double peso) {
        contadorPersonas++;
        this.peso = peso;
        this.id = contadorPersonas;
    }

    public double getPeso() {
        return peso;
    }

    public int getId() {
        return id;
    }
}
