package main;

import java.awt.Color;
import static main.gbrandapplication.accessHome;
import static main.gbrandapplication.mainAccessPanel;

public class panelDashboard extends javax.swing.JPanel {

    public panelDashboard() {
        initComponents();
        setOpaque(false);
        
        panelTransparent1.removeAll();
        panelTransparent1.add(panelDataBarang1);
        panelTransparent1.repaint();
        panelTransparent1.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTransparent1 = new component.swing.panelTransparent();
        panelDataBarang1 = new main.access.panelDataBarang();
        panelDataPenjualan2 = new main.access.panelDataPenjualan();
        panelDataPembelian2 = new main.access.panelDataPembelian();
        panelDataPengeluaran2 = new main.access.panelDataPengeluaran();
        panelDataSupplier2 = new main.access.panelDataSupplier();
        panelKategori2 = new main.access.panelKategori();
        panelLaporan1 = new main.access.panelLaporan();
        button1 = new component.swing.button();
        jLabel8 = new javax.swing.JLabel();
        labelDataBarangDashboard = new javax.swing.JLabel();
        labelPenjualanDashboard = new javax.swing.JLabel();
        labelPembelianDashboard = new javax.swing.JLabel();
        labelPengeluaranDashboard = new javax.swing.JLabel();
        labelSupplierDashboard = new javax.swing.JLabel();
        labelKategoriDashboard = new javax.swing.JLabel();
        labelLaporanDashboard = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTransparent1.setBackground(new java.awt.Color(225, 225, 225));
        panelTransparent1.setAlpha(0.8F);
        panelTransparent1.setRound(25);
        panelTransparent1.setLayout(new java.awt.CardLayout());
        panelTransparent1.add(panelDataBarang1, "card2");
        panelTransparent1.add(panelDataPenjualan2, "card3");
        panelTransparent1.add(panelDataPembelian2, "card4");
        panelTransparent1.add(panelDataPengeluaran2, "card5");
        panelTransparent1.add(panelDataSupplier2, "card6");
        panelTransparent1.add(panelKategori2, "card7");
        panelTransparent1.add(panelLaporan1, "card8");

        add(panelTransparent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 860, 530));

