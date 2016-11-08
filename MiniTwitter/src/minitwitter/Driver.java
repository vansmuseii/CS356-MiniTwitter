package minitwitter;

import java.io.IOException;
import javax.swing.SwingUtilities;

/**
 *
 * @author Van Muse
 */
public class Driver {
    
    public Driver(){
    }
        
    /**
     * Main for the whole program
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        AdminUI s = AdminUI.getInstance();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                s.setVisible(true);
            }
        });
    } 
}
