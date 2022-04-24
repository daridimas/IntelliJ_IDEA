/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.stripbandunk.swing.jframe;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dimas
 */
public class FormUtamaDesktop extends javax.swing.JFrame {

    /**
     * Creates new form FormUtamaDesktop
     */
    public FormUtamaDesktop() {
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

        jInternalFrameKategori = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jInternalFrameBarang = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        jInternalFrameKategori.setClosable(true);
        jInternalFrameKategori.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameKategori.setIconifiable(true);
        jInternalFrameKategori.setMaximizable(true);
        jInternalFrameKategori.setResizable(true);
        jInternalFrameKategori.setTitle("Manajemen Kategori");
        try {
            jInternalFrameKategori.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        jInternalFrameKategori.setVisible(true);

        jLabel1.setText("Manajemen Kategori");

        javax.swing.GroupLayout jInternalFrameKategoriLayout = new javax.swing.GroupLayout(jInternalFrameKategori.getContentPane());
        jInternalFrameKategori.getContentPane().setLayout(jInternalFrameKategoriLayout);
        jInternalFrameKategoriLayout.setHorizontalGroup(
            jInternalFrameKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jInternalFrameKategoriLayout.setVerticalGroup(
            jInternalFrameKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(287, Short.MAX_VALUE))
        );

        jInternalFrameBarang.setClosable(true);
        jInternalFrameBarang.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameBarang.setIconifiable(true);
        jInternalFrameBarang.setMaximizable(true);
        jInternalFrameBarang.setResizable(true);
        jInternalFrameBarang.setTitle("Manajemen Barang");
        jInternalFrameBarang.setPreferredSize(new java.awt.Dimension(499, 359));
        try {
            jInternalFrameBarang.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        jInternalFrameBarang.setVisible(true);

        jLabel2.setText("Manajemen Barang");

        javax.swing.GroupLayout jInternalFrameBarangLayout = new javax.swing.GroupLayout(jInternalFrameBarang.getContentPane());
        jInternalFrameBarang.getContentPane().setLayout(jInternalFrameBarangLayout);
        jInternalFrameBarangLayout.setHorizontalGroup(
            jInternalFrameBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(381, Short.MAX_VALUE))
        );
        jInternalFrameBarangLayout.setVerticalGroup(
            jInternalFrameBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(304, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Kategori");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setText("Barang");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 913, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        if (jDesktopPane1 == jInternalFrameKategori.getDesktopPane()) {
            jInternalFrameKategori.setVisible(true);
        } else {
            jInternalFrameKategori.setBounds(0, 0, 600,400);
            jDesktopPane1.add(jInternalFrameKategori);
        }
        
        try {
            jInternalFrameKategori.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FormUtamaDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if (jDesktopPane1 == jInternalFrameBarang.getDesktopPane()) {
            jInternalFrameBarang.setVisible(true);
        } else {
            jInternalFrameBarang.setBounds(0, 0, 600,400);
            jDesktopPane1.add(jInternalFrameBarang);
        }
        
        try {
            jInternalFrameBarang.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FormUtamaDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormUtamaDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtamaDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtamaDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtamaDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtamaDesktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrameBarang;
    private javax.swing.JInternalFrame jInternalFrameKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}