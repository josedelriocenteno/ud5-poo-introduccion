package A5_Relaciones_Entre_Clases;

// ================================================================
// Asociacion.java
// ================================================================
// OBJETIVO DEL ARCHIVO
// ---------------------------------------------------------------
// - Entender qué es una ASOCIACIÓN entre clases
// - Ver un ejemplo simple, real y 100% claro
// - Diferenciarla de agregación y composición
// ================================================================


// ================================================================
// 1. ¿QUÉ ES UNA ASOCIACIÓN?
// ---------------------------------------------------------------
// → Es una relación *débil* entre dos clases.
// → Una clase *usa* a otra, pero NO depende totalmente de ella.
//
// ✔ Ninguna clase posee a la otra
// ✔ No hay ciclo de vida compartido
// ✔ La relación es simplemente:
//       "A conoce a B" o "A usa a B"
//
// EJEMPLOS REALES:
//   - Un Profesor usa un Libro para preparar clases
//   - Una Persona usa un Coche (pero no lo posee necesariamente)
//   - Un Estudiante utiliza un Ordenador en la biblioteca
//
// → Asociación NO implica propiedad
// → Es la relación más simple y más flexible
// ================================================================


// ================================================================
// 2. EJEMPLO DE CLASES PARA LA ASOCIACIÓN
// ---------------------------------------------------------------
// ✦ Profesor
// ✦ Libro
//
// El profesor *usa* un libro para enseñar, pero el libro NO pertenece
// al profesor, ni se destruye cuando el profesor deja de existir.
//
// → Esto es ASOCIACIÓN simple.
// ================================================================

class Libro {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}


// ================================================================
// Profesor tiene una asociación con Libro
// ---------------------------------------------------------------
// IMPORTANTE:
//
// - Profesor *recibe o usa* un Libro, pero NO es dueño de él.
// - El Libro EXISTE independientemente del Profesor.
// - El Profesor puede usar varios libros o ninguno.
// ================================================================

class Profesor {

    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    // MÉTODO QUE DEMUESTRA ASOCIACIÓN (Profesor usa Libro)
    public void explicarTema(Libro libro) {
        System.out.println(
                nombre + " está explicando usando el libro: " + libro.getTitulo()
        );
    }
}


// ================================================================
// 3. USO PRÁCTICO
// ---------------------------------------------------------------
// - El Profesor usa un libro sin que sea suyo.
// - El libro se crea fuera y se pasa como parámetro.
// - Ninguno depende de la vida del otro.
// ================================================================

class UsoAsociacion {
    public static void main(String[] args) {

        Libro libro = new Libro("Programación en Java");
        Profesor profesor = new Profesor("Carlos");

        profesor.explicarTema(libro);
        // Salida:
        // "Carlos está explicando usando el libro: Programación en Java"
    }
}


// ================================================================
// 4. LO QUE DEBES RECORDAR
// ---------------------------------------------------------------
// ✔ Asociación = relación débil (uso)
// ✔ Una clase conoce a otra, pero no la posee
// ✔ No hay ciclo de vida compartido
// ✔ Es la relación más sencilla entre clases
// ✔ El objeto asociado suele entrar por:
//      → parámetros
//      → setters
//      → inyección simple
// ================================================================