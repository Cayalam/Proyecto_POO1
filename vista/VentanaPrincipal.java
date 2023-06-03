package vista;

import javax.swing.JFrame;
public class VentanaPrincipal extends JFrame
{
    //----------------------
    // Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public DialogoNiveles miDialogoNiveles = null;

    
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public VentanaPrincipal()
    {
        //Definición del layout de la ventana
        this.setLayout(null);

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,0,580,580);
        this.add(miPanelEntradaDatos);

       

        //Caracteristicas de la ventana
        this.setTitle("Trainer brain");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

      
    }
    //Crear Dialogo para siguiente
   public void crearDialogoNiveles()
   {
    miDialogoNiveles= new DialogoNiveles();
   }
   //Crear Dialogo para preguntas
   public void crearDialogoPreguntas()
   {
    miDialogoNiveles= new DialogoNiveles();
   }

   
    
}
