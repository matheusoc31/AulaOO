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
public class Pedra extends Pokemon {

    public Pedra(String nome, int HP, int ataque, int defesa, String nomeAtaq1, String nomeAtaq2) {
        super(nome, HP, ataque, defesa, nomeAtaq1, nomeAtaq2);
    }

   
    @Override
    public double ataque(Pokemon p, int atackAdd) {
        int AT = ataque + atackAdd;
        double dano = AT - p.getDefesa();
        
        if (dano > 0) {
            if ((p instanceof Fogo) || (p instanceof Venenoso)) {
                return dano * (1.5);
            } else {
                if ((p instanceof Grama) || (p instanceof Agua) || (p instanceof Terrestre)) {
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
