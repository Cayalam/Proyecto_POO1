package vista;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Facil extends JFrame {
    static String textoBaseDeDatos =
            "¿Dónde está ubicada la Casa Blanca?\tWashington D.C.\tNew York\tCalifornia\tFlorida\tTexas"
                    + "\n" +
                    "¿Cuándo acabó la Segunda Guerra Mundial?\t1945\t1944\t1943\t1942\t1941"
                    + "\n" +
                    "¿Quién inventó la bombilla?\tThomas Edison\tNikola Tesla\tBenjamin Franklin\tAlbert Einstein\tIsaac Newton"
                    + "\n" +
                    "¿Quién inventó el teléfono?\tAlexander Graham Bell\tThomas Edison\tNikola Tesla\tBenjamin Franklin\tAlbert Einstein"
                    + "\n" +
                    "¿Cuál es el país más grande del mundo?\tRusia\tChina\tEstados Unidos\tCanadá\tBrasil"
                    + "\n" +
                    "¿Cuál es el río más caudaloso del planeta?\tAmazonas\tNilo\tMisisipi\tGanges\tYangtsé"
                    + "\n" +
                    "¿Cuál es el país más visitado del mundo?\tFrancia\tEstados Unidos\tEspaña\tChina\tItalia"
                    + "\n" +
                    "¿Cuál es la moneda que maneja Estados Unidos?\tDólar\tEuro\tPeso\tYen\tLibra"
                    + "\n" +
                    "¿Cuál es el país más poblado del mundo?\tChina\tIndia\tEstados Unidos\tIndonesia\tBrasil";

    private static String textoBaseDePreguntas;

    static String[] renglones = textoBaseDePreguntas.split("\n");
    static int cantidadDePreguntas = renglones.length;
   


    static String[][] baseDePreguntas = new String[cantidadDePreguntas][16];

    String[] preguntaEscogida;
    String pregunta;
    String respuesta;
    
    ArrayList<String> Opciones = new ArrayList<>();

    int n_pregunta = 0;

    static int preguntasAcertadas = 0;
    static int preguntasFalladas = 0;
    static int puntuacion = 0;


    public void escogerPregunta(int n) {
        preguntaEscogida = baseDePreguntas[n];
        pregunta = preguntaEscogida[0];
        respuesta = preguntaEscogida[1];
        Opciones.clear();
        
        for (int i = 1; i < 5; i++) {
            Opciones.add(preguntaEscogida[i]);
        }
        for (int i = 0; i < 4; i++) {
            Collections.shuffle(Opciones);
        }
    }
//Veo muchos if /else, qué pasó con el "Try" y compañia 

    public void mostrarPregunta() {
        jLabel1.setText(pregunta);
       
        jButton1.setText(Opciones.get(0));
        jButton1.setBackground(Color.cyan);
        jButton1.setFocusable(false);
        jButton1.setBounds(0, 100, 100, 100);

        jButton2.setText(Opciones.get(1));
        jButton2.setBackground(Color.cyan);
        jButton2.setFocusable(false);
        jButton2.setBounds(0,150,100,100);

        jButton4.setText(Opciones.get(2));
        jButton4.setBackground(Color.cyan);
        jButton4.setFocusable(false);
        jButton4.setBounds(0,200,100,100);

        jButton3.setText(Opciones.get(3));
        jButton3.setBackground(Color.cyan);
        jButton3.setFocusable(false);
        jButton3.setBounds(0,250,100,100);
    }

   public int calcularPuntuacion(int preguntasAcertadas, int preguntasFalladas) {
    puntuacion = preguntasAcertadas * 100; 
    int penalizacion = (preguntasFalladas / 3) * 50;
    puntuacion -= penalizacion;

    return puntuacion;
}


    void escogerRespuesta(int n) {
        if (Opciones.get(n).equals(respuesta)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Respuesta correcta",
                    "Eso Bro :)",
                    JOptionPane.INFORMATION_MESSAGE
                    
            );
            preguntasAcertadas++;
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Repuesta incorrecta, la respuesta es: " + respuesta,
                    "Mucha Loka :(",
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
    "Preguntas acertadas: " + preguntasAcertadas + "\n\nPreguntas falladas: " + preguntasFalladas +"\n\nTu puntuación fue: "+puntuacion +"\n\n\nCada dia te superas mas :D",
    "Resultados... :/",
    JOptionPane.PLAIN_MESSAGE
);
            System.exit(0);
        }
        escogerPregunta(n_pregunta);
        mostrarPregunta();
        n_pregunta++;
    }

    public Facil(Object object) {
        for (int i = 0; i < renglones.length; i++) {
            String renglon = renglones[i];
            baseDePreguntas[i] = renglon.split("\t");
        }
        initComponents();
        setSize(900, 600);
        setLocationRelativeTo(null);
        //setExtendedState(MAXIMIZED_BOTH);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pregunta");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(4, 0, 0, 10));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Opción 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Opción 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Opción 3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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
}