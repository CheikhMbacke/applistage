/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcca;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Cheikh Mbacké
 */
public class CloseFrame {
    
     public static void close(JLabel label,JFrame frame){
         label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        if(JOptionPane.showConfirmDialog(null,"Voulez-vous fermer la fenêtre ?", "Fermer", JOptionPane.YES_NO_OPTION)==0){
            frame.setVisible(false);
        }
    }
    
}
