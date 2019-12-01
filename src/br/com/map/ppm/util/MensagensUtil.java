/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.ppm.util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Allyson
 */
public class MensagensUtil {
    
    public static final Locale PT_BR = new Locale("pt", "BR");
    public static final Locale EN_US = new Locale("en", "US");
    public static final Locale ES_ES = new Locale("es", "ES");
    
    private static ResourceBundle resource = ResourceBundle.getBundle("br/com/map/ppm/properties/mensagens", PT_BR);
    
    //mensagens validação
    public static final String MSG_VALIDACAO_CAMPOS_VAZIOS = "msg.validacao.camposvazios";
    public static final String MSG_ERRO_SELECIONAR_PRODUTO = "msg.erro.selecionar";
    public static final String MSG_ATENCAO = "msg.atencao";
    public static final String MSG_PRECO_INVALIDO = "msg.preco.invalido";
    public static final String MSG_ERRO_ENTRADAS_INVALIDAS = "msg.erro.entradas.invalidas";
    
    //mensagens banco de dados
    public static final String MSG_ERRO_CONEXAO_BANCO = "msg.erro.conexaobanco";
    public static final String MSG_ERRO_DAO_CRIAR_ESPECIFICACAO = "msg.erro.dao.criar.especificacao";
    public static final String MSG_ERRO_DAO_CRIAR_PRODUTO = "msg.erro.dao.criar.produto";
    public static final String MSG_ERRO_DAO_BUSCAR_ESPECIFICACAO = "msg.erro.dao.buscar.especificacao";
    public static final String MSG_ERRO_DAO_BUSCAR_PRODUTO = "msg.erro.dao.buscar.produto";
    public static final String MSG_ERRO_DAO_REMOVER_PRODUTO = "msg.erro.dao.remover.produto";
    public static final String MSG_ERRO_DAO_REMOVER_ESPECIFICACAO = "msg.erro.dao.remover.especificacao";

    //mensagens botões, labels e outros componentes gráficos
    public static final String MSG_LABEL_ESPECIFICACAO_PRINCIPAL = "msg.label.especificacao.principal";
    public static final String MSG_LABEL_ESPECIFICACAO_CODIGO = "msg.label.especificacao.codigo";
    public static final String MSG_LABEL_ESPECIFICACAO_FABRICANTE = "msg.label.especificacao.fabricante";
    public static final String MSG_LABEL_ESPECIFICACAO_COR = "msg.label.especificacao.cor";
    public static final String MSG_LABEL_ESPECIFICACAO_SISTEMA = "msg.label.especificacao.sistema";
    public static final String MSG_LABEL_ESPECIFICACAO_DETALHES = "msg.label.especificacao.detalhes";
    public static final String MSG_BUTTON_ESPECIFICACAO_CONFIRMAR = "msg.button.especificacao.confirmar";
    public static final String MSG_BUTTON_ESPECIFICACAO_CANCELAR = "msg.button.especificacao.cancelar";
    public static final String MSG_LABEL_PRODUTOS_PRINCIPAL = "msg.label.produtos.principal";
    public static final String MSG_LABEL_PRODUTOS_CODIGO = "msg.label.produtos.codigo";
    public static final String MSG_LABEL_PRODUTOS_NOME = "msg.label.produtos.nome";
    public static final String MSG_LABEL_PRODUTOS_PRECO = "msg.label.produtos.preco";
    public static final String MSG_LABEL_PRODUTOS_ESPECIFICACAO = "msg.label.produtos.especificacao";
    public static final String MSG_BUTTON_PRODUTOS_CRIARESPECIFICACAO = "msg.button.produtos.novaespecificacao";
    public static final String MSG_BUTTON_PRODUTOS_SALVAR = "msg.button.produtos.salvar";
    public static final String MSG_BUTTON_PRODUTOS_EDITAR = "msg.button.produtos.editar";
    public static final String MSG_BUTTON_PRODUTOS_REMOVER = "msg.button.produtos.remover";
    public static final String MSG_TABELA_CODIGO = "msg.tabela.codigo";
    public static final String MSG_TABELA_NOME = "msg.tabela.nome";
    public static final String MSG_TABELA_PRECO = "msg.tabela.preco";
    public static final String MSG_TABELA_ESPECIFICACAO = "msg.tabela.especificacao";
    
    
    public static String getMensagem(String key){
        return resource.getString(key);
    }
    
    public static void setLocale(Locale local){
        resource = ResourceBundle.getBundle("br/com/map/ppm/properties/mensagens", local);
    }
}
