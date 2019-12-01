/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.ppm.util;

import java.util.ResourceBundle;

/**
 *
 * @author Allyson
 */
public class ConfUtil {
    //pega o arquivo properties
    private static final ResourceBundle bundle = ResourceBundle.getBundle("br/com/map/ppm/properties/conf");

    //define os nomes das constantes disponíveis
    public static final String CONF_JDBC_URL = "conf.jdbc.url";
    public static final String CONF_JDBC_USUARIO = "conf.jdbc.usuario";
    public static final String CONF_JDBC_SENHA = "conf.jdbc.senha";
    
    //metodo para obter a mensagem
    public static String getConf(String key){
        return bundle.getString(key);
    }
}
