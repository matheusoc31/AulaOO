/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2018.pokemons;

import trabalho2018.outras.*;

/**
 * Classe para objetos do tipo Pokemon onde serão contidos valores e metodos
 * para o mesmo
 *
 * @author Matheus de Oliveira Carvalho
 */
public class Pokemon {

    protected String nome;
    protected double HP;
    protected double HPcheio;
    protected int ataque;
    protected int defesa;
    protected Ataque atq1;
    protected Ataque atq2;

    public Pokemon() {
    }

    /**
     * Metodo para instanciar objetos do tipo Pokemon atribuindo valores
     * passados como parametro aos atributos da classe.
     *
     * @param nome string-Nome do Pokemon
     * @param HP int-Vida padrão do Pokemon
     * @param ataque int-Ataque básico do Pokemon
     * @param defesa int-Defesa básica do Pokemon
     * @param atq1 Ataque-Ataque especial de numero 1
     * @param atq2 Ataque-Ataque especial de numero 2
     */
    public Pokemon(String nome, double HP, int ataque, int defesa, Ataque atq1, Ataque atq2) {
        this.nome = nome;
        this.HP = HP;
        this.ataque = ataque;
        this.defesa = defesa;
        this.atq1 = atq1;
        this.atq2 = atq2;
        HPcheio = HP;
    }

    /**
     * Metodo para calcular quanto de dano um ataque causou, usando como base
     * o ataque padrão do pokemon que está atacando + o ataque especial
     * escolhido pelo treinador - a defesa padrão do pokemon
     * que esta sendo atacado. Depois ocorre um ajuste de *1,4 se ocorre vantagem
     * de atributos ou de *0,7 se ocorre desvantagem.
     * 
     * @param p Pokemon- Pokemon que esta sendo atacado.
     * @param atckADD int- Ataque adicional calculado atraves do ataque especial escolhido.
     * @return double-Valor do dano sofrido.
     */
    public double ataque(Pokemon p, int atckADD) {
        int AT = ataque + atckADD;
        double dano = AT - p.getDefesa();

        if (dano > 0) {
            return dano;
        } else {
            return 0;
        }
    }
/**
 * Metodo para saber se um pokemon ainda pode lutar ou se foi derrotado.
 * @return bollean-A condção do Pokemon.
 */
    public boolean foraDeCombate() {
        return HP <= 0;
    }

    /*
    FUNCOES GETTERS
     */
    public String getNome() {
        return nome;
    }

    public double getHP() {
        return HP;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public Ataque getAtq1() {
        return atq1;
    }

    public Ataque getAtq2() {
        return atq2;
    }

    public double getHPcheio() {
        return HPcheio;
    }

    /*
    FUNCOES SETTERS
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHP(double HP) {
        if (HP < 0) {
            this.HP = 0;
        } else {
            this.HP = HP;
        }
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setAtq1(Ataque atq1) {
        this.atq1 = atq1;
    }

    public void setAtq2(Ataque atq2) {
        this.atq2 = atq2;
    }

}
