package modelo;

import java.util.ArrayList;
import java.util.Collections;
import vista.Dificil;
import javax.swing.JOptionPane;

public class Preguntas {
       static String textoBaseDePreguntas = 
"¿Cual es el elemento más ligero en la tabla periodica?\tHidrógeno\tHelio\tLitio\tOxigeno"
+"\n"
+"En que año se fundo la compañia Microsoft?\t1975\t1980\t1985\t1990"
+"\n"
+"¿Cual es el país con mayor población del mundo?\tChina\tIndia\tEstados Unidos\tRusia"
+"\n"
+"¿Cual es el país con mayor población de América Latina?\tBrasil\tMéxico\tColombia\tArgentina"
+"\n"
+"Cual es el oceano más grande del mundo?\tOceano Pacifico\tOceano Atlantico\tOceano Indico\tOceano Glacial Antartico"
+"\n"
+"¿Cual es el río más largo del mundo?\tRio Amazonas\tRio Nilo\tRio Yangtze\tRio Misisipi"
+"\n"
+"¿Cual es el país más grande del mundo?\tRusia\tCanada\tChina\tEstados Unidos"
+"\n"
+"Quien escribio el libro El Principito?\tAntoine de Saint-Exupéry\tJulio Verne\tJ. K. Rowling\tJ. R. R. Tolkien"
+"\n"
+"Cual es la lengua más hablada del mundo?\tChino Mandarín\tEspañol\tIngles\tHindi"
+"\n"
+"En que pais se encuentra el Taj Mahal?\tIndia\tChina\tJapon\tTailandia"
+"\n"
+"¿Cual es la obra mas famosa de Leonardo Da Vinci?\tLa Mona Lisa\tLa Ultima Cena\tLa Gioconda\tLa Dama del Armiño"
+"\n"
+"¿Cual es el país con mayor superficie del mundo?\tRusia\tCanada\tChina\tEstados Unidos"
+"\n"
+"Cual es el decierto mas grande del mundo?\tSahara\tAntartico\tArabia\tGobi"
+"\n"
+"¿Cual es la ciudad mas poblada de Africa?\tEl Cairo\tLagos\tKinshasa\tJohannesburgo"
+"\n"
+"¿Cual es el instrumento musical mas antiguo del mundo?\tFlauta\tTambor\tViolin\tPiano"
+"\n"
+"¿Cual es la estatua mas famosa del mundo?\tLa Estatua de la Libertad\tEl David\tEl Pensador\tEl Moises";


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
    private void mostrarPregunta() {
    }
    
}
