/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fcca;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cheikh Mbacké
 */
public class ModifDonnees extends javax.swing.JFrame {

    /** Creates new form CompteurAffectés */
    public ModifDonnees() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        msg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        rechercheText = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        copyright = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 27, 87));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/logo.PNG"))); // NOI18N
        jLabel1.setText("Vue sur les données");

        exitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/baseline_close_black_24dp.png"))); // NOI18N
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });

        backLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backLabel.setForeground(new java.awt.Color(255, 255, 255));
        backLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/baseline_arrow_back_black_24dp.png"))); // NOI18N
        backLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(7, 27, 87));

        jTable1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Compteur", "Nom", "Prénom", "CIN", "Tel"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/website.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Recherche");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        msg.setEditable(false);
        msg.setBackground(new java.awt.Color(7, 27, 87));
        msg.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        msg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        msg.setBorder(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/baseline_search_black_24dp.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rechercheText.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        rechercheText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheTextActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(7, 27, 87));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/baseline_delete_black_24dp.png"))); // NOI18N
        delete.setText("Supprimer");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        delete.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        update.setForeground(new java.awt.Color(7, 27, 87));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/baseline_redo_black_24dp.png"))); // NOI18N
        update.setText("Modifier");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        copyright.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        copyright.setForeground(new java.awt.Color(153, 153, 153));
        copyright.setText("Copyright (C) 2018 by Cheikh");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fcca/image/baseline_copyright_white_18dp.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(rechercheText, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(delete)
                        .addGap(31, 31, 31)
                        .addComponent(update))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(copyright)
                .addGap(8, 8, 8)
                .addComponent(jLabel4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rechercheText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copyright)
                    .addComponent(jLabel4)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        // TODO add your handling code here:
        CloseFrame.close(exitLabel,this);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_backLabelMouseClicked
    public boolean FineRA=false;
    public boolean FineRC=false;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        msg.setText("");
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            
                        },
                        new String [] {
                            "N° Compteur", "Nom", "Prénom", "CIN","Tel"
                        }
                ));
        try {
            String data=rechercheText.getText();
            Connection conn=ConnectBD.BD();
            //Recherche dans la table des abonnés
            Statement states=conn.createStatement();
            ResultSet resultat=states.executeQuery("SELECT * FROM abonne WHERE nom LIKE '%"+data+"%' OR prenom LIKE '%"+data+"%'"+
                "OR cin LIKE '%"+data+"%' OR adresse LIKE '%"+data+"%' OR numCompteur LIKE '%"+data+"%' OR tel LIKE '%"+data+"%'");
            
            //Recherche dans la table des consommations
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM consommation WHERE dateDebut LIKE '%"+data+"%' OR "+
                    "dateFin LIKE '%"+data+"%' OR AI LIKE '%"+data+"%' OR NI LIKE '%"+data+"%'");
            //Remplir la table
            if(data.length()==0){
                msg.setText("Recherche vide");
                msg.setForeground(Color.red);
            }else if(resultat.first()){
                FineRA=true;
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            
                        },
                        new String [] {
                            "N° Compteur", "Nom", "Prénom", "CIN","Tel"
                        }
                ));
                DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
                Object[] row = new Object[5];
                    do{
                        row[0]=resultat.getString("numCompteur");
                        row[1]=resultat.getString("nom");
                        row[2]=resultat.getString("prenom");
                        row[3]=resultat.getString("cin");
                        row[4]=resultat.getString("tel");
                        model.addRow(row);
                    }while(resultat.next());
            }else if(rs.first()){
                FineRC=true;
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            
                        },
                        new String [] {
                            "Date de Debut", "Date de fin", "AI", "NI","ID"
                        }
                ));
                DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
                Object[] row = new Object[5];
                do{
                    row[0]=rs.getDate("dateDebut").toString();
                    row[1]=rs.getDate("dateFin").toString();
                    row[2]=rs.getInt("AI");
                    row[3]=rs.getInt("NI");
                    row[4]=rs.getInt("idConsommation");
                    model.addRow(row);
                }while(rs.next());
            }else {
                msg.setText("Aucun resultat trouvé");
                msg.setForeground(Color.red);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModifDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        msg.setText("");
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1){
            if(jTable1.getRowCount()==0){
                msg.setText("La table est vide");
                msg.setForeground(Color.red);
            }else{
                msg.setText("Aucune ligne n'est sélectionnée");
                msg.setForeground(Color.red);
            }
        }else{
            if(FineRA){
                String numCompteur=model.getValueAt(jTable1.getSelectedRow(), 0).toString();
                String nom=model.getValueAt(jTable1.getSelectedRow(), 1).toString();
                String prenom=model.getValueAt(jTable1.getSelectedRow(), 2).toString();
                String cin=model.getValueAt(jTable1.getSelectedRow(), 3).toString();
                String tel=model.getValueAt(jTable1.getSelectedRow(), 4).toString();
                Connection conn;
                try {
                    conn = ConnectBD.BD();
                    PreparedStatement pstate=conn.prepareStatement("UPDATE abonne set nom=?,prenom=?,cin=?,tel=? WHERE"+
                            " numCompteur=?");
                    pstate.setString(1, nom);
                    pstate.setString(2, prenom);
                    pstate.setString(3, cin);
                    pstate.setString(4, tel);
                    pstate.setString(5, numCompteur);
                    pstate.executeUpdate();
                    msg.setText("L'abonné a été modifiée");
                    msg.setForeground(Color.green);
                } catch (SQLException ex) {
                    Logger.getLogger(ModifDonnees.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(FineRC){
                String dateDebut=model.getValueAt(jTable1.getSelectedRow(), 0).toString();
                String dateFin=model.getValueAt(jTable1.getSelectedRow(), 1).toString();
                String AI=model.getValueAt(jTable1.getSelectedRow(), 2).toString();
                String NI=model.getValueAt(jTable1.getSelectedRow(), 3).toString();
                String ID=model.getValueAt(jTable1.getSelectedRow(), 4).toString();
                Connection conn;
                try {
                    conn = ConnectBD.BD();
                    PreparedStatement pstate=conn.prepareStatement("UPDATE consommation set dateDebut=?,dateFin=?,AI=?,NI=?"+
                            "WHERE idConsommation=?");
                    pstate.setString(1, dateDebut);
                    pstate.setString(2, dateFin);
                    pstate.setString(3, AI);
                    pstate.setString(4, NI);
                    pstate.setString(5, ID);
                    pstate.executeUpdate();
                    msg.setText("La consommation a été modifiée");
                    msg.setForeground(Color.green);
                } catch (SQLException ex) {
                    Logger.getLogger(ModifDonnees.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1){
            if(jTable1.getRowCount()==0){
                msg.setText("La table est vide");
                msg.setForeground(Color.red);
            }else{
                msg.setText("Aucune ligne n'est sélectionnée");
                msg.setForeground(Color.red);
            }
        }else{
            if(FineRA){
                String numCompteur=model.getValueAt(jTable1.getSelectedRow(), 0).toString();
                Connection conn;
                try {
                    conn = ConnectBD.BD();
                    PreparedStatement pstate=conn.prepareStatement("UPDATE abonne set TypeAbonne=? WHERE numCompteur=?");
                    pstate.setString(1, "R");
                    pstate.setString(2, numCompteur);
                    pstate.executeUpdate();
                    model.removeRow(jTable1.getSelectedRow());
                    msg.setText("L'abonnement a été supprimée");
                    msg.setForeground(Color.green);
                } catch (SQLException ex) {
                    Logger.getLogger(ModifDonnees.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(FineRC){
                String ID=model.getValueAt(jTable1.getSelectedRow(), 4).toString();
                Connection conn;
                try {
                    conn = ConnectBD.BD();
                    PreparedStatement pstate=conn.prepareStatement("DELETE FROM consommation WHERE idConsommation=?");
                    pstate.setString(1, ID);
                    pstate.executeUpdate();
                    model.removeRow(jTable1.getSelectedRow());
                    msg.setText("La consommation a été supprimée");
                    msg.setForeground(Color.green);
                } catch (SQLException ex) {
                    Logger.getLogger(ModifDonnees.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void rechercheTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rechercheTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ModifDonnees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifDonnees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifDonnees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifDonnees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifDonnees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel copyright;
    private javax.swing.JButton delete;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField msg;
    private javax.swing.JTextField rechercheText;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}
