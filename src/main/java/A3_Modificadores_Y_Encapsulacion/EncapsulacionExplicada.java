package A3_Modificadores_Y_Encapsulacion;

// ================================================================
// EncapsulacionExplicada.java
// ================================================================
// OBJETIVO:
// - Entender QUÉ ES la encapsulación
// - Ver cómo se aplica correctamente en una clase real
// - Aprender a proteger atributos + exponer comportamientos seguros
// - Entender por qué "public" en todo es un ERROR
// ================================================================


// ================================================================
// 1. ¿QUÉ ES LA ENCAPSULACIÓN?
// ---------------------------------------------------------------
// → Es ocultar los datos internos de un objeto y permitir acceso
//   solo mediante MÉTODOS CONTROLADOS (getters/setters o similares).
//
// → Razones:
//   ✔ Proteger valores incorrectos
//   ✔ Evitar cambios inesperados desde fuera
//   ✔ Permitir validaciones
//   ✔ Mantener coherencia en el objeto
//
// → Regla general:
//   - Los atributos casi SIEMPRE van "private"
//   - Se accede a ellos con métodos públicos controlados
// ================================================================


// ================================================================
// 2. EJEMPLO INCORRECTO (SIN ENCAPSULACIÓN)
// ---------------------------------------------------------------
// Problemas:
// - Cualquiera puede poner edad = -500
// - Se rompe la lógica del objeto
// - No hay control
// ================================================================

class UsuarioMAL {
    public String nombre;
    public int edad;
}

//
// Esto permitiría cosas como:
//
// UsuarioMAL u = new UsuarioMAL();
// u.edad = -999;       // ERROR lógico
//


// ================================================================
// 3. EJEMPLO CORRECTO (CON ENCAPSULACIÓN REAL)
// ---------------------------------------------------------------
// - Atributos PRIVADOS
// - Validación en setters
// - Lógica interna protegida
// - Métodos seguros
// ================================================================

class Usuario {

    // ---------------------------
    // ATRIBUTOS PRIVADOS
    // ---------------------------
    private String nombre;
    private int edad;

    // ---------------------------
    // CONSTRUCTOR
    // ---------------------------
    public Usuario(String nombre, int edad) {
        this.setNombre(nombre);   // importante: usar setters
        this.setEdad(edad);
    }

    // ---------------------------
    // GETTERS Y SETTERS
    // ---------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // validación de ejemplo
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("ERROR: nombre vacío");
            return;
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        // validación real
        if (edad < 0 || edad > 120) {
            System.out.println("ERROR: la edad no es válida.");
            return;
        }
        this.edad = edad;
    }

    // ---------------------------
    // MÉTODOS DE COMPORTAMIENTO
    // → EXPLIQUEMOS LA DIFERENCIA
    // Estos métodos usan los atributos
    // de forma controlada y lógica.
    // ---------------------------
    public void cumplirAnios() {
        this.edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años");
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

}

// ================================================================
// 4. USO REAL DE LA CLASE
// ---------------------------------------------------------------
// - NUNCA accedemos directamente a los atributos
// - Usamos getters/setters → control total
// - Observa cómo protege de valores absurdos
// ================================================================

class UsoEncapsulacion {
    public static void main(String[] args) {

        Usuario u = new Usuario("Pepe", 20);

        u.presentarse();

        // Intentar poner una edad ilógica
        u.setEdad(-50);        // → NO LO PERMITE

        // Cambiar nombre correctamente
        u.setNombre("Roberto");

        u.cumplirAnios();      // edad +1

        u.presentarse();
    }
}


// ================================================================
// 5. QUÉ APRENDER DE ESTE ARCHIVO
// ---------------------------------------------------------------
// ✔ Los atributos casi siempre deben ser private
// ✔ Los setters son puerta de control → VALIDAR SIEMPRE
// ✔ El constructor también debería usar setters normalmente
// ✔ Los métodos reflejan comportamientos, NO datos
// ✔ Encapsular = proteger + controlar + evitar errores
// ================================================================