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
public class Pokemon {

    protected String nome;
    protected int HP;
    protected int ataque;
    protected int defesa;
    protected String nomeAtaq1;
    protected String nomeAtaq2;
    

    public Pokemon() {
    }
        

    public Pokemon(String nome, int HP, int ataque, int defesa, String nomeAtaq1, String nomeAtaq2) {
        this.nome = nome;
        this.HP = HP;
        this.ataque = ataque;
        this.defesa = defesa;
        this.nomeAtaq1 = nomeAtaq1;
        this.nomeAtaq2 = nomeAtaq2;
    }

    public double ataque(Pokemon p, int n) {
        int AT = ataque + n;
        double dano = AT - p.getDefesa();

        if (dano > 0) {
            return dano;
        } else {
            return 0;
        }
    }

    public boolean foraDeCombate() {
        if (HP <= 0) {
            return true;
        } else {
            return false;
        }
    }
    

    public String getNome() {
        return nome;
    }

    public int getHP() {
        return HP;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public String getNomeAtaq1() {
        return nomeAtaq1;
    }

    public String getNomeAtaq2() {
        return nomeAtaq2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setNomeAtaq1(String nomeAtaq1) {
        this.nomeAtaq1 = nomeAtaq1;
    }

    public void setNomeAtaq2(String nomeAtaq2) {
        this.nomeAtaq2 = nomeAtaq2;
    }

}
