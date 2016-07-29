/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * Objetivo: Conferir o valor total de determinado ingrediente em determinada compra 
 * do cliente
 * 
 * @author Maria Emanuele e Shirley Roberta
 * @since 10/07/2016
 * @version 1.0
 * 
 */
public class ComprarIngrediente {
    private int quantidade;
    private double preco;
    private double valorTotal;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal() {
        this.valorTotal = this.quantidade * this.preco;
        //calcula o valor total da compra sendo o preço de determinada coisa vezes a quantidade
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
