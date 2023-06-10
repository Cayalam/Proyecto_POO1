package vista;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DialogoNivelDificil extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
     private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    public DialogoNivelDificil()
    {
        //Definición del layout de la ventana
        this.setLayout(null);

        //Caracteristicas de la ventana
        this.setTitle("Nivel Dificil");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);


    }
    
}
