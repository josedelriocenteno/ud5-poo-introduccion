package EjerciciosClase;

public class Figuras {
}

class Circulo{

    private double radio;
    private Punto centro;

    public Circulo(double radio){
        this.radio = radio;
        centro = new Punto(0,0);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto punto) {
        this.centro = punto;
    }

    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro(){
        return 2 * Math.PI * radio;
    }

    public void mover(Punto punto){
        this.centro.mover(punto);
    }

    public void desplazar(double despX, double despY){
        this.centro.desplazar(despX,despY);
    }

    @Override
    public String toString(){
        return String.format("Circulo > radio=%f centro=%s",radio,centro.toString());
    }
}

class Rectangulo{

    private double base;
    private double altura;
    private Punto centro;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        centro = new Punto();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double area(){
        return base * altura;
    }

    public double perimetro(){
        return 2*base + 2*altura;
    }

    public void mover(Punto punto){
        this.centro.mover(punto);
    }

    public void desplazar(double despX, double despY){
        this.centro.desplazar(despX,despY);
    }

    @Override
    public String toString(){
        return String.format("Rectángulo > base=%f altura=%f centro=%s",base,altura,centro.toString());
    }
}

class Cuadrado{

    private double lado;
    private Punto centro;

    public Cuadrado(double lado){
        this.lado = lado;
        centro = new Punto();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double area(){
        return Math.pow(lado,2);
    }

    public double perimetro(){
        return 4*lado;
    }

    public void mover(Punto punto){
        this.centro.mover(punto);
    }

    public void desplazar(double despX, double despY){
        this.centro.desplazar(despX,despY);
    }

    @Override
    public String toString(){
        return String.format("Cuadrado > lado=%f centro=%s",lado,centro.toString());
    }
}

class Triangulo{

    private double base;
    private double altura;
    private Punto centro;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        centro = new Punto();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double area(){
        return (base * altura)/2;
    }

    public double perimetro(){
        double hipotenusa = Math.sqrt(base * base + altura * altura);
        return base + altura + hipotenusa;
    }

    public void mover(Punto punto){
        this.centro.mover(punto);
    }

    public void desplazar(double despX, double despY){
        this.centro.desplazar(despX,despY);
    }

    @Override
    public String toString(){
        return String.format("Triángulo > base=%f altura=%f centro=%s",base,altura,centro.toString());
    }
}

class AppFiguras {
    static void main() {

        Circulo circulo = new Circulo(5);
        circulo.setCentro(new Punto(4.2,-3.6));

        System.out.println(circulo);
        System.out.println("Area = " + circulo.area());
        System.out.println("Perimetro = " + circulo.perimetro());
        System.out.println(" ");
    }
}