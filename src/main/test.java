package main;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import system.massage.popup.dialogLupaPassword;
import service.connect;
import system.notification.Notification;

public class test extends javax.swing.JFrame {

    public test() {
        initComponents();
        
        titleBar.init(this);
        
        this.getRootPane().setDefaultButton(buttonLogin);
        
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showNotification = new javax.swing.JToggleButton();
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

        showNotification.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        //        if(aksi == true){
            //            changeIcon(button12, "/resource/icon/align_hover.png");
            //            button12.setBackground(new Color(242, 242, 242));
            new system.massage.list.listKategoriDataPembelian().setVisible(true);
            //            system.massage.list.listKategori list = new system.massage.list.listKategori(null, true);
            //            list.show();
            //            aksi = false;
            //        } else {
            //            changeIcon(button12, "/resource/icon/align.png");
            //            button12.setBackground(new Color(255, 255, 255));
            //            aksi = true;
            //        }
    }//GEN-LAST:event_button12ActionPerformed

    private void buttonSimpanDataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanDataBarangActionPerformed
        String IDPembelian = fieldIDDataPembelian.getText();
        String IDSupplier = fieldSupplierDataPembelian.getText();
        String IDKategori = fieldKategoriDataPembelian.getText();
        String Harga = fieldHargaDataPembelian.getText();
        String Quantity = fieldQuantityDataPembelian.getText();

        java.util.Date Tanggal = new java.util.Date();
        java.text.SimpleDateFormat TanggalFormat = new java.text.SimpleDateFormat("YYYY-MM-dd");
        String TanggalHariIni = TanggalFormat.format(Tanggal);

