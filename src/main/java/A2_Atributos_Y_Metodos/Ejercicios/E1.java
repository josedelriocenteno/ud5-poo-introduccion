package A2_Atributos_Y_Metodos.Ejercicios;


public class E1 {
    private int edad;
    private String nombre;
    private double salario;
    private static String empresa = "OpenAI";
    private static int contador;
    private final int BONO = 400;

    boolean esMayorDeEdad(){
        return edad >= 18;
    }
    public void aumentoDeSalario(double porcentaje){
        if (porcentaje > 0){
            double suma = salario * porcentaje/100;
            salario += suma;
        }else
            System.out.println("El porcentaje debe de ser mayor que 0");
    }
    public static void cambiarNombreEmpresa(String nuevoNombre){
        empresa = nuevoNombre;
    }
    // Constructor principal con todos los parámetros
    public E1(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        setSalario(salario); // Usamos setter para validar salario
        contador++;
    }
    // Sobrecarga del constructor para crear objeto solo con nombre
    // edad y salario se inicializan con valores por defecto (0 y 0.0)
    public E1(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.salario = 0.0;
    }
    // Getter y setter para salario con validación para no aceptar negativos
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario>0)
            this.salario = salario;
        else
            System.out.println("No se aceptan salarios negativos.");
    }
    public void saludo(){
        System.out.println("Hola " + nombre);
    }
    public void aumentarSalrioConBono(){
        salario += BONO;
    }
    public void setNombre(String nombre){
        if (nombre != null && !nombre.isBlank())
            this.nombre = nombre;
        else
            System.out.println("No se aceptan cadenas vacias.");
    }
    public static String getEmpresa(){
        return empresa;
    }
}