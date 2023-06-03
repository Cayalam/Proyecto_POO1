package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionListener;


public class DialogoNiveles extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
   private JButton facil;
   private JButton intermedio;
   private JButton dificil;
   private JLabel seleccion;
   
    //----------------------
    // Metodos
    //----------------------
    public DialogoNiveles()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);
        //Creación de los objetos

        seleccion = new JLabel("Seleccione la dificultad");
        seleccion.setBounds(60,30,200,40);
        seleccion.setFont(new java.awt.Font("Gomawo", 1, 15));
        seleccion.setForeground(Color.white);
        this.add(seleccion);

        facil = new JButton("Facil");
        facil.setBounds(69,70,150,40);
        facil.setBackground(Color.GREEN);
        facil.setFont(new java.awt.Font("Gomawo", 1, 15));
        facil.setForeground(Color.white);
        facil.setFocusable(false);
        facil.setActionCommand("Facil");
        this.add(facil);

        
        intermedio = new JButton("Intermedio");
        intermedio.setBounds(69,120,150,40);
        intermedio.setBackground(Color.ORANGE);
        intermedio.setFont(new java.awt.Font("Gomawo", 1, 15));
        intermedio.setForeground(Color.white);
        intermedio.setFocusable(false);
        intermedio.setActionCommand("intermedio");
        this.add(intermedio);

        
        dificil = new JButton("Dificil");
        dificil.setBounds(69,170,150,40);
        dificil.setBackground(Color.RED);
        dificil.setFont(new java.awt.Font("Gomawo", 1, 15));
        dificil.setForeground(Color.white);
        dificil.setRolloverEnabled(true);
        dificil.setFocusable(false);
        dificil.setActionCommand("dificil");
        this.add(dificil);

        //Caracteristicas de la ventana
        this.setTitle("Seleccion de dificultad");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    

    public void agregarOyenteBoton(ActionListener pAL)
    {
        facil.addActionListener(pAL);
        intermedio.addActionListener(pAL);
        dificil.addActionListener(pAL);
    }

    public void cerrarDialogofacil()
    {
        this.dispose();
    }

    public void cerrarDialogointermedio()
    {
        this.dispose();
    }

    public void cerrarDialogodificil()
    {
        this.dispose();
    }
    // metodos de acceso
    public JButton getFacil() {
        return facil;
    }
    
    public JButton getIntermedio() {
        return intermedio;
    }

    public JButton getDificil() {
        return dificil;
    }
    
    
    
}
