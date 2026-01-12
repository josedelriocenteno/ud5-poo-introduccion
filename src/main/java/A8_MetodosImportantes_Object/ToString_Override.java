package A8_MetodosImportantes_Object;

// ================================================================
// ToString_Override.java
// ================================================================
// OBJETIVO DEL ARCHIVO
// ---------------------------------------------------------------
// - Entender qué hace el método toString() de Java
// - Aprender a sobrescribirlo correctamente
// - Ver un ejemplo real y claro de uso
// ================================================================


// ================================================================
// 1. ¿QUÉ ES toString()?
// ---------------------------------------------------------------
// → toString() es un método heredado de la clase Object
// → Devuelve una representación en forma de String del objeto
//
// ✔ Por defecto, toString() devuelve:
//      NombreClase@CódigoHash
//   Ejemplo: Persona@1a2b3c
// ✔ No muestra los valores de los atributos, solo referencia
// ✔ Para mostrar información útil, debemos sobrescribirlo
//
// EJEMPLOS REALES:
//   - Mostrar datos de un estudiante, empleado, coche, etc.
//   - Facilita la depuración y logging
// ================================================================


// ================================================================
// 2. EJEMPLO DE CLASE PARA toString()
// ---------------------------------------------------------------
// ✦ Persona: nombre + edad
//
// Sobrescribiremos toString() para mostrar los datos de forma legible
// ================================================================

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // ================================================================
    // 3. SOBRESCRIBIENDO toString()
    // ---------------------------------------------------------------
    // - Usamos @Override para indicarle a Java que estamos sobrescribiendo
    // - Devolvemos un String con la información más relevante
    // ================================================================
    @Override
    public String toString() {
        return "Persona { nombre='" + nombre + "', edad=" + edad + " }";
    }
}


// ================================================================
// 4. USO PRÁCTICO
// ---------------------------------------------------------------
// - Cuando imprimimos el objeto directamente, se llama automáticamente a toString()
// - Sin sobrescribir, mostrará algo ilegible
// ================================================================

class UsoToString {
    public static void main(String[] args) {

        Persona p1 = new Persona("Ana", 25);
        Persona p2 = new Persona("Luis", 30);

        System.out.println(p1);
        System.out.println(p2);

        // Salida:
        // Persona { nombre='Ana', edad=25 }
        // Persona { nombre='Luis', edad=30 }

        // EJEMPLO SIN SOBRESCRIBIR toString():
        // Persona@15db9742
        // Persona@6d06d69c
    }
}


// ================================================================
// 5. LO QUE DEBES RECORDAR
// ---------------------------------------------------------------
// ✔ toString() se hereda de Object y sirve para representar objetos como String
// ✔ Por defecto muestra NombreClase@CódigoHash (no útil)
// ✔ Sobrescribir toString() permite imprimir datos relevantes de forma legible
// ✔ Siempre usar @Override al sobrescribir
// ✔ Facilita depuración, logging y presentación de objetos
// ================================================================