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
    
    private static ResourceBundle resource = ResourceBundle.getBundle("mensagens", PT_BR);
    

    public static final String MSG_VALIDACAO_CAMPOS_VAZIOS = "msg.validacao.camposvazios";
    
    public static final String MSG_ERRO_CONEXAO_BANCO = "msg.erro.conexaobanco";
    public static final String MSG_ERRO_DAO_CRIAR_ESPECIFICACAO = "msg.erro.dao.criar.especificacao";
    public static final String MSG_ERRO_DAO_CRIAR_PRODUTO = "msg.erro.dao.criar.produto";
    public static final String MSG_ERRO_DAO_BUSCAR_ESPECIFICACAO = "msg.erro.dao.buscar.especificacao";
    public static final String MSG_ERRO_DAO_BUSCAR_PRODUTO = "msg.erro.dao.buscar.produto";
    public static final String MSG_ERRO_DAO_REMOVER_PRODUTO = "msg.erro.dao.remover.produto";
    public static final String MSG_ERRO_DAO_REMOVER_ESPECIFICACAO = "msg.erro.dao.remover.especificacao";

    public static final String MSG_ERRO_SELECIONAR = "msg.erro.selecionar";
    public static final String MSG_ERRO_CONSULTAR = "msg.erro.consultar ";
    public static final String MSG_LABEL_NOME  = "msg.label.nome";
    public static final String MSG_BUTTON_SALVAR = "msg.button.salvar";
    public static final String MSG_BUTTON_CANCELAR = "msg.button.cancelar";
    public static final String MSG_BUTTON_NOVO = "msg.button.novo";
    public static final String MSG_TABELA_CODIGO = "msg.tabela.codigo";
    public static final String MSG_TABELA_NOME = "msg.tabela.nome";
    public static final String MSG_TABELA_EMAIL = "msg.tabela.email";
    
    public static String getMensagem(String key){
        return resource.getString(key);
    }
    
    public static void setLocale(Locale local){
        resource = ResourceBundle.getBundle("mensagens", local);
    }
}
