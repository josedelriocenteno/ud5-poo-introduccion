package A5_Relaciones_Entre_Clases;

// ================================================================
// Composicion.java
// ================================================================
// OBJETIVO DEL ARCHIVO
// ---------------------------------------------------------------
// - Entender qué es una COMPOSICIÓN entre clases
// - Ver un ejemplo simple, real y 100% claro
// - Diferenciarla de asociación y agregación
// ================================================================


// ================================================================
// 1. ¿QUÉ ES UNA COMPOSICIÓN?
// ---------------------------------------------------------------
// → Es la relación más fuerte entre clases (todo-parte)
// → Una clase "contiene" a otra y controla completamente su ciclo de vida
//
// ✔ La parte NO puede existir sin el todo
// ✔ Cuando el todo se destruye, la parte también se destruye
// ✔ Se usa cuando una clase depende completamente de otra
//
// EJEMPLOS REALES:
//   - Un Coche tiene un Motor → si el Coche se destruye, el Motor también
//   - Un Libro tiene Páginas → las páginas no existen sin el libro
//   - Una Casa tiene Habitaciones → las habitaciones dependen de la casa
//
// → Composición = relación fuerte, vida conjunta
// ================================================================


// ================================================================
// 2. EJEMPLO DE CLASES PARA LA COMPOSICIÓN
// ---------------------------------------------------------------
// ✦ Coche
// ✦ Motor
//
// El Motor pertenece al Coche y no puede existir fuera de él.
// Si el Coche se elimina, el Motor también deja de existir.
// ================================================================

class Motor {
    private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}


// ================================================================
// Coche contiene un Motor (Composición)
// ---------------------------------------------------------------
// IMPORTANTE:
//
// - El Coche crea el Motor dentro de su constructor
// - El Motor NO existe fuera del Coche
// - La relación es de vida conjunta (todo-parte)
// ================================================================

class Coche {

    private String marca;
    private Motor motor; // Composición: Coche controla la vida del Motor

    public Coche(String marca, String tipoMotor) {
        this.marca = marca;
        this.motor = new Motor(tipoMotor); // Coche crea el Motor
    }

    public void mostrarInfo() {
        System.out.println("Coche: " + marca + " | Motor: " + motor.getTipo());
    }
}


// ================================================================
// 3. USO PRÁCTICO
// ---------------------------------------------------------------
// - El Motor NO se crea fuera, lo crea el Coche
// - La existencia del Motor depende del Coche
// ================================================================

class UsoComposicion {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Toyota", "V6");
        Coche coche2 = new Coche("Honda", "Electrico");

        coche1.mostrarInfo();
        coche2.mostrarInfo();
        // Salida:
        // "Coche: Toyota | Motor: V6"
        // "Coche: Honda | Motor: Electrico"
    }
}


// ================================================================
// 4. LO QUE DEBES RECORDAR
// ---------------------------------------------------------------
// ✔ Composición = relación todo-parte muy fuerte
// ✔ La clase “todo” crea y controla la vida de la parte
// ✔ La parte NO puede existir sola
// ✔ Se usa cuando el ciclo de vida de los objetos está ligado
// ✔ La creación de la parte suele ser interna (constructor del todo)
// ================================================================