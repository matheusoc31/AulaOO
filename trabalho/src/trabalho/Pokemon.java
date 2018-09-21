/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.Random;

/**
 *
 * @author Ufjf
 */
public class Pokemon {

    private int Hp;
    private String ataque1;
    private String ataque2;
    private int ppAtaque1;
    private int ppAtaque2;
    private int dano1;
    private int dano2;

    public Pokemon() {
        Hp = 0;
        ppAtaque1 = 0;
        ppAtaque2 = 0;
        ataque1 = "";
        ataque2 = "";
    }

    public int danoBonus() {
        Random d = new Random(System.currentTimeMillis());
        int dano = d.nextInt() % 7;
        if (dano == 0) {
            dano = d.nextInt() % 7;
            if (dano < 0) {
                dano = dano * (-1);
            }
        } else {
            if (dano < 0) {
                dano = dano * (-1);
            }
        }
        return dano;
    }

    public void fala() {
    }

    public int ataque1(String elemOponente) {
        int dano = 0;
        switch (elemOponente) {
            case "raio":
                dano = dano + dano1 + danoBonus();
                break;
            case "fogo":
                dano = dano + dano1 + danoBonus();
                break;
            case "agua":
                dano = dano + dano1 + danoBonus();
                break;
            case "grama":
                dano = dano + dano1 + danoBonus();
                break;
        }
        dano = dano + dano1 + danoBonus();
        return dano;
    }

    public int ataque2(String elemOponente) {
        int dano = 0;
        switch (elemOponente) {
            case "raio":
                dano = dano + dano2 + danoBonus();
                break;
            case "fogo":
                dano = dano + dano2 + danoBonus();
                break;
            case "agua":
                dano = dano + dano2 + danoBonus();
                break;
            case "grama":
                dano = dano + dano2 + danoBonus();
                break;
        }
        return dano;
    }

    public void sofrerAtaque(int dano) {
        Hp = Hp - dano;
        if (Hp <= 0) {
            System.out.println("O POKEMON ESTA FORA DE COMBATE");
        }
    }

    public int getHp() {
        return Hp;
    }

    public String getAtaque1() {
        return ataque1;
    }

    public String getAtaque2() {
        return ataque2;
    }

    public int getPpAtaque1() {
        return ppAtaque1;
    }

    public int getPpAtaque2() {
        return ppAtaque2;
    }

    public int getDano1() {
        return dano1;
    }

    public int getDano2() {
        return dano2;
    }

}
