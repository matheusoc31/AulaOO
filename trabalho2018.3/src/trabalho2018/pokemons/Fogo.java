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
public class Fogo extends Pokemon {

  
    public Fogo(String nome, int HP, int ataque, int defesa, String nomeAtaq1, String nomeAtaq2) {
        super(nome, HP, ataque, defesa, nomeAtaq1, nomeAtaq2);
    }

    
    @Override
    public double ataque(Pokemon p, int atackAdd) {
        int AT = ataque + atackAdd;
        double dano = AT - p.getDefesa();
        
        if (dano > 0) {
            if ((p instanceof Fogo) || (p instanceof Grama)) {
                return dano * (1.5);
            } else {
                if ((p instanceof Terrestre) || (p instanceof Agua) || (p instanceof Pedra)) {
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
