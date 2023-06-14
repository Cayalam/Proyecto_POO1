package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import vista.DialogoNiveles;
import vista.Dificil;
import vista.Facil;
import vista.Intermedio;
import vista.VentanaPrincipal;


public class Controlador implements ActionListener
{
    private VentanaPrincipal venPrin;
    private DialogoNiveles jP;
    private Facil preguntasFacil;
   
    private Intermedio preguntasIntermedio;
    private Dificil preguntasDificil;


    public Controlador(VentanaPrincipal pVenPrin, DialogoNiveles miDialogoNiveles){
        this.venPrin =pVenPrin;
        this.jP= miDialogoNiveles;
        this.venPrin.miPanelEntradaDatos.agregarOyenteBoton(this);
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        if (comando.equals("jugar")){
            venPrin.crearDialogoNiveles();
            this.venPrin.miDialogoNiveles.agregarOyenteBoton(this);

        }
        if (comando.equals("salir")){
            JOptionPane.showMessageDialog(null, "Has salido de la aplicación");
            System.exit(0);
}

// conectar el boton de facil con el dialogo de preguntas
        if (comando.equals("Facil")){
            venPrin.crearDialogoPreguntas();
            this.venPrin.miDialogoNiveles.agregarOyenteBoton(this);
            preguntasFacil = new Facil(comando);
            

        }
        if (comando.equals("intermedio")){
            venPrin.crearDialogoPreguntas();
            this.venPrin.miDialogoNiveles.agregarOyenteBoton(this);
            preguntasIntermedio = new Intermedio(comando);

        }
        if (comando.equals("dificil")){
            venPrin.crearDialogoPreguntas();
            this.venPrin.miDialogoNiveles.agregarOyenteBoton(this);
            preguntasDificil = new Dificil(comando);

        }
        



        }
        
    }
    
    