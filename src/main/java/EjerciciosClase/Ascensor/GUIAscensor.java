package EjerciciosClase.Ascensor;

import javax.swing.*;

public class GUIAscensor extends JFrame {

    private Ascensor ascensor;

    private JLabel lblPiso;
    private JTextArea areaMensajes;

    private JButton btnSubir;
    private JButton btnBajar;
    private JButton btnAbrir;
    private JButton btnCerrar;
    private JButton btnEntrar;
    private JButton btnSalir;

    public GUIAscensor() {
        ascensor = new Ascensor(10, 500); // 10 pisos, 500kg
        initComponents();
        actualizarPiso();
    }

    private void initComponents() {
        setTitle("Ascensor");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lblPiso = new JLabel("Piso: 0", SwingConstants.CENTER);

        areaMensajes = new JTextArea();
        areaMensajes.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaMensajes);

        btnSubir = new JButton("Subir");
        btnBajar = new JButton("Bajar");
        btnAbrir = new JButton("Abrir puertas");
        btnCerrar = new JButton("Cerrar puertas");
        btnEntrar = new JButton("Entrar persona");
        btnSalir = new JButton("Salir personas");

        JPanel panelBotones = new JPanel(new java.awt.GridLayout(3, 2, 5, 5));
        panelBotones.add(btnSubir);
        panelBotones.add(btnBajar);
        panelBotones.add(btnAbrir);
        panelBotones.add(btnCerrar);
        panelBotones.add(btnEntrar);
        panelBotones.add(btnSalir);

        setLayout(new java.awt.BorderLayout());
        add(lblPiso, java.awt.BorderLayout.NORTH);
        add(scroll, java.awt.BorderLayout.CENTER);
        add(panelBotones, java.awt.BorderLayout.SOUTH);

        // EVENTOS
        btnSubir.addActionListener(e -> moverAscensor(ascensor.getPiso() + 1));
        btnBajar.addActionListener(e -> moverAscensor(ascensor.getPiso() - 1));

        btnAbrir.addActionListener(e -> {
            ascensor.abrirPuertas();
            mensaje("Puertas abiertas");
        });

        btnCerrar.addActionListener(e -> {
            ascensor.cerrarPuertas();
            mensaje("Puertas cerradas");
        });

        btnEntrar.addActionListener(e -> {
            Persona p = new Persona(70);
            ascensor.entrarSalirPersona("entrar", p);
            mensaje("Entra persona de 70kg");
        });

        btnSalir.addActionListener(e -> {
            ascensor.salirTodasLasPersonas();
            mensaje("Salen todas las personas del ascensor");
        });
    }

    private void moverAscensor(int destino) {
        try {
            ascensor.moverAscensor(destino);
            actualizarPiso();
        } catch (Exception ex) {
            mensaje(ex.getMessage());
        }
    }

    private void actualizarPiso() {
        lblPiso.setText("Piso: " + ascensor.getPiso());
    }

    private void mensaje(String msg) {
        areaMensajes.append(msg + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUIAscensor().setVisible(true));
    }
}
