/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.massage.list;

/**
 *
 * @author TEGAR ADITYA
 */
public class listSupplier extends system.massage.massageDialog{

    /**
     * Creates new form listSupplier
     */
    public listSupplier(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        textFieldMain1 = new component.swing.textFieldMain();
        textField1 = new component.swing.textField();
        jScrollPane1 = new javax.swing.JScrollPane();
        button1 = new component.swing.button();
        button2 = new component.swing.button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 557));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldMain1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldMain1.setText("List Supplier");
        textFieldMain1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textFieldMain1.setRound(18);
        getContentPane().add(textFieldMain1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 430, 53));

        textField1.setLabelText("Cari");
        textField1.setLineColor(new java.awt.Color(153, 153, 153));
        textField1.setOpaque(false);
        getContentPane().add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 114, 210, -1));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 169, 430, 377));

        button1.setText("Batal");
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 100, -1));

        button2.setText("Pilih");
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 100, -1));

        pack();
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
            java.util.logging.Logger.getLogger(listSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                listSupplier dialog = new listSupplier(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.swing.button button1;
    private component.swing.button button2;
    private javax.swing.JScrollPane jScrollPane1;
    private component.swing.textField textField1;
    private component.swing.textFieldMain textFieldMain1;
    // End of variables declaration//GEN-END:variables
}