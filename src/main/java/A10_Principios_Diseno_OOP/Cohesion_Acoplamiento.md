# 🧩 Cohesión y Acoplamiento
**Principios clave para diseñar buen código en POO**

---

## 1. ¿¿Por qué son importantes?
La cohesión y el acoplamiento determinan si tu programa será:

- Fácil de mantener
- Fácil de ampliar
- Fácil de depurar
- Más resistente a errores
- Más reutilizable

Son la **base de un buen diseño orientado a objetos**.

---

# 2. COHESIÓN
## ✔ “Qué tan enfocada está una clase en una única responsabilidad”

---

## 🔎 Ejemplo simple:
- Clase **con buena cohesión**:
    - `CalculadoraImpuestos` → solo calcula impuestos.
- Clase **con mala cohesión**:
    - `Utilidades` → tiene 200 métodos mezclados: formatear texto, leer archivos, enviar emails, cálculos matemáticos…

---

## Tipos de cohesión (de peor a mejor)
- ❌ **Cohesión baja**: responsabilidades mezcladas, clase hace “de todo”.
- ✔ **Cohesión alta**: cada clase tiene UNA responsabilidad clara.

---

## Ejemplo incorrecto (cohesión baja)
```java
class Factura {
    void calcularTotal() { ... }
    void imprimirFactura() { ... }
    void conectarBaseDatos() { ... }
    void enviarEmail() { ... }
}
``` 
Problema:
- Esta clase hace demasiadas cosas → difícil de mantener y cambiar.

**Ejemplo correcto (cohesión alta)**
``` java
class Factura {
    void calcularTotal() { ... }
}

class FacturaPrinter {
    void imprimir(Factura f) { ... }
}

class FacturaEmailer {
    void enviar(Factura f) { ... }
}
``` 
Ventajas:

- Clases más pequeñas, claras y reutilizables.

- Si cambia la lógica de email, NO afecta al cálculo de la factura.

---
## 3. ACOPLAMIENTO
**✔ “Qué tanto dependen las clases entre sí”**

---
Tipos de acoplamiento

- ❌ Alto acoplamiento → clases demasiado dependientes

- ✔ Bajo acoplamiento → clases independientes y flexibles

**Ejemplo de acoplamiento alto (malo)**
``` java
class Motor {
    public void arrancar() {
        System.out.println("Motor encendido");
    }
}

class Coche {
    private Motor motor = new Motor(); // DEPENDENCIA FUERTE

    public void encender() {
        motor.arrancar();
    }
}
``` 
Problema:
- El coche depende totalmente de esa clase Motor.
- No se puede cambiar el tipo de motor sin editar Coche.
---
**Ejemplo de acoplamiento bajo (bueno)**

*Se usa inyección de dependencias:*
```java
class Motor {
    public void arrancar() { ... }
}

class MotorElectrico extends Motor { ... }
class MotorDiesel extends Motor { ... }

class Coche {
    private Motor motor;

    // Se recibe el motor desde fuera → más flexible
    public Coche(Motor motor) {
        this.motor = motor;
    }

    public void encender() {
        motor.arrancar();
    }
}
```
**Ventajas:**
- Puedes usar MotorEléctrico, MotorDiesel, etc.
- El coche no depende de una implementación concreta.
- Mayor flexibilidad y mantenibilidad.

---
## 4. Relación entre cohesión y acoplamiento
| Buen diseño         | Mal diseño          |
| ------------------- | ------------------- |
| ✔ Alta cohesión     | ❌ Baja cohesión     |
| ✔ Bajo acoplamiento | ❌ Alto acoplamiento |

- **Alta cohesión →** clases simples y enfocadas
- **Bajo acoplamiento →** clases independientes

→ Juntos producen código limpio, extensible y fácil de mantener.

---
## 5. Cómo mejorar cohesión y reducir acoplamiento en tu código
**✔ 1. Divide responsabilidades**
*Si una clase tiene demasiados métodos, probablemente hace demasiadas cosas.*

**✔ 2. Usa interfaces**
*Permiten depender de contratos, no de implementaciones.*

**✔ 3. Inyecta dependencias por constructor**
*En lugar de crear objetos dentro de las clases.*

**✔ 4. Evita “clases Dios”**
*Clases gigantes con demasiadas responsabilidades.*

**✔ 5. Piensa en módulos pequeños**
*Pequeños bloques que hagan una cosa bien.*

---
## 6. Resumen final
| Concepto         | Qué es                                             | Buscamos              |
| ---------------- | -------------------------------------------------- | --------------------- |
| **Cohesión**     | Qué tan centrada está una clase en una única tarea | **Cohesión alta**     |
| **Acoplamiento** | Qué tanto depende una clase de otra                | **Acoplamiento bajo** |

**Código ideal → Alta cohesión + Bajo acoplamiento**

*Estos principios son el corazón del diseño profesional en POO.*