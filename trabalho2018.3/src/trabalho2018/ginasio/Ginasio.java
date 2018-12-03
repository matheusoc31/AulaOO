/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2018.ginasio;

import trabalho2018.treinador.*;
import trabalho2018.outras.*;

/**
 * Classe para objetos do tipo Ginasio onde serão contidos valores e metodos
 * para o mesmo
 *
 * @author Matheus de Oliveira Carvalho
 */
public class Ginasio {

    private Treinador jogador;
    private Treinador lider;
    private String nome;
    private Insignia insignia;

    /**
     * Metodo para instanciar objetos da classe Insignia.
     *
     * @param jogador Treinador-treinador desafiante no ginasio.
     * @param lider Treinador-lider do ginasio.
     * @param nome string-nome do ginassio.
     * @param insignia Insignia-Insiginia que pode ser ganha nesse ginasio.
     */
    public Ginasio(Treinador jogador, Treinador lider, String nome, Insignia insignia) {
        this.jogador = jogador;
        this.lider = lider;
        this.nome = nome;
        this.insignia = insignia;
    }

    /**
     * Metodo para simular a batalha de ginasio. Composta de turnos para os dois
     * treinadores, que ficam em um ciclo ate que um deles tenha os seus dois
     * pokemons derrotados.
     *
     * @return boolean- Retorna o vencedor da batalha
     */
    public boolean luta() {
        while (!lider.perdedor() && !jogador.perdedor()) {
            jogador.turnoP1Jogador(lider);
            jogador.turnoP2Jogador(lider);
            lider.turnoP1Lider(jogador);
            lider.turnoP2Lider(jogador);
            jogador.statusPokemon();
        }
        return lider.perdedor();
    }


    /* FUNCOES GETTERS */
    public Treinador getJogador() {
        return jogador;
    }

    public Treinador getLider() {
        return lider;
    }

    public String getNome() {
        return nome;
    }

    public Insignia getInsignia() {
        return insignia;
    }

    /* FUNCOES SETTERS */
    public void setJogador(Treinador jogador) {
        this.jogador = jogador;
    }

    public void setLider(Treinador lider) {
        this.lider = lider;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInsignia(Insignia insignia) {
        this.insignia = insignia;
    }

}
