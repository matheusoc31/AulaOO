/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author Ufjf
 */
public class Charmander extends Pokemon {

    public void fala() {
        System.out.println("CHARMANDER");
    }
// COLOCAR A VARIAVEL DANO EM TODOS OS CASOS

    public int ataque1(String elemOponente) {
        int dano = 0;
        switch (elemOponente) {
            case "raio":
                dano = dano + danoBonus();
                break;
            case "fogo":
                dano = dano + danoBonus();
                break;
            case "agua":
                dano = dano + (-2) * danoBonus();
                break;
            case "grama":
                dano = dano + 2 * danoBonus();
                break;
        }
        return dano;
    }

    public int ataque2(String elemOponente) {
        int dano = 0;
        switch (elemOponente) {
            case "raio":
                dano = dano + danoBonus();
                break;
            case "fogo":
                dano = dano + danoBonus();
                break;
            case "agua":
                dano = dano + 2 * danoBonus();
                break;
            case "grama":
                dano = dano + (-2) * danoBonus();
                break;
        }
        return dano;
    }

}
