package EjerciciosClase.Ascensor;

import java.util.Objects;

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

    // GETTERS (sin cambios)
    public int getPiso() { return piso; }
    public int getPisos() { return pisos; }
    public boolean getPuertas() { return puertas; }
    public boolean isAlarma() { return alarma; }
    public double getCapacidad() { return capacidad; }
    public double getOcupacion() { return ocupacion; }

    // PUERTAS
    public void abrirPuertas() {
        puertas = true;
        System.out.println("🟢 Puertas ABIERTAS - Piso " + piso);
    }

    public void cerrarPuertas() {
        puertas = false;
        System.out.println("🔴 Puertas CERRADAS - Subiendo/Bajando...");
    }

    // VALIDAR ACCIÓN
    private int validarString(String s) {
        if (s == null) return 0;
        return switch (s.toLowerCase()) {
            case "entrar" -> 1;
            case "salir" -> -1;
            default -> 0;
        };
    }

    // ENTRAR / SALIR PERSONA
    public void entrarSalirPersona(String accion, Persona p) {
        if (!puertas) {
            System.out.println("❌ ERROR: Las puertas están cerradas");
            return;
        }

        int dir = validarString(accion);
        if (dir == 1) { // ENTRAR
            if (ocupacion + p.getPeso() <= capacidad) {
                ocupacion += p.getPeso();
                System.out.println("✅ Persona " + p.getId() + " entra (" + ocupacion + "/" + capacidad + " kg)");
            } else {
                System.out.println("🚨 EXCESO PESO: " + p.getPeso() + "kg");
                activarAlarma(true);
            }
        } else if (dir == -1) { // SALIR
            ocupacion = 0;
            System.out.println("👥 Todas las personas salen");
            activarAlarma(false);
        } else {
            System.out.println("❓ Acción inválida: " + accion);
        }
    }

    // ⭐ MOVER ASCENSOR CON SLEEP MEJORADO ⭐
    public void moverAscensor(int destino) throws PisoExcepcion, InterruptedException {
        if (alarma) {
            System.out.println("🚨 ALARMA: Ascensor bloqueado");
            return;
        }

        if (destino < 0 || destino > pisos) {
            throw new PisoExcepcion("Piso inválido: " + destino + 
                " (válidos: 0-" + pisos + ")");
        }

        System.out.println("📍 Saliendo piso " + piso + " → destino " + destino);
        cerrarPuertas();

        // MOVIMIENTO PISO A PISO CON SLEEP
        while (piso != destino) {
            if (piso < destino) {
                piso++;
                System.out.println("⬆️  Pasando por piso: " + piso);
            } else {
                piso--;
                System.out.println("⬇️  Pasando por piso: " + piso);
            }
            
            // ⭐ SLEEP: Simula tiempo real (0.8s por piso)
            Thread.sleep(800);
        }

        System.out.println("🎯 Llegado a piso " + piso);
        abrirPuertas();
    }

    // ALARMA
    public void activarAlarma(boolean activar) {
        alarma = activar;
        System.out.println(alarma ? "🚨 ALARMA ACTIVADA" : "✅ Alarma desactivada");
    }
    
    public void salirTodasLasPersonas() {
        ocupacion = 0;
        System.out.println("👥 Emergencia: Todos salen");
        activarAlarma(false);
    }
}
