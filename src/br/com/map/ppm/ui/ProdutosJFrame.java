package br.com.map.ppm.ui;

import br.com.map.ppm.model.bean.Especificacao;
import br.com.map.ppm.model.bean.Produto;
import br.com.map.ppm.model.dao.EspecificacaoDao;
import br.com.map.ppm.model.dao.ProdutoDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class ProdutosJFrame extends javax.swing.JFrame {

    public ProdutosJFrame() {
        initComponents();
        recarregar();
    }

    public void recarregar() {
        txtFieldCodigo.setText("");
        txtFieldNome.setText("");
        txtFieldPreco.setText("");
        comboBoxEspecificacao.removeAllItems();
        List<Especificacao> especificacoes = new EspecificacaoDao().obterEspecificacoes();
        comboBoxEspecificacao.addItem(" ");
        for(Especificacao e: especificacoes){
            comboBoxEspecificacao.addItem(e.toString());
        }
        TableModel modeloTabela = jTableProdutos.getModel();
        int numeroLinhas = modeloTabela.getRowCount();
        for(int i=0; i< numeroLinhas; i++){
            modeloTabela.setValueAt("", i, 0);
            modeloTabela.setValueAt("", i, 1);
            modeloTabela.setValueAt("", i, 2);
            modeloTabela.setValueAt("", i, 3);
        }
        
        List<Produto> lista = new ProdutoDao().obterProdutos();
        for (int i = 0; i < lista.size(); i++) {
            modeloTabela.setValueAt(lista.get(i).getCodigo(), i, 0);
            modeloTabela.setValueAt(lista.get(i).getNome(), i, 1);
            modeloTabela.setValueAt(lista.get(i).getPreco(), i, 2);
            modeloTabela.setValueAt(lista.get(i).getEspecificacao().toString(), i, 3);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFieldCodigo = new javax.swing.JTextField();
        txtFieldNome = new javax.swing.JTextField();
        txtFieldPreco = new javax.swing.JTextField();
        comboBoxEspecificacao = new javax.swing.JComboBox<>();
        buttonNovaEspecificacao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buttonCadastrar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Produtos");

        jLabel2.setText("código");

        jLabel3.setText("nome");

        jLabel4.setText("preço");

        jLabel5.setText("especificação");

        txtFieldCodigo.setEditable(false);

        comboBoxEspecificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonNovaEspecificacao.setText("nova especificação");
        buttonNovaEspecificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovaEspecificacaoActionPerformed(evt);
            }
        });

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "código", "nome", "preço", "especificação"
            }
        ));
        jScrollPane1.setViewportView(jTableProdutos);

        jLabel6.setText("buscar:");

        buttonCadastrar.setText("cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        buttonEditar.setText("editar");

        buttonRemover.setText("remover");
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonCadastrar)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4)
                                    .addComponent(txtFieldPreco)
                                    .addComponent(txtFieldNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboBoxEspecificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                        .addComponent(buttonNovaEspecificacao))
                                    .addComponent(txtFieldCodigo))
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonRemover)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboBoxEspecificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNovaEspecificacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrar)
                    .addComponent(buttonEditar)
                    .addComponent(buttonRemover))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovaEspecificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovaEspecificacaoActionPerformed
        EspecificacaoJFrame e = new EspecificacaoJFrame(this);
        e.setVisible(true);
    }//GEN-LAST:event_buttonNovaEspecificacaoActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        // TODO add your handling code here:
        if(txtFieldNome.getText().equals("")||txtFieldPreco.getText().equals("")||
                comboBoxEspecificacao.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Campos vazios", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Produto prod = new Produto();
        prod.setNome(txtFieldNome.getText());
        prod.setPreco(Double.parseDouble(txtFieldPreco.getText()));
        String especificacaoString = (String)comboBoxEspecificacao.getSelectedItem();
        String[] array = especificacaoString.split(" | ");
        Especificacao esp = new Especificacao();
        esp.setCodigo(Integer.parseInt(array[0]));
        esp.setFabricante(array[1]);
        esp.setCor(array[2]);
        esp.setSistema(array[3]);
        esp.setDetalhes(array[4]);
        prod.setEspecificacao(esp);
        new ProdutoDao().criar(prod);
        recarregar();
        
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
        // TODO add your handling code here:
        TableModel modeloTabela = jTableProdutos.getModel();
        int linhaSelecionada = jTableProdutos.getSelectedRow();
        int codigo = (Integer)modeloTabela.getValueAt(linhaSelecionada, 0);
        System.out.println("olha eu");
        new ProdutoDao().removerPorCodigo(codigo);
        recarregar();
    }//GEN-LAST:event_buttonRemoverActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ProdutosJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutosJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutosJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutosJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutosJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonNovaEspecificacao;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JComboBox<String> comboBoxEspecificacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtFieldCodigo;
    private javax.swing.JTextField txtFieldNome;
    private javax.swing.JTextField txtFieldPreco;
    // End of variables declaration//GEN-END:variables
}
