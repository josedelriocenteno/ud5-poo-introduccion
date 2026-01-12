package A3_Modificadores_Y_Encapsulacion;
/*
 * ================================================================
 *                  ModificadoresAcceso.java
 *        Apuntes en formato de código — Java POO
 * ================================================================
 *
 *  En Java existen varios modificadores que afectan:
 *    1. La visibilidad (quién puede acceder)
 *    2. El comportamiento (static, final)
 *
 *  Este documento explica:
 *      - public
 *      - private
 *      - protected
 *      - default (sin palabra clave)
 *      - static
 *      - final
 * ================================================================
 */

/* ---------------------------------------------------------------
 * 1. MODIFICADOR: public
 * ---------------------------------------------------------------
 *  - Permite acceso desde cualquier clase, paquete o módulo.
 *  - Se usa para clases, métodos y atributos que deben ser visibles
 *    desde cualquier parte del programa.
 * ---------------------------------------------------------------
 */

public class ModificadoresAcceso {
    // Atributo público: accesible desde cualquier clase
    public String nombre;

    // Método público: puede llamarse desde fuera libremente
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}



/* ---------------------------------------------------------------
 * 2. MODIFICADOR: private
 * ---------------------------------------------------------------
 *  - Es el nivel de acceso más restrictivo.
 *  - Solo permite acceso desde la MISMA clase.
 *  - Ideal para encapsulación y datos sensibles.
 * ---------------------------------------------------------------
 */

class EjemploPrivate {

    // Atributo privado: NO accesible desde fuera
    private double saldo;

    // Método público que expone el dato de forma controlada
    public double obtenerSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }
}



/* ---------------------------------------------------------------
 * 3. MODIFICADOR: protected
 * ---------------------------------------------------------------
 *  - Accesible desde:
 *        ✔ La misma clase
 *        ✔ Clases del mismo paquete
 *        ✔ Subclases (incluso en otros paquetes)
 *  - Muy útil en herencia.
 * ---------------------------------------------------------------
 */

class Animal {

    // Atributo protegido, accesible para subclases
    protected String tipo;
}

class Perro extends Animal {

    public void mostrarTipo() {
        System.out.println("Tipo de animal: " + tipo);
    }
}



/* ---------------------------------------------------------------
 * 4. MODIFICADOR: default (paquete)
 * ---------------------------------------------------------------
 *  - Se aplica cuando NO se escribe ningún modificador.
 *  - Accesible desde cualquier clase del MISMO PAQUETE.
 *  - No accesible desde otros paquetes.
 * ---------------------------------------------------------------
 */

class EjemploDefault {  // Clase con acceso default

    int contador;       // Atributo default

    void incrementar() { // Método default
        contador++;
    }
}



/* ---------------------------------------------------------------
 * 5. MODIFICADOR: static
 * ---------------------------------------------------------------
 *  - Pertenece a la CLASE, no a los objetos.
 *  - Se puede usar sin crear instancias.
 *  - Ideal para constantes y utilidades.
 * ---------------------------------------------------------------
 */

class Utilidades {

    // Atributo estático: compartido por todas las instancias
    static double PI = 3.14159;

    // Método estático: se llama con Utilidades.sumar()
    static int sumar(int a, int b) {
        return a + b;
    }
}



/* ---------------------------------------------------------------
 * 6. MODIFICADOR: final
 * ---------------------------------------------------------------
 *  - Variable final → no se puede cambiar su valor
 *  - Método final → no puede ser sobrescrito (override)
 *  - Clase final → no puede heredarse
 * ---------------------------------------------------------------
 */

final class ClaseFinal {    // No se puede extender

    final int CONSTANTE = 10;   // Valor inmodificable

    final void metodoFijo() {   // No se puede sobrescribir
        System.out.println("Este método no puede ser modificado");
    }
}



/* ---------------------------------------------------------------
 * 7. RESUMEN FINAL
 * ---------------------------------------------------------------
 *
 *  public     → acceso total desde cualquier lugar
 *  private    → acceso solo dentro de la clase
 *  protected  → clase + paquete + subclases
 *  default    → acceso solo dentro del paquete
 *
 *  static     → pertenece a la clase, no al objeto
 *  final      → no modificable (variable, método o clase)
 *
 * ---------------------------------------------------------------
 */