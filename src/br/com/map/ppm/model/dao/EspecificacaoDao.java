/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.ppm.model.dao;

import br.com.map.ppm.model.bean.Especificacao;
import br.com.map.ppm.model.connectionfactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vinicius_2
 */
public class EspecificacaoDao {
    public int criar(Especificacao esp){
        Connection conexao = ConnectionFactory.getConnection();
        int codigo = -1;
        try {
            PreparedStatement pst = conexao.
                    prepareStatement("insert into tbespecificacao"
                    + "(fabricante,cor,sistema,detalhes) values (?,?,?,?)", 
                            PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, esp.getFabricante());
            pst.setString(2, esp.getCor());
            pst.setString(3, esp.getSistema());
            pst.setString(4, esp.getDetalhes());
            pst.executeUpdate();
            ResultSet rs = pst.getGeneratedKeys();
            if(rs.next()){
                codigo = rs.getInt(1);
            }
            pst.close();
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao persistir a especificação.");
        } finally{
            return codigo;
        }
    }
    
    public Especificacao buscarPorCodigo(int codigo){
        Especificacao esp = null;
        Connection conexao = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = conexao.prepareStatement
                    ("select * from tbespecificacao where codigo=?");
            pst.setInt(1, codigo);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                esp = new Especificacao();
                esp.setCodigo(rs.getInt("codigo"));
                esp.setFabricante(rs.getString("fabricante"));
                esp.setCor(rs.getString("cor"));
                esp.setSistema(rs.getString("sistema"));
                esp.setDetalhes(rs.getString("detalhes"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro na busca por código.");
        }
        return esp;
    }
}
