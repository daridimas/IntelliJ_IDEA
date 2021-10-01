/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.swing.jframe;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

/**
 *
 * @author dimas
 */
public class FormUtamaBab64 extends javax.swing.JFrame {

    /**
     * Creates new form FormUtamaBlank
     */
    public FormUtamaBab64() {
        initComponents();
        
        FocusListener listener = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) { // ada e.getComponent atau e.getSource untuk mengetahui objek mana yang fokus
                // untuk konversi txtNama passKataSandi txtAreaKeterangan kita bisa pakai JTextComponent
                JTextComponent component = (JTextComponent) e.getComponent();
                component.setBackground(Color.YELLOW);
            }

            @Override
            public void focusLost(FocusEvent e) {
                JTextComponent component = (JTextComponent) e.getComponent();
                component.setBackground(Color.WHITE);
            }
            
        };
        
        txtNama.addFocusListener(listener);
        passKataSandi.addFocusListener(listener);
        txtAreaKeterangan.addFocusListener(listener);
        
//        txtNama.addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//                // Jika txtNama sedang fokus
//                txtNama.setBackground(Color.YELLOW);
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                // Jika txtNama fokusnya hilang
//                txtNama.setBackground(Color.WHITE);
//            }
//        });
//        
//        passKataSandi.addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//                // Jika txtNama sedang fokus
//                passKataSandi.setBackground(Color.YELLOW);
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                // Jika txtNama fokusnya hilang
//                passKataSandi.setBackground(Color.WHITE);
//            }
//        });
//        
//        txtAreaKeterangan.addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//                // Jika txtNama sedang fokus
//                txtAreaKeterangan.setBackground(Color.YELLOW);
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                // Jika txtNama fokusnya hilang
//                txtAreaKeterangan.setBackground(Color.WHITE);
//            }
//        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lblSandi = new javax.swing.JLabel();
        lblKeterangan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaKeterangan = new javax.swing.JTextArea();
        passKataSandi = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNama.setText("Nama :");

        lblSandi.setText("Kata Sandi :");

        lblKeterangan.setText("Keterangan :");

        txtAreaKeterangan.setColumns(20);
        txtAreaKeterangan.setRows(5);
        jScrollPane1.setViewportView(txtAreaKeterangan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNama)
                    .addComponent(lblSandi)
                    .addComponent(lblKeterangan)
                    .addComponent(txtNama)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(passKataSandi))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSandi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passKataSandi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblKeterangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(480, 360));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FormUtamaBab64.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtamaBab64.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtamaBab64.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtamaBab64.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtamaBab64().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblKeterangan;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblSandi;
    private javax.swing.JPasswordField passKataSandi;
    private javax.swing.JTextArea txtAreaKeterangan;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}