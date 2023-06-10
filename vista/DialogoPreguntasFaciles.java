package vista;

import javax.swing.JDialog;

public class DialogoPreguntasFaciles  extends JDialog{

    

    public DialogoPreguntasFaciles() {
        this.setTitle("Preguntas Faciles");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
}
