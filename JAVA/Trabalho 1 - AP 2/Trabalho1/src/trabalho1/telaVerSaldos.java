
package trabalho1;

/**
 *
 * @author jonas
 */
public class telaVerSaldos extends javax.swing.JFrame {

    public telaVerSaldos() {
        initComponents();
        jLabelSaldoContaComum.setText("Saldo: " + Principal.cComun.getSaldo());
        jLabelSaldoContaPoupanca.setText("Saldo: "+ Principal.cPoupanca.getSaldo());
        jLabelSaldoContaEspecial.setText("Saldo: "+ Principal.cEspecial.getSaldo());
        jLabelSaldoContaComumTitular.setText("Titular: " + Principal.cComun.getNome());
        jLabelSaldoContaPoupancaTitular.setText("Titular: "+ Principal.cPoupanca.getNome());
        jLabelSaldoContaEspecialTitular.setText("Titular: "+ Principal.cEspecial.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonConfirmarVerSaldo = new javax.swing.JButton();
        jLabelSaldoContaComum = new javax.swing.JLabel();
        jLabelSaldoContaPoupanca = new javax.swing.JLabel();
        jLabelSaldoContaEspecial = new javax.swing.JLabel();
        jLabelSaldoContaPoupancaTitular = new javax.swing.JLabel();
        jLabelSaldoContaEspecialTitular = new javax.swing.JLabel();
        jLabelSaldoContaComumTitular = new javax.swing.JLabel();

        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Saldos");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Conta Comum");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Conta Poupança");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Conta Especial");

        jButtonConfirmarVerSaldo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonConfirmarVerSaldo.setText("OK");
        jButtonConfirmarVerSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarVerSaldoActionPerformed(evt);
            }
        });

        jLabelSaldoContaComum.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabelSaldoContaComum.setText("jLabel5");

        jLabelSaldoContaPoupanca.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabelSaldoContaPoupanca.setText("jLabel5");

        jLabelSaldoContaEspecial.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabelSaldoContaEspecial.setText("jLabel5");

        jLabelSaldoContaPoupancaTitular.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabelSaldoContaPoupancaTitular.setText("jLabel5");

        jLabelSaldoContaEspecialTitular.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabelSaldoContaEspecialTitular.setText("jLabel5");

        jLabelSaldoContaComumTitular.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabelSaldoContaComumTitular.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSaldoContaComumTitular)
                            .addComponent(jLabelSaldoContaComum))))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSaldoContaPoupanca)
                    .addComponent(jLabel3)
                    .addComponent(jLabelSaldoContaPoupancaTitular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabelSaldoContaEspecial)
                        .addComponent(jButtonConfirmarVerSaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelSaldoContaEspecialTitular))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmarVerSaldo)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSaldoContaComumTitular)
                            .addComponent(jLabelSaldoContaPoupancaTitular)
                            .addComponent(jLabelSaldoContaEspecialTitular))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSaldoContaComum)
                            .addComponent(jLabelSaldoContaPoupanca)
                            .addComponent(jLabelSaldoContaEspecial))
                        .addContainerGap(108, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarVerSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarVerSaldoActionPerformed
        telaVerSaldos.this.dispose();
    }//GEN-LAST:event_jButtonConfirmarVerSaldoActionPerformed


    public static void main1(String args[]) {
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
            java.util.logging.Logger.getLogger(telaVerSaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaVerSaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaVerSaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaVerSaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaVerSaldos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarVerSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelSaldoContaComum;
    private javax.swing.JLabel jLabelSaldoContaComumTitular;
    private javax.swing.JLabel jLabelSaldoContaEspecial;
    private javax.swing.JLabel jLabelSaldoContaEspecialTitular;
    private javax.swing.JLabel jLabelSaldoContaPoupanca;
    private javax.swing.JLabel jLabelSaldoContaPoupancaTitular;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
