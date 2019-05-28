/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.SwingUtilities;

/**
 *
 * @author COLEJXA2
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Derivar().setVisible(true);
            }
        });
    }
    
}
