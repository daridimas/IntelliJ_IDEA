/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.swing.jframe;

import java.sql.Time;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author dimas
 */
public class FormUtamaBab613 extends javax.swing.JFrame {

    /**
     * Creates new form FormUtamaBlank
     */
    public FormUtamaBab613() {
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

        jLabelAngka = new javax.swing.JLabel();
        jFormattedTextFieldAngka = new javax.swing.JFormattedTextField();
        jButtonAngka = new javax.swing.JButton();
        jLabelTanggal = new javax.swing.JLabel();
        jFormattedTextFieldTanggal = new javax.swing.JFormattedTextField();
        jButtonTanggal = new javax.swing.JButton();
        jFormattedTextFieldWaktu = new javax.swing.JFormattedTextField();
        jButtonWaktu = new javax.swing.JButton();
        jLabelWaktu = new javax.swing.JLabel();
        jButtonPersen = new javax.swing.JButton();
        jFormattedTextFieldPersen = new javax.swing.JFormattedTextField();
        jLabelPersen = new javax.swing.JLabel();
        jButtonUang = new javax.swing.JButton();
        jFormattedTextFieldUang = new javax.swing.JFormattedTextField();
        jLabelUang = new javax.swing.JLabel();
        jFormattedTextFieldMask = new javax.swing.JFormattedTextField();
        jLabelMask = new javax.swing.JLabel();
        jButtonMask = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAngka.setText("Input Angka :");

        jFormattedTextFieldAngka.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextFieldAngka.setValue(new Double(0.0));

        jButtonAngka.setText("Proses");
        jButtonAngka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAngkaActionPerformed(evt);
            }
        });

        jLabelTanggal.setText("Input Tangal :");

        jFormattedTextFieldTanggal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d MMMM yyyy"))));
        jFormattedTextFieldTanggal.setValue(new java.util.Date());

        jButtonTanggal.setText("Proses");
        jButtonTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTanggalActionPerformed(evt);
            }
        });

        jFormattedTextFieldWaktu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFormattedTextFieldWaktu.setValue(new java.util.Date());

        jButtonWaktu.setText("Proses");
        jButtonWaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWaktuActionPerformed(evt);
            }
        });

        jLabelWaktu.setText("Input Waktu :");

        jButtonPersen.setText("Proses");
        jButtonPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPersenActionPerformed(evt);
            }
        });

        jFormattedTextFieldPersen.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0%"))));
        jFormattedTextFieldPersen.setValue(new Double(0.5)
        );

        jLabelPersen.setText("Input Persen :");

        jButtonUang.setText("Proses");
        jButtonUang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUangActionPerformed(evt);
            }
        });

        jFormattedTextFieldUang.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("??#,##0"))));
        jFormattedTextFieldUang.setValue(new Long(1000)
        );

        jLabelUang.setText("Input Uang :");

        try {
            jFormattedTextFieldMask.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("??-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelMask.setText("Input Mask :");

        jButtonMask.setText("Proses");
        jButtonMask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldAngka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAngka))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonTanggal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAngka)
                            .addComponent(jLabelTanggal)
                            .addComponent(jLabelWaktu)
                            .addComponent(jLabelPersen)
                            .addComponent(jLabelUang)
                            .addComponent(jLabelMask))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldWaktu, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonWaktu))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldPersen, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPersen))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldUang, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonUang))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldMask, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMask)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAngka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldAngka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAngka))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTanggal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTanggal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWaktu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonWaktu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPersen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldPersen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPersen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldUang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMask)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldMask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMask))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(437, 386));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAngkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAngkaActionPerformed
        // TODO add your handling code here:
       Double data = (Double) jFormattedTextFieldAngka.getValue();
       System.out.println("Hasil = " + data);
    }//GEN-LAST:event_jButtonAngkaActionPerformed

    private void jButtonTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTanggalActionPerformed
        // TODO add your handling code here:
        Date tanggal = (Date) jFormattedTextFieldTanggal.getValue();
        
        System.out.println("Hasil = " + tanggal);
    }//GEN-LAST:event_jButtonTanggalActionPerformed

    private void jButtonWaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWaktuActionPerformed
        // TODO add your handling code here:
        Date waktu = (Date) jFormattedTextFieldWaktu.getValue();
        
        Time time = new Time(waktu.getTime());
        
        System.out.println("Hasil = " + time); 
    }//GEN-LAST:event_jButtonWaktuActionPerformed

    private void jButtonPersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPersenActionPerformed
        // TODO add your handling code here:
        if (jFormattedTextFieldPersen.getValue() instanceof Long) {
            Long persen = (Long) jFormattedTextFieldPersen.getValue();
            System.out.println("Hasil = " + persen);
            
        } else if (jFormattedTextFieldPersen.getValue() instanceof Double) {
            Double persen = (Double) jFormattedTextFieldPersen.getValue();
            System.out.println("Hasil = " + persen);
        
        }
    }//GEN-LAST:event_jButtonPersenActionPerformed

    private void jButtonUangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUangActionPerformed
        // TODO add your handling code here:
        Long uang = (Long) jFormattedTextFieldUang.getValue();
        
        System.out.println("Hasil = " + uang);
    }//GEN-LAST:event_jButtonUangActionPerformed

    private void jButtonMaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaskActionPerformed
        // TODO add your handling code here:
        String nilai = (String) jFormattedTextFieldMask.getValue();
        
        System.out.println("Hasil = " + nilai);
    }//GEN-LAST:event_jButtonMaskActionPerformed

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
            java.util.logging.Logger.getLogger(FormUtamaBab613.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtamaBab613.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtamaBab613.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtamaBab613.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Locale.setDefault(new Locale("in", "ID"));
                new FormUtamaBab613().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAngka;
    private javax.swing.JButton jButtonMask;
    private javax.swing.JButton jButtonPersen;
    private javax.swing.JButton jButtonTanggal;
    private javax.swing.JButton jButtonUang;
    private javax.swing.JButton jButtonWaktu;
    private javax.swing.JFormattedTextField jFormattedTextFieldAngka;
    private javax.swing.JFormattedTextField jFormattedTextFieldMask;
    private javax.swing.JFormattedTextField jFormattedTextFieldPersen;
    private javax.swing.JFormattedTextField jFormattedTextFieldTanggal;
    private javax.swing.JFormattedTextField jFormattedTextFieldUang;
    private javax.swing.JFormattedTextField jFormattedTextFieldWaktu;
    private javax.swing.JLabel jLabelAngka;
    private javax.swing.JLabel jLabelMask;
    private javax.swing.JLabel jLabelPersen;
    private javax.swing.JLabel jLabelTanggal;
    private javax.swing.JLabel jLabelUang;
    private javax.swing.JLabel jLabelWaktu;
    // End of variables declaration//GEN-END:variables
}
