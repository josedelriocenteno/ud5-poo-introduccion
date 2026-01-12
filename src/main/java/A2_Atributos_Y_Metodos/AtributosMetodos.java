package A2_Atributos_Y_Metodos;

/**
 * AtributosMetodos.java
 *
 * Este archivo explica de forma completa y detallada:
 *   - Atributos de instancia
 *   - Atributos de clase (static)
 *   - Constantes final
 *   - Uso de this
 *   - Encapsulación mediante private + getters/setters
 *   - Métodos de instancia y métodos estáticos
 *   - Validaciones en setters
 *
 * Este archivo sirve como base esencial antes de estudiar:
 *   → encapsulación avanzada
 *   → relaciones entre clases
 *   → herencia y polimorfismo
 *   → modificadores de acceso
 */
public class AtributosMetodos {

    // ================================================================================================
    // 1. ATRIBUTOS DE INSTANCIA
    // ================================================================================================
    // Cada OBJETO tendrá su propia copia de estos atributos.
    // Se recomienda SIEMPRE usar private para mantener encapsulación.

    private String nombre;    // Solo accesible desde la clase
    private int edad;         // Validaremos valores en el setter
    public double salario;    // Público: se puede acceder desde fuera


    // ================================================================================================
    // 2. ATRIBUTO DE CLASE (STATIC)
    // ================================================================================================
    // static → pertenece a la CLASE, no a los objetos.
    // Todos los objetos comparten UNA ÚNICA COPIA.

    //  Ejemplo rápido
//    public class Persona {
//        private String nombre;            // atributo de instancia
//        private static int contador = 0; // atributo estático
//
//        public Persona(String nombre) {
//            this.nombre = nombre;
//            contador++; // Incrementa el contador cada vez que creas una Persona
//        }
//
//        public static int getContador() {
//            return contador;
//        }
//    }


    private static int contador = 0; // Cuántos objetos se han creado


    // ================================================================================================
    // 3. CONSTANTE (FINAL)
    // ================================================================================================
    // final → su valor NO puede cambiar.
    // Convención: constantes suelen escribirse en mayúsculas, pero aquí seguimos tu estilo inicial.

    public final double PI = 3.1416;


    // ================================================================================================
    // 4. CONSTRUCTOR
    // ================================================================================================
    // Los constructores inicializan el estado del objeto.
    // El uso de "this" diferencia entre atributo y parámetro.

    public AtributosMetodos(String nombre, int edad, double salario) {
        this.nombre = nombre;      // this.nombre = atributo | nombre = parámetro
        this.setEdad(edad);        // Usamos setter para aplicar validación
        this.salario = salario;
        contador++;                // Cada vez que se crea un objeto, aumentamos el contador
    }


    // ================================================================================================
    // 5. GETTERS Y SETTERS (ENCAPSULACIÓN)
    // ================================================================================================
    // Permiten controlar cómo se accede y modifica el estado interno del objeto.
    // Se pueden aplicar reglas, validaciones, logs, etc.

    // Los getters son métodos públicos que devuelven el valor
    // de un atributo privado, permitiendo leerlo.

    // Los setters son métodos públicos que asignan o modifican el valor de un
    // atributo privado, donde se pueden aplicar reglas, validaciones o
    // acciones adicionales antes de modificar el atributo.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // Podemos añadir validaciones si queremos
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        // Ejemplo de validación real
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida. Debe estar entre 0 y 120.");
        }
    }


    // ================================================================================================
    // 6. MÉTODOS DE INSTANCIA
    // ================================================================================================
    // Operan sobre los atributos del objeto.

    /**
     * Muestra toda la información del objeto.
     */
    public void mostrarInfo() {
        System.out.println("=== Información del empleado ===");
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad   : " + edad);
        System.out.println("Salario: " + salario);
    }

    /**
     * Aumenta el salario sumando un importe dado.
     */
    public void aumentarSalario(double aumento) {
        if (aumento > 0) {
            salario += aumento;
        } else {
            System.out.println("El aumento debe ser positivo.");
        }
    }


    // ================================================================================================
    // 7. MÉTODOS ESTÁTICOS
    // ================================================================================================
    // NO necesitan un objeto para ser usados.
    // Se llaman con: AtributosMetodos.getContador()

    public static int getContador() {
        return contador;
    }


    // ================================================================================================
    // 8. EJEMPLOS INTERNOS (NO SE EJECUTAN)
    // ================================================================================================
    /*
     * EJEMPLO DE USO:
     *
     * AtributosMetodos emp1 = new AtributosMetodos("Ana", 30, 1500);
     * AtributosMetodos emp2 = new AtributosMetodos("Luis", 22, 1200);
     *
     * emp1.mostrarInfo();
     * emp1.aumentarSalario(200);
     *
     * System.out.println("Total empleados creados: " + AtributosMetodos.getContador());
     *
     * emp2.setEdad(-5);  // Mostrará validación
     */


    // ================================================================================================
    // 9. IDEAS PARA EJERCICIOS (AMPLIADOS)
    // ================================================================================================
    /*
     * 1. Crea un método que devuelva si una persona es mayor de edad.
     * 2. Crea un método que calcule un aumento según porcentaje.
     * 3. Añade otro atributo static: empresa = "OpenAI".
     * 4. Crea un método estático cambiarEmpresa(String nuevaEmpresa).
     * 5. Añade una validación extra al setter de salario (no permitir valores < 0).
     * 6. Sobrecarga el constructor para permitir crear empleados SOLO con nombre.
     */
}