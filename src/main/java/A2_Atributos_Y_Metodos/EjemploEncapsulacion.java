package A2_Atributos_Y_Metodos;

// EjemploEncapsulacion.java
// Este ejemplo muestra cómo utilizar la encapsulación en Java con atributos privados
// y métodos públicos getters y setters para controlar el acceso a esos atributos.

public class EjemploEncapsulacion {

    // Atributos privados para proteger los datos del acceso directo desde fuera de la clase
    private String nombre;
    private int edad;

    // Constructor que inicializa los atributos al crear un objeto
    public EjemploEncapsulacion(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad); // Usamos setEdad para incluir validación al asignar edad
    }

    // Getter para obtener el valor del atributo nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para modificar el valor del atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener el valor del atributo edad
    public int getEdad() {
        return edad;
    }

    // Setter para modificar el valor del atributo edad con validación de datos
    public void setEdad(int edad) {
        if (edad >= 0) { // Validamos que la edad no sea negativa
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa");
            this.edad = 0; // Asignar valor por defecto en caso de error
        }
    }

    // Método para mostrar la información del objeto
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear un objeto con valores iniciales
        EjemploEncapsulacion persona = new EjemploEncapsulacion("María", 28);

        // Mostrar información inicial
        persona.mostrarInfo();

        // Intentar modificar atributos usando setters
        persona.setNombre("Ana");
        persona.setEdad(35);

        // Mostrar información modificada
        System.out.println("Después de modificar los datos:");
        persona.mostrarInfo();

        // Intento de asignar un valor inválido para edad
        persona.setEdad(-5); // Aquí se disparará la validación y no se cambiará la edad

        // Mostrar información para verificar que no cambió la edad
        System.out.println("Después de intentar asignar edad negativa:");
        persona.mostrarInfo();
    }
}