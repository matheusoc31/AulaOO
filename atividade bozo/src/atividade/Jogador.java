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
public class Jogador {

    private String nome;
    private Dado d[] = new Dado[5];
    private int tab[] = new int[13];

    public Jogador(String nome) {
        this.nome = nome;
        for (int i = 0; i < 13; i++) {
            tab[i] = -1;
        }
    }

    public void jogada() {
        Scanner ler = new Scanner(System.in);
        String resp;

        for (int j = 1; j < 4; j++) {
            if (j == 1) {
                for (int i = 0; i < 5; i++) {
                    d[i].rolagem();
                    d[i].exibirFace();
                }
            } else {
                if (j == 2) {
                    System.out.println("DESEJA ALTERAR ALGUM VALOR NA SEGUNDA JOGADA? (sim ou nao) /n");
                    resp = ler.next();
                    if (resp == "sim") {
                        for (int a = 1; a <= 5; a++) {
                            System.out.println("DESEJA JOGAR O DADO " + a + " NOVAMENTE? /n");
                            resp = ler.next();
                            if (resp == "sim") {
                                d[a - 1].rolagem();
                                d[a - 1].exibirFace();
                            }
                        }
                    }
                } else {
                    System.out.println("DESEJA ALTERAR ALGUM VALOR NA TERCEIRA JOGADA? (sim ou nao) /n");
                    resp = ler.next();
                    if (resp == "sim") {
                        for (int a = 1; a <= 5; a++) {
                            System.out.println("DESEJA JOGAR O DADO " + a + " NOVAMENTE? /n ");
                            resp = ler.next();
                            if (resp == "sim") {
                                d[a - 1].rolagem();
                                d[a - 1].exibirFace();
                            }
                        }
                    }
                }
            }
        }
    }

    public void marcacao() {
        Scanner ler = new Scanner(System.in);
        String resp;

        System.out.println("CONFORME A SUA JOGADA, QUAL MARCAÇÃO VOCE DESEJAR FAZER (FAVOR ESCREVER EM LETRAS MINUSCULAS E SEM ESPACO) /n");
        for (int i = 0; i < 5; i++) {
            d[i].exibirFace();
        }
        resp = ler.next();

        switch (resp) {
            case "aces":
            case "dois":
            case "tres":
            case "quarta":
            case "quinta":
            case "sexta":
            case "trinca":
                tab[6] = d[0].getFace() + d[1].getFace() + d[2].getFace() + d[3].getFace() + d[4].getFace();
            case "quadra":
                tab[7] = d[0].getFace() + d[1].getFace() + d[2].getFace() + d[3].getFace() + d[4].getFace();
            case "fullhouse":
                tab[8] = 25;
                break;
            case "sequenciacurta":
                tab[9] = 30;
                break;

            case "sequncialonga":
                tab[10] = 40;
                break;

            case "bozo":
                tab[11] = 50;
                break;

            case "bozobonus":
                tab[12] = 100;
                break;

            default:
                for (int i = 0; i < 5; i++) {
                    if (tab[i] == -1) {
                        tab[i] = 0;
                    }
                }

        }

    }
}