        if(IDPembelian.isEmpty()){
            JOptionPane.showMessageDialog(null," tidak boleh kosong");
            fieldIDDataPembelian.requestFocus();
        }else if(IDSupplier.isEmpty()){
            JOptionPane.showMessageDialog(null," tidak boleh kosong");
            fieldSupplierDataPembelian.requestFocus();
        }else if(IDKategori.isEmpty()){
            JOptionPane.showMessageDialog(null," tidak boleh kosong");
            fieldKategoriDataPembelian.requestFocus();
        }else if(Harga.isEmpty()){
            JOptionPane.showMessageDialog(null," tidak boleh kosong");
            fieldHargaDataPembelian.requestFocus();
        }else if(Quantity.isEmpty()){
            JOptionPane.showMessageDialog(null," tidak boleh kosong");
            fieldQuantityDataPembelian.requestFocus();
        } else{

            try{
                Statement statement = (Statement) service.connect.GetConnection().createStatement();
                statement.executeUpdate("INSERT INTO data_pembelian VALUES ('" + IDPembelian + "', '"+ IDSupplier +"', '"+ IDKategori +"', '"+ TanggalHariIni +"', '" + Harga +"', '" + Quantity +"');");
                statement.close ();
                resetDataPembelian();
            }catch (Exception t){
                System.err.println(t);
                JOptionPane.showMessageDialog(null, "data gagal disimpan");
            }

            tableDataPembelian();
            autoNumberDataPembelian();
        }
    }//GEN-LAST:event_buttonSimpanDataBarangActionPerformed

    private void buttonResetDataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetDataBarangActionPerformed
        resetDataPembelian();
    }//GEN-LAST:event_buttonResetDataBarangActionPerformed

    private void buttonEditDataPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditDataPembelianActionPerformed
        String IDPembelian = fieldIDDataPembelian.getText();
        String IDSupplier = fieldSupplierDataPembelian.getText();
        String IDKategori = fieldKategoriDataPembelian.getText();
        String Harga = fieldHargaDataPembelian.getText();
        String Quantity = fieldQuantityDataPembelian.getText();

        if(IDSupplier.isEmpty()){
            JOptionPane.showMessageDialog(null," tidak boleh kosong");
            fieldSupplierDataPembelian.requestFocus();
        }else if(IDKategori.isEmpty()){
            JOptionPane.showMessageDialog(null," tidak boleh kosong");
            fieldKategoriDataPembelian.requestFocus();
        }else if(Harga.isEmpty()){
            JOptionPane.showMessageDialog(null," tidak boleh kosong");
            fieldHargaDataPembelian.requestFocus();
        }else if(Quantity.isEmpty()){
            JOptionPane.showMessageDialog(null," tidak boleh kosong");
            fieldQuantityDataPembelian.requestFocus();
        } else{

            try{
                Statement statement = (Statement) service.connect.GetConnection().createStatement();
                statement.executeUpdate("UPDATE data_pembelian SET id_supplier='"+ IDSupplier +"', id_kategori='"+ IDKategori +"', harga_beli='"+ Harga +"', quantity='"+ Quantity +"' WHERE id_pembelian='"+ IDPembelian +"';");
                statement.close ();
                resetDataPembelian();
            }catch (Exception t){
                JOptionPane.showMessageDialog(null, "data gagal disimpan");
            }

            tableDataPembelian();
            autoNumberDataPembelian();
        }
    }//GEN-LAST:event_buttonEditDataPembelianActionPerformed

    private void buttonHapusDataPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusDataPembelianActionPerformed
        try{
            Statement statement = (Statement)service.connect.GetConnection().createStatement();
            statement.executeUpdate("DELETE FROM data_pembelian WHERE id_pembelian = ('"+ fieldIDDataPembelian.getText() +"');");

            fieldIDDataPembelian.requestFocus();
            fieldIDDataPembelian.getText();
            fieldSupplierDataPembelian.getText();
            fieldKategoriDataPembelian.getText();
            fieldHargaDataPembelian.getText();
            fieldQuantityDataPembelian.getText();
        }
        catch(Exception t){
            JOptionPane.showMessageDialog(null, "Data gagal di hapus");
        }

        tableDataPembelian();
        resetDataPembelian();
        autoNumberDataPembelian();
    }//GEN-LAST:event_buttonHapusDataPembelianActionPerformed

    private void tableDataPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataPembelianMouseClicked
        fieldIDDataPembelian.setText(tableDataPembelian.getValueAt(tableDataPembelian.getSelectedRow(),0)+"");
        fieldSupplierDataPembelian.setText(tableDataPembelian.getValueAt(tableDataPembelian.getSelectedRow(),1)+"");
        fieldKategoriDataPembelian.setText(tableDataPembelian.getValueAt(tableDataPembelian.getSelectedRow(),2)+"");
        fieldHargaDataPembelian.setText(tableDataPembelian.getValueAt(tableDataPembelian.getSelectedRow(),3)+"");
        fieldQuantityDataPembelian.setText(tableDataPembelian.getValueAt(tableDataPembelian.getSelectedRow(),4)+"");
        fieldTanggalDataPembelian.setText(tableDataPembelian.getValueAt(tableDataPembelian.getSelectedRow(),5)+"");

        buttonEditDataPembelian.setEnabled(true);
        buttonHapusDataPembelian.setEnabled(true);
    }//GEN-LAST:event_tableDataPembelianMouseClicked

    private void fieldCariDataPembelianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCariDataPembelianKeyReleased
        String key = fieldCariDataPembelian.getText();
        System.out.println(key);

        if(key!=""){
            searchDataPembelian(key);
        }else{
            tableDataPembelian();
        }
    }//GEN-LAST:event_fieldCariDataPembelianKeyReleased

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        new system.massage.list.listsuplier().setVisible(true);
    }//GEN-LAST:event_button13ActionPerformed

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                fram = new test();
                new test().setVisible(true);
            }
        });
    }
    
    private static JFrame fram;
    
    public static JFrame getJFram(){
        return fram;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    public static javax.swing.JToggleButton showNotification;
    private component.model.tableCustom.table tableDataPembelian;
    // End of variables declaration//GEN-END:variables
}
