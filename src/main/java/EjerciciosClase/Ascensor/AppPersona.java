package EjerciciosClase.Ascensor;

public class AppPersona {
    public static void main(String[] args) throws Exception {

        Ascensor a = new Ascensor(5, 300);

        Persona p1 = new Persona(80);
        Persona p2 = new Persona(90);
        Persona p3 = new Persona(200);

        a.abrirPuertas();
        a.entrarSalirPersona("entrar", p1);
        a.entrarSalirPersona("entrar", p2);
        a.entrarSalirPersona("entrar", p3); // alarma

        a.moverAscensor(3); // no se mueve

        a.entrarSalirPersona("salir", p1);
        a.moverAscensor(3); // ahora sí
    }
}
