package br.com.map.ppm.ui;

import br.com.map.ppm.model.bean.Especificacao;
import br.com.map.ppm.model.dao.EspecificacaoDao;
import br.com.map.ppm.util.MensagensUtil;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EspecificacaoJFrame extends javax.swing.JFrame {

    ProdutosJFrame parent;

    public EspecificacaoJFrame(ProdutosJFrame parent) {
        this.parent = parent;
        parent.disable();
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        preencherStringsNoIdioma();
    }

    public void preencherStringsNoIdioma() {
        labelPrincipal.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_LABEL_ESPECIFICACAO_PRINCIPAL));
        labelCodigo.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_LABEL_ESPECIFICACAO_CODIGO));
        labelFabricante.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_LABEL_ESPECIFICACAO_FABRICANTE));
        labelCor.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_LABEL_ESPECIFICACAO_COR));
        labelSistema.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_LABEL_ESPECIFICACAO_SISTEMA));
        labelDetalhes.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_LABEL_ESPECIFICACAO_DETALHES));
        buttonConfirmar.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_BUTTON_ESPECIFICACAO_CONFIRMAR));
        buttonCancelar.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_BUTTON_ESPECIFICACAO_CANCELAR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPrincipal = new javax.swing.JLabel();
        labelFabricante = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        labelSistema = new javax.swing.JLabel();
        labelDetalhes = new javax.swing.JLabel();
        txtFieldCodigo = new javax.swing.JTextField();
        txtFieldFabricante = new javax.swing.JTextField();
        txtFieldCor = new javax.swing.JTextField();
        txtFieldSistema = new javax.swing.JTextField();
        txtFieldDetalhes = new javax.swing.JTextField();
        buttonConfirmar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelPrincipal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelPrincipal.setText("Especificação");

        labelFabricante.setText("fabricante");

        labelCodigo.setText("código");

        labelCor.setText("cor");

        labelSistema.setText("sistema");

        labelDetalhes.setText("detalhes");

        txtFieldCodigo.setEditable(false);

        buttonConfirmar.setText("confirmar");
        buttonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCodigo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelFabricante)
                                .addComponent(labelCor, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelSistema, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelDetalhes, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(buttonConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPrincipal)
                        .addGap(27, 27, 27)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPrincipal)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(txtFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFabricante)
                    .addComponent(txtFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCor)
                    .addComponent(txtFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSistema)
                    .addComponent(txtFieldSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDetalhes)
                    .addComponent(txtFieldDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConfirmar)
                    .addComponent(buttonCancelar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmarActionPerformed
        if (txtFieldCor.getText().equals("") || txtFieldDetalhes.getText().equals("")
                || txtFieldFabricante.getText().equals("") || txtFieldSistema.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    MensagensUtil.getMensagem(MensagensUtil.MSG_VALIDACAO_CAMPOS_VAZIOS),
                    MensagensUtil.getMensagem(MensagensUtil.MSG_ATENCAO),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        Especificacao esp = new Especificacao();
        esp.setFabricante(txtFieldFabricante.getText());
        esp.setCor(txtFieldCor.getText());
        esp.setSistema(txtFieldSistema.getText());
        esp.setDetalhes(txtFieldDetalhes.getText());

        try {
            new EspecificacaoDao().criar(esp);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                    MensagensUtil.getMensagem(MensagensUtil.MSG_ERRO_ENTRADAS_INVALIDAS));
            return;
        }
        parent.recarregarComboboxEspecificacoes();
        parent.enable();
        this.dispose();
    }//GEN-LAST:event_buttonConfirmarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        parent.enable();
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    // public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
 /*      try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EspecificacaoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EspecificacaoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EspecificacaoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EspecificacaoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
    //</editor-fold>

    /* Create and display the form */
    //   java.awt.EventQueue.invokeLater(new Runnable() {
    //        public void run() {
    //             new EspecificacaoJFrame().setVisible(true);
    //          }
    //      });*/
    //   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonConfirmar;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelDetalhes;
    private javax.swing.JLabel labelFabricante;
    private javax.swing.JLabel labelPrincipal;
    private javax.swing.JLabel labelSistema;
    private javax.swing.JTextField txtFieldCodigo;
    private javax.swing.JTextField txtFieldCor;
    private javax.swing.JTextField txtFieldDetalhes;
    private javax.swing.JTextField txtFieldFabricante;
    private javax.swing.JTextField txtFieldSistema;
    // End of variables declaration//GEN-END:variables
}
