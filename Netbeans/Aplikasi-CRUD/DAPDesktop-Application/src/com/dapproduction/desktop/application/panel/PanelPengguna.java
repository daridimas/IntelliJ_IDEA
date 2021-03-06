/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dapproduction.desktop.application.panel;

import com.dapproduction.desktop.application.dialog.DialogPengguna;
import com.dapproduction.desktop.entity.Pengguna;
import com.dapproduction.desktop.service.DatabaseHelper;
import com.dapproduction.desktop.service.PenggunaService;
import com.stripbandunk.jwidget.model.DefaultPaginationModel;
import com.stripbandunk.jwidget.model.DynamicTableModel;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author dimas
 */
public class PanelPengguna extends javax.swing.JPanel {

    private DynamicTableModel<Pengguna> tableModel;
    private final int PAGE_SIZE = 10;
    /**
     * Creates new form PanelPengguna
     */
    public PanelPengguna() {
        initComponents();
        
        tableModel = new DynamicTableModel<>(Pengguna.class);
        jDynamicTable1.setDynamicModel(tableModel);
    }
    
    public void reload() {
        new SwingWorker<List<Pengguna>, Object>() {
            @Override
            protected List<Pengguna> doInBackground() throws Exception {
                PenggunaService service = DatabaseHelper.getPenggunaService();
                List<Pengguna> select = service.select(0, PAGE_SIZE);
                return select;
            }

            @Override
            protected void done() {
                try {
                    // reload data pertama kali
                    PenggunaService service = DatabaseHelper.getPenggunaService();
                    int totalItem = new Long(service.count()).intValue();
                    
                    DefaultPaginationModel paginationModel = new DefaultPaginationModel(PAGE_SIZE, totalItem);
                    jPagination1.setModel(paginationModel);
                    
                    
                    tableModel.clear();
                    for (Pengguna pengguna : get()) {
                        tableModel.add(pengguna);
                    }
                } catch (InterruptedException | ExecutionException ex) {
                    Logger.getLogger(PanelPengguna.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDynamicTable1 = new com.stripbandunk.jwidget.JDynamicTable();
        jPagination1 = new com.stripbandunk.jwidget.JPagination();
        cRUDPanel1 = new com.stripbandunk.component.CRUDPanel();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Manajemen Pengguna");

        jScrollPane1.setViewportView(jDynamicTable1);

        jPagination1.addPaginationListener(new com.stripbandunk.jwidget.listener.PaginationListener() {
            public void onPageChange(com.stripbandunk.jwidget.event.PaginationEvent evt) {
                jPagination1OnPageChange(evt);
            }
        });

        cRUDPanel1.addCRUDListener(new com.stripbandunk.component.CRUDListener() {
            public void onDelete(com.stripbandunk.component.CRUDEvent evt) {
                cRUDPanel1OnDelete(evt);
            }
            public void onInsert(com.stripbandunk.component.CRUDEvent evt) {
                cRUDPanel1OnInsert(evt);
            }
            public void onReload(com.stripbandunk.component.CRUDEvent evt) {
                cRUDPanel1OnReload(evt);
            }
            public void onUpdate(com.stripbandunk.component.CRUDEvent evt) {
                cRUDPanel1OnUpdate(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cRUDPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPagination1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPagination1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cRUDPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPagination1OnPageChange(com.stripbandunk.jwidget.event.PaginationEvent evt) {//GEN-FIRST:event_jPagination1OnPageChange
        // TODO add your handling code here:
        
        final int skip = (evt.getCurrentPage() - 1) * evt.getPageSize();
        final int max = evt.getPageSize();
        
        new SwingWorker<List<Pengguna>, Object>() {
            @Override
            protected List<Pengguna> doInBackground() throws Exception {
                PenggunaService service = DatabaseHelper.getPenggunaService();
                List<Pengguna> select = service.select(skip, max);
                return select;
            }

            @Override
            protected void done() {
                try {
                    tableModel.clear();
                    for (Pengguna pengguna : get()) {
                        tableModel.add(pengguna);
                    }
                } catch (InterruptedException | ExecutionException ex) {
                    Logger.getLogger(PanelPengguna.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();
    }//GEN-LAST:event_jPagination1OnPageChange

    private void cRUDPanel1OnReload(com.stripbandunk.component.CRUDEvent evt) {//GEN-FIRST:event_cRUDPanel1OnReload
        // TODO add your handling code here:
        
        reload();
        
    }//GEN-LAST:event_cRUDPanel1OnReload

    private void cRUDPanel1OnInsert(com.stripbandunk.component.CRUDEvent evt) {//GEN-FIRST:event_cRUDPanel1OnInsert
        // TODO add your handling code here:
        
        DialogPengguna dialog = new DialogPengguna();
        dialog.setLocationRelativeTo(this);
        
        Pengguna pengguna = dialog.tambah();
        if (pengguna != null) {
            PenggunaService service = DatabaseHelper.getPenggunaService();
            service.insert(pengguna);
            
            reload();
        }
    }//GEN-LAST:event_cRUDPanel1OnInsert

    private void cRUDPanel1OnUpdate(com.stripbandunk.component.CRUDEvent evt) {//GEN-FIRST:event_cRUDPanel1OnUpdate
        // TODO add your handling code here:
        
        if (jDynamicTable1.getSelectedRow() != -1) {
            Pengguna pengguna = tableModel.get(jDynamicTable1.convertRowIndexToModel(jDynamicTable1.getSelectedRow()));
            DialogPengguna dialog = new DialogPengguna();
            dialog.setLocationRelativeTo(this);
            Pengguna hasil = dialog.ubah(pengguna);
            
            if(hasil != null){
                PenggunaService service = DatabaseHelper.getPenggunaService();
                service.update(pengguna);
                
                reload();
            }
        }
    }//GEN-LAST:event_cRUDPanel1OnUpdate

    private void cRUDPanel1OnDelete(com.stripbandunk.component.CRUDEvent evt) {//GEN-FIRST:event_cRUDPanel1OnDelete
        // TODO add your handling code here:
        
        if (jDynamicTable1.getSelectedRow() != -1) {
            if (JOptionPane.showConfirmDialog(this, "Anda Yakin?", "Hapus Pengguna", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                Pengguna pengguna = tableModel.get(jDynamicTable1.convertRowIndexToModel(jDynamicTable1.getSelectedRow()));
                PenggunaService service = DatabaseHelper.getPenggunaService();
                service.delete(pengguna);
                
                reload();
            }
        }
    }//GEN-LAST:event_cRUDPanel1OnDelete


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.stripbandunk.component.CRUDPanel cRUDPanel1;
    private com.stripbandunk.jwidget.JDynamicTable jDynamicTable1;
    private javax.swing.JLabel jLabel1;
    private com.stripbandunk.jwidget.JPagination jPagination1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
