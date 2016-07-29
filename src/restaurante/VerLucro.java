/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * Objetivo: Verificar o lucro obtido no dia.
 * 
 * @author Maria Emanuele e Shirley Roberta
 * @since 10/07/2016
 * @version 1.0
 * 
 */

public class VerLucro {
    private double dinheiroGanho;
    private double dinheiroGasto;
    private double lucro;

    public double getLucro() {
        return lucro;
    }

    public void setLucro() {
        this.lucro = this.dinheiroGanho - this.dinheiroGasto;
        //calcula o lucro do dia ou da semana sendo o resultado o dinheiro ganho - o dinheiro gasto
    }

    public double getDinheiroGanho() {
        return dinheiroGanho;
    }

    public void setDinheiroGanho(double dinheiroGanho) {
        this.dinheiroGanho = dinheiroGanho;
    }

    public double getDinheiroGasto() {
        return dinheiroGasto;
    }

    public void setDinheiroGasto(double dinheiroGasto) {
        this.dinheiroGasto = dinheiroGasto;
    }

}
