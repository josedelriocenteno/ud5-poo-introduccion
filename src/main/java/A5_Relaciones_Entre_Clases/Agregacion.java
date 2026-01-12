package A5_Relaciones_Entre_Clases;

// ================================================================
// Agregacion.java
// ================================================================
// OBJETIVO DEL ARCHIVO
// ---------------------------------------------------------------
// - Entender qué es una AGREGACIÓN entre clases
// - Ver un ejemplo simple, real y 100% claro
// - Diferenciarla de asociación y composición
// ================================================================


// ================================================================
// 1. ¿QUÉ ES UNA AGREGACIÓN?
// ---------------------------------------------------------------
// → Es una relación más fuerte que la asociación, pero NO tan fuerte como la composición.
// → Una clase "tiene" a otra, pero el objeto puede existir por sí mismo.
//
// ✔ Una clase contiene a otra (relación de todo-parte)
// ✔ Cada parte puede existir independientemente del todo
// ✔ El ciclo de vida NO está ligado completamente
//
// EJEMPLOS REALES:
//   - Un Departamento tiene varios Empleados
//   - Una Biblioteca tiene varios Libros
//   - Una Casa tiene varias Ventanas (pero las ventanas podrían existir por separado)
//
// → Agregación implica propiedad, pero no dependencia total
// ================================================================


// ================================================================
// 2. EJEMPLO DE CLASES PARA LA AGREGACIÓN
// ---------------------------------------------------------------
// ✦ Departamento
// ✦ Empleado
//
// El Departamento *tiene* Empleados, pero los Empleados existen fuera
// del Departamento. Si se elimina el Departamento, los Empleados siguen existiendo.
// ================================================================

import java.util.ArrayList;
import java.util.List;

class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}


// ================================================================
// Departamento contiene una lista de Empleados (Agregación)
// ---------------------------------------------------------------
// IMPORTANTE:
//
// - Departamento "posee" a los Empleados, pero NO los crea ni destruye.
// - Los Empleados pueden existir fuera del Departamento.
// - La relación es de todo-parte, pero independiente.
// ================================================================


class Departamento {

    private String nombre;
    private List<Empleado> empleados; // Contiene, pero no posee totalmente

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    // MÉTODO PARA AGREGAR EMPLEADOS (no crea el empleado, solo lo asocia)
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println(empleado.getNombre() + " ha sido agregado al departamento " + nombre);
    }

    // MÉTODO PARA LISTAR EMPLEADOS
    public void listarEmpleados() {
        System.out.println("Empleados en el departamento " + nombre + ":");
        for (Empleado e : empleados) {
            System.out.println("- " + e.getNombre());
        }
    }
}


// ================================================================
// 3. USO PRÁCTICO
// ---------------------------------------------------------------
// - Creamos empleados primero, fuera del Departamento
// - Luego los agregamos al Departamento
// - Ninguno depende del ciclo de vida del otro
// ================================================================

class UsoAgregacion {
    public static void main(String[] args) {

        Empleado e1 = new Empleado("Ana");
        Empleado e2 = new Empleado("Luis");

        Departamento dep = new Departamento("Recursos Humanos");

        dep.agregarEmpleado(e1);
        dep.agregarEmpleado(e2);

        dep.listarEmpleados();
        // Salida:
        // "Ana ha sido agregado al departamento Recursos Humanos"
        // "Luis ha sido agregado al departamento Recursos Humanos"
        // "Empleados en el departamento Recursos Humanos: Ana, Luis"
    }
}


// ================================================================
// 4. LO QUE DEBES RECORDAR
// ---------------------------------------------------------------
// ✔ Agregación = relación todo-parte, pero independiente
// ✔ La clase “todo” contiene a la clase “parte”
// ✔ La clase “parte” puede existir sola
// ✔ Se usa cuando se quiere “tener” algo sin control absoluto de su vida
// ✔ El objeto agregado puede entrar por:
//      → parámetros
//      → setters
//      → listas, colecciones, arrays
// ================================================================