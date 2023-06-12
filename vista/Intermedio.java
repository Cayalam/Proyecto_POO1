package vista;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Intermedio extends JFrame {
    static String textoBaseDePreguntas =
            "¿Cuál es la capital de Canadá?\tOttawa\tToronto\tVancouver" + "\n"
                    + "¿Cuál es la moneda oficial de Japón?\tYen\tDólar\tEuro" + "\n"
                    + "¿Quién pintó: La noche estrellada?\tVincent van Gogh\tPablo Picasso\tSalvador Dalí" + "\n"
                    + "¿Cuál es el océano más pequeño del mundo?\tOcéano Ártico\tOcéano Atlántico\tOcéano Índico" + "\n"
                    + "¿Cuál es la montaña más alta de América del Norte?\tMonte McKinley (Denali)\tMontaña de la Mesa\tMonte Rainier" + "\n"
                    + "¿Cuál es el idioma más hablado en el mundo?\tMandarín\tInglés\tEspañol" + "\n"
                    + "¿Cuál es el país con la mayor extensión territorial en América del Sur?\tBrasil\tArgentina\tPerú" + "\n"
                    + "¿Cuál es el escritor de la famosa novela: Cien años de soledad?\tGabriel García Márquez\tMario Vargas Llosa\tJulio Cortázar" + "\n"
                    + "¿Cuál es el país que tiene el sistema de gobierno conocido como: monarquía parlamentaria?\tReino Unido\tEstados Unidos\tAlemania" + "\n"
                    + "¿Quién fue el presidente de los Estados Unidos durante la Segunda Guerra Mundial?\tFranklin D. Roosevelt\tHarry S. Truman\tDwight D. Eisenhower" + "\n"
                    + "¿Cuál es el símbolo químico del carbono?\tC\tCa\tCo" + "\n"
                    + "¿Cuál es el país más pequeño del mundo en términos de superficie terrestre?\tCiudad del Vaticano\tMónaco\tNauru" + "\n"
                    + "¿En qué año se celebró la primera Copa Mundial de la FIFA?\t1930\t1950\t1960";

    static String[] renglones = textoBaseDePreguntas.split("\n");
    static int cantidadDePreguntas = renglones.length;

    static String[][] baseDePreguntas = new String[cantidadDePreguntas][4];

    String[] preguntaEscogida;
    String pregunta;
    String respuesta;

    ArrayList<String> opciones = new ArrayList<>();

    int n_pregunta = 0;

    static int preguntasAcertadas = 0;
    static int preguntasFalladas = 0;
    static int puntuacion = 0;

    public void escogerPregunta(int n) {
        preguntaEscogida = baseDePreguntas[n];
        pregunta = preguntaEscogida[0];
        respuesta = preguntaEscogida[1];
        opciones.clear();

        for (int i = 1; i < 4; i++) {
            opciones.add(preguntaEscogida[i]);
        }
        Collections.shuffle(opciones);
    }

    public void mostrarPregunta() {
        jLabel1.setText(pregunta);

        jButton1.setText(opciones.get(0));
        jButton2.setText(opciones.get(1));
        jButton4.setText(opciones.get(2));
        jButton3.setText(opciones.get(3));
    }

    public int calcularPuntuacion(int preguntasAcertadas, int preguntasFalladas) {
        puntuacion = preguntasAcertadas * 100;
        int penalizacion = (preguntasFalladas / 3) * 50;
        puntuacion -= penalizacion;

        return puntuacion;
    }

    void escogerRespuesta(int n) {
        if (opciones.get(n).equals(respuesta)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Respuesta correcta",
                    "¡Correcto!",
                    JOptionPane.INFORMATION_MESSAGE
            );
            preguntasAcertadas++;
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Respuesta incorrecta, la respuesta es: " + respuesta,
                    "¡Incorrecto!",
                    JOptionPane.ERROR_MESSAGE
            );
            preguntasFalladas++;
        }
        jugar();
    }

    public void jugar() {
        puntuacion = calcularPuntuacion(preguntasAcertadas, preguntasFalladas);
        if (n_pregunta == cantidadDePreguntas) {
            JOptionPane.showMessageDialog(
                    this,
                    "Preguntas acertadas: " + preguntasAcertadas + "\n\nPreguntas falladas: " + preguntasFalladas + "\n\nTu puntuación fue: " + puntuacion + "\n\n¡Cada día te superas más!",
                    "Resultados",
                    JOptionPane.PLAIN_MESSAGE
            );
            System.exit(0);
        }
        escogerPregunta(n_pregunta);
        mostrarPregunta();
        n_pregunta++;
    }

    public Intermedio(Object object) {
        for (int i = 0; i < renglones.length; i++) {
            String renglon = renglones[i];
            baseDePreguntas[i] = renglon.split("\t");
        }
        initComponents();
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        jugar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        jPanel2.setLayout(new java.awt.GridLayout(2, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pregunta");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(4, 0, 0, 10));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jButton1.setText("Opción 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24));
        jButton2.setText("Opción 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24));
        jButton4.setText("Opción 3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24));
        jButton3.setText("Opción 4");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        escogerRespuesta(0);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        escogerRespuesta(1);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        escogerRespuesta(2);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        escogerRespuesta(3);
    }


    // Variables declaration - do not modify
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;

    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    // End of variables declaration
}
