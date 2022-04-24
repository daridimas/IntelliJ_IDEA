/*
 *  Copyright (c) 2011-2012, StripBandunk and/or its affiliates. All rights reserved.
 *  STRIPBANDUNK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.stripbandunk.desktop.application.panel;

import com.stripbandunk.desktop.application.dialog.DialogBarang;
import com.stripbandunk.desktop.entity.Barang;
import com.stripbandunk.desktop.service.DatabaseHelper;
import com.stripbandunk.desktop.service.BarangService;
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
 * @author echo
 */
public class PanelBarang extends javax.swing.JPanel {

    private DynamicTableModel<Barang> tableModel;
    private final int PAGE_SIZE = 100;

    /**
     * Creates new form PanelBarang
     */
    public PanelBarang() {
        initComponents();

        tableModel = new DynamicTableModel<>(Barang.class);
        jDynamicTable1.setDynamicModel(tableModel);
    }

    public void reload() {

        new SwingWorker<List<Barang>, Object>() {

            @Override
            protected List<Barang> doInBackground() throws Exception {
                BarangService service = DatabaseHelper.getBarangService();
                List<Barang> select = service.select(0, PAGE_SIZE);
                return select;
            }

            @Override
            protected void done() {
                try {
                    BarangService service = DatabaseHelper.getBarangService();
                    int totalItem = new Long(service.count()).intValue();

                    DefaultPaginationModel paginationModel = new DefaultPaginationModel(PAGE_SIZE, totalItem);
                    jPagination1.setModel(paginationModel);

                    tableModel.clear();
                    for (Barang barang : get()) {
                        tableModel.add(barang);
                    }
                } catch (InterruptedException | ExecutionException ex) {
                    Logger.getLogger(PanelBarang.class.getName()).log(Level.SEVERE, null, ex);
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
        crudPanel1 = new com.stripbandunk.component.CrudPanel();

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel1.setText("Manajemen Barang");

        jScrollPane1.setViewportView(jDynamicTable1);

        jPagination1.addPaginationListener(new com.stripbandunk.jwidget.listener.PaginationListener() {
            public void onPageChange(com.stripbandunk.jwidget.event.PaginationEvent evt) {
                jPagination1OnPageChange(evt);
            }
        });

        crudPanel1.addCrudListener(new com.stripbandunk.component.CrudListener() {
            public void onInsert(com.stripbandunk.component.CrudEvent evt) {
                crudPanel1OnInsert(evt);
            }
            public void onUpdate(com.stripbandunk.component.CrudEvent evt) {
                crudPanel1OnUpdate(evt);
            }
            public void onDelete(com.stripbandunk.component.CrudEvent evt) {
                crudPanel1OnDelete(evt);
            }
            public void onReload(com.stripbandunk.component.CrudEvent evt) {
                crudPanel1OnReload(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPagination1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(crudPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPagination1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crudPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPagination1OnPageChange(com.stripbandunk.jwidget.event.PaginationEvent evt) {//GEN-FIRST:event_jPagination1OnPageChange
        // TODO add your handling code here:

        final int skip = (evt.getCurrentPage() - 1) * evt.getPageSize();
        final int max = evt.getPageSize();

        new SwingWorker<List<Barang>, Object>() {

            @Override
            protected List<Barang> doInBackground() throws Exception {
                BarangService service = DatabaseHelper.getBarangService();
                List<Barang> select = service.select(skip, max);
                return select;
            }

            @Override
            protected void done() {
                try {
                    tableModel.clear();
                    for (Barang barang : get()) {
                        tableModel.add(barang);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(PanelBarang.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(PanelBarang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();

    }//GEN-LAST:event_jPagination1OnPageChange

    private void crudPanel1OnReload(com.stripbandunk.component.CrudEvent evt) {//GEN-FIRST:event_crudPanel1OnReload
        // TODO add your handling code here:

        reload();

    }//GEN-LAST:event_crudPanel1OnReload

    private void crudPanel1OnInsert(com.stripbandunk.component.CrudEvent evt) {//GEN-FIRST:event_crudPanel1OnInsert
        // TODO add your handling code here:

        DialogBarang dialog = new DialogBarang();
        dialog.setLocationRelativeTo(this);

        Barang barang = dialog.tambah();
        if (barang != null) {
            BarangService service = DatabaseHelper.getBarangService();
            service.insert(barang);

            reload();
        }

    }//GEN-LAST:event_crudPanel1OnInsert

    private void crudPanel1OnUpdate(com.stripbandunk.component.CrudEvent evt) {//GEN-FIRST:event_crudPanel1OnUpdate
        // TODO add your handling code here:

        if (jDynamicTable1.getSelectedRow() != -1) {
            Barang barang = tableModel.get(jDynamicTable1.convertRowIndexToModel(jDynamicTable1.getSelectedRow()));
            DialogBarang dialog = new DialogBarang();
            dialog.setLocationRelativeTo(this);

            Barang hasil = dialog.ubah(barang);
            if (hasil != null) {
                BarangService service = DatabaseHelper.getBarangService();
                service.update(barang);

                reload();
            }
        }

    }//GEN-LAST:event_crudPanel1OnUpdate

    private void crudPanel1OnDelete(com.stripbandunk.component.CrudEvent evt) {//GEN-FIRST:event_crudPanel1OnDelete
        // TODO add your handling code here:

        if (jDynamicTable1.getSelectedRow() != -1) {
            if (JOptionPane.showConfirmDialog(this,
                    "Anda yakin?", "Hapus Barang",
                    JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                Barang barang = tableModel.get(jDynamicTable1.convertRowIndexToModel(jDynamicTable1.getSelectedRow()));
                BarangService service = DatabaseHelper.getBarangService();
                service.delete(barang);

                reload();
            }
        }

    }//GEN-LAST:event_crudPanel1OnDelete
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.stripbandunk.component.CrudPanel crudPanel1;
    private com.stripbandunk.jwidget.JDynamicTable jDynamicTable1;
    private javax.swing.JLabel jLabel1;
    private com.stripbandunk.jwidget.JPagination jPagination1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}