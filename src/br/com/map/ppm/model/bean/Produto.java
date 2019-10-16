/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.ppm.model.bean;

/**
 *
 * @author Vinicius_2
 */
public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private Especificacao especificacao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Especificacao getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(Especificacao especificacao) {
        this.especificacao = especificacao;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{\n código:").append(codigo)
                .append(",\n nome:").append(nome)
                .append(",\n preço:").append(preco)
                .append(",\n especificação:").append(especificacao)
                .append("\n}");
        return sb.toString();
    }  
    
    @Override
    public boolean equals(Object o){
        Produto prod2 = (Produto)o;
        try{
            return this.nome.equals(prod2.getNome()) &&
                    this.preco == prod2.getPreco() &&
                    this.especificacao.getCodigo() == prod2.
                            getEspecificacao().getCodigo();
        }catch(Exception e){
            return false;
        }
    }
}
