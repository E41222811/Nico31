/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.access;

import system.massage.popup.dialogHomeProfile;

/**
 *
 * @author Administrator
 */
public class ujiCoba extends javax.swing.JFrame {

    /**
     * Creates new form ujiCoba
     */
    public ujiCoba() {
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

        button1 = new component.swing.button();
        jPanel1 = new javax.swing.JPanel();
        button12 = new component.swing.button();
        jLabel1 = new javax.swing.JLabel();
        fieldIDDataPembelian = new component.swing.textFieldMain();
        fieldSupplierDataPembelian = new component.swing.textFieldMain();
        buttonSimpanDataBarang = new component.swing.button();
        buttonResetDataBarang = new component.swing.button();
        buttonEditDataPembelian = new component.swing.button();
        buttonHapusDataPembelian = new component.swing.button();
        panelRound1 = new component.swing.panelRound();
        scrollPaneDataPembelian = new javax.swing.JScrollPane();
        tableDataPembelian = new component.model.tableCustom.table();
        jLabel2 = new javax.swing.JLabel();
        fieldCariDataPembelian = new component.swing.textFieldMain();
        jLabel3 = new javax.swing.JLabel();
        fieldKategoriDataPembelian = new component.swing.textFieldMain();
        fieldHargaDataPembelian = new component.swing.textFieldMain();
        button13 = new component.swing.button();
        fieldTanggalDataPembelian = new component.swing.textFieldMain();
        fieldQuantityDataPembelian = new component.swing.textFieldMain();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        button1.setText("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon/align.png"))); // NOI18N
        button12.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });
        jPanel1.add(button12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 60, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel1.setText("ID Pembelian");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        fieldIDDataPembelian.setEditable(false);
        fieldIDDataPembelian.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jPanel1.add(fieldIDDataPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 280, 60));

        fieldSupplierDataPembelian.setEditable(false);
        fieldSupplierDataPembelian.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jPanel1.add(fieldSupplierDataPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 220, 60));

        buttonSimpanDataBarang.setBackground(new java.awt.Color(0, 204, 0));
        buttonSimpanDataBarang.setForeground(new java.awt.Color(255, 255, 255));
        buttonSimpanDataBarang.setText("Simpan");
        buttonSimpanDataBarang.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buttonSimpanDataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanDataBarangActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSimpanDataBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 100, 50));

        buttonResetDataBarang.setBackground(new java.awt.Color(102, 102, 102));
        buttonResetDataBarang.setForeground(new java.awt.Color(255, 255, 255));
        buttonResetDataBarang.setText("Reset");
        buttonResetDataBarang.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buttonResetDataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetDataBarangActionPerformed(evt);
            }
        });
        jPanel1.add(buttonResetDataBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 100, 50));

        buttonEditDataPembelian.setBackground(new java.awt.Color(0, 0, 204));
        buttonEditDataPembelian.setForeground(new java.awt.Color(255, 255, 255));
        buttonEditDataPembelian.setText("Edit");
        buttonEditDataPembelian.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buttonEditDataPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditDataPembelianActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEditDataPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 100, 50));

        buttonHapusDataPembelian.setBackground(new java.awt.Color(204, 0, 0));
        buttonHapusDataPembelian.setForeground(new java.awt.Color(255, 255, 255));
        buttonHapusDataPembelian.setText("Hapus");
        buttonHapusDataPembelian.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buttonHapusDataPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusDataPembelianActionPerformed(evt);
            }
        });
        jPanel1.add(buttonHapusDataPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 100, 50));

        panelRound1.setLayout(new java.awt.BorderLayout());

        tableDataPembelian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDataPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataPembelianMouseClicked(evt);
            }
        });
        scrollPaneDataPembelian.setViewportView(tableDataPembelian);

        panelRound1.add(scrollPaneDataPembelian, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 840, 250));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel2.setText("Supplier");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        fieldCariDataPembelian.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        fieldCariDataPembelian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldCariDataPembelianKeyReleased(evt);
            }
        });
        jPanel1.add(fieldCariDataPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 400, 60));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel3.setText("Cari");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        fieldKategoriDataPembelian.setEditable(false);
        fieldKategoriDataPembelian.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jPanel1.add(fieldKategoriDataPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 200, 60));

        fieldHargaDataPembelian.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jPanel1.add(fieldHargaDataPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 260, 60));

        button13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icon/align.png"))); // NOI18N
        button13.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });
        jPanel1.add(button13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 60, 60));

        fieldTanggalDataPembelian.setEditable(false);
        fieldTanggalDataPembelian.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jPanel1.add(fieldTanggalDataPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 280, 60));

        fieldQuantityDataPembelian.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jPanel1.add(fieldQuantityDataPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 120, 280, 60));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel4.setText("Kategori");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel5.setText("Harga");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel6.setText("Tanggal");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel7.setText("Quantity");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
//        dialogHomeProfile message = new dialogHomeProfile(this);
//        message.showMessage("Lupa Password ?", "Verify Username and Email \n for Your User to change Password.");
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(ujiCoba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ujiCoba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ujiCoba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ujiCoba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ujiCoba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.swing.button button1;
    private component.swing.button button12;
    public static component.swing.button button13;
    private component.swing.button buttonEditDataPembelian;
    private component.swing.button buttonHapusDataPembelian;
    private component.swing.button buttonResetDataBarang;
    private component.swing.button buttonSimpanDataBarang;
    private component.swing.textFieldMain fieldCariDataPembelian;
    private component.swing.textFieldMain fieldHargaDataPembelian;
    private component.swing.textFieldMain fieldIDDataPembelian;
    public static component.swing.textFieldMain fieldKategoriDataPembelian;
    private component.swing.textFieldMain fieldQuantityDataPembelian;
    public static component.swing.textFieldMain fieldSupplierDataPembelian;
    private component.swing.textFieldMain fieldTanggalDataPembelian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private component.swing.panelRound panelRound1;
    private javax.swing.JScrollPane scrollPaneDataPembelian;
    private component.model.tableCustom.table tableDataPembelian;
    // End of variables declaration//GEN-END:variables
}