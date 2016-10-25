/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author VANSKEES
 */
public class Driver {
    
    JFrame f;
    public Driver(){
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new AdminUI());      //adds the start panel
        f.pack();
        f.setLocationRelativeTo(null); //centers the window
        f.setVisible(true);
    }
        
    /**
     * Main for the whole program
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Driver();
            }
        });
    } 
}
