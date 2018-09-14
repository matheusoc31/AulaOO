/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import java.util.Random;

/**
 *
 * @author Ufjf
 */
public class Dado {

    private int lados = 6;
    private int face;

    public void rolagem() {
        Random gerador = new Random(System.currentTimeMillis());
        face = gerador.nextInt() % 6;
        if (face < 0) {
        face = gerador.nextInt() % 6;
        }

    }

    public void exibirFace() {
        System.out.println("--FACE = " + face);
    }

    public int getFace() {
        return face;
    }

}
