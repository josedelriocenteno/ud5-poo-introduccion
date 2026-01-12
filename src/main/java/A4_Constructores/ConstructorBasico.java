package A4_Constructores;

/**

 ConstructorBasico.java

 Apuntes en formato código sobre constructores en Java.

 OBJETIVOS:

 Entender qué es un constructor y cómo se diferencia de un método normal.

 Inicializar atributos de un objeto al momento de creación.

 Uso de 'this' para diferenciar atributos de parámetros.

 Preparación para ver sobrecarga de constructores y buenas prácticas.
 */
public class ConstructorBasico {

    // ============================================================================================
// 1. ATRIBUTOS DE LA CLASE
// ============================================================================================
    private String nombre;
    private int edad;

// ============================================================================================
// 2. CONSTRUCTORES
// ============================================================================================

    /*

    Constructor con parámetros

    Tiene el mismo nombre que la clase.

    No devuelve ningún valor.

    Se ejecuta automáticamente al crear un objeto.
    */
    public ConstructorBasico(String nombre, int edad) {
        this.nombre = nombre; // 'this.nombre' se refiere al atributo de la clase
        this.edad = edad; // 'this.edad' se refiere al atributo de la clase
    }

    /*

    Constructor vacío (sin parámetros)

    Permite crear objetos con valores por defecto.

    Útil si no quieres inicializar los atributos al crear el objeto.
    */
    public ConstructorBasico() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

// ============================================================================================
// 3. MÉTODOS GETTERS Y SETTERS
// ============================================================================================

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) { // Validación simple
            this.edad = edad;
        } else {
            System.out.println("Edad no puede ser negativa");
        }
    }

// ============================================================================================
// 4. MÉTODO DE COMPORTAMIENTO
// ============================================================================================

    /*

    Mostrar información del objeto en consola
    */
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

// ============================================================================================
// 5. MAIN — EJEMPLO DE USO
// ============================================================================================

    public static void main(String[] args) {
// Crear objeto usando constructor con parámetros
        ConstructorBasico persona1 = new ConstructorBasico("Carlos", 40);
        persona1.mostrarInfo();

        System.out.println();

// Crear objeto usando constructor vacío
        ConstructorBasico persona2 = new ConstructorBasico();
        persona2.mostrarInfo();

        System.out.println("\nActualizando datos de persona2...");
        persona2.setNombre("Lucía");
        persona2.setEdad(28);
        persona2.mostrarInfo();


    }

// ============================================================================================
// 6. NOTAS ADICIONALES
// ============================================================================================
/*

Un constructor siempre tiene el mismo nombre que la clase y no devuelve valor.

Podemos tener varios constructores (sobrecarga) con diferente número de parámetros.

El uso de 'this' es esencial cuando los parámetros tienen el mismo nombre que los atributos.

Siempre inicializar atributos importantes para evitar valores nulos o inconsistentes.

Constructores vacíos permiten crear objetos con valores por defecto y modificarlos luego.
*/
}