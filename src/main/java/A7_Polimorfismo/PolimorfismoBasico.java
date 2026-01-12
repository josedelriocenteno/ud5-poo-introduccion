package A7_Polimorfismo;

/**

 PolimorfismoBasico.java

 Apuntes en formato código sobre polimorfismo en Java.

 OBJETIVOS:

 Entender qué es el polimorfismo

 Ver cómo funciona la sobrescritura de métodos (@Override)

 Observar que una referencia de tipo padre puede apuntar a un objeto hijo
 */

// ================================================================
// 1. CLASE BASE (SUPERCLASE)
// ================================================================
class Animal {
    /**
     * Método que puede ser sobrescrito en clases hijas
     */
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

// ================================================================
// 2. CLASES DERIVADAS (SUBCLASES)
// ================================================================
class Perro extends Animal {
    /**
     * Sobrescribe el método hacerSonido() para comportamiento específico
     */
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla");
    }
}

// ================================================================
// 3. CLASE PRINCIPAL / MAIN
// ================================================================
public class PolimorfismoBasico {

    public static void main(String[] args) {

        // ============================================================================================
        // CREACIÓN DE OBJETOS Y REFERENCIAS
        // ============================================================================================
        Animal animal1 = new Animal();       // Objeto Animal
        Animal animal2 = new Perro();        // Polimorfismo: referencia de tipo Animal, objeto Perro
        Animal animal3 = new Gato();         // Polimorfismo: referencia de tipo Animal, objeto Gato

        // ============================================================================================
        // LLAMADAS A MÉTODOS (SOBRESCRITURA)
        // ============================================================================================
        animal1.hacerSonido(); // Ejecuta Animal
        animal2.hacerSonido(); // Ejecuta Perro (sobrescrito)
        animal3.hacerSonido(); // Ejecuta Gato (sobrescrito)

        // ============================================================================================
        // CONCEPTOS CLAVE
        // ============================================================================================
        /*
         * 1) Polimorfismo = "muchas formas":
         *    Una referencia de tipo padre puede apuntar a objetos de cualquier subclase.
         *
         * 2) Sobrescritura (@Override):
         *    Permite que un método definido en la clase base tenga un comportamiento distinto en la subclase.
         *
         * 3) Ventajas:
         *    - Permite escribir código genérico (referencias de tipo padre)
         *    - Facilita extensibilidad y mantenimiento
         *
         * 4) Consideraciones:
         *    - El tipo de la referencia determina qué métodos y atributos son accesibles (solo visibles del tipo padre)
         *    - El método ejecutado se determina en tiempo de ejecución (polimorfismo dinámico)
         */
    }
}