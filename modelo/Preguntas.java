package modelo;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Preguntas {
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
      void escogerRespuesta(int n) {
        if (Opciones.get(n).equals(respuesta)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Su respuesta es correcta",
                    "Muy bien :)",
                    JOptionPane.INFORMATION_MESSAGE
                    
            );
            preguntasAcertadas++;
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Su respuesta es incorrecta, la respuesta es: " + respuesta,
                    "Que mal :(",
                    JOptionPane.ERROR_MESSAGE
            );
            preguntasFalladas++;
        }
        jugar();
    }

    public void jugar() {
        if (n_pregunta == cantidadDePreguntas) {
            JOptionPane.showMessageDialog(
                    this,
                    "Preguntas acertadas: " + preguntasAcertadas + "\nPreguntas falladas: " + preguntasFalladas + "\nGracias por jugar",
                    "Muy bien :)",
                    JOptionPane.PLAIN_MESSAGE
            );
            System.exit(0);
        }
        escogerPregunta(n_pregunta);
        mostrarPregunta();
        n_pregunta++;
    }
}
