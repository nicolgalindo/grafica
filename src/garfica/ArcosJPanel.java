/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garfica;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author nicog
 */
    public class ArcosJPanel extends JPanel {
        public void paintComponent( Graphics g )
        {
            this.setBackground(Color.WHITE);
            super.paintComponent( g ); 
            g.setColor(Color.red);
            g.drawLine(1, 1, 500, 1);
            g.drawLine(1, 1, 1, 500);
         g.drawLine(1, 500, 500, 500);
         g.drawLine(500, 1, 500, 500);
         
         
            for(int i= 1; i<=500; i=i+10)
            {
               g.drawLine(1, 500-i, 1+i, 1);
               g.drawLine(1, 500-i, 500-i, 500);  
            }
        
        }
    }