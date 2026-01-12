// GettersSettersExplicacion.java
// Apuntes en formato de código: Getters y Setters explicados paso a paso
// Estilo: claro, ordenado y con ejemplos prácticos (como te gusta)

package A3_Modificadores_Y_Encapsulacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/*
 * ================
 *  INTRODUCCIÓN
 * ================
 *
 * Los getters y setters (accesores y mutadores) son métodos que permiten:
 *  - Leer (get) y modificar (set) atributos privados de una clase.
 *  - Encapsular validaciones y lógica de acceso.
 *  - Mantener la representación interna oculta (encapsulación).
 *
 * Reglas prácticas:
 *  - Haz los atributos siempre private (por defecto).
 *  - Expón getters para lectura controlada.
 *  - Expón setters solo cuando realmente quieras permitir modificación.
 *  - Valida en los setters para mantener el objeto en estado consistente.
 */

/* ------------------------------------------------------------
 *  EJEMPLO 1 — Clase Persona (básico: getters, setters con validación)
 * ------------------------------------------------------------
 */
public class GettersSettersExplicacion {

    /*
     * Clase interna de ejemplo: Persona
     * - atributos privados
     * - getters y setters con validaciones claras
     */
    public static class Persona {
        // Atributos privados: no accesibles desde fuera directamente
        private String nombre;
        private int edad;

        // Constructor mínimo
        public Persona(String nombre, int edad) {
            // Reutilizamos los setters para validar en el constructor
            setNombre(nombre);
            setEdad(edad);
        }

        /* ---------- GETTERS ---------- */
        // Convención: getXxx() para tipos no booleanos
        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        /* ---------- SETTERS (con validación) ---------- */
        // Los setters permiten controlar el estado interno
        public void setNombre(String nombre) {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede ser vacío");
            }
            this.nombre = nombre.trim();
        }

        public void setEdad(int edad) {
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
        }
    }

    /* ------------------------------------------------------------
     *  EJEMPLO 2 — Campo solo lectura (sin setter)
     * ------------------------------------------------------------
     *
     * Si no quieres que un campo se modifique después de la creación,
     * simplemente no proporcionas un setter.
     */
    public static class Producto {
        private final String codigo; // final + no setter => inmutable respecto a este campo
        private String descripcion;

        public Producto(String codigo, String descripcion) {
            if (codigo == null || codigo.isEmpty()) {
                throw new IllegalArgumentException("Código obligatorio");
            }
            this.codigo = codigo;
            this.descripcion = descripcion;
        }

        // Getter para código (lectura permitida)
        public String getCodigo() {
            return codigo;
        }

        // Getter/setter para descripción (modificable)
        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    }

    /* ------------------------------------------------------------
     *  EJEMPLO 3 — Defensive copy para tipos mutables (Date, List...)
     * ------------------------------------------------------------
     *
     * IMPORTANTE: cuando tu atributo es un objeto mutable (Date, List, array),
     * debes evitar devolver la referencia directa: devuelve una copia.
     */
    public static class Agenda {
        private Date fechaCreacion;
        private final List<String> notas = new ArrayList<>();

        public Agenda(Date fechaCreacion) {
            // Guardar una copia defensiva
            this.fechaCreacion = (fechaCreacion == null) ? new Date() : new Date(fechaCreacion.getTime());
        }

        // Getter devuelve copia defensiva
        public Date getFechaCreacion() {
            return (fechaCreacion == null) ? null : new Date(fechaCreacion.getTime());
        }

        // Setter guarda copia defensiva
        public void setFechaCreacion(Date fechaCreacion) {
            this.fechaCreacion = (fechaCreacion == null) ? null : new Date(fechaCreacion.getTime());
        }

        // Exponer una vista inmodificable de la lista
        public List<String> getNotas() {
            return Collections.unmodifiableList(new ArrayList<>(notas));
        }

        // Añadir nota mediante método controlado
        public void anadirNota(String nota) {
            if (nota == null || nota.trim().isEmpty()) {
                throw new IllegalArgumentException("Nota vacía no permitida");
            }
            notas.add(nota.trim());
        }
    }

    /* ------------------------------------------------------------
     *  EJEMPLO 4 — Fluent setters (encadenables)
     * ------------------------------------------------------------
     *
     * Devuelven 'this' para permitir person.setA().setB();
     * Útil en builders o configuraciones; menos recomendado en entidades JPA.
     */
    public static class Configuracion {
        private int timeout;
        private boolean activarLogs;

        public int getTimeout() {
            return timeout;
        }

        public Configuracion setTimeout(int timeout) {
            if (timeout < 0) throw new IllegalArgumentException("timeout negativo");
            this.timeout = timeout;
            return this; // devuelve this para encadenar
        }

        public boolean isActivarLogs() {
            return activarLogs;
        }

        public Configuracion setActivarLogs(boolean activarLogs) {
            this.activarLogs = activarLogs;
            return this;
        }
    }

    /* ------------------------------------------------------------
     *  BUENAS PRÁCTICAS (resumen práctico)
     * ------------------------------------------------------------
     *
     * 1) Atributos private por defecto.
     * 2) Usar getters para exponer lectura.
     * 3) Usar setters solo si realmente se puede/quiera modificar.
     * 4) Validar siempre en setters y/o en constructores.
     * 5) Para campos inmutables: final + no setter.
     * 6) Para objetos mutables (Date, List, array) -> defensive copy.
     * 7) Evitar lógica pesada en getters (que causen efectos secundarios).
     * 8) Para frameworks (JPA, JSON) sigue sus convenciones, pero mantén la encapsulación lógica.
     * 9) Documenta el contrato: cuándo puede ser null, rangos válidos, etc.
     */

    /* ------------------------------------------------------------
     *  EJECUCIÓN DE EJEMPLOS (main)
     * ------------------------------------------------------------
     */
    public static void main(String[] args) {
        // Ejemplo 1: Persona
        Persona p = new Persona("Ana", 25);
        System.out.println(p);
        p.setEdad(26);

        // Ejemplo 2: Producto
        Producto prod = new Producto("ABC123", "Camiseta");
        System.out.println("Código producto: " + prod.getCodigo());
        prod.setDescripcion("Camiseta blanca");

        // Ejemplo 3: Agenda y defensive copy
        Date ahora = new Date();
        Agenda a = new Agenda(ahora);
        System.out.println("Fecha creación agenda (original): " + a.getFechaCreacion());
        ahora.setTime(0);
        System.out.println("Fecha creación agenda (tras modificar original): " + a.getFechaCreacion());

        a.anadirNota("Comprar leche");
        System.out.println("Notas: " + a.getNotas());

        // Ejemplo 4: Fluent setters
        Configuracion conf = new Configuracion().setTimeout(30).setActivarLogs(true);
        System.out.println("Timeout: " + conf.getTimeout() + ", logs: " + conf.isActivarLogs());
    }
}