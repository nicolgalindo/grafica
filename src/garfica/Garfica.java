/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garfica;

/**
 *
 * @author nicog
 */
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Garfica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     JFrame marco = new JFrame("Dibujo abstroide");
     marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     ArcosJPanel arcosJPanel = new ArcosJPanel();
     marco.add( arcosJPanel );
     marco.setSize(500,500);
     marco.setVisible(true);
     
        
        // TODO code application logic here
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
