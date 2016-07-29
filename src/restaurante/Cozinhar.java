/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * Objetivo: Ajudar o cozinheiro a seguir os passos, indicando em qual está.
 * 
 * @author Maria Emanuele e Shirley Roberta
 * @since 10/07/2016
 * @version 1.0
 * 
 */

public class Cozinhar {
    private String ingredientes;

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public int cozinhar (String[] ingrediente){
        ingrediente = this.ingredientes.split(",");
        boolean misturar = false;
        int forma = 1;
        for (int i = 0; i < ingrediente.length; i++){
            misturar = true;
            //mistura todos os ingredientes dentro da forma
            if (misturar == true){
                forma += 1;
                misturar = false;
                //adiciona 1 item na forma, aumentando um passo e para de misturar
            }
        }
        return forma;
        //retorna a quantidade de passos da receita.
    }
    
}
