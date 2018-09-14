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

    public String getNome() {
        return nome;
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
                            System.out.println("RESPOSTA: ");
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
                            System.out.println("RESPOSTA: ");
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

        System.out.println("---CARTAO DE MARCACAO--- /n");
        System.out.println("ACES: "+tab[0]+"DOIS: "+tab[1]+"TRES: "+tab[2]+"QUADROS: "+tab[3]+"/n");
        System.out.println("CINCOS: "+tab[4]+"SEIS: "+tab[5]+"TRINCA: "+tab[6]+"QUADRA: "+tab[7]+"/n");
        System.out.println("FULL HOUSE: "+tab[8]+"SEQ CURTA: "+tab[9]+"SEQ LONGA: "+tab[10]+"BOZO: "+tab[11]+"/n");
        System.out.println("BOZO BONUS: "+tab[12]+"/n");

        System.out.println("CONFORME A SUA JOGADA, QUAL MARCAÇÃO VOCE DESEJAR FAZER (FAVOR ESCREVER EM LETRAS MINUSCULAS E SEM ESPACO) \n");
        for (int i = 0; i < 5; i++) {
            d[i].exibirFace();
        }
        System.out.println("RESPOSTA: ");
        resp = ler.next();

        int cont = 0;
        switch (resp) {
            case "aces":
                for (int i = 0; i < 5; i++) {
                    if (d[i].getFace() == 1) {
                        cont++;
                    }
                }
                tab[0] = cont * 1;
                break;
            case "dois":
                cont = 0;
                for (int i = 0; i < 5; i++) {
                    if (d[i].getFace() == 2) {
                        cont++;
                    }
                }
                tab[1] = cont * 2;
                break;
            case "tres":
                cont = 0;
                for (int i = 0; i < 5; i++) {
                    if (d[i].getFace() == 3) {
                        cont++;
                    }
                }
                tab[2] = cont * 3;
                break;
            case "quatros":
                cont = 0;
                for (int i = 0; i < 5; i++) {
                    if (d[i].getFace() == 4) {
                        cont++;
                    }
                }
                tab[3] = cont * 4;
                break;
            case "cincos":
                cont = 0;
                for (int i = 0; i < 5; i++) {
                    if (d[i].getFace() == 5) {
                        cont++;
                    }
                }
                tab[4] = cont * 5;
                break;
            case "seis":
                cont = 0;
                for (int i = 0; i < 5; i++) {
                    if (d[i].getFace() == 6) {
                        cont++;
                    }
                }
                tab[5] = cont * 6;
                break;
            case "trinca":
                tab[6] = d[0].getFace() + d[1].getFace() + d[2].getFace();
                tab[6] = tab[6] + d[3].getFace() + d[4].getFace();
            case "quadra":
                tab[7] = d[0].getFace() + d[1].getFace() + d[2].getFace();
                tab[7] = tab[7] + d[3].getFace() + d[4].getFace();
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
                if (tab[11] == -1) {
                    tab[11] = 50;
                } else {
                    if (tab[11] == 0) {
                        tab[12] = 50;
                    } else {
                        tab[12] = 100;
                    }
                }
                break;

            default:
                for (int i = 0; i < 5; i++) {
                    if (tab[i] == -1) {
                        tab[i] = 0;
                    }
                }
        }
    }

    public int bonus() {
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            cont = cont + tab[i];
        }
        if (cont >= 63) {
            return 35;
        } else {
            return 0;
        }

    }

    public int pontuacao() {
        int pont = 0;
        for (int i = 0; i < 13; i++) {
            pont = pont + tab[i];
        }
        return pont + bonus();
    }

}
