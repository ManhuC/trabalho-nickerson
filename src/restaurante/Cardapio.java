
package restaurante;

/**
 *
 * Objetivo: Construir um cardápio que será especificado pelo cliente o nome da comida,
 * os ingredientes e o preço de cada comida será calculado por quanto foi gasto para
 * fazê-la
 * 
 * @author Maria Emanuele e Shirley Roberta
 * @since 10/07/2016
 * @version 1.0
 * 
 */

public class Cardapio {
    private String nome;
    private double preco;
    private String ingrediente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double precoIngredientes) {
        this.preco = precoIngredientes + (precoIngredientes * 0.2);
        //calcula o valor da comida sendo a soma do preço gasto nela com 20% desse valor.
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    
}