        button1.setText("Keluar Tampilan Dashboard");
        button1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 230, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon/transaksi-icon.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        labelDataBarangDashboard.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelDataBarangDashboard.setForeground(new java.awt.Color(0, 51, 255));
        labelDataBarangDashboard.setText("Data Barang");
        labelDataBarangDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDataBarangDashboardMouseClicked(evt);
            }
        });
        add(labelDataBarangDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 190, 40));

        labelPenjualanDashboard.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPenjualanDashboard.setForeground(new java.awt.Color(0, 51, 255));
        labelPenjualanDashboard.setText("Data Penjualan");
        labelPenjualanDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPenjualanDashboardMouseClicked(evt);
            }
        });
        add(labelPenjualanDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 190, 40));

        labelPembelianDashboard.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPembelianDashboard.setForeground(new java.awt.Color(0, 51, 255));
        labelPembelianDashboard.setText("Data Pembelian");
        labelPembelianDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPembelianDashboardMouseClicked(evt);
            }
        });
        add(labelPembelianDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 190, 40));

        labelPengeluaranDashboard.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPengeluaranDashboard.setForeground(new java.awt.Color(0, 51, 255));
        labelPengeluaranDashboard.setText("Data Pengeluaran");
        labelPengeluaranDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPengeluaranDashboardMouseClicked(evt);
            }
        });
        add(labelPengeluaranDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 190, 40));

        labelSupplierDashboard.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelSupplierDashboard.setForeground(new java.awt.Color(0, 51, 255));
        labelSupplierDashboard.setText("Data Supplier");
        labelSupplierDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSupplierDashboardMouseClicked(evt);
            }
        });
        add(labelSupplierDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 190, 40));

        labelKategoriDashboard.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelKategoriDashboard.setForeground(new java.awt.Color(0, 51, 255));
        labelKategoriDashboard.setText("Kategori");
        labelKategoriDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelKategoriDashboardMouseClicked(evt);
            }
        });
        add(labelKategoriDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 190, 40));

        labelLaporanDashboard.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelLaporanDashboard.setForeground(new java.awt.Color(0, 51, 255));
        labelLaporanDashboard.setText("Laporan");
        labelLaporanDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLaporanDashboardMouseClicked(evt);
            }
        });
        add(labelLaporanDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 190, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 200, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 200, 50));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, 50));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 200, 50));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 200, 50));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 200, 50));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 200, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void labelDataBarangDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDataBarangDashboardMouseClicked
        panelTransparent1.removeAll();
        panelTransparent1.add(panelDataBarang1);
        panelTransparent1.repaint();
        panelTransparent1.revalidate();
    }//GEN-LAST:event_labelDataBarangDashboardMouseClicked

    private void labelPenjualanDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPenjualanDashboardMouseClicked
        panelTransparent1.removeAll();
        panelTransparent1.add(panelDataPenjualan2);
        panelTransparent1.repaint();
        panelTransparent1.revalidate();
    }//GEN-LAST:event_labelPenjualanDashboardMouseClicked

    private void labelPembelianDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPembelianDashboardMouseClicked
        panelTransparent1.removeAll();
        panelTransparent1.add(panelDataPembelian2);
        panelTransparent1.repaint();
        panelTransparent1.revalidate();
    }//GEN-LAST:event_labelPembelianDashboardMouseClicked

    private void labelPengeluaranDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPengeluaranDashboardMouseClicked
        panelTransparent1.removeAll();
        panelTransparent1.add(panelDataPengeluaran2);
        panelTransparent1.repaint();
        panelTransparent1.revalidate();
    }//GEN-LAST:event_labelPengeluaranDashboardMouseClicked

    private void labelSupplierDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSupplierDashboardMouseClicked
        panelTransparent1.removeAll();
        panelTransparent1.add(panelDataSupplier2);
        panelTransparent1.repaint();
        panelTransparent1.revalidate();
    }//GEN-LAST:event_labelSupplierDashboardMouseClicked

    private void labelKategoriDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKategoriDashboardMouseClicked
        panelTransparent1.removeAll();
        panelTransparent1.add(panelKategori2);
        panelTransparent1.repaint();
        panelTransparent1.revalidate();
    }//GEN-LAST:event_labelKategoriDashboardMouseClicked

    private void labelLaporanDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLaporanDashboardMouseClicked
        panelTransparent1.removeAll();
        panelTransparent1.add(panelLaporan1);
        panelTransparent1.repaint();
        panelTransparent1.revalidate();
    }//GEN-LAST:event_labelLaporanDashboardMouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        mainAccessPanel.removeAll();
        mainAccessPanel.add(accessHome);
        mainAccessPanel.repaint();
        mainAccessPanel.revalidate();
    }//GEN-LAST:event_button1ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
           jButton2.setForeground(Color.CYAN);
        //btnMasterData.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
          jButton2.setForeground(Color.CYAN);
    }//GEN-LAST:event_jButton3MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.swing.button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelDataBarangDashboard;
    private javax.swing.JLabel labelKategoriDashboard;
    private javax.swing.JLabel labelLaporanDashboard;
    private javax.swing.JLabel labelPembelianDashboard;
    private javax.swing.JLabel labelPengeluaranDashboard;
    private javax.swing.JLabel labelPenjualanDashboard;
    private javax.swing.JLabel labelSupplierDashboard;
    private main.access.panelDataBarang panelDataBarang1;
    private main.access.panelDataPembelian panelDataPembelian2;
    private main.access.panelDataPengeluaran panelDataPengeluaran2;
    private main.access.panelDataPenjualan panelDataPenjualan2;
    private main.access.panelDataSupplier panelDataSupplier2;
    private main.access.panelKategori panelKategori2;
    private main.access.panelLaporan panelLaporan1;
    private component.swing.panelTransparent panelTransparent1;
    // End of variables declaration//GEN-END:variables
}
