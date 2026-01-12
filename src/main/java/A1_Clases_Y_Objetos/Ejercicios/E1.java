package A1_Clases_Y_Objetos.Ejercicios;

import java.util.Scanner;

public class E1 {
    static Scanner sc = new Scanner(System.in);
    String nombre;
    int edad;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    void actualizarNombre() {
        System.out.print("Cuál es el nuevo nombre? ");
        nombre = sc.nextLine();  // Usar nextLine para nombres con espacios
    }

    void actualizarEdad() {
        System.out.print("Cuál es la nueva edad? ");
        edad = sc.nextInt();
        sc.nextLine();  // Consumir salto de línea pendiente
    }

    boolean esMayorDeEdad() {
        return edad >= 18;
    }

    void incrementarEdad() {
        edad++;
    }

    public String compararEdad(E1 otraPersona) {
        if (this.edad > otraPersona.edad) {
            return this.nombre + " es mayor que " + otraPersona.nombre;
        } else if (this.edad < otraPersona.edad) {
            return otraPersona.nombre + " es mayor que " + this.nombre;
        } else {
            return this.nombre + " y " + otraPersona.nombre + " tienen la misma edad";
        }
    }

    public static void main(String[] args) {
        E1 personaA = new E1();
        E1 personaB = new E1();

        personaA.nombre = "Jaime";
        personaA.edad = 18;

        personaB.nombre = "Lucas";
        personaB.edad = 14;

        System.out.println("Mostrar datos de cada persona: ");
        personaA.mostrarInfo();
        personaB.mostrarInfo();

        personaB.actualizarNombre();
        personaB.actualizarEdad();
        personaB.mostrarInfo();

        System.out.println("La persona A es mayor de edad? " + personaA.esMayorDeEdad());
        System.out.println("La persona B es mayor de edad? " + personaB.esMayorDeEdad());

        E1 personaC = new E1();
        System.out.println("Edad de la persona A antes de personaC = personaA: " + personaA.edad);

        // personaC asigna la referencia de personaA
        personaC = personaA;

        personaC.actualizarEdad();

        System.out.println("Edad de personaC después de actualizar edad: " + personaC.edad);
        System.out.println("Edad de personaA después de actualizar personaC: " + personaA.edad);

        System.out.println("Edad personaB antes de incrementar: " + personaB.edad);
        personaB.incrementarEdad();
        System.out.println("Edad personaB después de incrementar: " + personaB.edad);

        System.out.println("Hola, soy " + personaA.nombre + " y tengo " + personaA.edad + " años.");

        System.out.println(personaA.compararEdad(personaB));

        // Aquí se crea personaD y se asigna la referencia de personaA
        E1 personaD = personaA;

        // Cambiar nombre desde personaD afecta a personaA (mismo objeto)
        personaD.nombre = "Nombre cambiado desde personaD";

        System.out.println("Nombre de personaD: " + personaD.nombre);
        System.out.println("Nombre de personaA: " + personaA.nombre);

        // Asignar null a personaA no elimina objeto, sólo la referencia personaA
        personaA = null;

        // personaD sigue apuntando al objeto original, puede acceder a datos
        System.out.println("Accediendo desde personaD después de personaA=null:");
        personaD.mostrarInfo();

        // Crear más objetos para practicar
        E1 personaE = new E1();
        personaE.nombre = "Carlos";
        personaE.edad = 40;
        personaE.mostrarInfo();

        // Incrementar edad de personaE
        personaE.incrementarEdad();
        System.out.println("PersonaE después de incrementar edad:");
        personaE.mostrarInfo();
    }
}