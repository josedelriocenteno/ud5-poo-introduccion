package EjerciciosClase.Ascensor;

public class Ascensor {

    private int piso = 0;
    private int pisos;
    private boolean puertas; // true = abiertas
    private boolean alarma;
    private double capacidad;
    private double ocupacion;

    public Ascensor(int pisos, double capacidad) {
        this.pisos = pisos;
        this.capacidad = capacidad;
        this.ocupacion = 0;
        this.puertas = false;
        this.alarma = false;
    }

    // GETTERS Y SETTERS
    public int getPiso() {
        return piso;
    }

    public int getPisos() {
        return pisos;
    }

    public boolean getPuertas() {
        return puertas;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public double getOcupacion() {
        return ocupacion;
    }

    // PUERTAS
    public void abrirPuertas() {
        puertas = true;
        System.out.println("Puertas abiertas");
    }

    public void cerrarPuertas() {
        puertas = false;
        System.out.println("Puertas cerradas");
    }

    // VALIDAR ACCIÓN
    public int validarString(String s) {
        if (s == null) return 0;
        else if (s.equalsIgnoreCase("entrar")) return 1;
        else if (s.equalsIgnoreCase("salir")) return -1;
        else return 0;
    }

    // ENTRAR / SALIR PERSONA
    public void entrarSalirPersona(String s, Persona p) {

        if (!puertas) {
            System.out.println("Las puertas están cerradas");
            return;
        }

        if (validarString(s) == 1) { // ENTRAR
            if ((ocupacion + p.getPeso()) <= capacidad) {
                ocupacion += p.getPeso();
                System.out.println("Persona " + p.getId() + " entra (" + p.getPeso() + " kg)");
            } else {
                System.out.println("⚠ Exceso de peso, alarma activada");
                activarAlarma(true);
            }

        } else if (validarString(s) == -1) { // SALIR
            ocupacion = 0;
            System.out.println("Salen todas las personas");
            activarAlarma(false);

        } else {
            System.out.println("Acción no válida");
        }
    }

    // MOVER ASCENSOR
    public void moverAscensor(int destino) throws PisoExcepcion, InterruptedException {

        if (alarma) {
            System.out.println("Ascensor bloqueado por alarma");
            return;
        }

        if (destino < 0 || destino > pisos) {
            throw new PisoExcepcion(
                String.format("El piso definido no existe, las plantas son de la 0 a la %d", pisos)
            );
        }

        cerrarPuertas();

        while (piso != destino) {
            if (piso < destino) {
                piso++;
            } else {
                piso--;
            }

            System.out.println("Ascensor pasando por piso: " + piso);
            Thread.sleep(500);
        }

        abrirPuertas();
    }

    // ALARMA
    public void activarAlarma(boolean activar) {
        alarma = activar;
    }
    
    public void salirTodasLasPersonas() {
    ocupacion = 0;
    alarma = false;
    }

}
