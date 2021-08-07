/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author jonas
 */
public class telaSaque extends javax.swing.JFrame {


    public telaSaque() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNumeroContaSaque = new javax.swing.JLabel();
        jTextFieldNumeroContaSaque = new javax.swing.JTextField();
        jLabelValorSaque = new javax.swing.JLabel();
        jTextFieldValorSaque = new javax.swing.JTextField();
        jButtonConfirmarSaque = new javax.swing.JButton();
        jButtonCancelarSaque = new javax.swing.JButton();
        jLabelNomeTitular = new javax.swing.JLabel();

        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Saque");

        jLabelNumeroContaSaque.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNumeroContaSaque.setText("Numero da Conta");

        jTextFieldNumeroContaSaque.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldNumeroContaSaque.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNumeroContaSaqueFocusLost(evt);
            }
        });
        jTextFieldNumeroContaSaque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextFieldNumeroContaSaqueMouseEntered(evt);
            }
        });
        jTextFieldNumeroContaSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroContaSaqueActionPerformed(evt);
            }
        });

        jLabelValorSaque.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelValorSaque.setText("Valor ");

        jTextFieldValorSaque.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldValorSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorSaqueActionPerformed(evt);
            }
        });

        jButtonConfirmarSaque.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonConfirmarSaque.setText("Confirmar");
        jButtonConfirmarSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarSaqueActionPerformed(evt);
            }
        });

        jButtonCancelarSaque.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonCancelarSaque.setText("Cancelar");
        jButtonCancelarSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarSaqueActionPerformed(evt);
            }
        });

        jLabelNomeTitular.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabelNomeTitular.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNomeTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNumeroContaSaque)
                            .addComponent(jTextFieldNumeroContaSaque)
                            .addComponent(jLabelValorSaque)
                            .addComponent(jTextFieldValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButtonCancelarSaque)
                        .addGap(83, 83, 83)
                        .addComponent(jButtonConfirmarSaque)))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNomeTitular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabelNumeroContaSaque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumeroContaSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelValorSaque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmarSaque)
                    .addComponent(jButtonCancelarSaque))
                .addGap(23, 23, 23))
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

    private void jTextFieldNumeroContaSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroContaSaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroContaSaqueActionPerformed

    private void jTextFieldValorSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorSaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorSaqueActionPerformed

    private void jButtonConfirmarSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarSaqueActionPerformed
        
        int retorno = 0;
        
        if(Integer.parseInt(jTextFieldNumeroContaSaque.getText()) == Principal.cComun.getNumero()){
            retorno = Principal.cComun.sacar(Double.parseDouble(jTextFieldValorSaque.getText()));
        }else if(Integer.parseInt(jTextFieldNumeroContaSaque.getText()) == Principal.cPoupanca.getNumero()){
            retorno = Principal.cPoupanca.sacar(Double.parseDouble(jTextFieldValorSaque.getText()));
        }else if(Integer.parseInt(jTextFieldNumeroContaSaque.getText()) == Principal.cEspecial.getNumero()){
            retorno = Principal.cEspecial.sacar(Double.parseDouble(jTextFieldValorSaque.getText()));
        }else retorno = 3;
        
        if(retorno == 0) JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
        else if(retorno == 1) JOptionPane.showMessageDialog(null, "Saque Efetuado!");
        else if(retorno == 2)JOptionPane.showMessageDialog(null, "Saque Efetuado Ultilizando Cheque Especial!");
        else if(retorno == 3)JOptionPane.showMessageDialog(null, "Numero de Conta Inválido!");
        telaSaque.this.dispose();      
    }//GEN-LAST:event_jButtonConfirmarSaqueActionPerformed

    private void jButtonCancelarSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarSaqueActionPerformed
        telaSaque.this.dispose();
    }//GEN-LAST:event_jButtonCancelarSaqueActionPerformed

    private void jTextFieldNumeroContaSaqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNumeroContaSaqueMouseEntered

    }//GEN-LAST:event_jTextFieldNumeroContaSaqueMouseEntered

    private void jTextFieldNumeroContaSaqueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNumeroContaSaqueFocusLost
        
        if(Principal.cComun.getNumero() == Integer.parseInt(jTextFieldNumeroContaSaque.getText())){
            jLabelNomeTitular.setText("Titular: " + Principal.cComun.getNome());
        }else if(Principal.cPoupanca.getNumero() == Integer.parseInt(jTextFieldNumeroContaSaque.getText())){
            jLabelNomeTitular.setText("Titular: " + Principal.cPoupanca.getNome());
        }else if(Principal.cEspecial.getNumero() == Integer.parseInt(jTextFieldNumeroContaSaque.getText())){
            jLabelNomeTitular.setText("Titular: " + Principal.cEspecial.getNome());
        }else jLabelNomeTitular.setText("Titular: Inexistente");
    }//GEN-LAST:event_jTextFieldNumeroContaSaqueFocusLost


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
            java.util.logging.Logger.getLogger(telaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaSaque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarSaque;
    private javax.swing.JButton jButtonConfirmarSaque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNomeTitular;
    private javax.swing.JLabel jLabelNumeroContaSaque;
    private javax.swing.JLabel jLabelValorSaque;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNumeroContaSaque;
    private javax.swing.JTextField jTextFieldValorSaque;
    // End of variables declaration//GEN-END:variables
}
