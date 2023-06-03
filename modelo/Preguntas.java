package modelo;

public class Preguntas extends javax.swing.JFrame{
    static String urlBD = "https://docs.google.com/spreadsheets/d/e/2PACX-1vT8hF79oryUhN80AaRSfDDYpnfJ1X77Uy3A55yNTiIZK7XGWseEG6loJPwcXkSCJ35odij8s5QD2UL4/pub?output=tsv";
    static String textoBaseDePreguntas = LeerArchivo_ASCII(urlBD);
    static String[] renglones = textoBaseDePreguntas.split("\n");
    static int cantidadDePreguntas = renglones.length;
    
    static String[][] baseDePreguntas = new String[cantidadDePreguntas][12];

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


}
    

