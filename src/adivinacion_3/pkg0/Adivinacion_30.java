package adivinacion_3.pkg0;

import Ventanas.Principal;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author chepe
 */
public class Adivinacion_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //agregando el estilo nimbus a las ventanas
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
        }

        //llamando a la ventana principal y mostrandola
        Principal p = new Principal();
        p.setVisible(true);
    }
}
