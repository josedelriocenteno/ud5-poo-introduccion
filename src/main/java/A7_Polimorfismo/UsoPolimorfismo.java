package A7_Polimorfismo;

/**
 UsoPolimorfismo.java

 Apuntes en formato código sobre cómo usar polimorfismo en Java.

 OBJETIVOS:

 Demostrar que referencias de tipo padre pueden apuntar a objetos de subclases

 Mostrar cómo iterar sobre colecciones de objetos polimórficos

 Observar que el método ejecutado depende del objeto real (runtime), no de la referencia
 */

public class UsoPolimorfismo {

    public static void main(String[] args) {

        // ============================================================================================
        // 1. REFERENCIAS DE CLASE BASE APUNTANDO A OBJETOS
        // ============================================================================================
        Animal animal = new Animal();   // objeto de tipo Animal
        animal.hacerSonido();           // Salida: El animal hace un sonido

        Animal perro = new Perro();     // referencia de tipo Animal → objeto Perro
        perro.hacerSonido();            // Salida: El perro ladra (polimorfismo)

        Animal gato = new Gato();       // referencia de tipo Animal → objeto Gato
        gato.hacerSonido();             // Salida: El gato maulla (polimorfismo)

        // ============================================================================================
        // 2. COLECCIÓN DE OBJETOS POLIMÓRFICOS
        // ============================================================================================
        Animal[] animales = {animal, perro, gato};

        System.out.println("\nIterando sobre array de animales con polimorfismo:");

        // Cada objeto ejecuta su versión de hacerSonido() según su tipo real
        for (Animal a : animales) {
            a.hacerSonido();
        }

        // ============================================================================================
        // 3. CONCEPTOS CLAVE OBSERVADOS
        // ============================================================================================
        /*
         * - Una referencia de clase padre puede contener cualquier objeto de su jerarquía.
         * - El método sobrescrito se determina en tiempo de ejecución (dinámico).
         * - Esto permite escribir código genérico que trabaja con distintas subclases.
         * - Las colecciones (arrays, listas) de tipo padre facilitan el manejo de múltiples subclases.
         * - Es fundamental entender la diferencia entre tipo de referencia y tipo de objeto real.
         */
    }
}