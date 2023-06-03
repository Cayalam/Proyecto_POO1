package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    
    private JButton btJugar;
    private JButton btSalir;
    private JLabel lbImagen;
    private ImageIcon iImagen;
    

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar boton AgregarVendedor
        btJugar = new JButton("Jugar");
        btJugar.setFont(new Font("Arial", Font.BOLD, 20));
        btJugar.setBackground(Color.GREEN);
        btJugar.setBounds(200,400,170,50);
        btJugar.setFocusable(false);
        btJugar.setActionCommand("jugar");
        this.add(btJugar);

        //Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(235,480,100,50);
        btSalir.setFont(new Font("Arial", Font.BOLD, 20));
        btSalir.setBackground(Color.RED);
        btSalir.setFocusable(false);
        btSalir.setActionCommand("salir");
        this.add(btSalir);


            //Creación y adicion de la imagen
            iImagen = new ImageIcon(getClass().getResource("/vista/Train.png"));
            lbImagen = new JLabel(iImagen);
            lbImagen.setBounds(85,10,400,400);
            add(lbImagen);

    }

    //Metodos de acceso
   public JButton getBtJugar() {
        return btJugar;
    }
    public void agregarOyenteBoton(ActionListener pAL){
        btJugar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }

   
    

}



