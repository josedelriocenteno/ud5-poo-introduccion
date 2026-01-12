package A4_Constructores;

/**

 ConstructorSobrecarga.java

 Apuntes en formato código sobre sobrecarga de constructores en Java.

 OBJETIVOS:

 Aprender a crear múltiples constructores en la misma clase (sobrecarga).

 Permitir crear objetos de diferentes formas según los datos disponibles.

 Mostrar cómo asignar valores predeterminados cuando no se proporciona información.
 */

public class ConstructorSobrecarga {

    // ============================================================================================
// 1. ATRIBUTOS DE LA CLASE
// ============================================================================================
    private String nombre;
    private int edad;
    private String ciudad;

// ============================================================================================
// 2. CONSTRUCTORES SOBRECARGADOS
// ============================================================================================

    /*
     * Constructor 1: Sin parámetros
     * - Inicializa atributos con valores predeterminados
     * - Permite crear objetos aunque no tengamos información inicial
     */
    public ConstructorSobrecarga() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.ciudad = "No especificada";
    }

    /*
     * Constructor 2: Con nombre y edad
     * - Ciudad se inicializa con valor predeterminado
     * - Útil si no conocemos la ciudad al crear el objeto
     */
    public ConstructorSobrecarga(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = "No especificada";
    }

    /*
     * Constructor 3: Con todos los atributos
     * - Inicializa todos los atributos con los valores proporcionados
     */
    public ConstructorSobrecarga(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

// ============================================================================================
// 3. MÉTODOS DE LA CLASE
// ============================================================================================

    /*
     * Mostrar información del objeto en consola
     */
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
    }

// ============================================================================================
// 4. MAIN — EJEMPLO DE USO DE SOBRECARGA
// ============================================================================================

    public static void main(String[] args) {
        // Objeto con constructor sin parámetros
        ConstructorSobrecarga persona1 = new ConstructorSobrecarga();
        System.out.println("Objeto 1 (constructor sin parámetros):");
        persona1.mostrarInfo();

        System.out.println();

        // Objeto con constructor nombre + edad
        ConstructorSobrecarga persona2 = new ConstructorSobrecarga("Ana", 25);
        System.out.println("Objeto 2 (constructor con nombre y edad):");
        persona2.mostrarInfo();

        System.out.println();

        // Objeto con constructor completo (nombre, edad, ciudad)
        ConstructorSobrecarga persona3 = new ConstructorSobrecarga("Luis", 35, "Madrid");
        System.out.println("Objeto 3 (constructor con todos los atributos):");
        persona3.mostrarInfo();
    }

// ============================================================================================
// 5. NOTAS ADICIONALES
// ============================================================================================
    /*
     * - La sobrecarga permite múltiples formas de crear objetos según la información disponible.
     * - Cada constructor debe tener una lista de parámetros distinta (tipo o cantidad).
     * - Se puede llamar a un constructor desde otro usando 'this(...)' (ver next level).
     * - Permite establecer valores por defecto y evitar duplicar lógica.
     */


}