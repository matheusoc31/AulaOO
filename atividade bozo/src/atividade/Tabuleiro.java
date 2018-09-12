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
public class Tabuleiro {

    private int tabela[] = new int[13];

    public void zerar() {
        for (int i = 0; i < 13; i++) {
            tabela[i] = -1;
        }
    }
}
