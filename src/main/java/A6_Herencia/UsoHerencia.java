package A6_Herencia;

/**

 * UsoHerencia.java
 * Apuntes en formato código sobre creación de objetos y demostración de herencia en Java.
 *
 * OBJETIVOS:
 * * Crear objetos de la clase padre y de la subclase
 * * Observar cómo se heredan atributos y métodos
 * * Mostrar sobrescritura de métodos y uso de métodos exclusivos de la subclase
 */

public class UsoHerencia {
    public static void main(String[] args) {

        // ============================================================================================
        // 1. OBJETO DE LA CLASE PADRE
        // ============================================================================================
        ClasePadre padre = new ClasePadre("Juan", 50);
        System.out.println("Objeto de ClasePadre:");
        padre.mostrarInfo();  // Muestra atributos de ClasePadre
        padre.saludar();      // Método de ClasePadre (no sobrescrito)

        System.out.println();

        // ============================================================================================
        // 2. OBJETO DE LA CLASE HIJA (subclase)
        // ============================================================================================
        ClaseHija hija = new ClaseHija("María", 25, "Madrid");
        System.out.println("Objeto de ClaseHija:");
        hija.mostrarInfo();    // Método heredado de ClasePadre
        hija.mostrarCiudad();  // Método exclusivo de ClaseHija
        hija.saludar();        // Método sobrescrito en ClaseHija (@Override)

        // ============================================================================================
        // 3. NOTAS Y CONCEPTOS CLAVE
        // ============================================================================================
        /*
         * - Los objetos de la subclase pueden acceder a métodos heredados y atributos protected.
         * - Los métodos sobrescritos permiten personalizar comportamiento de la subclase.
         * - Los métodos exclusivos de la subclase solo existen en esa clase.
         * - La herencia permite reutilización de código y extensión de funcionalidades.
         * - protected: visibilidad que facilita herencia, pero no expone al mundo exterior.
         */
    }
}