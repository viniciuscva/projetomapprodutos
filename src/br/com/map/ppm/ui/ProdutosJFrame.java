package br.com.map.ppm.ui;

import br.com.map.ppm.model.bean.Especificacao;
import br.com.map.ppm.model.bean.Produto;
import br.com.map.ppm.model.dao.EspecificacaoDao;
import br.com.map.ppm.model.dao.ProdutoDao;
import br.com.map.ppm.relatorios.RelatorioProdutos;
import br.com.map.ppm.util.MensagensUtil;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class ProdutosJFrame extends javax.swing.JFrame {

    List<Produto> listaProdutos;
    Produto prodSelecionado;

    public ProdutosJFrame() {
        initComponents();
        recarregar();
        preencherStringsNoIdioma();
    }

    public void recarregarComboboxEspecificacoes() {
        comboBoxEspecificacao.removeAllItems();
        List<Especificacao> especificacoes = new EspecificacaoDao().obterEspecificacoes();
        comboBoxEspecificacao.addItem(" ");
        for (Especificacao e : especificacoes) {
            comboBoxEspecificacao.addItem(e.toString());
        }
    }

    public void recarregar() {
        txtFieldCodigo.setText("");
        txtFieldNome.setText("");
        txtFieldPreco.setText("");
        //carregar combobox especificacoes
        recarregarComboboxEspecificacoes();
        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
                    MensagensUtil.getMensagem(MensagensUtil.MSG_TABELA_CODIGO),
                    MensagensUtil.getMensagem(MensagensUtil.MSG_TABELA_NOME),
                    MensagensUtil.getMensagem(MensagensUtil.MSG_TABELA_PRECO),
                    MensagensUtil.getMensagem(MensagensUtil.MSG_TABELA_ESPECIFICACAO)
                }
        ));
        TableModel modeloTabela = jTableProdutos.getModel();
        int numeroLinhas = modeloTabela.getRowCount();
        for (int i = 0; i < numeroLinhas; i++) {
            modeloTabela.setValueAt("", i, 0);
            modeloTabela.setValueAt("", i, 1);
            modeloTabela.setValueAt("", i, 2);
            modeloTabela.setValueAt("", i, 3);
        }

        listaProdutos = new ProdutoDao().obterProdutos();
        for (int i = 0; i < listaProdutos.size(); i++) {
            modeloTabela.setValueAt(listaProdutos.get(i).getCodigo(), i, 0);
            modeloTabela.setValueAt(listaProdutos.get(i).getNome(), i, 1);
            modeloTabela.setValueAt(listaProdutos.get(i).getPreco(), i, 2);
            modeloTabela.setValueAt(listaProdutos.get(i).getEspecificacao().toString(), i, 3);
        }
    }

    public void preencherStringsNoIdioma() {
        labelPrincipal.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_LABEL_PRODUTOS_PRINCIPAL));
        labelCodigo.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_LABEL_PRODUTOS_CODIGO));
        labelNome.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_LABEL_PRODUTOS_NOME));
        labelPreco.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_LABEL_PRODUTOS_PRECO));
        labelEspecificacao.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_LABEL_PRODUTOS_ESPECIFICACAO));
        buttonNovaEspecificacao.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_BUTTON_PRODUTOS_CRIARESPECIFICACAO));
        buttonSalvar.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_BUTTON_PRODUTOS_SALVAR));
        buttonEditar.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_BUTTON_PRODUTOS_EDITAR));
        buttonRemover.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_BUTTON_PRODUTOS_REMOVER));
        menuIdioma.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_MENU_IDIOMA));
        menuRelatorios.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_MENU_RELATORIOS));
        menuItemRelatorioPrecoMaiorQueMil.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_MENUITEM_PRECOMAIORQUEMIL));
        menuItemRelatorioPrecoMenorQueMil.setText(MensagensUtil.getMensagem(MensagensUtil.MSG_MENUITEM_PRECOMENORQUEMIL));
        recarregar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        labelPrincipal = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        labelEspecificacao = new javax.swing.JLabel();
        txtFieldCodigo = new javax.swing.JTextField();
        txtFieldNome = new javax.swing.JTextField();
        txtFieldPreco = new javax.swing.JTextField();
        comboBoxEspecificacao = new javax.swing.JComboBox<>();
        buttonNovaEspecificacao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        buttonSalvar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        barraDeMenu = new javax.swing.JMenuBar();
        menuIdioma = new javax.swing.JMenu();
        menuItemPortuguese = new javax.swing.JMenuItem();
        menuItemEnglish = new javax.swing.JMenuItem();
        menuItemSpanish = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuItemRelatorioPrecoMaiorQueMil = new javax.swing.JMenuItem();
        menuItemRelatorioPrecoMenorQueMil = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPrincipal.setText("Produtos");

        labelCodigo.setText("código");

        labelNome.setText("nome");

        labelPreco.setText("preço");

        labelEspecificacao.setText("especificação");

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

        buttonSalvar.setText("salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonEditar.setText("editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonRemover.setText("remover");
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });

        menuIdioma.setText("Language");

        menuItemPortuguese.setText("Portuguese");
        menuItemPortuguese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPortugueseActionPerformed(evt);
            }
        });
        menuIdioma.add(menuItemPortuguese);

        menuItemEnglish.setText("English");
        menuItemEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEnglishActionPerformed(evt);
            }
        });
        menuIdioma.add(menuItemEnglish);

        menuItemSpanish.setText("Spanish");
        menuItemSpanish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSpanishActionPerformed(evt);
            }
        });
        menuIdioma.add(menuItemSpanish);

        barraDeMenu.add(menuIdioma);

        menuRelatorios.setText("Relatórios");

        menuItemRelatorioPrecoMaiorQueMil.setText("Produtos com preço superior a $1000,00");
        menuItemRelatorioPrecoMaiorQueMil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRelatorioPrecoMaiorQueMilActionPerformed(evt);
            }
        });
        menuRelatorios.add(menuItemRelatorioPrecoMaiorQueMil);

        menuItemRelatorioPrecoMenorQueMil.setText("Produtos com preço inferior a $1000,00");
        menuItemRelatorioPrecoMenorQueMil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRelatorioPrecoMenorQueMilActionPerformed(evt);
            }
        });
        menuRelatorios.add(menuItemRelatorioPrecoMenorQueMil);

        barraDeMenu.add(menuRelatorios);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(labelPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonSalvar)
                            .addComponent(labelNome)
                            .addComponent(labelPreco)
                            .addComponent(labelCodigo)
                            .addComponent(labelEspecificacao))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFieldPreco)
                                    .addComponent(txtFieldNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboBoxEspecificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
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
                .addComponent(labelPrincipal)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(txtFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(txtFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEspecificacao)
                    .addComponent(comboBoxEspecificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNovaEspecificacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonEditar)
                    .addComponent(buttonRemover))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovaEspecificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovaEspecificacaoActionPerformed
        EspecificacaoJFrame e = new EspecificacaoJFrame(this);
        e.setVisible(true);
    }//GEN-LAST:event_buttonNovaEspecificacaoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // TODO add your handling code here:
        if (txtFieldNome.getText().equals("") || txtFieldPreco.getText().equals("")
                || comboBoxEspecificacao.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(
                    this,
                    MensagensUtil.getMensagem(MensagensUtil.MSG_VALIDACAO_CAMPOS_VAZIOS),
                    MensagensUtil.getMensagem(MensagensUtil.MSG_ATENCAO),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        Produto prod = (prodSelecionado == null) ? new Produto() : prodSelecionado;
        prod.setNome(txtFieldNome.getText());
        double preco = -1;
        try {
            preco = Double.parseDouble(txtFieldPreco.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, MensagensUtil.getMensagem(MensagensUtil.MSG_PRECO_INVALIDO));
            return;
        }
        prod.setPreco(preco);
        String especificacaoString = (String) comboBoxEspecificacao.getSelectedItem();
        String[] array = especificacaoString.split(" | ");
        Especificacao esp = new Especificacao();
        esp.setCodigo(Integer.parseInt(array[0]));
        esp.setFabricante(array[1]);
        esp.setCor(array[2]);
        esp.setSistema(array[3]);
        esp.setDetalhes(array[4]);
        prod.setEspecificacao(esp);
        if (prodSelecionado == null) {

            try {
                new ProdutoDao().criar(prod);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        MensagensUtil.getMensagem(MensagensUtil.MSG_ERRO_ENTRADAS_INVALIDAS));
                return;
            }
        } else {
            try {
                new ProdutoDao().editarProduto(prod);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        MensagensUtil.getMensagem(MensagensUtil.MSG_ERRO_ENTRADAS_INVALIDAS));
                return;
            }
            prodSelecionado = null;
        }
        recarregar();

    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
        // TODO add your handling code here:
        TableModel modeloTabela = jTableProdutos.getModel();
        int linhaSelecionada = jTableProdutos.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, MensagensUtil.getMensagem(MensagensUtil.MSG_ERRO_SELECIONAR_PRODUTO));
            return;
        }
        int codigo = (Integer) modeloTabela.getValueAt(linhaSelecionada, 0);
        //System.out.println("olha eu");
        new ProdutoDao().removerPorCodigo(codigo);
        recarregar();
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        TableModel modeloTabea = jTableProdutos.getModel();
        try {
            int row = jTableProdutos.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, MensagensUtil.getMensagem(MensagensUtil.MSG_ERRO_SELECIONAR_PRODUTO));
                return;
            }
            prodSelecionado = listaProdutos.get(row);
            txtFieldCodigo.setText(prodSelecionado.getCodigo() + "");
            txtFieldNome.setText(prodSelecionado.getNome());
            txtFieldPreco.setText(prodSelecionado.getPreco() + "");
            comboBoxEspecificacao.setSelectedItem(prodSelecionado.getEspecificacao().toString());

        } catch (NullPointerException e) {
            //JOptionPane.showMessageDialog(this, "Erro" + e.getMessage());
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void menuItemPortugueseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPortugueseActionPerformed
        MensagensUtil.setLocale(MensagensUtil.PT_BR);
        preencherStringsNoIdioma();
    }//GEN-LAST:event_menuItemPortugueseActionPerformed

    private void menuItemEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEnglishActionPerformed
        MensagensUtil.setLocale(MensagensUtil.EN_US);
        preencherStringsNoIdioma();
    }//GEN-LAST:event_menuItemEnglishActionPerformed

    private void menuItemSpanishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSpanishActionPerformed
        MensagensUtil.setLocale(MensagensUtil.ES_ES);
        preencherStringsNoIdioma();
    }//GEN-LAST:event_menuItemSpanishActionPerformed

    private void menuItemRelatorioPrecoMaiorQueMilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRelatorioPrecoMaiorQueMilActionPerformed
        List<Produto> produtosDoRelatorio = selecionarProdutosComPrecoSuperiorAMil();
        try {
            new RelatorioProdutos().imprimirProdutosComPrecoMaiorQueMil(produtosDoRelatorio);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_menuItemRelatorioPrecoMaiorQueMilActionPerformed

    private void menuItemRelatorioPrecoMenorQueMilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRelatorioPrecoMenorQueMilActionPerformed
        List<Produto> produtosDoRelatorio = selecionarProdutosComPrecoInferiorAMil();
        try {
            new RelatorioProdutos().imprimirProdutosComPrecoMenorQueMil(produtosDoRelatorio);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_menuItemRelatorioPrecoMenorQueMilActionPerformed

    private List<Produto> selecionarProdutosComPrecoSuperiorAMil(){
        List<Produto> selecionados = new ArrayList<>();
        for(Produto prod: listaProdutos){
            if(prod.getPreco()>=1000){
                selecionados.add(prod);
            }
        }
        return selecionados;
    }
    
    private List<Produto> selecionarProdutosComPrecoInferiorAMil(){
        List<Produto> selecionados = new ArrayList<>();
        for(Produto prod: listaProdutos){
            if(prod.getPreco()<1000){
                selecionados.add(prod);
            }
        }
        return selecionados;
    }
    
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
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonNovaEspecificacao;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboBoxEspecificacao;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelEspecificacao;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelPrincipal;
    private javax.swing.JMenu menuIdioma;
    private javax.swing.JMenuItem menuItemEnglish;
    private javax.swing.JMenuItem menuItemPortuguese;
    private javax.swing.JMenuItem menuItemRelatorioPrecoMaiorQueMil;
    private javax.swing.JMenuItem menuItemRelatorioPrecoMenorQueMil;
    private javax.swing.JMenuItem menuItemSpanish;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JTextField txtFieldCodigo;
    private javax.swing.JTextField txtFieldNome;
    private javax.swing.JTextField txtFieldPreco;
    // End of variables declaration//GEN-END:variables
}
