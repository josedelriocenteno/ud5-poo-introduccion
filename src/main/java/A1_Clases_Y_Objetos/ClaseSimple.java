package A1_Clases_Y_Objetos;

/**
 * ClaseSimple.java
 * Introducción fundamental a clases y objetos en Java.
 *
 * Esta clase explica con claridad:
 *  - Qué es una clase y qué representa
 *  - Qué es el estado (atributos) y el comportamiento (métodos)
 *  - Cómo Java gestiona constructores por defecto
 *  - Validaciones básicas
 *  - Uso de 'this'
 *  - Qué ocurre en memoria cuando se crean objetos
 *
 * Este archivo sirve como base antes de estudiar:
 *  - Encapsulación (private, getters/setters)
 *  - Constructores personalizados
 *  - Sobrecarga
 *  - Relaciones entre clases (composición, agregación)
 *  - Buenas prácticas OOP
 */
    public class ClaseSimple {

    // =================================================================================================
    // 1. ATRIBUTOS (Estado del objeto)
    // =================================================================================================
    // Son las "propiedades" o características que tendrá cada objeto individual.
    // Estos campos NO son estáticos: pertenecen a cada instancia creada con 'new'.
    //
    // Nota: no usamos "private" todavía porque este tema se ve en encapsulación.
    String nombre;     // Nombre de la persona
    int edad;          // Edad de la persona
    
    // =================================================================================================
    // 2. CONSTRUCTOR POR DEFECTO (GENERADO AUTOMÁTICAMENTE POR JAVA)
    // =================================================================================================
    // Si no defines ningún constructor, Java genera:
    //
    //   public ClaseSimple() { }
    //
    // Esto permite crear objetos así:
    //   ClaseSimple p = new ClaseSimple();
    //
    // En clases complejas, casi siempre definiremos nuestros propios constructores.

    // =================================================================================================
    // 3. MÉTODOS (Comportamiento del objeto)
    // =================================================================================================

    /**
     * Mostrar información del objeto.
     * Muestra el estado actual de la instancia.
     *
     * Nota: Esto NO devuelve nada, solo imprime datos.
     */
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    /**
     * Actualiza la edad del objeto con una validación.
     *
     * Uso de VALIDACIÓN:
     *  - Evita estados inválidos (edad negativa, etc.)
     *  - Es una de las bases de un diseño robusto
     *
     * @param nuevaEdad La nueva edad a asignar
     */
    void actualizarEdad(int nuevaEdad) {
        if (nuevaEdad >= 0) {
            edad = nuevaEdad;
        } else {
            System.out.println("[ERROR] La edad no puede ser negativa.");
        }
    }

    // =================================================================================================
    // 4. MÉTODO ADICIONAL: Cambiar nombre (para reforzar el concepto de estado)
    // =================================================================================================
    /**
     * Actualiza el nombre del objeto.
     *
     * @param nuevoNombre Nuevo nombre para la persona
     */
    void actualizarNombre(String nuevoNombre) {
        if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
            nombre = nuevoNombre;
        } else {
            System.out.println("[ERROR] El nombre no puede ser vacío.");
        }
    }

    // =================================================================================================
    // 5. MÉTODO CON RETURN: comprobar si es mayor de edad
    // =================================================================================================
    /**
     * Determina si la persona es mayor de edad.
     *
     * @return true si edad >= 18, false en caso contrario
     */
    boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // =================================================================================================
    // 6. USO DE 'this' (EXPLICACIÓN IMPORTANTE)
    // =================================================================================================
    /*
     * 'this' se refiere al objeto actual.
     *
     * ¿Cuándo se usa?
     *  - Cuando un parámetro tiene el mismo nombre que un atributo
     *  - En constructores
     *  - En métodos encadenados (fluentes)
     *
     * Ejemplo típico (no usado arriba para no mezclar):
     *
     * void setEdad(int edad) {
     *     this.edad = edad; // 'this.edad' = atributo, 'edad' = parámetro
     * }
     */

    // =================================================================================================
    // 7. QUÉ OCURRE EN MEMORIA (RESUMEN CLARO)
    // =================================================================================================
    /*
     * Cuando escribes:
     *    ClaseSimple p = new ClaseSimple();
     *
     * Ocurre lo siguiente:
     * 1. Se reserva memoria en la "heap" para un nuevo objeto ClaseSimple.
     * 2. Se crean los atributos:
     *       nombre = null
     *       edad = 0
     * 3. Se ejecuta el constructor por defecto.
     * 4. La variable 'p' en la memoria stack guarda una REFERENCIA al objeto en la heap.
     *
     * Esto es clave para entender:
     *  - paso por referencia en objetos
     *  - asignaciones entre variables
     *  - colector de basura (GC)
     */

    // =================================================================================================
    // 8. NOTAS FINALES (CONCEPTOS QUE SE VERÁN LUEGO)
    // =================================================================================================
    /*
     * Más adelante aprenderás:
     *
     * ✔ Encapsulación:
     *      private String nombre;
     *      getters/setters
     *
     * ✔ Constructores personalizados:
     *      public ClaseSimple(String nombre, int edad) { ... }
     *
     * ✔ Sobrecarga:
     *      varios métodos con el mismo nombre pero parámetros distintos
     *
     * ✔ Relaciones entre clases:
     *      - Composición
     *      - Agregación
     *      - Asociación
     *
     * ✔ Métodos especializados:
     *      toString(), equals(), hashCode()
     *
     * ✔ Buenas prácticas OOP:
     *      cohesión, bajo acoplamiento, responsabilidad única (SRP)
     */
}