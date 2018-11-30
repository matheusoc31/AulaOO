/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2018.pokemons;

import trabalho2018.outras.Ataque;

/**
 * Classe para objetos do tipo Pokemon onde serão contidos valores e metodos
 * para o mesmo. Objetos dessa classe passam a ter o atributo Fogo.
 *
 * @author Matheus de Oliveira Carvalho
 */
public class Fogo extends Pokemon {

    public Fogo(String nome, int HP, int ataque, int defesa, Ataque atq1, Ataque atq2) {
        super(nome, HP, ataque, defesa, atq1, atq2);
    }

    /**
     * Metodo para calcular quanto de dano um ataque causou, usando como base o
     * ataque padrão do pokemon que está atacando + o ataque especial escolhido
     * pelo treinador - a defesa padrão do pokemon que esta sendo atacado.
     * Depois ocorre um ajuste de *1,4 se ocorre vantagem de atributos ou de
     * *0,7 se ocorre desvantagem.
     *
     * @param p Pokemon- Pokemon que esta sendo atacado.
     * @param atckAdd int- Ataque adicional calculado atraves do ataque especial
     * escolhido.
     * @return double-Valor do dano sofrido.
     */
    @Override
    public double ataque(Pokemon p, int atckAdd) {
        int AT = ataque + atckAdd;
        double dano = AT - p.getDefesa();

        if (dano > 0) {
            if ((p instanceof Fogo) || (p instanceof Grama)) {
                return dano * (1.4);
            } else {
                if ((p instanceof Terrestre) || (p instanceof Agua) || (p instanceof Pedra)) {
                    return dano * (0.6);
                } else {
                    return dano;
                }
            }
        } else {
            return 0;
        }
    }
}
