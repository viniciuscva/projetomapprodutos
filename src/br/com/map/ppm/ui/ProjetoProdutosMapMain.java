
package br.com.map.ppm.ui;

import br.com.map.ppm.model.bean.Produto;
import br.com.map.ppm.model.bean.factory.EspecificacaoFactory;
import br.com.map.ppm.model.bean.factory.ProdutoFactory;
import br.com.map.ppm.model.dao.ProdutoDao;
import java.util.List;
import java.util.Scanner;


public class ProjetoProdutosMapMain {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Produto> listaProdutos = new ProdutoDao().obterProdutos();
        char opcao;
        
        while(true){
            System.out.println("==============================================");
            System.out.println("1-cadastrar produto");
            System.out.println("2-cadastrar especificação");
            System.out.println("3-listar produtos");
            System.out.println("4-editar produto");
            System.out.println("5-remover produto");
            System.out.println("6-sair");
            System.out.print(" >> ");
            opcao = input.nextLine().charAt(0);
            if(opcao=='1'){
                Produto produto = ProdutoFactory.criarNovoProduto();
                listaProdutos.add(produto);
            }else if(opcao=='2'){
                EspecificacaoFactory.criarNovaEspecificacao();
            }else if(opcao=='3'){
                if(listaProdutos.size()==0){
                    System.out.println("Lista vazia.");
                }
                for(Produto produto: listaProdutos){
                    System.out.println(produto);
                }
            }else if(opcao=='4'){
                System.out.println("Digite o código do produto a  ser editado:");
                int codigo = Integer.parseInt(input.nextLine());
                Produto prod = selecionarProdutoDaListaPeloCodigo(listaProdutos, codigo);
                ProdutoFactory.editarProduto(prod);
            }else if(opcao=='5'){
                System.out.println("Digite o código do produto a ser removido:");
                int codigo = Integer.parseInt(input.nextLine());
                Produto prod = selecionarProdutoDaListaPeloCodigo(listaProdutos, codigo);
                listaProdutos.remove(prod);
                new ProdutoDao().removerProduto(prod);
            }else if(opcao=='6'){
                System.out.println("Encerrando...");
                break;
            }else {
                System.out.println("Opção inválida.");
            }
            
        }
    }
    
    public static Produto selecionarProdutoDaListaPeloCodigo(
            List<Produto> listaProdutos,
            int codigo)
    {
        for(Produto p: listaProdutos){
            if(p.getCodigo()==codigo){
                return p;
            }
        }
        return null;
    }
    
}
