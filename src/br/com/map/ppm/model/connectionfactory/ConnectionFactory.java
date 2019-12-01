/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.ppm.model.connectionfactory;

import br.com.map.ppm.util.ConfUtil;
import br.com.map.ppm.util.MensagensUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Allyson
 */
public class ConnectionFactory {
    
   // private static final String URL = "jdbc:postgresql://localhost:5432/projetoprodutos";
    //private static final String USUARIO = "postgres";
   // private static final String SENHA = "admin";
    
    public static Connection getConnection(){
       /* try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
            return null;
        }*/
        try {
            return DriverManager.getConnection(
                    ConfUtil.getConf(ConfUtil.CONF_JDBC_URL), 
                    ConfUtil.getConf(ConfUtil.CONF_JDBC_USUARIO), 
                    ConfUtil.getConf(ConfUtil.CONF_JDBC_SENHA));
            
        } catch (SQLException ex) {
           // System.out.println("Erro: " + ex.getMessage());
            System.out.println(MensagensUtil.getMensagem(MensagensUtil.MSG_ERRO_CONEXAO_BANCO));
            return null;
        }
    }
}
