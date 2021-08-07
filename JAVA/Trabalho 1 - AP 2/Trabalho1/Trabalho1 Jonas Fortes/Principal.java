
package trabalho1;


import javax.swing.JFrame;

public class Principal extends JFrame {
    
    static Contas cComun = new Contas();
    static ContaPoupanca cPoupanca = new ContaPoupanca();
    static ContaEspecial cEspecial = new ContaEspecial();
    
    public Principal() {
        initComponents();
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonOpTranferencia = new javax.swing.JButton();
        jButtonOpDepósito = new javax.swing.JButton();
        jButtonOpReajustar = new javax.swing.JButton();
        jButtonOpVerSaldo = new javax.swing.JButton();
        jButtonOpSair = new javax.swing.JButton();
        jButtonOpSaque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Operações");

        jButtonOpTranferencia.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonOpTranferencia.setText("Transferência");
        jButtonOpTranferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpTranferenciaActionPerformed(evt);
            }
        });

        jButtonOpDepósito.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonOpDepósito.setText("Despósito");
        jButtonOpDepósito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpDepósitoActionPerformed(evt);
            }
        });

        jButtonOpReajustar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonOpReajustar.setText("Reajustar");
        jButtonOpReajustar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpReajustarActionPerformed(evt);
            }
        });

        jButtonOpVerSaldo.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonOpVerSaldo.setText("Ver Saldo");
        jButtonOpVerSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpVerSaldoActionPerformed(evt);
            }
        });

        jButtonOpSair.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonOpSair.setText("Sair");
        jButtonOpSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpSairActionPerformed(evt);
            }
        });

        jButtonOpSaque.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonOpSaque.setText("Saque");
        jButtonOpSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpSaqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(306, 306, 306))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonOpReajustar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jButtonOpVerSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonOpSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jButtonOpDepósito, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonOpTranferencia)
                            .addComponent(jButtonOpSair, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOpTranferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOpDepósito, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOpSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOpReajustar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOpVerSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOpSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOpSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpSaqueActionPerformed
        telaSaque telaSaque = new telaSaque();
        telaSaque.setVisible(true);
       
         
    }//GEN-LAST:event_jButtonOpSaqueActionPerformed

    private void jButtonOpDepósitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpDepósitoActionPerformed
        telaDeposito telaDeposito = new telaDeposito();
        telaDeposito.setVisible(true);
    }//GEN-LAST:event_jButtonOpDepósitoActionPerformed

    private void jButtonOpTranferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpTranferenciaActionPerformed
        telaTransferencia telaTransferencia = new telaTransferencia();
        telaTransferencia.setVisible(true);
    }//GEN-LAST:event_jButtonOpTranferenciaActionPerformed

    private void jButtonOpReajustarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpReajustarActionPerformed
        telaReajuste telaReajuste = new telaReajuste();
        telaReajuste.setVisible(true);
    }//GEN-LAST:event_jButtonOpReajustarActionPerformed

    private void jButtonOpVerSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpVerSaldoActionPerformed
        telaVerSaldos telaVerSaldos = new telaVerSaldos();
        telaVerSaldos.setVisible(true);
    }//GEN-LAST:event_jButtonOpVerSaldoActionPerformed

    private void jButtonOpSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonOpSairActionPerformed

    
    public static void main1(String args[]) {
        
        
        
      
        
        
        
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOpDepósito;
    private javax.swing.JButton jButtonOpReajustar;
    private javax.swing.JButton jButtonOpSair;
    private javax.swing.JButton jButtonOpSaque;
    private javax.swing.JButton jButtonOpTranferencia;
    private javax.swing.JButton jButtonOpVerSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

