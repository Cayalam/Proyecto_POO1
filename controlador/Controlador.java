package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.JuegoDePreguntas;
import vista.DialogoNiveles;
import vista.PreguntasGG;
import vista.VentanaPrincipal;


public class Controlador implements ActionListener
{
    private VentanaPrincipal venPrin;
    private DialogoNiveles jP;
    private PreguntasGG madrePreguntasGG;

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
            JOptionPane.showMessageDialog(null, "Gracias por jugar");
            System.exit(0);
}

// conectar el boton de facil con el dialogo de preguntas
        if (comando.equals("facil")){
            venPrin.crearDialogoPreguntas();
            this.venPrin.miDialogoNiveles.agregarOyenteBoton(this);

        }
        if (comando.equals("intermedio")){
            venPrin.crearDialogoPreguntas();
            this.venPrin.miDialogoNiveles.agregarOyenteBoton(this);

        }
        if (comando.equals("dificil")){
            venPrin.crearDialogoPreguntas();
            this.venPrin.miDialogoNiveles.agregarOyenteBoton(this);

        }
        if (comando.equals("siguiente")){
            venPrin.crearDialogoPreguntas();
            this.venPrin.miDialogoNiveles.agregarOyenteBoton(this);

            //si no hay mas preguntas desir el puntaje
        
                
            }



        }
        
    }
    
    