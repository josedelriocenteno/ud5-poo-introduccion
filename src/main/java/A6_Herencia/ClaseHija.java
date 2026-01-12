package A6_Herencia;

/**

 ClaseHija.java

 Apuntes en formato código sobre herencia y sobrescritura en Java.

 OBJETIVOS:

 Comprender cómo heredar atributos y métodos de una clase padre

 Aprender a agregar nuevos atributos y métodos en la subclase

 Sobrescribir métodos de la clase padre usando @Override
 */

public class ClaseHija extends ClasePadre {

    // ============================================================================================
// 1. NUEVOS ATRIBUTOS DE LA SUBCLASE
// ============================================================================================
    private String ciudad; // Exclusivo de ClaseHija

// ============================================================================================
// 2. CONSTRUCTOR DE LA SUBCLASE
// ============================================================================================

    /**
     * Constructor de ClaseHija
     * @param nombre Nombre del objeto (heredado de ClasePadre)
     * @param edad Edad del objeto (heredado de ClasePadre)
     * @param ciudad Ciudad del objeto (nuevo atributo)
     */
    public ClaseHija(String nombre, int edad, String ciudad) {
        super(nombre, edad); // Llama al constructor de la clase padre
        this.ciudad = ciudad; // Inicializa el nuevo atributo
    }

// ============================================================================================
// 3. GETTERS Y SETTERS
// ============================================================================================

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

// ============================================================================================
// 4. SOBRESCRITURA DE MÉTODOS (Override)
// ============================================================================================

    /**
     * Sobrescribe el método saludar() de ClasePadre
     * para personalizar el mensaje con el nuevo atributo
     */
    @Override
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años y vivo en " + ciudad + ".");
    }

// ============================================================================================
// 5. MÉTODOS NUEVOS DE LA SUBCLASE
// ============================================================================================

    /**
     * Método exclusivo de ClaseHija para mostrar la ciudad
     */
    public void mostrarCiudad() {
        System.out.println("Ciudad: " + ciudad);
    }

// ============================================================================================
// 6. NOTAS ADICIONALES
// ============================================================================================
/*
 * - La palabra clave super() se usa para invocar constructores de la clase padre.
 * - Los métodos heredados pueden ser utilizados directamente o sobrescritos.
 * - Los atributos protected de la clase padre son accesibles directamente.
 * - Podemos agregar tantos atributos y métodos nuevos como necesitemos en la subclase.
 */
}