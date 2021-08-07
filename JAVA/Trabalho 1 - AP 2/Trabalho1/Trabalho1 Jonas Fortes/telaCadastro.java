
package trabalho1;

import javax.swing.JOptionPane;


public class telaCadastro extends javax.swing.JFrame {

    
    public telaCadastro() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCadastro = new javax.swing.JLabel();
        jLabelNomeTitularC = new javax.swing.JLabel();
        jTextFieldNomeTitularC = new javax.swing.JTextField();
        jLabelNumeroContaC = new javax.swing.JLabel();
        jTextFieldNumeroContaC = new javax.swing.JTextField();
        jLabelSaldoInicialC = new javax.swing.JLabel();
        jTextFieldSaldoInicialC = new javax.swing.JTextField();
        jLabelCadastro1 = new javax.swing.JLabel();
        jLabelCadastro2 = new javax.swing.JLabel();
        jLabelNomeTitularP = new javax.swing.JLabel();
        jTextFieldNomeTitularP = new javax.swing.JTextField();
        jLabelNumeroContaP = new javax.swing.JLabel();
        jTextFieldNumeroContaP = new javax.swing.JTextField();
        jLabelSaldoInicialP = new javax.swing.JLabel();
        jTextFieldSaldoInicialP = new javax.swing.JTextField();
        jLabelTaxaReajusteP = new javax.swing.JLabel();
        jTextFieldTaxaReajusteP = new javax.swing.JTextField();
        jLabelCadastro3 = new javax.swing.JLabel();
        jLabelNomeTitularE = new javax.swing.JLabel();
        jTextFieldNomeTitularE = new javax.swing.JTextField();
        jLabelNumeroContaE = new javax.swing.JLabel();
        jTextFieldNumeroContaE = new javax.swing.JTextField();
        jLabelSaldoInicialE = new javax.swing.JLabel();
        jTextFieldSaldoInicialE = new javax.swing.JTextField();
        jLabelLimiteE = new javax.swing.JLabel();
        jTextFieldLimiteE = new javax.swing.JTextField();
        jLabelMultaE = new javax.swing.JLabel();
        jTextFieldMultaE = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelarCadastro = new javax.swing.JButton();

        setResizable(false);

        jLabelCadastro.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelCadastro.setText("Cadastro");

        jLabelNomeTitularC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNomeTitularC.setText("Nome Titular");

