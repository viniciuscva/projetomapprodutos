/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.ppm.model.bean.factory;

import br.com.map.ppm.model.bean.Produto;
import br.com.map.ppm.model.dao.EspecificacaoDao;
import br.com.map.ppm.model.dao.ProdutoDao;
import java.util.Scanner;

/**
 *
 * @author Vinicius_2
 */
public class ProdutoFactory {
    public static Produto criarNovoProduto(){
        Scanner input = new Scanner(System.in);
        Produto prod = new Produto();
        System.out.println("Digite o nome do produto:");
        prod.setNome(input.nextLine());
        System.out.println("Digite o preço do produto:");
        prod.setPreco(Double.parseDouble(input.nextLine()));
        System.out.println("Digite o código da especificação:");
        int codigoEsp = Integer.parseInt(input.nextLine());
        prod.setEspecificacao(new EspecificacaoDao().buscarPorCodigo(codigoEsp));
        if(prod.getEspecificacao()==null)
            System.out.println("Especificação não ficou definida.");
        ProdutoDao prodDao = new ProdutoDao();
        int codigo = prodDao.criar(prod);
        prod.setCodigo(codigo);
        System.out.println("Produto criado no banco de dados. Código:"+codigo);
        return prod;
    }
    
    public static void editarProduto(Produto prod){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o novo nome do produto:");
        prod.setNome(input.nextLine());
        System.out.println("Digite o novo preço do produto:");
        prod.setPreco(Double.parseDouble(input.nextLine()));
        System.out.println("Digite o novo código da especificação:");
        int codigoEsp = Integer.parseInt(input.nextLine());
        prod.setEspecificacao(new EspecificacaoDao().buscarPorCodigo(codigoEsp));
        if(prod.getEspecificacao()==null)
            System.out.println("Especificação não ficou definida.");
        ProdutoDao prodDao = new ProdutoDao();
        prodDao.editarProduto(prod);
    }
}
