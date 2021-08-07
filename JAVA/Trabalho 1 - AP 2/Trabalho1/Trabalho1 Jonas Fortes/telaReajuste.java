
package trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author jonas
 */
public class telaReajuste extends javax.swing.JFrame {


    public telaReajuste() {
        initComponents();
        jTextFieldContaReajuste.setText(Integer.toString(Principal.cPoupanca.getNumero()));
        jTextFieldTaxaReajuste.setText(Integer.toString(Principal.cPoupanca.getTaxa()));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelContaReajuste = new javax.swing.JLabel();
        jTextFieldContaReajuste = new javax.swing.JTextField();
        jButtonConfirmarReajuste = new javax.swing.JButton();
        jButtonCancelarReajuste1 = new javax.swing.JButton();
        jLabelTaxaReajuste = new javax.swing.JLabel();
        jTextFieldTaxaReajuste = new javax.swing.JTextField();
        jLabelTitularReajuste = new javax.swing.JLabel();

        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Reajuste");

        jLabelContaReajuste.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelContaReajuste.setText("Numero da Conta");

        jTextFieldContaReajuste.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldContaReajuste.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldContaReajusteFocusLost(evt);
            }
        });
        jTextFieldContaReajuste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContaReajusteActionPerformed(evt);
            }
        });

        jButtonConfirmarReajuste.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonConfirmarReajuste.setText("Confirmar");
        jButtonConfirmarReajuste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarReajusteActionPerformed(evt);
            }
        });

        jButtonCancelarReajuste1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonCancelarReajuste1.setText("Cancelar");
        jButtonCancelarReajuste1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarReajuste1ActionPerformed(evt);
            }
        });

        jLabelTaxaReajuste.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTaxaReajuste.setText("Taxa de Reajuste");

        jTextFieldTaxaReajuste.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldTaxaReajuste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaxaReajusteActionPerformed(evt);
            }
        });

        jLabelTitularReajuste.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabelTitularReajuste.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButtonCancelarReajuste1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButtonConfirmarReajuste)
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitularReajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTaxaReajuste)
                            .addComponent(jTextFieldTaxaReajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelContaReajuste)
                            .addComponent(jTextFieldContaReajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(144, 144, 144))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabelTitularReajuste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabelContaReajuste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldContaReajuste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTaxaReajuste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTaxaReajuste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmarReajuste)
                    .addComponent(jButtonCancelarReajuste1))
                .addGap(32, 32, 32))
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

    private void jTextFieldContaReajusteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContaReajusteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContaReajusteActionPerformed

    private void jButtonCancelarReajuste1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarReajuste1ActionPerformed
        telaReajuste.this.dispose();
    }//GEN-LAST:event_jButtonCancelarReajuste1ActionPerformed

    private void jButtonConfirmarReajusteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarReajusteActionPerformed
        
        try{
            int taxa = Integer.parseInt(jTextFieldTaxaReajuste.getText());
            Principal.cPoupanca.reajustar(taxa);
        }catch(NumberFormatException ex){
            Principal.cPoupanca.reajustar();
        }
                
                
        telaReajuste.this.dispose();
    }//GEN-LAST:event_jButtonConfirmarReajusteActionPerformed

    private void jTextFieldTaxaReajusteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTaxaReajusteActionPerformed

    }//GEN-LAST:event_jTextFieldTaxaReajusteActionPerformed

    private void jTextFieldContaReajusteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldContaReajusteFocusLost
        if(Principal.cComun.getNumero() == Integer.parseInt(jTextFieldContaReajuste.getText())){
            jLabelTitularReajuste.setText("Titular: " + Principal.cComun.getNome());
        }else if(Principal.cPoupanca.getNumero() == Integer.parseInt(jTextFieldContaReajuste.getText())){
            jLabelTitularReajuste.setText("Titular: " + Principal.cPoupanca.getNome());
        }else if(Principal.cEspecial.getNumero() == Integer.parseInt(jTextFieldContaReajuste.getText())){
            jLabelTitularReajuste.setText("Titular: " + Principal.cEspecial.getNome());
        }else jLabelTitularReajuste.setText("Titular: Inexistente");
    }//GEN-LAST:event_jTextFieldContaReajusteFocusLost


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
            java.util.logging.Logger.getLogger(telaReajuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaReajuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaReajuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaReajuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaReajuste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarReajuste1;
    private javax.swing.JButton jButtonConfirmarReajuste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelContaReajuste;
    private javax.swing.JLabel jLabelTaxaReajuste;
    private javax.swing.JLabel jLabelTitularReajuste;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldContaReajuste;
    private javax.swing.JTextField jTextFieldTaxaReajuste;
    // End of variables declaration//GEN-END:variables
}
