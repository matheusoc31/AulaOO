/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2018.treinador;

import trabalho2018.pokemons.*;
import java.util.Scanner;
import trabalho2018.ataques.Ataques;

/**
 *
 * @author Home
 */
public class Treinador {

    protected String nome;
    protected Pokemon p1;
    protected Pokemon p2;

    public Treinador(String nome, Pokemon p1, Pokemon p2) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Treinador(String nome) {
        this.nome = nome;
        p1 = null;
        p2 = null;
    }

    public void escolhaDePokemon() {
        Scanner ler = new Scanner(System.in);
        System.out.print("1-Charmander 2-Bulbasaur 3-Squirtle 4-Geodude ");
        System.out.print("5-Pikachu 6-Ekans 7-MrMime 8-Cubone \n");
        System.out.print("Treinador " + nome + " escolha o seu primeiro Pokemon: ");

        while (p1 == null) {
            int n = ler.nextInt();
            switch (n) {
                case 1:
                    Pokemon charmander = new Fogo("Charmander", 39, 52, 43, "Presa de Fogo", "Lanca chamas");
                    p1 = charmander;
                    break;
                case 2:
                    Pokemon bulbasaur = new Grama("Bulbasaur", 45, 49, 49, "Chicote de Vinha", "Folha Navalha");
                    p1 = bulbasaur;
                    break;
                case 3:
                    Pokemon squirtle = new Agua("Squirtle", 44, 48, 56, "Arma de Agua", "Pulso de Agua");
                    p1 = squirtle;
                    break;
                case 4:
                    Pokemon geodude = new Pedra("Geodude", 40, 65, 58, "Esmagar", "Explosao de Rocha");
                    p1 = geodude;
                    break;
                case 5:
                    Pokemon pikachu = new Eletrico("Pikachu", 35, 55, 40, "Choque do Trovao", "ElectroBall");
                    p1 = pikachu;
                    break;
                case 6:
                    Pokemon ekans = new Venenoso("Ekans", 35, 60, 44, "Picada de Veneno", "Gunk Shot");
                    p1 = ekans;
                    break;
                case 7:
                    Pokemon mrMime = new Psiquico("Mr Mine", 40, 45, 56, "Psybeam", "Truque");
                    p1 = mrMime;
                    break;
                case 8:
                    Pokemon cubone = new Terrestre("Cubone", 45, 50, 57, "Bonemerang", "Birmania Pisando");
                    p1 = cubone;
                    break;
                default:
                    System.out.print("NUMERO NAO CORRESPONDE A NENHUM POKEMON, DIGITE NOVAMENTE");
                    break;
            }
        }
        System.out.print("Escolha o seu segundo Pokemon: ");
        while (p2 == null) {
            int n = ler.nextInt();
            switch (n) {
                case 1:
                    Pokemon charmander = new Fogo("Charmander", 39, 52, 43, "Presa de Fogo", "Lanca chamas");
                    p2 = charmander;
                    break;
                case 2:
                    Pokemon bulbasaur = new Grama("Bulbasaur", 45, 49, 49, "Chicote de Vinha", "Folha Navalha");
                    p2 = bulbasaur;
                    break;
                case 3:
                    Pokemon squirtle = new Agua("Squirtle", 44, 48, 56, "Arma de Agua", "Pulso de Agua");
                    p2 = squirtle;
                    break;
                case 4:
                    Pokemon geodude = new Pedra("Geodude", 40, 65, 58, "Esmagar", "Explosao de Rocha");
                    p2 = geodude;
                    break;
                case 5:
                    Pokemon pikachu = new Eletrico("Pikachu", 35, 55, 40, "Choque do Trovao", "ElectroBall");
                    p2 = pikachu;
                    break;
                case 6:
                    Pokemon ekans = new Venenoso("Ekans", 35, 60, 44, "Picada de Veneno", "Gunk Shot");
                    p2 = ekans;
                    break;
                case 7:
                    Pokemon mrMime = new Psiquico("Mr Mine", 40, 45, 56, "Psybeam", "Truque");
                    p2 = mrMime;
                    break;
                case 8:
                    Pokemon cubone = new Terrestre("Cubone", 45, 50, 57, "Bonemerang", "Birmania Pisando");
                    p2 = cubone;
                    break;
                default:
                    System.out.print("NUMERO NAO CORRESPONDE A NENHUM POKEMON, DIGITE NOVAMENTE");
                    break;
            }
        }
    }

    public boolean perdedor() {
        if (p1.foraDeCombate() && p2.foraDeCombate()) {
            return true;
        } else {
            return false;
        }
    }

    public Pokemon getP1() {
        return p1;
    }

    public Pokemon getP2() {
        return p2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setP1(Pokemon p1) {
        this.p1 = p1;
    }

    public void setP2(Pokemon p2) {
        this.p2 = p2;
    }

}
