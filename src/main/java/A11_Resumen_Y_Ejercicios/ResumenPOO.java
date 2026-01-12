package A11_Resumen_Y_Ejercicios;

// =================================================================================================
// ResumenPOO.java
// =================================================================================================
// RESUMEN COMPLETÍSIMO DE POO (Programación Orientada a Objetos)
// Listo para estudiar TODO el TEMARIO COMPLETO del Tema 5
//
// Incluye resúmenes de:
//
// 1. Clases y Objetos
// 2. Atributos y Métodos
// 3. Modificadores y Encapsulación
// 4. Constructores
// 5. Relaciones entre clases (asociación, agregación, composición, dependencia)
// 6. Herencia
// 7. Polimorfismo
// 8. Métodos importantes de Object (toString, equals, hashCode, clone)
// 9. UML básico
// 10. Principios de diseño OOP (Cohesión, Acoplamiento, Abstracción, Buenas prácticas)
//
// Este archivo NO se ejecuta → Es una hoja de estudio en formato .java
// =================================================================================================

public class ResumenPOO {

    // =============================================================================================
    // 1. CLASES Y OBJETOS
    // ---------------------------------------------------------------------------------------------
    /*
        - Clase → plantilla / molde para crear objetos
        - Objeto → instancia real de una clase

        class Persona {
            String nombre;
            int edad;

            void saludar() {
                System.out.println("Hola, soy " + nombre);
            }
        }

        Persona p = new Persona();
        p.nombre = "Ana";
        p.edad = 20;
        p.saludar();
    */
    // =============================================================================================


    // =============================================================================================
    // 2. ATRIBUTOS Y MÉTODOS
    // ---------------------------------------------------------------------------------------------
    /*
        this → referencia al objeto actual
        Tipos de métodos:
            - void → no devuelve nada
            - return → devuelve valor
            - static → de clase, no del objeto
            - instancia → se usa con objetos

        Atributos:
            - De instancia → cada objeto tiene su copia
            - De clase (static) → compartido por todos
    */
    // =============================================================================================


    // =============================================================================================
    // 3. MODIFICADORES Y ENCAPSULACIÓN
    // ---------------------------------------------------------------------------------------------
    /*
        public: accesible desde cualquier lugar
        private: solo dentro de la clase
        protected: dentro del paquete + herencia
        default: solo paquete

        Encapsulación:
            - atributos private
            - getters + setters con validación
    */
    // =============================================================================================


    // =============================================================================================
    // 4. CONSTRUCTORES
    // ---------------------------------------------------------------------------------------------
    /*
        class Persona {
            String nombre;
            int edad;

            Persona() { }  // constructor por defecto

            Persona(String n, int e) {   // sobrecarga
                this.nombre = n;
                this.edad = e;
            }
        }

        Persona p = new Persona("Ana", 20);
    */
    // =============================================================================================


    // =============================================================================================
    // 5. RELACIONES ENTRE CLASES
    // ---------------------------------------------------------------------------------------------
    /*
        ✔ ASOCIACIÓN → relación débil (“usa a”)
            Profesor usa Libro, pero no lo posee

        ✔ AGREGACIÓN → “tiene un”, pero viven por separado
            Curso tiene Alumnos, pero pueden existir sin curso

        ✔ COMPOSICIÓN → relación fuerte, vida conjunta
            Casa → Habitaciones (si la casa muere, las habitaciones también)

        ✔ DEPENDENCIA → uso temporal dentro de un método
            Impresora imprime un Documento pasado como parámetro
    */
    // =============================================================================================


    // =============================================================================================
    // 6. HERENCIA (extends)
    // ---------------------------------------------------------------------------------------------
    /*
        class Animal {
            void hacerSonido() { ... }
        }

        class Perro extends Animal {
            @Override
            void hacerSonido() { System.out.println("Guau"); }
        }

        super() → llama al constructor o método de la clase padre
    */
    // =============================================================================================


    // =============================================================================================
    // 7. POLIMORFISMO
    // ---------------------------------------------------------------------------------------------
    /*
        Animal a = new Perro();  // un padre puede referirse a un hijo

        a.hacerSonido();  // ejecuta la versión del hijo (Perro)

        Arrays polimórficos:
            Animal[] lista = { new Perro(), new Gato(), new Vaca() };
    */
    // =============================================================================================


    // =============================================================================================
    // 8. MÉTODOS IMPORTANTES DE Object
    // ---------------------------------------------------------------------------------------------
    /*
        ✔ toString()
            Convierte objeto en texto legible

        ✔ equals()
            Compara objetos por contenido

        ✔ hashCode()
            Número representativo del objeto → debe cumplir contrato con equals()

        ✔ clone()
            Copia del objeto:
                - Shallow copy → copia superficial
                - Deep copy → copia profunda
    */
    // =============================================================================================


    // =============================================================================================
    // 9. UML BÁSICO
    // ---------------------------------------------------------------------------------------------
    /*
        Símbolos:
            + público
            - privado
            # protegido

        Clase UML:
            -------------------------
            |      Persona           |
            -------------------------
            | - nombre: String       |
            | - edad: int            |
            -------------------------
            | + saludar(): void      |
            -------------------------

        Pasar UML a Java:
            - atributos → campos
            - métodos → funciones
            - relaciones → asociaciones / composiciones / herencia
    */
    // =============================================================================================


    // =============================================================================================
    // 10. PRINCIPIOS DE DISEÑO OOP
    // ---------------------------------------------------------------------------------------------
    /*
        ✔ Cohesión alta → cada clase hace una sola cosa
        ✔ Bajo acoplamiento → clases independientes entre sí
        ✔ Abstracción → ocultar detalles, mostrar lo esencial
        ✔ Buenas prácticas:
            - nombres claros
            - métodos cortos
            - no duplicar código (DRY)
            - composición > herencia
            - evitar código mágico
            - excepciones claras
    */
    // =============================================================================================


    // =============================================================================================
    // FIN DEL RESUMEN
    // ---------------------------------------------------------------------------------------------
    /*
        ✔ Este archivo contiene TODO el tema resumido
        ✔ Ideal para estudiar antes de exámenes
        ✔ Si quieres, puedo generar un PDF o un Word con el resumen completo
    */
    // =============================================================================================
}