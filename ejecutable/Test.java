package ejecutable;
import controlador.Controlador;
import vista.DialogoNiveles;
import vista.DialogoPreguntasFaciles;
import vista.DialogoRespuesta;
import vista.PreguntasGG;
import vista.VentanaPrincipal;
public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentana,null);
        DialogoPreguntasFaciles miDialogoPreguntasFaciles = new DialogoPreguntasFaciles();
        
  
    }    
}
