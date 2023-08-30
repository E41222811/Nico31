package main;

import javax.swing.JOptionPane;
import static main.gbrandapplication.accessHome;
import static main.gbrandapplication.mainAccessPanel;

public class panelSetting extends javax.swing.JPanel {

    public panelSetting() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTransparent1 = new component.swing.panelTransparent();
        panelBantuan1 = new main.access.panelBantuan();
        panelTambahAkun1 = new main.access.panelTambahAkun();
        panelManagementAkun1 = new main.access.panelManagementAkun();
        panelTentang1 = new main.access.panelTentang();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        button1 = new component.swing.button();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTransparent1.setBackground(new java.awt.Color(225, 225, 225));
        panelTransparent1.setAlpha(0.8F);
        panelTransparent1.setRound(25);
        panelTransparent1.setLayout(new java.awt.CardLayout());
        panelTransparent1.add(panelBantuan1, "card3");
        panelTransparent1.add(panelTambahAkun1, "card5");
        panelTransparent1.add(panelManagementAkun1, "card4");
        panelTransparent1.add(panelTentang1, "card2");

        add(panelTransparent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 860, 530));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Bantuan");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 190, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Tambah Akun");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 190, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Management Akun");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 190, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Tentang");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 190, 40));

        button1.setText("Keluar Tampilan Setting");
        button1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 230, 60));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 200, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 200, 50));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 200, 50));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        panelTransparent1.removeAll();
        panelTransparent1.add(panelBantuan1);
        panelTransparent1.repaint();
        panelTransparent1.revalidate();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        panelTransparent1.removeAll();
        panelTransparent1.add(panelTambahAkun1);
        panelTransparent1.repaint();
        panelTransparent1.revalidate();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        panelTransparent1.removeAll();
        panelTransparent1.add(panelManagementAkun1);
        panelTransparent1.repaint();
        panelTransparent1.revalidate();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        panelTransparent1.removeAll();
        panelTransparent1.add(panelTentang1);
        panelTransparent1.repaint();
        panelTransparent1.revalidate();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        mainAccessPanel.removeAll();
        mainAccessPanel.add(accessHome);
        mainAccessPanel.repaint();
        mainAccessPanel.revalidate();
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.swing.button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private main.access.panelBantuan panelBantuan1;
    private main.access.panelManagementAkun panelManagementAkun1;
    private main.access.panelTambahAkun panelTambahAkun1;
    private main.access.panelTentang panelTentang1;
    private component.swing.panelTransparent panelTransparent1;
    // End of variables declaration//GEN-END:variables
}
