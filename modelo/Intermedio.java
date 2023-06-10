package modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;


public class Intermedio extends Preguntas{

    static String urlBD = "https://docs.google.com/spreadsheets/d/e/2PACX-1vTvI9Cj8Xf7FR_ViPoF0BjppkbvrlUzUViMY8PFMZxsOboj9ylXXSwDfRJgX-tWiB2Wbuuy9GrRl9j8/pub?output=tsv";
    static String textoBaseDePreguntas = LeerArchivo_ASCII(urlBD);
    static String[] renglones = textoBaseDePreguntas.split("\n");
    static int cantidadDePreguntas = renglones.length;

    static String[][] baseDePreguntas = new String[cantidadDePreguntas][13];

    String[] preguntaEscogida;
    String pregunta;
    String respuesta;
    String img;
    ArrayList<String> Opciones = new ArrayList<>();

    int n_pregunta = 0;

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }
        new Intermedio();
    }

    public void escogerPregunta(int n) {
        preguntaEscogida = baseDePreguntas[n];
        pregunta = preguntaEscogida[0];
        respuesta = preguntaEscogida[1];
        if (preguntaEscogida.length > 13) {
            img = preguntaEscogida[13];
        } else {
            img = "";
        }
        Opciones.clear();
        for (int i = 1; i < 12; i++) {
            Opciones.add(preguntaEscogida[i]);
        }
        for (int i = 0; i < 3; i++) {
            Collections.shuffle(Opciones);
        }
    }
    public static String LeerArchivo_ASCII(String ruta) {
        try {
            if (ruta == null) {
                throw new RuntimeException("Error, la URL de lectura no puede ser nula");
            }
            URL url = new URL(ruta);
            URLConnection conexión = url.openConnection();
            InputStreamReader isr = new InputStreamReader(conexión.getInputStream());
            return LeerArchivo_ASCII(isr);
        } catch (Exception e) {
            System.out.println("No hay conexión a internet, la base de datos no pudo ser cargada");
            System.exit(0);
        }
        return "";
    }

    public static String LeerArchivo_ASCII(Reader reader) throws Exception {
        BufferedReader br = new BufferedReader(reader);
        String texto = "";
        String linea;
        boolean primerRenglón = true;
        while ((linea = br.readLine()) != null) {
            if (primerRenglón) {
                primerRenglón = false;
            } else {
                texto += "\n";
            }
            texto += linea;
        }
        reader.close();
        br.close();
        return texto;
    }
}