package EjerciciosClase;

public class Racional {
    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador){
        if (denominador == 0) {
            System.out.println("El donominador no puede ser igual a 0.");
        }
        int m = mcd(Math.abs(numerador), Math.abs(denominador));
        this.numerador = numerador / m;
        this.denominador = denominador / m;
    }

    public int getNumerador(){
        return numerador;
    }

    public void setNumerador(int numerador){
        this.numerador = numerador;
    }

    public int getDenominador(){
        return denominador;
    }

    public void setDenominador(int denominador){
        this.denominador = denominador;
    }

    private int mcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public void sumar(Racional racional){
        int n = numerador * racional.denominador + racional.numerador * denominador;
        int d = denominador * racional.denominador;
        setNumerador(n);
        setDenominador(d);
    }

    public void restar(Racional racional){
        int n = numerador * racional.denominador - racional.numerador * denominador;
        int d = denominador * racional.denominador;
        setNumerador(n);
        setDenominador(d);
    }

    public void producto(Racional racional){
        int n = numerador * racional.numerador;
        int d = denominador * racional.denominador;
        setNumerador(n);
        setDenominador(d);
    }

    public void dividir(Racional racional){
        if (racional.numerador == 0) System.out.println("No se puede dividir por 0.");
        int n = numerador * racional.denominador;
        int d = denominador * racional.numerador;
        setNumerador(n);
        setDenominador(d);
    }

    public double toDecimal(){
        return (double) numerador / denominador;
    }

    @Override
    public String toString(){
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object objeto){
        Racional racional = (Racional) objeto;
        return numerador == racional.numerador && denominador == racional.denominador;
    }

    public int compareTo(Racional r) {
        if (toDecimal() > r.toDecimal()) return 1;
        else if (toDecimal() < r.toDecimal()) return -1;
        else return 0;
    }
}