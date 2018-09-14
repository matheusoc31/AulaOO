/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

/**
 *
 * @author Ufjf
 */
public class Bozo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Jogador j1 = new Jogador("Matheus");
        Jogador j2 = new Jogador("Caio");
        Jogador j3 = new Jogador("Vania");
        
        Jogo jogo = new Jogo(j1,j2,j3);
        jogo.partida();
        jogo.vencedor();

    }

}
