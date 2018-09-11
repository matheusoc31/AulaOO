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

    public Jogador(String nome) {
        this.nome = nome;
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
                    System.out.println("DESEJA ALTERAR ALGUM VALOR NA SEGUNDA JOGADA? (sim ou nao)");
                    resp = ler.next();
                    if (resp == "sim") {
                        for (int a = 1; a <= 5; a++) {
                            System.out.println("DESEJA JOGAR O DADO " + a + " NOVAMENTE? ");
                            resp = ler.next();
                            if (resp == "sim") {
                                d[a - 1].rolagem();
                                d[a - 1].exibirFace();
                            }
                        }
                    }
                } else {
                    System.out.println("DESEJA ALTERAR ALGUM VALOR NA TERCEIRA JOGADA? (sim ou nao)");
                    resp = ler.next();
                    if (resp == "sim") {
                        for (int a = 1; a <= 5; a++) {
                            System.out.println("DESEJA JOGAR O DADO " + a + " NOVAMENTE? ");
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

}
