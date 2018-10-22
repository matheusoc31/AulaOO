/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2018.pokemons;

/**
 *
 * @author Home
 */
public class Terrestre extends Pokemon {

    public Terrestre(String nome, int HP, int ataque, int defesa, String nomeAtaq1, String nomeAtaq2) {
        super(nome, HP, ataque, defesa, nomeAtaq1, nomeAtaq2);
    }

    
    @Override
    public double ataque(Pokemon p, int atackAdd) {
        int AT = ataque + atackAdd;
        int dano = AT - p.getDefesa();
        
        if (dano > 0) {
            if ((p instanceof Venenoso) || (p instanceof Pedra) || (p instanceof Fogo) || (p instanceof Eletrico)) {
                return dano * (1.5);
            } else {
                if ((p instanceof Agua) || (p instanceof Grama)) {
                    return dano * (0.5);
                } else {
                    return dano;
                }
            }
        } else {
            return 0;
        }
    }
}
