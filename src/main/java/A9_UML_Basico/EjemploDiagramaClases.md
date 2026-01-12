```mermaid
classDiagram
%% Clases básicas
class ClaseSimple {
-nombre: String
-edad: int
+mostrarInfo()
+actualizarEdad(nuevaEdad: int)
}

class AtributosMetodos {
-nombre: String
-edad: int
+salario: double
+mostrarInfo()
+getNombre(): String
+setNombre(nombre: String)
+getEdad(): int
+setEdad(edad: int)
+getContador(): int
}

class EjemploEncapsulacion {
-nombre: String
-edad: int
+EjemploEncapsulacion(nombre: String, edad: int)
+getNombre(): String
+setNombre(nombre: String)
+getEdad(): int
+setEdad(edad: int)
+mostrarInfo()
}

%% Constructores
class ConstructorBasico {
-nombre: String
-edad: int
+ConstructorBasico(nombre: String, edad: int)
+getNombre(): String
+getEdad(): int
+mostrarInfo()
}

class ConstructorSobrecarga {
-nombre: String
-edad: int
-ciudad: String
+ConstructorSobrecarga()
+ConstructorSobrecarga(nombre: String, edad: int)
+ConstructorSobrecarga(nombre: String, edad: int, ciudad: String)
+mostrarInfo()
}

%% Herencia
class ClasePadre {
-nombre: String
-edad: int
+ClasePadre(nombre: String, edad: int)
+mostrarInfo()
+saludar()
}

class ClaseHija {
-ciudad: String
+ClaseHija(nombre: String, edad: int, ciudad: String)
+getCiudad(): String
+setCiudad(ciudad: String)
+saludar()
+mostrarCiudad()
}

ClaseHija --|> ClasePadre

%% Polimorfismo
class Animal {
+hacerSonido()
}

class Perro {
+hacerSonido()
}

class Gato {
+hacerSonido()
}

Perro --|> Animal
Gato --|> Animal