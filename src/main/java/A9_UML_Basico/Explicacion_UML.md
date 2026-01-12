# 📘 Introducción a UML

## 1. ¿Qué es UML?
- UML = **Unified Modeling Language** (Lenguaje Unificado de Modelado)
- Es un **lenguaje gráfico** para representar sistemas orientados a objetos.
- Permite **visualizar, especificar, construir y documentar** software.
- Muy útil para planificar programas antes de escribir código.

---

## 2. Tipos de diagramas UML
Existen varios tipos, pero los más comunes en POO son:

1. **Diagrama de clases**
    - Muestra clases, atributos, métodos y relaciones entre ellas.
    - Es útil para diseñar la estructura de un sistema.
2. **Diagrama de objetos**
    - Muestra instancias concretas de clases y sus valores actuales.
3. **Diagrama de casos de uso**
    - Muestra funcionalidades del sistema y los actores que las usan.
4. **Diagrama de secuencia**
    - Representa la interacción temporal entre objetos.

> En esta guía nos enfocaremos en **diagramas de clases**, porque son la base para traducir UML a Java.

---

## 3. Elementos de un diagrama de clases

### a) Clase
Representada como un **rectángulo dividido en tres secciones**:

+---------------------+
| NombreDeLaClase | ← Nombre de la clase (centrado)
+---------------------+
| - atributo1: Tipo | ← Atributos (con visibilidad)
| - atributo2: Tipo |
+---------------------+
| + metodo1(): Tipo | ← Métodos (con visibilidad)
| + metodo2(param): T |
+---------------------+


- **Visibilidad de atributos/métodos:**
    - `+` → público (`public`)
    - `-` → privado (`private`)
    - `#` → protegido (`protected`)
    - `~` → package / default

---

### b) Relaciones entre clases

| Relación       | Símbolo UML                  | Descripción |
|----------------|-----------------------------|-------------|
| **Asociación** | Línea continua →             | Una clase usa a otra. |
| **Agregación** | Línea con rombo vacío ◇       | “Tiene un” pero la parte puede existir sola. |
| **Composición**| Línea con rombo relleno ◆     | “Tiene un” y la parte depende totalmente del todo. |
| **Dependencia**| Línea de puntos →             | Uso temporal dentro de un método. |
| **Herencia**   | Línea con flecha blanca ▲     | Clase hija hereda de clase padre. |
| **Implementación** | Línea punteada con flecha ▲ | Clase implementa una interfaz. |

---

### c) Multiplicidad
- Indica **cuántos objetos participan en la relación**:

| Notación | Significado |
|----------|------------|
| `1`      | Exactamente uno |
| `0..1`   | Cero o uno |
| `*`      | Cero o muchos |
| `1..*`   | Al menos uno |

Ejemplo:
- Un **Departamento** tiene `0..*` Empleados → puede tener ninguno o muchos.

---

### d) Ejemplo simple de diagrama de clases

+-----------------+ 0..* +-----------------+
| Departamento |---------------->| Empleado |
+-----------------+ +-----------------+
| - nombre: String| | - nombre: String|
+-----------------+ +-----------------+
| + agregarEmpleado(e:Empleado) | + trabajar() |
+-----------------+ +-----------------+


- `Departamento` tiene **una lista de Empleados** → relación de agregación (`0..*` multiplicidad)
- Los Empleados **existen independientemente** del Departamento.

---

## 4. Reglas básicas para leer UML

1. **Nombre de la clase** siempre en la sección superior.
2. **Atributos** en la sección del medio, con visibilidad y tipo.
3. **Métodos** en la sección inferior, con visibilidad, parámetros y tipo de retorno.
4. **Relaciones**: observa línea, rombo, flechas y multiplicidad para entender dependencia, agregación, composición o herencia.
5. **Consistencia**: un diagrama UML bien hecho refleja exactamente la estructura que luego se implementa en Java.

---

## 5. Consejos prácticos

- Antes de programar, dibuja un UML para visualizar tus clases y relaciones.
- Mantén la **simplicidad**: evita incluir todos los métodos si no son relevantes.
- Usa UML como **guía de comunicación** entre desarrolladores, no como código final.

---

**Resumen:**  
UML te ayuda a **planificar y comunicar** la estructura de tu programa. Con los símbolos correctos y la interpretación de multiplicidad y relaciones, puedes traducir un diagrama directamente a clases, atributos y métodos en Java.