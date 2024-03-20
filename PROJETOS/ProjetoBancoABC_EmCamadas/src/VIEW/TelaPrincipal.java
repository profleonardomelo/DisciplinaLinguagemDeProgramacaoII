package VIEW;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnCadastroDeConta = new javax.swing.JButton();
        btnAlteracaoDeConta = new javax.swing.JButton();
        btnExclusaoDeConta = new javax.swing.JButton();
        btnListagemDeContas = new javax.swing.JButton();
        btnPesquisaDeContas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema IFBA - Tela Principal");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Principal");

        btnCadastroDeConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastroDeConta.setText("Cadastro de Conta");
        btnCadastroDeConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroDeContaActionPerformed(evt);
            }
        });

        btnAlteracaoDeConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAlteracaoDeConta.setText("Alteração de Conta");
        btnAlteracaoDeConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteracaoDeContaActionPerformed(evt);
            }
        });

        btnExclusaoDeConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExclusaoDeConta.setText("Exclusão de Conta");
        btnExclusaoDeConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExclusaoDeContaActionPerformed(evt);
            }
        });

        btnListagemDeContas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnListagemDeContas.setText("Listagem de Contas");
        btnListagemDeContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemDeContasActionPerformed(evt);
            }
        });

        btnPesquisaDeContas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPesquisaDeContas.setText("Pesquisa de Contas");
        btnPesquisaDeContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaDeContasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnListagemDeContas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPesquisaDeContas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastroDeConta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlteracaoDeConta)))
                        .addGap(30, 30, 30))))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnExclusaoDeConta)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTitulo)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastroDeConta)
                    .addComponent(btnAlteracaoDeConta))
                .addGap(18, 18, 18)
                .addComponent(btnExclusaoDeConta)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListagemDeContas)
                    .addComponent(btnPesquisaDeContas))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroDeContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroDeContaActionPerformed

        new TelaDeCadastroDeConta().setVisible(true);

    }//GEN-LAST:event_btnCadastroDeContaActionPerformed

    private void btnAlteracaoDeContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteracaoDeContaActionPerformed

        new TelaDeAlteracaoDeConta().setVisible(true);

    }//GEN-LAST:event_btnAlteracaoDeContaActionPerformed

    private void btnExclusaoDeContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExclusaoDeContaActionPerformed

        new TelaDeExclusaoDeConta().setVisible(true);

    }//GEN-LAST:event_btnExclusaoDeContaActionPerformed

    private void btnListagemDeContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemDeContasActionPerformed

        new TelaDeListagemDeContas().setVisible(true);

    }//GEN-LAST:event_btnListagemDeContasActionPerformed

    private void btnPesquisaDeContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaDeContasActionPerformed

        new TelaDePesquisaDeContas().setVisible(true);

    }//GEN-LAST:event_btnPesquisaDeContasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlteracaoDeConta;
    private javax.swing.JButton btnCadastroDeConta;
    private javax.swing.JButton btnExclusaoDeConta;
    private javax.swing.JButton btnListagemDeContas;
    private javax.swing.JButton btnPesquisaDeContas;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
