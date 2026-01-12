package A8_MetodosImportantes_Object;

// ================================================================
// Interfaz_Cloneable.java
// ================================================================
// OBJETIVO DEL ARCHIVO
// ---------------------------------------------------------------
// - Entender qué es la interfaz Cloneable
// - Aprender a sobrescribir el método clone()
// - Diferenciar entre copia superficial y copia profunda
// - Ver un ejemplo funcional con una clase Coche
// ================================================================

public class Interfaz_Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Creamos un objeto Coche
        Coche coche1 = new Coche("Toyota", "Corolla", 2020);
        Coche coche2 = (Coche) coche1.clone();   // Clonamos coche1

        // Mostramos los objetos y comprobamos si son iguales
        System.out.println("coche1: " + coche1);
        System.out.println("coche2: " + coche2);

        // Verificamos si son el mismo objeto
        System.out.println("¿Misma referencia? " + (coche1 == coche2)); // false

        // Verificamos si los datos son iguales
        System.out.println("¿Mismos datos? " + coche1.equals(coche2)); // true
    }
}

// ================================================================
// Clase Coche (implementa Cloneable)
// ================================================================
// - Implementa la interfaz Cloneable para permitir clonación
// - Sobrescribe clone() para hacerlo público
// - Ejemplo de clonación superficial
// ================================================================

class Coche implements Cloneable {
    private String marca;
    private String modelo;
    private int anio;

    // Constructor
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Sobrescribiendo el método clone()
    @Override
    public Object clone() throws CloneNotSupportedException {
        // Llamamos al método clone() de Object (copia campo a campo)
        return super.clone();
    }

    // Sobrescribimos equals() para comparar contenido
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return anio == coche.anio &&
                marca.equals(coche.marca) &&
                modelo.equals(coche.modelo);
    }

    // Mostramos datos de forma legible
    @Override
    public String toString() {
        return "Coche { marca='" + marca + "', modelo='" + modelo + "', año=" + anio + " }";
    }
}

// ================================================================
// NOTAS TEÓRICAS
// ================================================================
// - Cloneable es una interfaz vacía (no tiene métodos).
// - Su único propósito es indicar que un objeto puede clonarse.
// - Si una clase NO implementa Cloneable e intentamos clonar,
//   se lanza CloneNotSupportedException.
//
// - El método clone() está definido en Object (protegido),
//   por eso hay que sobrescribirlo y hacerlo público.
//
// - La clonación por defecto (super.clone()):
//   -> Copia los valores de los atributos primitivos.
//   -> Copia las referencias de objetos (NO los objetos en sí).
//      Esto se llama "copia superficial".
//
// - Para una "copia profunda", tendríamos que clonar manualmente
//   los objetos internos que tenga la clase.
// ================================================================