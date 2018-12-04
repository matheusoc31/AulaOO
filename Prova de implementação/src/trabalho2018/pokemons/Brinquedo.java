/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2018.pokemons;

import trabalho2018.outras.Ataque;

/**
 *
 * @author ice
 */
public class Brinquedo extends Pokemon{
    
    private String som;
    private int preco;
    
    
    public Brinquedo(String nome, int HP, int ataque, int defesa, Ataque atq1, Ataque atq2, String som,int preco)
    {
        super(nome, HP, ataque, defesa, atq1, atq2);
        this.som = som;
        this.preco = preco;
    }

    public String getSom() {
        return som;
    }

    public int getPreco() {
        return preco;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
    
    
}