        jTextFieldNomeTitularC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldNomeTitularC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeTitularCActionPerformed(evt);
            }
        });

        jLabelNumeroContaC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNumeroContaC.setText("Numero da Conta");

        jTextFieldNumeroContaC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldNumeroContaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroContaCActionPerformed(evt);
            }
        });

        jLabelSaldoInicialC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSaldoInicialC.setText("Saldo Inicial");

        jTextFieldSaldoInicialC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldSaldoInicialC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoInicialCActionPerformed(evt);
            }
        });

        jLabelCadastro1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelCadastro1.setText("Conta Comum");

        jLabelCadastro2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelCadastro2.setText("Conta Poupança");

        jLabelNomeTitularP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNomeTitularP.setText("Nome Titular");

        jTextFieldNomeTitularP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldNomeTitularP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeTitularPActionPerformed(evt);
            }
        });

        jLabelNumeroContaP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNumeroContaP.setText("Numero da Conta");

        jTextFieldNumeroContaP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldNumeroContaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroContaPActionPerformed(evt);
            }
        });

        jLabelSaldoInicialP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSaldoInicialP.setText("Saldo Inicial");

        jTextFieldSaldoInicialP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldSaldoInicialP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoInicialPActionPerformed(evt);
            }
        });

        jLabelTaxaReajusteP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTaxaReajusteP.setText("Taxa de Reajuste");

        jTextFieldTaxaReajusteP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldTaxaReajusteP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaxaReajustePActionPerformed(evt);
            }
        });

        jLabelCadastro3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelCadastro3.setText("Conta Especial");

        jLabelNomeTitularE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNomeTitularE.setText("Nome Titular");

        jTextFieldNomeTitularE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldNomeTitularE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeTitularEActionPerformed(evt);
            }
        });

        jLabelNumeroContaE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNumeroContaE.setText("Numero da Conta");

        jTextFieldNumeroContaE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldNumeroContaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroContaEActionPerformed(evt);
            }
        });

        jLabelSaldoInicialE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSaldoInicialE.setText("Saldo Inicial");

        jTextFieldSaldoInicialE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldSaldoInicialE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoInicialEActionPerformed(evt);
            }
        });

        jLabelLimiteE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelLimiteE.setText("Limite");

        jTextFieldLimiteE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldLimiteE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLimiteEActionPerformed(evt);
            }
        });

        jLabelMultaE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelMultaE.setText("Multa");

        jTextFieldMultaE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldMultaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMultaEActionPerformed(evt);
            }
        });

        jButtonCadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonCancelarCadastro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonCancelarCadastro.setText("Cancelar");
        jButtonCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeTitularC)
                            .addComponent(jTextFieldNomeTitularC, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNumeroContaC)
                            .addComponent(jTextFieldNumeroContaC, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSaldoInicialC)
                            .addComponent(jTextFieldSaldoInicialC, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCadastro1))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTaxaReajusteP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNomeTitularP)
                            .addComponent(jTextFieldNomeTitularP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNumeroContaP)
                            .addComponent(jTextFieldNumeroContaP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSaldoInicialP)
                            .addComponent(jTextFieldSaldoInicialP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTaxaReajusteP)
                            .addComponent(jLabelCadastro2)
                            .addComponent(jLabelCadastro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMultaE)
                            .addComponent(jTextFieldMultaE, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNomeTitularE)
                            .addComponent(jTextFieldNomeTitularE, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNumeroContaE)
                            .addComponent(jTextFieldNumeroContaE, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSaldoInicialE)
                            .addComponent(jTextFieldSaldoInicialE, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCadastro3)
                            .addComponent(jLabelLimiteE)
                            .addComponent(jTextFieldLimiteE, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNomeTitularC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeTitularC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNumeroContaC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumeroContaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSaldoInicialC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSaldoInicialC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCadastro3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelNomeTitularE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeTitularE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelNumeroContaE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumeroContaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelSaldoInicialE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSaldoInicialE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelLimiteE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldLimiteE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelMultaE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMultaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCadastro2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelNomeTitularP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeTitularP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelNumeroContaP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumeroContaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelSaldoInicialP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSaldoInicialP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTaxaReajusteP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTaxaReajusteP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(122, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

        try{
            Principal.cComun.setNome(jTextFieldNomeTitularC.getText());
            Principal.cComun.setNumero(Integer.parseInt(jTextFieldNumeroContaC.getText()));
            Principal.cComun.setSaldo(Double.parseDouble(jTextFieldSaldoInicialC.getText()));

            Principal.cPoupanca.setNome(jTextFieldNomeTitularP.getText());
            Principal.cPoupanca.setNumero(Integer.parseInt(jTextFieldNumeroContaP.getText()));
            Principal.cPoupanca.setSaldo(Double.parseDouble(jTextFieldSaldoInicialP.getText()));
            Principal.cPoupanca.setTaxa(Integer.parseInt(jTextFieldTaxaReajusteP.getText()));

            Principal.cEspecial.setNome(jTextFieldNomeTitularE.getText());
            Principal.cEspecial.setNumero(Integer.parseInt(jTextFieldNumeroContaE.getText()));
            Principal.cEspecial.setSaldo(Double.parseDouble(jTextFieldSaldoInicialE.getText()));
            Principal.cEspecial.setLimite(Integer.parseInt(jTextFieldLimiteE.getText()));
            Principal.cEspecial.setMulta(Integer.parseInt(jTextFieldMultaE.getText()));
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Dados Inválidos");
            System.exit(0);
        }
        telaCadastro.this.dispose();
        Principal principal = new Principal();
        principal.setVisible(true);

    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldMultaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMultaEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMultaEActionPerformed

    private void jTextFieldLimiteEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLimiteEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLimiteEActionPerformed

    private void jTextFieldSaldoInicialEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoInicialEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaldoInicialEActionPerformed

    private void jTextFieldNumeroContaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroContaEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroContaEActionPerformed

    private void jTextFieldNomeTitularEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeTitularEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeTitularEActionPerformed

    private void jTextFieldTaxaReajustePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTaxaReajustePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTaxaReajustePActionPerformed

    private void jTextFieldSaldoInicialPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoInicialPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaldoInicialPActionPerformed

    private void jTextFieldNumeroContaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroContaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroContaPActionPerformed

    private void jTextFieldNomeTitularPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeTitularPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeTitularPActionPerformed

    private void jTextFieldSaldoInicialCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoInicialCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaldoInicialCActionPerformed

    private void jTextFieldNumeroContaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroContaCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroContaCActionPerformed

    private void jTextFieldNomeTitularCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeTitularCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeTitularCActionPerformed
    
    public static void main(String args[]) {
        
        JOptionPane.showMessageDialog(null, "Seja Bem Vindo!");
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Mac OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadastro().setVisible(true);
            }
        });
    }

  
    
        
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelCadastro1;
    private javax.swing.JLabel jLabelCadastro2;
    private javax.swing.JLabel jLabelCadastro3;
    private javax.swing.JLabel jLabelLimiteE;
    private javax.swing.JLabel jLabelMultaE;
    private javax.swing.JLabel jLabelNomeTitularC;
    private javax.swing.JLabel jLabelNomeTitularE;
    private javax.swing.JLabel jLabelNomeTitularP;
    private javax.swing.JLabel jLabelNumeroContaC;
    private javax.swing.JLabel jLabelNumeroContaE;
    private javax.swing.JLabel jLabelNumeroContaP;
    private javax.swing.JLabel jLabelSaldoInicialC;
    private javax.swing.JLabel jLabelSaldoInicialE;
    private javax.swing.JLabel jLabelSaldoInicialP;
    private javax.swing.JLabel jLabelTaxaReajusteP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldLimiteE;
    private javax.swing.JTextField jTextFieldMultaE;
    private javax.swing.JTextField jTextFieldNomeTitularC;
    private javax.swing.JTextField jTextFieldNomeTitularE;
    private javax.swing.JTextField jTextFieldNomeTitularP;
    private javax.swing.JTextField jTextFieldNumeroContaC;
    private javax.swing.JTextField jTextFieldNumeroContaE;
    private javax.swing.JTextField jTextFieldNumeroContaP;
    private javax.swing.JTextField jTextFieldSaldoInicialC;
    private javax.swing.JTextField jTextFieldSaldoInicialE;
    private javax.swing.JTextField jTextFieldSaldoInicialP;
    private javax.swing.JTextField jTextFieldTaxaReajusteP;
    // End of variables declaration//GEN-END:variables
}
