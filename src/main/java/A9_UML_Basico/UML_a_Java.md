# 📘 UML a Java

## 1. Introducción
- UML (Unified Modeling Language) es un lenguaje gráfico para modelar sistemas.
- Un diagrama de clases UML puede **convertirse directamente a código Java** siguiendo reglas claras.
- Este documento explica cómo hacerlo paso a paso.

---

## 2. Paso 1: Identificar las clases
- Cada **rectángulo** en UML = una **clase Java**
- Nombre de la clase → `class NombreClase { ... }`
- Ejemplo UML:

+-----------------+
| Persona |
+-----------------+
| - nombre: String|
| - edad: int |
+-----------------+
| + saludar() |
+-----------------+


**Traducción a Java:**
```java
public class Persona {
    private String nombre;
    private int edad;

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}
```

3. Paso 2: Traducir atributos

Atributos UML: - → private, + → public, # → protected

Tipo UML → Tipo Java: String, int, boolean, etc.

Ejemplo UML:
- nombre: String
- edad: int
Traducción a Java:
```java
private String nombre;
private int edad;
```
>Tip: Por buenas prácticas, los atributos suelen ser private y se accede mediante getters y setters.


4. Paso 3: Traducir métodos

Métodos UML: visibilidad + nombre + parámetros + tipo de retorno

Ejemplo UML:
+ saludar(): void
+ setNombre(nombre: String): void
Traducción a Java:
```java
public void saludar() {
    System.out.println("Hola, soy " + nombre);
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}
```
5. Paso 4: Traducir relaciones entre clases

   | Relación       | Traducción a Java                                                      |
   | -------------- | ---------------------------------------------------------------------- |
   | Asociación     | Un método recibe un objeto como parámetro                              |
   | Agregación     | Una clase tiene un atributo que referencia otra clase (lista o objeto) |
   | Composición    | Una clase crea internamente el objeto de la otra clase                 |
   | Dependencia    | Un método usa temporalmente un objeto de otra clase                    |
   | Herencia       | `class Hija extends Padre`                                             |
   | Implementación | `class MiClase implements Interfaz`                                    |

Ejemplo UML:
```
+-----------------+      1
| Persona         |----------------+
+-----------------+                |
| - nombre: String|                |
+-----------------+                |
| + saludar()     |                |
+-----------------+                |
                                   |
                           +-----------------+
                           | Mascota         |
                           +-----------------+
                           | - nombre: String|
                           +-----------------+

```
Traducción a Java:
```java
class Mascota {
    private String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Persona {
    private String nombre;
    private Mascota mascota; // Asociación

    public Persona(String nombre, Mascota mascota) {
        this.nombre = nombre;
        this.mascota = mascota;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo una mascota llamada " + mascota.getNombre());
    }
}
```
6. Paso 5: Manejar multiplicidad

- Multiplicidad UML → colecciones en Java
  - 1 → un objeto
  - 0..* o * → List<Clase> o ArrayList<Clase>

Ejemplo UML:
```
+-----------------+      0..*  
| Departamento    |----------------+
+-----------------+                |
| - nombre: String|                |
+-----------------+                |
| + agregarEmpleado(e:Empleado)     |
+-----------------+                |
                           +-----------------+
                           | Empleado        |
                           +-----------------+
                           | - nombre: String|
                           +-----------------+
```
Traducción a Java:
```java
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

class Departamento {
    private String nombre;
    private List<Empleado> empleados; // 0..* multiplicidad

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }
}
```
7. Consejos prácticos

- Traduce siempre primero las clases y atributos.

- Luego los métodos y relaciones.

- Multiplicidad → colecciones (List, Set) si es >1.

- Composición → crear objetos dentro de la clase; agregación → pasar objetos desde fuera.

- Mantén los nombres consistentes con UML para facilitar la lectura y mantenimiento.
---
**Resumen:**

1. Cada elemento UML tiene su equivalente en Java: clases, atributos, métodos y relaciones.

2. UML sirve como mapa visual, y siguiendo reglas simples se puede pasar fácilmente a código funcional.

3. Practicar con diagramas y su traducción mejora la comprensión de la POO y el diseño limpio de software.