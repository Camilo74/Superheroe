/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superheroe;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Superheroe extends javax.swing.JFrame {

    /**
     * Creates new form Superheroe
     */
    public Superheroe() {
        this.setTitle("Superheroe");
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelGIANTE = new javax.swing.JLabel();
        Hada = new javax.swing.JButton();
        LabelHada1 = new javax.swing.JLabel();
        LabelMAGO = new javax.swing.JLabel();
        LabelKRIPTON = new javax.swing.JLabel();
        Mago = new javax.swing.JButton();
        Gigante = new javax.swing.JButton();
        Kripton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        LabelGIANTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superheroe/2 .png"))); // NOI18N
        LabelGIANTE.setText("jLabel1");

        Hada.setText("GIGANTE");
        Hada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HadaMouseClicked(evt);
            }
        });

        LabelHada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superheroe/1.png"))); // NOI18N
        LabelHada1.setText("jLabel1");

        LabelMAGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superheroe/4.jpg"))); // NOI18N
        LabelMAGO.setText("jLabel1");

        LabelKRIPTON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superheroe/3.jpg"))); // NOI18N
        LabelKRIPTON.setText("jLabel1");

        Mago.setText("MAGO");
        Mago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MagoMouseClicked(evt);
            }
        });

        Gigante.setText("HADA");
        Gigante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GiganteMouseClicked(evt);
            }
        });

        Kripton.setText("KRIPTONIANO");
        Kripton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KriptonMouseClicked(evt);
            }
        });
        Kripton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KriptonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Gigante, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelGIANTE, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelKRIPTON, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Hada, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Kripton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelMAGO, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mago, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(LabelHada1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(474, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelGIANTE, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelMAGO, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelKRIPTON, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mago)
                    .addComponent(Gigante)
                    .addComponent(Kripton)
                    .addComponent(Hada))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(LabelHada1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KriptonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KriptonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KriptonActionPerformed

    private void HadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HadaMouseClicked
        // TODO add your handling code here:
        Gigante usar = new Gigante();
        usar.imprimir();

    }//GEN-LAST:event_HadaMouseClicked

    private void GiganteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GiganteMouseClicked
        // TODO add your handling code here:
        Hada usar = new Hada();
        usar.imprimir();
    }//GEN-LAST:event_GiganteMouseClicked

    private void KriptonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KriptonMouseClicked
        // TODO add your handling code here:
        Kriptoniano usar = new Kriptoniano();
        usar.imprimir();
    }//GEN-LAST:event_KriptonMouseClicked

    private void MagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MagoMouseClicked
        // TODO add your handling code here:
        Mago usar = new Mago();
        usar.imprimir();
    }//GEN-LAST:event_MagoMouseClicked

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
            java.util.logging.Logger.getLogger(Superheroe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Superheroe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Superheroe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Superheroe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Superheroe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gigante;
    private javax.swing.JButton Hada;
    private javax.swing.JButton Kripton;
    private javax.swing.JLabel LabelGIANTE;
    private javax.swing.JLabel LabelHada1;
    private javax.swing.JLabel LabelKRIPTON;
    private javax.swing.JLabel LabelMAGO;
    private javax.swing.JButton Mago;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
