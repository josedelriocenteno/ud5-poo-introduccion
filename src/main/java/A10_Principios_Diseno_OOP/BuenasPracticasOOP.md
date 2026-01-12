# 🧼 Buenas Prácticas de Programación Orientada a Objetos
**Guía para escribir código limpio, entendible y fácil de mantener**

---

# 1. Nomenclatura Clara y Consistente

## ✔ Clases → Sustantivos, PascalCase
Ej:  
`Factura`, `Usuario`, `GestorTareas`, `ControladorPedidos`

## ✔ Métodos → Verbos, camelCase
Ej:  
`calcularTotal()`, `enviarEmail()`, `generarReporte()`

## ✔ Variables → camelCase, nombre descriptivo
Ej:  
`precioFinal`, `contadorUsuarios`, `fechaNacimiento`

## ❌ Evitar nombres genéricos o poco claros
- `data`, `temp`, `x`, `obj`, `gestor`, `util`

**El nombre debe explicar qué es y por qué existe.**

---

# 2. Una Clase = Una Responsabilidad

Se basa en el principio **SRP (Single Responsibility Principle)**.

✔ Cada clase debe tener **un propósito claro y único**  
✔ Si una clase crece demasiado → dividir en varias

---

## ❌ Ejemplo incorrecto
```java
class Factura {
    void calcularTotal() { ... }
    void imprimir() { ... }
    void enviarPorEmail() { ... }
    void conectarBD() { ... }
}
```
Muy mezclado → difícil de mantener.

---
### ✔ Ejemplo correcto
```java
class Factura { ... }
class FacturaPrinter { ... }
class FacturaEmailer { ... }
class FacturaRepository { ... }
```
---
# 3. Métodos Cortos y Claros
### ✔ Reglas prácticas:
- Un método debe hacer una sola cosa

- Debería caber en menos de 20 líneas

- Nombre = explica su propósito

- Evitar parámetros excesivos (máx 3 idealmente)

---
### ❌ Incorrecto
```java
void procesar() {
    // 200 líneas de lógica mezclada
}
```
### ✔ Correcto
```java
void validarPedido() { ... }
void calcularTotal() { ... }
void aplicarDescuentos() { ... }
void guardarEnBD() { ... }
```
---
# 4. Evitar Duplicación de Código (DRY)
**Don't Repeat Yourself**
### ❌ Incorrecto
```java
double calcularIVA(double precio) {
    return precio * 0.21;
}

double calcularIVAProducto(double precio) {
    return precio * 0.21;
}
```
### ✔ Correcto
```java
double calcularIVA(double precio) { ... }
```
Si copias código → te tocará corregirlo en 8 sitios.

---
# 5. Usar Interfaces para Reducir Acoplamiento
Interfaces permiten intercambiar comportamientos sin tocar el código.
```java
interface Enviador {
    void enviar(String mensaje);
}
```
Implementaciones:
```java
class EnviadorEmail implements Enviador { ... }
class EnviadorSMS implements Enviador { ... }
class EnviadorWhatsApp implements Enviador { ... }
```
---
# 6. Composición > Herencia
### ✔ Preferir que una clase "tenga" otras clases
en lugar de que "sea" esas clases.

---
### ❌ Incorrecto (abuso de herencia)
```java
class CocheElectrico extends MotorElectrico { ... }
```
### ✔ Correcto (composición)
```java
class Coche {
    private Motor motor;
}
```
Más flexible → puedes cambiar MotorDiesel por MotorElectrico.

---
# 7. Encapsulación Fuerte
### ✔ Mantener atributos privados
```java
private int edad;
```
### ✔ Exponer solo lo necesario mediante getters/setters
```java
public int getEdad() { return edad; }
public void setEdad(int edad) { this.edad = edad; }
```
### ❌ No exponer atributos públicos
```java
public int edad;
```
---
# 8. Evitar Código "Mágico"
### ❌ Números mágicos
```java
if (nivel > 42) { ... }
```
### ✔ Usar constantes
```java
private static final int NIVEL_MAX = 42;
```
---
# 9. Excepciones Bien Usadas
- No atrapar excepciones que no vas a manejar
- Lanza excepciones específicas (no usar Exception genérica)
- Incluir mensajes descriptivos
```java
throw new IllegalArgumentException("El email no es válido");
```
---
# 10. Comentarios Útiles (NO comentar lo obvio)
✔ Explica por qué, no qué hace el código.

❌ No expliques cosas obvias que se entienden con un buen nombre de método.

---
# 11. Evitar Funciones Gigantes en main()
### ❌ Esto:
```java
public static void main(String[] args) {
    // 300 líneas de lógica
}
```
### ✔ Mejor:
```java
public static void main(String[] args) {
    Sistema sistema = new Sistema();
    sistema.iniciar();
}
```
---
# 12. Cumplir la Regla de las 3C
### ✔ Claro
Se entiende a la primera.
### ✔ Corto
Sin lógica innecesaria.
### ✔ Cohesivo
Una sola responsabilidad por clase/método.

---
# 13. Resumen General
| Principio                      | Objetivo                          |
| ------------------------------ | --------------------------------- |
| ✔ Nombres claros               | Código fácil de leer              |
| ✔ Cohesión alta                | Clases pequeñas y enfocadas       |
| ✔ Bajo acoplamiento            | Cambios fáciles y sin romper nada |
| ✔ DRY                          | No duplicar código                |
| ✔ Encapsulación                | Control de acceso                 |
| ✔ Composición > Herencia       | Diseño flexible                   |
| ✔ Métodos cortos               | Legibilidad                       |
| ✔ No exponer detalles internos | Uso seguro                        |

---
# 14. Frase Final
**"El buen código se lee como si fuera un texto bien escrito."**