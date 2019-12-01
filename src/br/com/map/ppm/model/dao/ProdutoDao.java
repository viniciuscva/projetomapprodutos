/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.ppm.model.dao;

import br.com.map.ppm.model.bean.Produto;
import br.com.map.ppm.model.connectionfactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinicius_2
 */
public class ProdutoDao {
    public int criar(Produto prod) throws SQLException{
        Connection conexao = ConnectionFactory.getConnection();
        int codigo = -1;
        try{
            PreparedStatement pst = conexao.prepareStatement("insert into "
                    + "tbproduto(nome,preco,especificacao) values (?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, prod.getNome());
            pst.setDouble(2, prod.getPreco());
            pst.setInt(3, prod.getEspecificacao().getCodigo());
            pst.executeUpdate();
            ResultSet rs = pst.getGeneratedKeys();
            if(rs.next()){
                codigo = rs.getInt(1);
            }
        } catch(SQLException e){
            throw new SQLException("Erro ao persistir produto.");
            //System.out.println("Erro ao persistir o produto.");
        } 
        return codigo;
    }
    
    public List<Produto> obterProdutos(){
        List<Produto> listaProdutos = new ArrayList<>();
        Connection conexao = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = conexao.
                    prepareStatement("select * from tbproduto");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Produto prod = new Produto();
                prod.setCodigo(rs.getInt("codigo"));
                prod.setNome(rs.getString("nome"));
                prod.setPreco(rs.getDouble("preco"));
                prod.setEspecificacao(new EspecificacaoDao().
                        buscarPorCodigo(rs.getInt("especificacao")));
                listaProdutos.add(prod);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar lista de produtos no banco de dados.");
        }
        return listaProdutos;
    }
    
    public void editarProduto(Produto prod) throws SQLException{
        //seta os dados de prod em cima da linha do banco de dados que possui
        //o código igual ao código de prod
        Connection conexao = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = conexao.prepareStatement("update tbproduto "
                    + "set nome=?, preco=?, especificacao=? where codigo=?");
            pst.setString(1, prod.getNome());
            pst.setDouble(2, prod.getPreco());
            pst.setInt(3, prod.getEspecificacao().getCodigo());
            pst.setInt(4, prod.getCodigo());
            pst.executeUpdate();
            System.out.println("Produto editado com sucesso.");
        } catch (SQLException ex) {
            throw new SQLException("Erro ao persistir.");
        }
    }
    
    public void removerProduto(Produto prod){
        Connection conexao = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = conexao.prepareStatement
                        ("delete from tbproduto where codigo=?");
            pst.setInt(1, prod.getCodigo());
            pst.executeUpdate();
            PreparedStatement pst2 = conexao.prepareStatement
                    ("delete from tbespecificacao where codigo=?");
            pst2.setInt(1, prod.getEspecificacao().getCodigo());
            pst2.executeUpdate();
            System.out.println("OK.");
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar produto do banco de dados.");
        }
    }
    
    public void removerPorCodigo(int codigo){
        Connection conexao = ConnectionFactory.getConnection();
        int codigoEspecificacao = -1;
        try {
            PreparedStatement pst = conexao.prepareStatement
                        ("select especificacao from tbproduto where codigo=?");
            pst.setInt(1, codigo);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                codigoEspecificacao = rs.getInt("especificacao");
            }
            PreparedStatement pst2 = conexao.prepareStatement
                    ("delete from tbproduto where codigo=?");
            pst2.setInt(1, codigo);
            pst2.executeUpdate();
            PreparedStatement pst3 = conexao.prepareStatement
                    ("delete from tbespecificacao where codigo=?");
            pst3.setInt(1, codigoEspecificacao);
            pst3.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar produto do banco de dados.");
        }
    }
    
    public Produto consultarProduto(int codigo){
        Connection conexao = ConnectionFactory.getConnection();
        Produto produto = new Produto();
        try {
            PreparedStatement pst = conexao.prepareStatement("select * from"
                    + " tbproduto where codigo=?");
            pst.setInt(1, codigo);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                produto.setCodigo(rs.getInt("codigo"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setEspecificacao(new EspecificacaoDao().
                        buscarPorCodigo(rs.getInt("especificacao")));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar produto por código no banco de dados.");
        }
        return produto;
    }
}
