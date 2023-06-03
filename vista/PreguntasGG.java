package vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;


public class PreguntasGG extends JDialog {

    //Atributos
    public JLabel pregunta;
    public JButton btOpcion1;
    public JButton btOpcion2;
    public JButton btOpcion3;
    public JButton btOpcion4;
    public JButton btSiguiente;
    public JLabel lbImagen;
    public Image iImagen;


public PreguntasGG()
{
    //Definición del layout del Dialogo
    this.setLayout(null);

    //Creación de los objetos
    pregunta = new JLabel("¿Cuál es el nombre del primer presidente de Colombia?");
    pregunta.setBounds(80,20,400,40);
    this.add(pregunta);

    //Creación y adicion de la imagen
   /* iImagen =new ImageIcon(getClass().getResource("/vista/Bandera_de_Colombia")).getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
    lbImagen = new JLabel();
    lbImagen.setBounds(85,10,400,400);
    add(lbImagen); */
    



    btOpcion1 = new JButton("A) Francisco de Paula Santander");
    btOpcion1.setBounds(90,230,300,30);
    btOpcion1.setFocusable(false);
    btOpcion1.setLayout(null);
    this.add(btOpcion1);

    btOpcion2 = new JButton("B) Simón Bolivar");
    btOpcion2.setBounds(90,270,300,30);
    btOpcion2.setFocusable(false);
    btOpcion2.setLayout(null);
    this.add(btOpcion2);

    btOpcion3 = new JButton("C) Antonio Nariño");
    btOpcion3.setBounds(90,310,300,30);
    btOpcion3.setFocusable(false);
    btOpcion3.setLayout(null);
    this.add(btOpcion3);

    btOpcion4 = new JButton("D) Rafael Nuñez");
    btOpcion4.setBounds(90,350,300,30);
    btOpcion4.setFocusable(false);
    btOpcion4.setLayout(null);
    this.add(btOpcion4);

    btSiguiente = new JButton("Siguiente");
    btSiguiente.setBounds(90,390,300,40);
    btSiguiente.setFocusable(false);
    btSiguiente.setLayout(null);
    btSiguiente.setBackground(Color.GREEN);
    this.add(btSiguiente);

    //comando para centrar el texto en el boton
    btOpcion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btOpcion2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btOpcion3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btOpcion4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);


    //Caracteristicas del dialogo
    this.setTitle("Pregunta 1");
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setVisible(true);
}
    //agregar botones oyentes
    public void agregarOyentes(ActionListener pAl)
    {
        btOpcion1.addActionListener(pAl);
        btOpcion2.addActionListener(pAl);
        btOpcion3.addActionListener(pAl);
        btOpcion4.addActionListener(pAl);
        btSiguiente.addActionListener(pAl);
        
    }
    public void crearDialogoPreguntas() {
        PreguntasGG miDialogoPreguntas = new PreguntasGG();
        
    }
}
    

