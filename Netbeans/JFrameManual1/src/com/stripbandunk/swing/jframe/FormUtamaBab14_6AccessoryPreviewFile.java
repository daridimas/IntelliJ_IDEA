/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.stripbandunk.swing.jframe;

import java.awt.Dimension;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author dimas
 */
public class FormUtamaBab14_6AccessoryPreviewFile extends javax.swing.JFrame {

    /**
     * Creates new form FormUtamaBab14_6AccessoryPreviewFile
     */
    public FormUtamaBab14_6AccessoryPreviewFile() {
        initComponents();
        
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("PNG Image", "png"));
        jFileChooser1.setAccessory(jPanel1);
        jFileChooser1.getAccessory().setMinimumSize(new Dimension(300, 300));
        jFileChooser1.getAccessory().setPreferredSize(new Dimension(300, 300));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jFileChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jFileChooser1PropertyChange(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(jLabel1);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Buka Gambar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int hasil = jFileChooser1.showOpenDialog(this);
        
        if (hasil == jFileChooser1.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
            System.out.println(file);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFileChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jFileChooser1PropertyChange
        // TODO add your handling code here:
        
        // perubahan property
        
        if (evt.getPropertyName().equals(jFileChooser1.SELECTED_FILE_CHANGED_PROPERTY)) {
            
            File file = jFileChooser1.getSelectedFile();
            if (file != null) {
                if (!file.isDirectory()) {
                    if (file.getName().endsWith(".png")) {
                        ImageIcon icon = new ImageIcon(file.getPath());
                        jLabel1.setIcon(icon);
                    }
                }
            }
        }
        
    }//GEN-LAST:event_jFileChooser1PropertyChange

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
            java.util.logging.Logger.getLogger(FormUtamaBab14_6AccessoryPreviewFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtamaBab14_6AccessoryPreviewFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtamaBab14_6AccessoryPreviewFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtamaBab14_6AccessoryPreviewFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtamaBab14_6AccessoryPreviewFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
