package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class DialogoRespuesta extends JDialog{

    //----------------------
    // Atributos
    //----------------------
   private JLabel Puntaje;
   private JButton salir;
   private double puntaje;
   private JLabel felicitaciones;

     
    public DialogoRespuesta()
    {
        //Definición del layout de la ventana
        this.setLayout(null);


        //Creación de los objetos
        Puntaje = new JLabel("Puntaje: "+puntaje);
        Puntaje.setBounds(60,30,200,40);
        Puntaje.setFont(new java.awt.Font("Gomawo", 1, 15));
        Puntaje.setForeground(java.awt.Color.white);
        this.add(Puntaje);

        felicitaciones = new JLabel("Felicitaciones");
        felicitaciones.setBounds(60,30,200,40);
        felicitaciones.setFont(new java.awt.Font("Gomawo", 1, 15));
        felicitaciones.setForeground(java.awt.Color.white);
        this.add(felicitaciones);

        salir = new JButton("Salir");
        salir.setBounds(69,170,150,40);
        salir.setBackground(java.awt.Color.RED);
        salir.setFont(new java.awt.Font("Gomawo", 1, 15));
        salir.setForeground(java.awt.Color.white);
        salir.setFocusable(false);
        salir.setActionCommand("salir");
        this.add(salir);
 
        //Caracteristicas de la ventana
        this.setTitle("Trainer brain");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

      
    }
    //Metodos de acceso
    public JButton getBtSalir() {
         return salir;
    }
    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
<<<<<<< HEAD
    
=======

>>>>>>> f9d22096f7dbe56b9eba8957222a50e1fa81a3ff
    public void setFelicitaciones(JLabel felicitaciones) {
        this.felicitaciones = felicitaciones;
    }
    public JLabel getFelicitaciones() {
        return felicitaciones;
    }
    public void setPuntaje(JLabel puntaje) {
        Puntaje = puntaje;
    }
    public JLabel getPuntaje() {
        return Puntaje;
    }
    
    
}
