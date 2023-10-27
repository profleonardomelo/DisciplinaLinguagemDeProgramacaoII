package Principal;

import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class TelaPrincipalMDI extends javax.swing.JFrame {

    private JInternalFrame telaInterior;

    public TelaPrincipalMDI() {
        initComponents();
        this.telaInterior = new JInternalFrame();
        
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        btnTela1 = new javax.swing.JButton();
        btnTela2 = new javax.swing.JButton();
        btnTela3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);

        desktopPane.setAutoscrolls(true);

        btnTela1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTela1.setText("Tela 1");
        btnTela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTela1ActionPerformed(evt);
            }
        });

        btnTela2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTela2.setText("Tela 2");
        btnTela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTela2ActionPerformed(evt);
            }
        });

        btnTela3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTela3.setText("Tela 3");
        btnTela3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTela3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTela2)
                    .addComponent(btnTela1)
                    .addComponent(btnTela3))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnTela1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTela2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTela3)
                .addContainerGap(100, Short.MAX_VALUE))
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTela1ActionPerformed

        this.telaInterior.dispose();

        Tela1 tela1 = new Tela1();
        ((BasicInternalFrameUI)tela1.getUI()).setNorthPane(null);
        tela1.setSize(desktopPane.getSize());
        this.telaInterior = tela1;

        desktopPane.add(tela1);
        tela1.setVisible(true);

    }//GEN-LAST:event_btnTela1ActionPerformed

    private void btnTela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTela2ActionPerformed

        this.telaInterior.dispose();

        Tela2 tela2 = new Tela2();
        ((BasicInternalFrameUI)tela2.getUI()).setNorthPane(null);
        tela2.setSize(desktopPane.getSize());
        this.telaInterior = tela2;

        desktopPane.add(tela2);
        tela2.setVisible(true);
    }//GEN-LAST:event_btnTela2ActionPerformed

    private void btnTela3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTela3ActionPerformed
        
        this.telaInterior.dispose();

        Tela3 tela3 = new Tela3();
        ((BasicInternalFrameUI)tela3.getUI()).setNorthPane(null);
        tela3.setSize(desktopPane.getSize());
        this.telaInterior = tela3;

        desktopPane.add(tela3);
        tela3.setVisible(true);
    }//GEN-LAST:event_btnTela3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTela1;
    private javax.swing.JButton btnTela2;
    private javax.swing.JButton btnTela3;
    private javax.swing.JDesktopPane desktopPane;
    // End of variables declaration//GEN-END:variables

}
