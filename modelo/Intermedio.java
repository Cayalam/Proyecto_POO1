package modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Intermedio extends JFrame 
{
    static String textoBaseDePreguntas = 
"¿Cuál es la capital de Canadá?\tOttawa\tToronto\tVancouver" + "\n"
+"¿Cuál es la moneda oficial de Japón?\tYen\tDólar\tEuro" + "\n"
+ "¿Quién pintó: La noche estrellada?\tVincent van Gogh\tPablo Picasso\tSalvador Dalí" + "\n"
+ "¿Cuál es el océano más pequeño del mundo?\tOcéano Ártico\tOcéano Atlántico\tOcéano Índico" + "\n"
+ "¿Cuál es la montaña más alta de América del Norte?\tMonte McKinley (Denali)\tMontaña de la Mesa\tMonte Rainier" + "\n"
+"¿Cuál es el idioma más hablado en el mundo?\tMandarín\tInglés\tEspañol" + "\n"
+"¿Cuál es el país con la mayor extensión territorial en América del Sur?\tBrasil\tArgentina\tPerú"+ "\n"
+"¿Cuál es el escritor de la famosa novela: Cien años de soledad?\tGabriel García Márquez\tMario Vargas Llosa\tJulio Cortázar" + "\n"
+"¿Cuál es el país que tiene el sistema de gobierno conocido como: monarquía parlamentaria?\tReino Unido\tEstados Unidos\tAlemania" + "\n"
+"¿Quién fue el presidente de los Estados Unidos durante la Segunda Guerra Mundial?\tFranklin D. Roosevelt\tHarry S. Truman\tDwight D. Eisenhower" + "\n"
+"¿Cuál es el símbolo químico del carbono?\tC\tCa\tCo" + "\n"
+"¿Cuál es el país más pequeño del mundo en términos de superficie terrestre?\tCiudad del Vaticano\tMónaco\tNauru"+ "\n"
+"¿En qué año se celebró la primera Copa Mundial de la FIFA?\t1930\t1950\t1960";
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

}
