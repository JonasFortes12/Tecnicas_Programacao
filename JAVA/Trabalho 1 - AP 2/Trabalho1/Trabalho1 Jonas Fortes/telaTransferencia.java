
package trabalho1;

import javax.swing.JOptionPane;


public class telaTransferencia extends javax.swing.JFrame {
    
    public telaTransferencia() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNContaOrigem = new javax.swing.JLabel();
        jTextFieldNContaOrigem = new javax.swing.JTextField();
        jLabelNContaDestino = new javax.swing.JLabel();
        jTextFieldNContaDestino = new javax.swing.JTextField();
        jButtonConfirmarTransferencia = new javax.swing.JButton();
        jButtonCancelarTransferencia = new javax.swing.JButton();
        jLabelValorTransferencia = new javax.swing.JLabel();
        jTextFieldValorTranferencia = new javax.swing.JTextField();
        jLabelNomeTitularOrigem = new javax.swing.JLabel();
        jLabelNomeTitularDestino = new javax.swing.JLabel();

        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Transferência");

        jLabelNContaOrigem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNContaOrigem.setText("Número Conta Origem");

        jTextFieldNContaOrigem.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldNContaOrigem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNContaOrigemFocusLost(evt);
            }
        });
        jTextFieldNContaOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNContaOrigemActionPerformed(evt);
            }
        });

        jLabelNContaDestino.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNContaDestino.setText("Número Conta Destino");

        jTextFieldNContaDestino.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldNContaDestino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNContaDestinoFocusLost(evt);
            }
        });
        jTextFieldNContaDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNContaDestinoActionPerformed(evt);
            }
        });

        jButtonConfirmarTransferencia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonConfirmarTransferencia.setText("Confirmar");
        jButtonConfirmarTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarTransferenciaActionPerformed(evt);
            }
        });

        jButtonCancelarTransferencia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonCancelarTransferencia.setText("Cancelar");
        jButtonCancelarTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarTransferenciaActionPerformed(evt);
            }
        });

        jLabelValorTransferencia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelValorTransferencia.setText("Valor");

        jTextFieldValorTranferencia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldValorTranferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTranferenciaActionPerformed(evt);
            }
        });

        jLabelNomeTitularOrigem.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabelNomeTitularOrigem.setText(".");

        jLabelNomeTitularDestino.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabelNomeTitularDestino.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonConfirmarTransferencia)
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNContaOrigem)
                    .addComponent(jTextFieldNContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNContaDestino)
                    .addComponent(jTextFieldNContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValorTransferencia)
                    .addComponent(jTextFieldValorTranferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNomeTitularDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(jLabelNomeTitularOrigem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jButtonCancelarTransferencia)
                    .addContainerGap(248, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabelNomeTitularOrigem)
                .addGap(18, 18, 18)
                .addComponent(jLabelNomeTitularDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNContaOrigem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNContaDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelValorTransferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValorTranferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButtonConfirmarTransferencia)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(273, Short.MAX_VALUE)
                    .addComponent(jButtonCancelarTransferencia)
                    .addGap(22, 22, 22)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNContaOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNContaOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNContaOrigemActionPerformed

    private void jTextFieldNContaDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNContaDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNContaDestinoActionPerformed

    private void jButtonCancelarTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarTransferenciaActionPerformed
        telaTransferencia.this.dispose();
    }//GEN-LAST:event_jButtonCancelarTransferenciaActionPerformed

    private void jTextFieldValorTranferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTranferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorTranferenciaActionPerformed

    private void jButtonConfirmarTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarTransferenciaActionPerformed
        int retorno;
        int conta1 = Integer.parseInt(jTextFieldNContaOrigem.getText());
        int conta2 = Integer.parseInt(jTextFieldNContaDestino.getText());
        double valor = Double.parseDouble(jTextFieldValorTranferencia.getText());
        
        retorno = Principal.cComun.transferir(conta1, conta2, valor);
        
        
        if(retorno == 0) JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
        else if(retorno == 1) JOptionPane.showMessageDialog(null, "Transferência Efetuada!");
        else JOptionPane.showMessageDialog(null, "Conta Não Existente!");
        
        telaTransferencia.this.dispose();
    }//GEN-LAST:event_jButtonConfirmarTransferenciaActionPerformed

    private void jTextFieldNContaOrigemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNContaOrigemFocusLost
        if(Principal.cComun.getNumero() == Integer.parseInt(jTextFieldNContaOrigem.getText())){
            jLabelNomeTitularOrigem.setText("Titular Origem: " + Principal.cComun.getNome());
        }else if(Principal.cPoupanca.getNumero() == Integer.parseInt(jTextFieldNContaOrigem.getText())){
            jLabelNomeTitularOrigem.setText("Titular Origem: " + Principal.cPoupanca.getNome());
        }else if(Principal.cEspecial.getNumero() == Integer.parseInt(jTextFieldNContaOrigem.getText())){
            jLabelNomeTitularOrigem.setText("Titular Origem: " + Principal.cEspecial.getNome());
        }else jLabelNomeTitularOrigem.setText("Titular Origem: Inexistente");
    }//GEN-LAST:event_jTextFieldNContaOrigemFocusLost

    private void jTextFieldNContaDestinoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNContaDestinoFocusLost
        if(Principal.cComun.getNumero() == Integer.parseInt(jTextFieldNContaDestino.getText())){
            jLabelNomeTitularDestino.setText("Titular Destino: " + Principal.cComun.getNome());
        }else if(Principal.cPoupanca.getNumero() == Integer.parseInt(jTextFieldNContaDestino.getText())){
            jLabelNomeTitularDestino.setText("Titular Destino: " + Principal.cPoupanca.getNome());
        }else if(Principal.cEspecial.getNumero() == Integer.parseInt(jTextFieldNContaDestino.getText())){
            jLabelNomeTitularDestino.setText("Titular Destino: " + Principal.cEspecial.getNome());
        }else jLabelNomeTitularDestino.setText("Titular Destino: Inexistente");
    }//GEN-LAST:event_jTextFieldNContaDestinoFocusLost

 
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
            java.util.logging.Logger.getLogger(telaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaTransferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarTransferencia;
    private javax.swing.JButton jButtonConfirmarTransferencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNContaDestino;
    private javax.swing.JLabel jLabelNContaOrigem;
    private javax.swing.JLabel jLabelNomeTitularDestino;
    private javax.swing.JLabel jLabelNomeTitularOrigem;
    private javax.swing.JLabel jLabelValorTransferencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNContaDestino;
    private javax.swing.JTextField jTextFieldNContaOrigem;
    private javax.swing.JTextField jTextFieldValorTranferencia;
    // End of variables declaration//GEN-END:variables
}
