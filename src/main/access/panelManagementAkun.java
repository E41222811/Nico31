package main.access;

import com.mysql.jdbc.Statement;
import component.model.table.tableCustom;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class panelManagementAkun extends javax.swing.JPanel {

    public panelManagementAkun() {
        initComponents();
        setOpaque(false);
        tableManagementAkun();
        tableManagementAkun.fixTable(scrollPaneManagementAkun);
    }

    public void tableManagementAkun(){
        DefaultTableModel isi = new DefaultTableModel();
        isi.addColumn("ID Pengguna");
        isi.addColumn("Username");
        isi.addColumn("Nama");
        isi.addColumn("Email");
        isi.addColumn("Tipe Akun");
        isi.addColumn("Alamat");
        
        tableManagementAkun.setModel(isi);
        try{
            Statement statement = (Statement)service.connect.GetConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM data_pengguna");
            while(result.next()){
                isi.addRow(new Object[]{
                    result.getString("id_pengguna"),
                    result.getString("username"),
                    result.getString("nama_pengguna"),
                    result.getString("email"),
                    result.getString("tipe_akun"),
                    result.getString("alamat")
                });
                tableManagementAkun.setModel(isi);
            }        
        }
        catch(Exception e){
            System.out.print("Gagal terhubung");
            JOptionPane.showMessageDialog(null,"Koneksi databases error");
        }
        buttonHapusManagementAkun.setEnabled(false);
    }
    
    private void searchManagementAkun(String key){
        DefaultTableModel isi = new DefaultTableModel();
        isi.addColumn("ID Pengguna");
        isi.addColumn("Username");
        isi.addColumn("Nama");
        isi.addColumn("Email");
        isi.addColumn("Tipe Akun");
        isi.addColumn("Alamat");
        
        tableManagementAkun.setModel(isi);
        try{
            Statement statement = (Statement)service.connect.GetConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM data_pengguna WHERE id_pengguna LIKE '%"+key+"%' OR username LIKE '%"+key+"%' OR nama_pengguna LIKE '%"+key+"%' OR email LIKE '%"+key+"%' OR tipe_akun LIKE '%"+key+"%' OR alamat LIKE '%"+key+"%';");
            while(result.next()){
                isi.addRow(new Object[]{
                    result.getString("id_pengguna"),
                    result.getString("username"),
                    result.getString("nama_pengguna"),
                    result.getString("email"),
                    result.getString("tipe_akun"),
                    result.getString("alamat")
                });
                tableManagementAkun.setModel(isi);
            }        
        }
        catch(Exception e){
            System.out.print("Gagal menampilkan... ");
            JOptionPane.showMessageDialog(null,"Tidak bisa mencari data");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldIDPenggunaManagementAkun = new javax.swing.JTextField();
        panelRound2 = new component.swing.panelRound();
        scrollPaneManagementAkun = new javax.swing.JScrollPane();
        tableManagementAkun = new component.model.tableCustom.table();
        jLabel1 = new javax.swing.JLabel();
        fieldCariManagementAkun = new component.swing.textFieldMain();
        buttonHapusManagementAkun = new component.swing.button();

        fieldIDPenggunaManagementAkun.setText("jTextField1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setLayout(new java.awt.BorderLayout());

        scrollPaneManagementAkun.setBorder(null);

        tableManagementAkun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableManagementAkun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableManagementAkunMouseClicked(evt);
            }
        });
        scrollPaneManagementAkun.setViewportView(tableManagementAkun);

        panelRound2.add(scrollPaneManagementAkun, java.awt.BorderLayout.CENTER);

        add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 840, 420));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel1.setText("Cari");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        fieldCariManagementAkun.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        fieldCariManagementAkun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldCariManagementAkunKeyReleased(evt);
            }
        });
        add(fieldCariManagementAkun, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 340, 60));

        buttonHapusManagementAkun.setBackground(new java.awt.Color(204, 0, 0));
        buttonHapusManagementAkun.setForeground(new java.awt.Color(255, 255, 255));
        buttonHapusManagementAkun.setText("Hapus");
        buttonHapusManagementAkun.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buttonHapusManagementAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusManagementAkunActionPerformed(evt);
            }
        });
        add(buttonHapusManagementAkun, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 110, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHapusManagementAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusManagementAkunActionPerformed
        try{
            Statement statement = (Statement)service.connect.GetConnection().createStatement();
            statement.executeUpdate("DELETE FROM data_pengguna WHERE id_pengguna = ('"+ fieldIDPenggunaManagementAkun.getText() +"');");

            fieldIDPenggunaManagementAkun.requestFocus();
            fieldIDPenggunaManagementAkun.getText();
        }
        catch(Exception t){
            JOptionPane.showMessageDialog(null, "Data gagal di hapus");
        }

        tableManagementAkun();
    }//GEN-LAST:event_buttonHapusManagementAkunActionPerformed

    private void tableManagementAkunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableManagementAkunMouseClicked
        fieldIDPenggunaManagementAkun.setText(tableManagementAkun.getValueAt(tableManagementAkun.getSelectedRow(),0) + "");
        
        buttonHapusManagementAkun.setEnabled(true);
    }//GEN-LAST:event_tableManagementAkunMouseClicked

    private void fieldCariManagementAkunKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCariManagementAkunKeyReleased
        String key = fieldCariManagementAkun.getText();
        System.out.println(key);

        if(key!=""){
            searchManagementAkun(key);
        }else{
            tableManagementAkun();
        }
    }//GEN-LAST:event_fieldCariManagementAkunKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.swing.button buttonHapusManagementAkun;
    private component.swing.textFieldMain fieldCariManagementAkun;
    private javax.swing.JTextField fieldIDPenggunaManagementAkun;
    private javax.swing.JLabel jLabel1;
    private component.swing.panelRound panelRound2;
    private javax.swing.JScrollPane scrollPaneManagementAkun;
    public static component.model.tableCustom.table tableManagementAkun;
    // End of variables declaration//GEN-END:variables
}
