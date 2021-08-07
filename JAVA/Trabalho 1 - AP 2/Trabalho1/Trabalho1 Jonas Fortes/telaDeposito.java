
package trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author jonas
 */
public class telaDeposito extends javax.swing.JFrame {

    public telaDeposito() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNumeroContaDeposito = new javax.swing.JLabel();
        jTextFieldNumeroContaDeposito = new javax.swing.JTextField();
        jLabelValorDeposito = new javax.swing.JLabel();
        jTextFieldValorDeposito = new javax.swing.JTextField();
        jButtonConfirmarDeposito = new javax.swing.JButton();
        jButtonCancelarDeposito1 = new javax.swing.JButton();
        jLabelNomeTitularDeposito = new javax.swing.JLabel();

        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Depósito");

        jLabelNumeroContaDeposito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNumeroContaDeposito.setText("Número da Conta");

        jTextFieldNumeroContaDeposito.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldNumeroContaDeposito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNumeroContaDepositoFocusLost(evt);
            }
        });

        jLabelValorDeposito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelValorDeposito.setText("Valor");

        jTextFieldValorDeposito.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jButtonConfirmarDeposito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonConfirmarDeposito.setText("Confirmar");
        jButtonConfirmarDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarDepositoActionPerformed(evt);
            }
        });

        jButtonCancelarDeposito1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonCancelarDeposito1.setText("Cancelar");
        jButtonCancelarDeposito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarDeposito1ActionPerformed(evt);
            }
        });

        jLabelNomeTitularDeposito.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabelNomeTitularDeposito.setText(".");
        jLabelNomeTitularDeposito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabelNomeTitularDepositoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCancelarDeposito1)
                        .addGap(60, 60, 60)
                        .addComponent(jButtonConfirmarDeposito)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNomeTitularDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNumeroContaDeposito)
                            .addComponent(jTextFieldNumeroContaDeposito)
                            .addComponent(jLabelValorDeposito)
                            .addComponent(jTextFieldValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1)))
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabelNomeTitularDeposito)
                .addGap(18, 18, 18)
                .addComponent(jLabelNumeroContaDeposito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumeroContaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelValorDeposito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmarDeposito)
                    .addComponent(jButtonCancelarDeposito1))
                .addGap(22, 22, 22))
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

    private void jButtonConfirmarDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarDepositoActionPerformed
        
        if(Integer.parseInt(jTextFieldNumeroContaDeposito.getText()) == Principal.cComun.getNumero()){
            Principal.cComun.depositar(Double.parseDouble(jTextFieldValorDeposito.getText()));
            JOptionPane.showMessageDialog(null, "Depósito Efetuado!");
        }else if(Integer.parseInt(jTextFieldNumeroContaDeposito.getText()) == Principal.cPoupanca.getNumero()){
            Principal.cPoupanca.depositar(Double.parseDouble(jTextFieldValorDeposito.getText()));
            JOptionPane.showMessageDialog(null, "Depósito Efetuado!");
        }else if(Integer.parseInt(jTextFieldNumeroContaDeposito.getText()) == Principal.cEspecial.getNumero()){
            Principal.cEspecial.depositar(Double.parseDouble(jTextFieldValorDeposito.getText()));
            JOptionPane.showMessageDialog(null, "Depósito Efetuado!");
        }else JOptionPane.showMessageDialog(null, "Numero de Conta Inválido!");
        
        telaDeposito.this.dispose();
    }//GEN-LAST:event_jButtonConfirmarDepositoActionPerformed

    private void jButtonCancelarDeposito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarDeposito1ActionPerformed
        telaDeposito.this.dispose();
    }//GEN-LAST:event_jButtonCancelarDeposito1ActionPerformed

    private void jLabelNomeTitularDepositoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabelNomeTitularDepositoFocusLost
     
    }//GEN-LAST:event_jLabelNomeTitularDepositoFocusLost

    private void jTextFieldNumeroContaDepositoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNumeroContaDepositoFocusLost
        
        if(Principal.cComun.getNumero() == Integer.parseInt(jTextFieldNumeroContaDeposito.getText())){
            jLabelNomeTitularDeposito.setText("Titular: " + Principal.cComun.getNome());
        }else if(Principal.cPoupanca.getNumero() == Integer.parseInt(jTextFieldNumeroContaDeposito.getText())){
            jLabelNomeTitularDeposito.setText("Titular: " + Principal.cPoupanca.getNome());
        }else if(Principal.cEspecial.getNumero() == Integer.parseInt(jTextFieldNumeroContaDeposito.getText())){
            jLabelNomeTitularDeposito.setText("Titular: " + Principal.cEspecial.getNome());
        }else jLabelNomeTitularDeposito.setText("Titular: Inexistente");
        
    }//GEN-LAST:event_jTextFieldNumeroContaDepositoFocusLost

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(telaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDeposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarDeposito1;
    private javax.swing.JButton jButtonConfirmarDeposito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNomeTitularDeposito;
    private javax.swing.JLabel jLabelNumeroContaDeposito;
    private javax.swing.JLabel jLabelValorDeposito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNumeroContaDeposito;
    private javax.swing.JTextField jTextFieldValorDeposito;
    // End of variables declaration//GEN-END:variables
}
