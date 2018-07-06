/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcca;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Cheikh Mbacké
 */
public class AbonneRegister extends javax.swing.JFrame {

    /**
     * Creates new form AbonneRegister
     */
    public AbonneRegister() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        msg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        cin = new javax.swing.JTextField();
        nom2 = new javax.swing.JTextField();
        addr = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(7, 27, 87));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/ic_account_circle_white_24dp.png"))); // NOI18N
        jLabel2.setText("Nom");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 132, 35));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/ic_account_circle_white_24dp.png"))); // NOI18N
        jLabel3.setText("Prenom");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 132, 35));

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/baseline_location_on_white_24dp.png"))); // NOI18N
        jLabel4.setText("Adresse");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 132, 35));

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/baseline_payment_white_24dp.png"))); // NOI18N
        jLabel5.setText("CIN");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 132, 36));

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/baseline_call_white_24dp.png"))); // NOI18N
        jLabel6.setText("Tel");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 378, 132, 39));

        tel.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telKeyTyped(evt);
            }
        });
        jPanel1.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 289, 30));

        jButton1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/baseline_send_black_24dp.png"))); // NOI18N
        jButton1.setText("s'abonner");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 509, -1, 36));

        msg.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 467, 289, 24));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/logo.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 0, -1, 556));

        exitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/baseline_close_white_24dp.png"))); // NOI18N
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel1.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 0, 42, 35));

        cin.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        cin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cinKeyTyped(evt);
            }
        });
        jPanel1.add(cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 289, 35));

        nom2.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        nom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom2ActionPerformed(evt);
            }
        });
        jPanel1.add(nom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 289, 35));

        addr.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jPanel1.add(addr, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 289, 35));

        prenom.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomActionPerformed(evt);
            }
        });
        jPanel1.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 289, 35));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/images (1).jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, 200));

        backLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backLabel.setForeground(new java.awt.Color(255, 255, 255));
        backLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/baseline_arrow_back_white_24dp.png"))); // NOI18N
        backLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        jPanel1.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 42, 35));

        jLabel8.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/baseline_offline_bolt_white_24dp2.png"))); // NOI18N
        jLabel8.setText("N°Compteur");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 132, 33));

        jComboBox.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxMouseClicked(evt);
            }
        });
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 289, 33));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/baseline_cloud_download_black_24dp.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     /*public void closeFrame(){
        WindowEvent winClose= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
    }*/
    private void errorMessage(String message,JLabel label){
            label.setText(message);
            label.setForeground(Color.red);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name=nom2.getText();
        String surname=prenom.getText();
        String adresse=addr.getText();
        String identite=cin.getText();
        String numTel=tel.getText();
     
        if(name.length()!=0 && surname.length()!=0 && adresse.length()!=0 && !jComboBox.getSelectedItem().toString().equals("")){
            if(identite.length() == 13){
                if(numTel.length()==9){
                    String numCpt=jComboBox.getSelectedItem().toString();
                Connection conn;
                msg.setText("");
                try {
                    conn = ConnectBD.BD();
                    //Verifier si le numéro de compteur est deja pris ou pas
                    Statement s=conn.createStatement();
                    ResultSet rs=s.executeQuery("SELECT cin,nom,prenom,tel FROM abonne");
                    Boolean CptCin = false;
                    
                    while(rs.next()){
                        if(rs.getString("cin").equals(identite))
                        {
                              CptCin=true;
                              break;
                        }
                    }
                    if(CptCin){
                       errorMessage("le numéro cin est déja pris",msg);
                    }else{
                        //Enregistrement de l'abonné
                        PreparedStatement ps=conn.prepareStatement("INSERT INTO abonne (nom,prenom,adresse,cin,tel,numCompteur)"
                            +" VALUES (?,?,?,?,?,?)");
                        ps.setString(1, name.toLowerCase());
                        ps.setString(2, surname.toLowerCase());
                        ps.setString(3, adresse.toLowerCase());
                        ps.setString(4, identite);
                        ps.setString(5, numTel);
                        ps.setString(6, numCpt);
                        ps.executeUpdate();
                        jComboBox.removeItem(numCpt);
                        //Affectation du compteur à l'abonné
                        Statement state=conn.createStatement();
                        ResultSet rst=state.executeQuery("SELECT idAbonne FROM abonne WHERE numCompteur='"+numCpt+"'");
                        int id=0;
                        while(rst.next())
                             id=rst.getInt("idAbonne");

                        PreparedStatement states=conn.prepareStatement("UPDATE compteur SET idAbonne=? "+
                                "WHERE numCompteur='"+numCpt+"'");
                        states.setInt(1, id);
                        states.executeUpdate();
                        conn.close();
                        //message
                        JOptionPane.showMessageDialog(null, "Abonnement réussie");
                        msg.setText("Enregistrement réussie");
                        msg.setForeground(Color.green);
                        nom2.setText("");
                        prenom.setText("");
                        addr.setText("");
                        cin.setText("");
                        tel.setText("");
                        //Dans le cas ou jComboBox.removeItem vide la liste des compteur
                        if(jComboBox.isCursorSet()){
                            if(JOptionPane.showConfirmDialog(null,"I n' ya plus de compteurs disponibles,Voulez-vous en créer un nouveau?", "Créer compteur",
                                    JOptionPane.YES_NO_OPTION)==0){
                                new CompterRegister().setVisible(true);
                            }else{
                                JOptionPane.showMessageDialog(null, "Vous aller retourner au menu,appuyer sur OK");
                                this.setVisible(false);
                                new Dashboard().setVisible(true);
                            }
                        }
                    }
                } catch (SQLException ex) {
               // Logger.getLogger(AbonneRegister.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println("Erreur: "+ex.getMessage());
            }
                }else{
                   errorMessage("le numéro de téléphone doit comprendre 9 chiffres",msg); 
                }
            }else{
                errorMessage("le numéro de cin doit comprendre 13 chiffres",msg);
            }
        }else{
            msg.setText("Veuiller remplir les champs vides");
            msg.setForeground(Color.red);
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    @SuppressWarnings("empty-statement")
    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        // TODO add your handling code here:
               CloseFrame.close(exitLabel,this);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void nom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom2ActionPerformed

    private void prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomActionPerformed

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_backLabelMouseClicked

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
        
                
               
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection conn;
        try {
            //Recuperation de tous les numéros de compteurs
            conn = ConnectBD.BD();
            Statement st=conn.createStatement();
            String sqlQuery="SELECT numCompteur,idAbonne FROM compteur WHERE idAbonne=0";
            ResultSet rs=st.executeQuery(sqlQuery);         
                
            while(rs.next()){
                jComboBox.addItem(rs.getString("numCompteur"));
            }
            if(!rs.first()){
                new CompterRegister().setVisible(true);
                jButton2.setEnabled(true);
            }
            jButton2.setEnabled(false);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AbonneRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMouseClicked
    private void cinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cinKeyTyped
        // TODO add your handling code here:
        isANumber(evt, msg);
    }//GEN-LAST:event_cinKeyTyped

    private void telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyTyped
        // TODO add your handling code here:
        isANumber(evt, msg);
    }//GEN-LAST:event_telKeyTyped
      public void isANumber(KeyEvent events,JLabel label){
          label.setText("");
        char c=events.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            events.consume();
            label.setText("Veuiller entrer des chiffres");
            label.setForeground(Color.red);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AbonneRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbonneRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbonneRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbonneRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AbonneRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addr;
    private javax.swing.JLabel backLabel;
    private javax.swing.JTextField cin;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel msg;
    private javax.swing.JTextField nom2;
    private javax.swing.JTextField prenom;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
