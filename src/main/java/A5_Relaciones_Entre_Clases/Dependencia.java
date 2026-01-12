package A5_Relaciones_Entre_Clases;

// ================================================================
// Dependencia.java
// ================================================================
// OBJETIVO DEL ARCHIVO
// ---------------------------------------------------------------
// - Entender qué es una DEPENDENCIA entre clases
// - Ver un ejemplo simple, real y 100% claro
// - Diferenciarla de asociación, agregación y composición
// ================================================================

// ================================================================
// 1. ¿QUÉ ES UNA DEPENDENCIA?
// ---------------------------------------------------------------
// → Es la relación más débil entre clases
// → Una clase *usa temporalmente* a otra dentro de un método
//
// ✔ La clase dependiente NO guarda referencia permanente
// ✔ La relación es muy breve: solo dura mientras se ejecuta el método
// ✔ Se usa cuando solo se necesita un objeto para realizar una acción puntual
//
// EJEMPLOS REALES:
//   - Una Persona imprime un Documento → solo necesita el Documento en ese momento
//   - Un Profesor califica un Examen → recibe el Examen como parámetro
//   - Un Cliente hace un pedido → pasa el Pedido a un método, no lo almacena
//
// → Dependencia = uso temporal, muy débil
// ================================================================

// ================================================================
// 2. EJEMPLO DE CLASES PARA LA DEPENDENCIA
// ---------------------------------------------------------------
// ✦ Impresora
// ✦ Documento
//
// La Persona usa la Impresora para imprimir un Documento.
// La Impresora no pertenece a la Persona, y la relación solo ocurre dentro del método.
// ================================================================

class Documento {
    private String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}

class Impresora {
    public void imprimir(Documento doc) {
        System.out.println("Imprimiendo el documento: " + doc.getTitulo());
    }
}

// ================================================================
// Clase Persona depende temporalmente de Documento e Impresora
// ---------------------------------------------------------------
// IMPORTANTE:
//
// - La Persona NO guarda referencia a Documento ni Impresora
// - Solo los utiliza dentro del método imprimirDocumento()
// - Una vez terminado el método, la dependencia desaparece
// ================================================================

class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // MÉTODO QUE DEMUESTRA DEPENDENCIA
    public void imprimirDocumento(Documento doc, Impresora impresora) {
        System.out.println(nombre + " está usando la impresora...");
        impresora.imprimir(doc);
        System.out.println("Impresión finalizada.");
    }
}

// ================================================================
// 3. USO PRÁCTICO
// ---------------------------------------------------------------
// - Creamos Documento e Impresora fuera de Persona
// - La Persona los usa temporalmente dentro del método
// - Ninguno depende de la vida del otro
// ================================================================

class UsoDependencia {
    public static void main(String[] args) {

        Documento doc = new Documento("Informe Anual");
        Impresora impresora = new Impresora();

        Persona persona = new Persona("Laura");

        persona.imprimirDocumento(doc, impresora);
        // Salida:
        // "Laura está usando la impresora..."
        // "Imprimiendo el documento: Informe Anual"
        // "Impresión finalizada."
    }
}

// ================================================================
// 4. LO QUE DEBES RECORDAR
// ---------------------------------------------------------------
// ✔ Dependencia = relación débil y temporal
// ✔ Se usa solo dentro de un método
// ✔ No hay referencia permanente ni ciclo de vida compartido
// ✔ Se usa cuando un objeto solo necesita otro de forma puntual
// ✔ La dependencia suele pasar por:
//      → parámetros
//      → variables locales
// ================================================================