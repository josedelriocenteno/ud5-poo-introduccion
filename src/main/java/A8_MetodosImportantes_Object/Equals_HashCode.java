package A8_MetodosImportantes_Object;

import java.util.Objects;

// ================================================================
// Equals_HashCode.java
// ================================================================
// OBJETIVO DEL ARCHIVO
// ---------------------------------------------------------------
// - Entender el contrato entre equals() y hashCode()
// - Aprender a sobrescribirlos correctamente
// - Ver un ejemplo funcional y claro
// ================================================================

public class Equals_HashCode {
    public static void main(String[] args) {

        // Creamos objetos de Persona
        Persona p1 = new Persona("Ana", 25);
        Persona p2 = new Persona("Ana", 25);
        Persona p3 = new Persona("Luis", 30);

        // Probamos equals()
        System.out.println("p1.equals(p2) = " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3) = " + p1.equals(p3)); // false

        // Probamos hashCode()
        System.out.println("p1.hashCode() = " + p1.hashCode());
        System.out.println("p2.hashCode() = " + p2.hashCode());
        System.out.println("p3.hashCode() = " + p3.hashCode());

        // Probamos toString()
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

// ================================================================
// Clase Persona (no pública, definida dentro del mismo archivo)
// ================================================================
class Persona2 {
    private String nombre;
    private int edad;

    // Constructor correcto
    public Persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobrescribiendo equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                 // misma referencia
        if (o == null || getClass() != o.getClass()) return false;
        Persona2 persona = (Persona2) o;
        return edad == persona.edad && nombre.equals(persona.nombre);
    }

    // Sobrescribiendo hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    // Sobrescribiendo toString()
    @Override
    public String toString() {
        return "Persona { nombre='" + nombre + "', edad=" + edad + " }";
    }
}

// ================================================================
// 2. USO PRÁCTICO
// ================================================================
class UsoEqualsHashCode {
    public static void main(String[] args) {

        Persona p1 = new Persona("Ana", 25);
        Persona p2 = new Persona("Ana", 25);
        Persona p3 = new Persona("Luis", 30);

        System.out.println("p1.equals(p2) = " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3) = " + p1.equals(p3)); // false

        System.out.println("p1.hashCode() = " + p1.hashCode());
        System.out.println("p2.hashCode() = " + p2.hashCode());
        System.out.println("p3.hashCode() = " + p3.hashCode());
    }
}