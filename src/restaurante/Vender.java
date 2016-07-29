/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * Objetivo: Controlar a venda de pratos para determinado cliente
 * 
 * @author Maria Emanuele e Shirley Roberta
 * @since 10/07/2016
 * @version 1.0
 * 
 */

public class Vender {
    private String cliente;
    private double preco;
    private String prato;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }
    
    public String vender (){
        String compra;
        compra = cliente + "Comprou prato " + prato + " por R$ " + preco;
        return cliente;
        //pega o cliente, o prato que ele comprou e o preço desse prato.
    }
    
}
