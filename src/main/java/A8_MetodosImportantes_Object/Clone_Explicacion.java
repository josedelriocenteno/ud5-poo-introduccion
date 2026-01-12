package A8_MetodosImportantes_Object;

// ================================================================
// Clone_Explicacion.java
// ================================================================
// OBJETIVO DEL ARCHIVO
// ---------------------------------------------------------------
// - Entender cómo funciona el método clone() en Java
// - Diferenciar shallow copy (copia superficial) y deep copy (copia profunda)
// - Ver ejemplos claros y funcionales
// ================================================================

import java.util.ArrayList;
import java.util.List;

// ================================================================
// 1. SHALLOW COPY (Copia superficial)
// ---------------------------------------------------------------
// → Se copia el objeto, pero los objetos internos siguen compartidos
// → Cambios en los objetos internos afectan a la copia
// ================================================================
class ShallowPersona implements Cloneable {     // Cloneable --> como una marca (marker interface)
    private String nombre;
    private List<String> hobbies;

    public ShallowPersona(String nombre) {
        this.nombre = nombre;
        this.hobbies = new ArrayList<>();
    }

    public void agregarHobby(String hobby) {
        hobbies.add(hobby);
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    // CloneNotSupportedException --> señal de error que se lanza cuando se intenta usar el método clone() en un objeto
    // cuya clase no implementa la interfaz Cloneable
    protected ShallowPersona clone() throws CloneNotSupportedException {    // Solo los objetos que explicitamente han sido
                                                                            // explicitamente han declarado puedan ser clonados
        return (ShallowPersona) super.clone(); // Clon superficial
    }

    @Override
    public String toString() {
        return "ShallowPersona { nombre='" + nombre + "', hobbies=" + hobbies + " }";
    }
}

// ================================================================
// 2. DEEP COPY (Copia profunda)
// ---------------------------------------------------------------
// → Se copia el objeto y sus objetos internos
// → Cambios en los objetos internos NO afectan a la copia
// ================================================================
class DeepPersona implements Cloneable {        // Cloneable --> Interfaz  como una marca (marker interface)
    private String nombre;
    private List<String> hobbies;

    public DeepPersona(String nombre) {
        this.nombre = nombre;
        this.hobbies = new ArrayList<>();
    }

    public void agregarHobby(String hobby) {
        hobbies.add(hobby);
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    protected DeepPersona clone() throws CloneNotSupportedException {
        DeepPersona copia = (DeepPersona) super.clone();
        // Creamos nueva lista para hobbies → evita compartir referencia
        copia.hobbies = new ArrayList<>(this.hobbies);
        return copia;
    }

    @Override
    public String toString() {
        return "DeepPersona { nombre='" + nombre + "', hobbies=" + hobbies + " }";
    }
}

// ================================================================
// 3. USO PRÁCTICO
// ================================================================
public class Clone_Explicacion {

    public static void main(String[] args) throws CloneNotSupportedException {

        // --- SHALLOW COPY ---
        ShallowPersona sp1 = new ShallowPersona("Ana");
        sp1.agregarHobby("Leer");
        ShallowPersona sp2 = sp1.clone(); // Clon superficial

        System.out.println("--- Shallow Copy ---");
        System.out.println("Original: " + sp1);
        System.out.println("Copia:    " + sp2);

        // Modificamos la lista de la copia
        sp2.agregarHobby("Correr");

        // La lista original también cambia → efecto de shallow copy
        System.out.println("Después de modificar la copia:");
        System.out.println("Original: " + sp1);
        System.out.println("Copia:    " + sp2);

        // --- DEEP COPY ---
        DeepPersona dp1 = new DeepPersona("Luis");
        dp1.agregarHobby("Futbol");
        DeepPersona dp2 = dp1.clone(); // Clon profundo

        System.out.println("\n--- Deep Copy ---");
        System.out.println("Original: " + dp1);
        System.out.println("Copia:    " + dp2);

        // Modificamos la lista de la copia
        dp2.agregarHobby("Natación");

        // La lista original NO cambia → efecto de deep copy
        System.out.println("Después de modificar la copia:");
        System.out.println("Original: " + dp1);
        System.out.println("Copia:    " + dp2);
    }
}
// ================================================================
// 4. LO QUE DEBES RECORDAR
// ---------------------------------------------------------------
// ✔ clone() crea una copia del objeto
// ✔ Shallow copy: comparte referencias de objetos internos → cambios afectan a ambos
// ✔ Deep copy: se crean nuevas instancias de los objetos internos → cambios independientes
// ✔ Para deep copy, normalmente se sobrescribe clone() manualmente
// ✔ clone() puede lanzar CloneNotSupportedException → manejar con try/catch o throws
// ================================================================