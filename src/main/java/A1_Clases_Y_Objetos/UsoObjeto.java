package A1_Clases_Y_Objetos;

/**
 * UsoObjeto.java
 * Ejemplo completo de creación y uso de objetos en Java.
 *
 * Este programa demuestra de forma práctica:
 *  - Qué significa "instanciar" un objeto con new
 *  - Cómo cada objeto creado posee su propio estado independiente
 *  - Cómo acceder a los atributos (aún sin encapsulación)
 *  - Cómo usar métodos para consultar o modificar el estado interno
 *  - Qué ocurre en memoria al trabajar con referencias a objetos
 *
 * Este archivo complementa ClaseSimple.java y sirve como práctica inicial
 * antes de ver encapsulación, constructores personalizados, relaciones
 * entre clases y polimorfismo.
 */
public class UsoObjeto {

    public static void main(String[] args) {

        // ============================================================================================
        // 1. CREACIÓN DE OBJETOS (INSTANCIAS)
        // ============================================================================================
        // Cada "new ClaseSimple()" crea un NUEVO objeto en memoria (en la heap).
        // Las variables persona1 y persona2 guardan únicamente REFERENCIAS al objeto creado.

        ClaseSimple persona1 = new ClaseSimple();  // Objeto #1
        ClaseSimple persona2 = new ClaseSimple();  // Objeto #2


        // ============================================================================================
        // 2. ASIGNACIÓN INICIAL DE ESTADO (ATRIBUTOS)
        // ============================================================================================
        // Como estamos antes de estudiar encapsulación, los atributos son accesibles directamente.

        persona1.nombre = "Juan";   // atributo del objeto 1
        persona1.edad  = 25;

        persona2.nombre = "Ana";    // atributo del objeto 2
        persona2.edad  = 30;


        // ============================================================================================
        // 3. MOSTRAR ESTADO DE CADA OBJETO
        // ============================================================================================
        // Cada objeto mantiene su propio estado. Los métodos leen ESO MISMO
        // que está almacenado dentro de su instancia.

        System.out.println("===== Información de persona1 =====");
        persona1.mostrarInfo();

        System.out.println("\n===== Información de persona2 =====");
        persona2.mostrarInfo();


        // ============================================================================================
        // 4. MODIFICAR EL ESTADO DE UN OBJETO (MEDIANTE MÉTODOS)
        // ============================================================================================
        // Llamamos a un método de persona1 para cambiar su edad.
        // Esto NO afecta al objeto persona2, porque cada uno tiene su propio campo edad.

        System.out.println("\nActualizando la edad de Juan a 26...");
        persona1.actualizarEdad(26);

        System.out.println("Información actualizada de persona1:");
        persona1.mostrarInfo();


        // ============================================================================================
        // 5. USO DE UN MÉTODO QUE DEVUELVE VALORES (return)
        // ============================================================================================
        System.out.println("\n¿Juan es mayor de edad?");
        System.out.println("Resultado: " + persona1.esMayorDeEdad());

        System.out.println("¿Ana es mayor de edad?");
        System.out.println("Resultado: " + persona2.esMayorDeEdad());


        // ============================================================================================
        // 6. DEMOSTRACIÓN IMPORTANTE: ASIGNAR UNA REFERENCIA A OTRA
        // ============================================================================================
        // En Java NO se copian objetos al asignar referencias, solo se copia la referencia.
        // EJEMPLO:
        //
        // persona3 = persona1;
        //
        // Ahora persona3 y persona1 APUNTAN AL MISMO OBJETO EN MEMORIA.

        ClaseSimple persona3 = persona1;  // persona3 referencia el MISMO objeto que persona1

        System.out.println("\n===== Demostración de referencias =====");
        persona3.actualizarEdad(40); // Cambiando la edad desde persona3

        System.out.println("Edad vista desde persona1:");
        persona1.mostrarInfo();   // Cambió porque es el MISMO objeto

        System.out.println("Edad vista desde persona3:");
        persona3.mostrarInfo();

        // Después estudiaremos "copia profunda" vs "copia superficial" en clone().


        // ============================================================================================
        // 7. EJERCICIOS PROPUESTOS (MEJORADOS)
        // ============================================================================================
        /*
         * 1. Crea un nuevo objeto persona4 y asigna tu nombre y edad.
         * 2. Muestra su información.
         * 3. Actualiza su edad usando actualizarEdad().
         * 4. Implementa en ClaseSimple un método que:
         *       - Devuelva un String con "Hola, soy [nombre] y tengo [edad] años".
         * 5. Crea un método que permita incrementar la edad en 1 año.
         * 6. Crea un método que compare dos objetos ClaseSimple y diga quién es mayor.
         *
         * *** BONUS (MUY IMPORTANTE) ***
         * 7. Comprueba el comportamiento si haces:
         *          persona4 = persona2;
         *    y luego cambias persona4.nombre.
         *    Explica por qué afecta también a persona2.
         */
    }
}