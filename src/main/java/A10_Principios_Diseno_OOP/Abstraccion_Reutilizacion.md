# 🧠 Abstracción y Reutilización
**Cómo diseñar código limpio, extensible y fácil de mantener**

---

# 1. ¿Qué es la Abstracción?
La **abstracción** consiste en **mostrar solo lo esencial** y **ocultar los detalles innecesarios**.

Es uno de los 4 pilares de la POO.

---

## ✔ Ejemplo del mundo real
Cuando conduces un coche:

- Ves el volante, pedales, palanca.
- No ves los cables, sensores, inyección, caja de cambios interna, etc.

El coche **oculta complejidad** y te ofrece una **interfaz simple**.

---

# 2. Abstracción en Java

Se logra mediante:

- **Clases**
- **Interfaces**
- **Métodos abstractos**
- **Herencia**
- **Encapsulación**

---

## ✔ Objetivo de la abstracción
- Facilitar el uso de una clase
- Evitar exponer detalles que pueden cambiar
- Crear sistemas más flexibles
- Reducir el acoplamiento
- Permitir reutilizar el código en múltiples contextos

---

# 3. Ejemplo claro de abstracción

## ❌ Sin abstracción (malo)
```java
class EnviarMensaje {
    void enviarPorWhatsapp(String msg) { ... }
    void enviarPorEmail(String msg) { ... }
    void enviarPorSMS(String msg) { ... }
}
```
El código se vuelve grande, difícil de mantener y cambiar.

---
## ✔ Con abstracción (bueno)
Creamos una interfaz que representa cualquier forma de envío:
```java
interface Notificador {
    void enviar(String mensaje);
}
```
Implementaciones:
```java
class EmailNotificador implements Notificador {
    public void enviar(String mensaje) {
        System.out.println("Email enviado: " + mensaje);
    }
}

class WhatsAppNotificador implements Notificador {
    public void enviar(String mensaje) {
        System.out.println("WhatsApp enviado: " + mensaje);
    }
}

class SMSNotificador implements Notificador {
    public void enviar(String mensaje) {
        System.out.println("SMS enviado: " + mensaje);
    }
}
```
Código reutilizable:
```java
class ServicioAlerta {
    private Notificador notificador;

    public ServicioAlerta(Notificador notificador) {
        this.notificador = notificador;
    }

    public void enviarAlerta(String msg) {
        notificador.enviar(msg);
    }
}
```
Uso:
```java
ServicioAlerta alerta = new ServicioAlerta(new SMSNotificador());
alerta.enviarAlerta("¡Emergencia!");
```
---
**Ventajas del diseño abstracto**

✔ Código más flexible

✔ Fácil de extender

✔ No hace falta tocar clases ya creadas

✔ Permite reutilizar código en distintos contextos

✔ Reduce acoplamiento

✔ Cumple el principio Open/Closed

---
# 4. ¿Qué es la Reutilización?
La reutilización consiste en **aprovechar código existente sin duplicarlo.**

Se consigue con:

- Herencia (extends)
- Composición (usar objetos dentro de otros)
- Interfaces
- Métodos generales reutilizables
- Librerías

---
# 5. Reutilización mediante Herencia

**🧱 Ejemplo correcto**
```java
abstract class Animal {
    void comer() {
        System.out.println("Comiendo...");
    }
}

class Perro extends Animal {
    void ladrar() {
        System.out.println("Guau!");
    }
}
```
Reutilizamos el método comer() en todas las subclases.

---
# 6. Reutilización mediante Composición (la mejor opción)
La composición es más flexible que la herencia.
### Ejemplo:
```java
class Motor {
    void arrancar() { System.out.println("Motor encendido"); }
}

class Coche {
    private Motor motor;

    public Coche(Motor motor) {
        this.motor = motor;
    }

    void arrancar() {
        motor.arrancar();
    }
}
```
---
# 7. Abstracción + Reutilización = Diseño Profesional
| Técnica           | Qué aporta                                     |
| ----------------- | ---------------------------------------------- |
| **Abstracción**   | Ocultar detalles, mostrar esencia, simplificar |
| **Reutilización** | Evitar duplicar código y mejorar mantenimiento |

Juntas permiten:

- Sistemas más limpios
- Código más modular
- Mantenimiento fiable
- Cambios rápidos sin romper nada
- Desarrollo más rápido

---
# 8. Reglas prácticas para aplicar HOY
✔ 1. Si un método hace demasiadas cosas → dividir

✔ 2. Si dos clases tienen código igual → extraerlo a una clase común

✔ 3. Evitar herencia si es posible usar composición

✔ 4. Usar interfaces para aumentar flexibilidad

✔ 5. Pensar en “¿qué necesito?” antes de “¿cómo se hace?”

✔ 6. Escribir métodos que hagan solo UNA cosa

✔ 7. No exponer detalles internos de implementación

---
# 9. Resumen Final
| Concepto            | Significado                                    | Objetivo                          |
| ------------------- | ---------------------------------------------- | --------------------------------- |
| ⭐ **Abstracción**   | Ocultar complejidad y mostrar solo lo esencial | Métodos e interfaces simples      |
| ⭐ **Reutilización** | Aprovechar código ya escrito, sin duplicar     | Herencia, composición, interfaces |
### Buen diseñador = escribe poco código, pero muy útil y flexible.