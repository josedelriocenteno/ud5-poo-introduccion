package A6_Herencia;

/**

 ClasePadre.java

 Apuntes en formato código sobre herencia en Java.

 OBJETIVOS:

 Comprender cómo se define una clase padre/base

 Aprender a usar atributos y métodos protegidos para herencia

 Mostrar cómo los métodos pueden ser sobrescritos (override) por subclases
 */

public class ClasePadre {

// ============================================================================================
// 1. ATRIBUTOS DE LA CLASE
// ============================================================================================

    /*
     * Atributos protegidos:
     * - Accesibles dentro de esta clase y en todas las subclases
     * - No se recomienda public para herencia, para mantener cierto control
     */
    protected String nombre;
    protected int edad;

// ============================================================================================
// 2. CONSTRUCTOR
// ============================================================================================

    /**
     * Constructor de la clase padre
     * @param nombre Nombre del objeto
     * @param edad Edad del objeto
     */
    public ClasePadre(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

// ============================================================================================
// 3. MÉTODOS DE LA CLASE
// ============================================================================================

    /**
     * Muestra información básica del objeto
     */
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    /**
     * Método que puede ser sobrescrito (override) en subclases
     */
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y soy una instancia de ClasePadre.");
    }

// ============================================================================================
// 4. NOTAS ADICIONALES
// ============================================================================================
    /*
     * - Los atributos protected permiten que las subclases accedan directamente
     *   sin necesidad de getters/setters, pero aún mantienen algo de control frente a clases externas.
     *
     * - Los métodos públicos permiten que cualquier clase pueda invocarlos.
     *
     * - Para extender esta clase:
     *      class ClaseHija extends ClasePadre { ... }
     *
     * - Se puede sobrescribir saludar() usando @Override en la subclase.
     */


}