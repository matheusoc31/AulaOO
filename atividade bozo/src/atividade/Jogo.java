/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import java.util.Scanner;

/**
 *
 * @author Ufjf
 */
public class Jogo {

    private Jogador jogadores[] = new Jogador[3];
    private int pont[] = new int[3];

    public Jogo(Jogador j1, Jogador j2, Jogador j3) {
        this.jogadores[0] = j1;
        this.jogadores[1] = j2;
        this.jogadores[2] = j3;
    }

    public void partida() {
        for (int i = 0; i < 13; i++) {
            jogadores[0].jogada();
            jogadores[0].marcacao();
            jogadores[1].jogada();
            jogadores[1].marcacao();
            jogadores[2].jogada();
            jogadores[2].marcacao();
        }
    }

    public void vencedor() {
        for (int i = 0; i < 3; i++) {
            pont[i] = jogadores[i].pontuacao();
        }
        int maior = 0;
        int vencedor = -1;
        for (int i = 0; i < 3; i++) {
            if (pont[i] > maior) {
                maior = pont[i];
                vencedor = i;
            }
        }
        System.out.println("O VENDECOR FOI : "+jogadores[vencedor].getNome()+" COM "+pont[vencedor]+" PONTOS!!" );
    }
}
