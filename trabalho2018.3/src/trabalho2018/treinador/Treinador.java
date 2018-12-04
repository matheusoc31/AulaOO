/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2018.treinador;

import java.util.Scanner;
import trabalho2018.pokemons.*;
import java.util.*;

/**
 * Classe para objetos do tipo Treinador onde serão contidos valores e metodos
 * para o mesmo
 *
 * @author Matheus de Oliveira Carvalho
 */
public class Treinador {

    protected String nome;
    protected Pokemon p1;
    protected Pokemon p2;

    /**
     * Metodo para instanciar um objeto da classe Treinador. Esse metodo atribui
     * um valor passsado como referencia para todos os atributos da classe.
     *
     * @param nome string-Nome do treinador.
     * @param p1 Pokemon-Primeiro Pokemon do treinador.
     * @param p2 Pokemon-Segundo Pokemon do treinador.
     */
    public Treinador(String nome, Pokemon p1, Pokemon p2) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Metodo para instanciar um objeto da classe Treinador. Esse metodo atribui
     * um valor apenas para o nome, deixando os pokemons como vazios.
     *
     * @param nome String-Nome do treinador.
     */
    public Treinador(String nome) {
        this.nome = nome;
        p1 = null;
        p2 = null;
    }

    /**
     * Metodo utilizado para recuperar a vida por completa dos Pokemons depois
     * de uma batalha. Altera os valores das vidas(HP) utilizando a variavel
     * HPcheio.
     *
     */
    public void centroPokemon() {
        p1.setHP(p1.getHPcheio());
        p2.setHP(p2.getHPcheio());
    }

    /**
     * Metodo utilizado para determinar se um treinador perdeu uma batalha,
     * vendo se os seus dois Pokemons foram derrotado.
     *
     * @return boolean-Retorna se o treinador perdeu uma batalha ou não.
     */
    public boolean perdedor() {
        return p1.foraDeCombate() && p2.foraDeCombate();
    }

    /**
     * Metodo para escrever os Status dos Pokemons na tela. Se a vida do Pokemon
     * estiver igual a zero o Status não será escrito.
     */
    public void statusPokemon() {
        if (p1.getHP() > 0) {
            System.out.println("-->" + p1.getNome() + " :" + p1.getHP());
        } else {
            System.out.println("-->" + p1.getNome() + " : 0");
        }
        if (p2.getHP() > 0) {
            System.out.println("-->" + p2.getNome() + " :" + p2.getHP() + "\n");
        } else {
            System.out.println("-->" + p1.getNome() + " : 0");
        }
    }

    /**
     * Metodo utilizado para executar o turno de ataque do primeiro Pokemon do
     * jogador. Utiliza valores inseridos pelo usuário atraves do teclado para
     * determinar qual pokemon adversario atacar e qual ataque especial usar. Se
     * a vida do Pokemon escolhido para sofrer o ataque for igual a 0 o ataque é
     * direcioando para o outro pokemon ainda em condições de batalha.
     *
     * @param t Treinador-Trinador que esta sendo atacado.
     */
    public void turnoP1Jogador(Treinador t) {
        try {
            Scanner ler = new Scanner(System.in);
            double dano;
            int n1, n2;
            if (p1.getHP() > 0) {
                System.out.println("ATAQUE DO POKEMON 1: " + p1.getNome());
                System.out.println("Qual pokemon advesario atacar: ");
                System.out.println("1-" + t.p1.getNome() + " :" + t.p1.getHP());
                System.out.println("2-" + t.p2.getNome() + " :" + t.p2.getHP());
                n1 = ler.nextInt();
                if (t.getP1().getHP() <= 0) {
                System.out.println("ESSE POKEMON ESTA FORA DE COMBATE!! DIRECIONANDO ATAQUE PARA O OUTRO POKEMON.\n");
                n1 = 2;
            } else {
                    if (t.getP2().getHP() <= 0) {
                        System.out.println("ESSE POKEMON ESTA FORA DE COMBATE!! DIRECIONANDO ATAQUE PARA O OUTRO POKEMON.\n");
                        n1 = 1;
                    }
                }
                switch (n1) {
                    case 1:
                        System.out.println("1- " + p1.getAtq1().getNome() + " ATQ:" + p1.getAtq1().getValor());
                        System.out.println("2- " + p1.getAtq2().getNome() + " ATQ:" + p1.getAtq2().getValor());
                        System.out.println("Qual ataque usar: ");
                        n2 = ler.nextInt();
                        switch (n2) {
                            case 1:
                                dano = p1.ataque(t.getP1(), p1.getAtq1().getValor());
                                t.getP1().setHP(t.getP1().getHP() - dano);
                                break;
                            case 2:
                                dano = p1.ataque(t.getP1(), p1.getAtq2().getValor());
                                t.getP1().setHP(t.getP1().getHP() - dano);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("1- " + p1.getAtq1().getNome() + " ATQ:" + p1.getAtq1().getValor());
                        System.out.println("2- " + p1.getAtq2().getNome() + " ATQ:" + p1.getAtq2().getValor());
                        System.out.println("Qual ataque usar: ");
                        n2 = ler.nextInt();
                        switch (n2) {
                            case 1:
                                dano = p1.ataque(t.getP2(), p1.getAtq1().getValor());
                                t.getP2().setHP(t.getP2().getHP() - dano);
                                break;
                            case 2:
                                dano = p1.ataque(t.getP2(), p1.getAtq2().getValor());
                                t.getP2().setHP(t.getP2().getHP() - dano);
                                break;
                        }
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("VALOR DIGITADO NAO CORRESPONDE A UM NUMERO!!");
        }
        catch (Exception e)
        {
           System.out.println(e.getMessage());
           int n1 = 2;
        }

    }

    /**
     * Metodo utilizado para executar o turno de ataque do segundo Pokemon do
     * jogador. Utiliza valores inseridos pelo usuário atraves do teclado para
     * determinar qual pokemon adversario atacar e qual ataque especial usar. Se
     * a vida do Pokemon escolhido para sofrer o ataque for igual a 0 o ataque é
     * direcioando para o outro pokemon ainda em condições de batalha.
     *
     * @param t Treinador-Trinador que esta sendo atacado.
     */
    public void turnoP2Jogador(Treinador t) {
        Scanner ler = new Scanner(System.in);
        double dano;
        int n1, n2;
        if (p2.getHP() > 0) {
            System.out.println("ATAQUE DO POKEMON 2: " + p2.getNome());
            System.out.println("1-" + t.p1.getNome() + " :" + t.p1.getHP());
            System.out.println("2-" + t.p2.getNome() + " :" + t.p2.getHP());
            System.out.println("Qual pokemon advesario atacar: ");
            n1 = ler.nextInt();
            if (t.getP1().getHP() <= 0) {
                System.out.println("ESSE POKEMON ESTA FORA DE COMBATE!! DIRECIONANDO ATAQUE PARA O OUTRO POKEMON.\n");
                n1 = 2;

            } else {
                if (t.getP2().getHP() <= 0) {
                    System.out.println("ESSE POKEMON ESTA FORA DE COMBATE!! DIRECIONANDO ATAQUE PARA O OUTRO POKEMON.\n");
                    n1 = 1;
                }
            }
            switch (n1) {
                case 1:
                    System.out.println("1- " + p2.getAtq1().getNome() + " ATQ:" + p2.getAtq1().getValor());
                    System.out.println("2- " + p2.getAtq2().getNome() + " ATQ:" + p2.getAtq2().getValor());
                    System.out.println("Qual ataque usar: ");
                    n2 = ler.nextInt();
                    switch (n2) {
                        case 1:
                            dano = p2.ataque(t.getP1(), p2.getAtq1().getValor());
                            t.getP1().setHP(t.getP1().getHP() - dano);
                            break;
                        case 2:
                            dano = p2.ataque(t.getP1(), p2.getAtq2().getValor());
                            t.getP1().setHP(t.getP1().getHP() - dano);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1- " + p2.getAtq1().getNome() + " ATQ:" + p2.getAtq1().getValor());
                    System.out.println("2- " + p2.getAtq2().getNome() + " ATQ:" + p2.getAtq2().getValor());
                    System.out.println("Qual ataque usar: ");
                    n2 = ler.nextInt();
                    switch (n2) {
                        case 1:
                            dano = p2.ataque(t.getP2(), p2.getAtq1().getValor());
                            t.getP2().setHP(t.getP2().getHP() - dano);
                            break;
                        case 2:
                            dano = p2.ataque(t.getP2(), p2.getAtq2().getValor());
                            t.getP2().setHP(t.getP2().getHP() - dano);
                            break;
                    }
                    break;
            }
        }
    }

    /**
     * Metodo utilizado para executar o turno de ataque do primeiro Pokemon do
     * lider de ginásio. Utiliza valores calculados atraves da operação random
     * para determinar qual pokemon adversario atacar e qual ataque especial
     * usar. Se a vida do Pokemon escolhido para sofrer o ataque for igual a 0 o
     * ataque é direcioando para o outro pokemon ainda em condições de batalha.
     *
     * @param jog Treinador-Trinador que esta sendo atacado.
     */
    public void turnoP1Lider(Treinador jog) {

        double dano;
        int num1, num2;
        if (p1.getHP() > 0) {
            num1 = (int) (Math.random() * 3);
            num2 = (int) (Math.random() * 3);
            while (num1 == 0 || num2 == 0) {
                if (num1 == 0) {
                    num1 = (int) (Math.random() * 3);
                } else {
                    num2 = (int) (Math.random() * 3);
                }
            }
            if (jog.getP1().getHP() <= 0) {
                num1 = 2;

            } else {
                if (jog.getP2().getHP() <= 0) {
                    num1 = 1;
                }
            }
            switch (num1) {
                case 1:
                    switch (num2) {
                        case 1:
                            System.out.println("__Pokemon " + p1.getNome() + " do lider de ginasio atacou o seu " + jog.getP1().getNome() + " com " + p1.getAtq1().getNome());
                            dano = p1.ataque(jog.getP1(), p1.getAtq1().getValor());
                            jog.getP1().setHP(jog.getP1().getHP() - dano);
                            break;
                        case 2:
                            System.out.println("__Pokemon " + p1.getNome() + " do lider de ginasio atacou o seu " + jog.getP1().getNome() + " com " + p1.getAtq2().getNome());
                            dano = p1.ataque(jog.getP1(), p1.getAtq2().getValor());
                            jog.getP1().setHP(jog.getP1().getHP() - dano);
                            break;
                    }
                    break;
                case 2:
                    switch (num2) {
                        case 1:
                            System.out.println("__Pokemon " + p1.getNome() + " do lider de ginasio atacou o seu " + jog.getP2().getNome() + " com " + p1.getAtq1().getNome());
                            dano = p1.ataque(jog.getP2(), p1.getAtq1().getValor());
                            jog.getP2().setHP(jog.getP2().getHP() - dano);
                            break;
                        case 2:
                            System.out.println("__Pokemon " + p1.getNome() + " do lider de ginasio atacou o seu " + jog.getP2().getNome() + " com " + p1.getAtq2().getNome());
                            dano = p1.ataque(jog.getP2(), p1.getAtq2().getValor());
                            jog.getP2().setHP(jog.getP2().getHP() - dano);
                            break;
                    }
                    break;
            }
        }
    }

    /**
     * Metodo utilizado para executar o turno de ataque do segundo Pokemon do
     * lider de ginásio. Utiliza valores calculados atraves da operação random
     * para determinar qual pokemon adversario atacar e qual ataque especial
     * usar. Se a vida do Pokemon escolhido para sofrer o ataque for igual a 0 o
     * ataque é direcioando para o outro pokemon ainda em condições de batalha.
     *
     * @param jog Treinador-Trinador que esta sendo atacado.
     */
    public void turnoP2Lider(Treinador jog) {
        int num1, num2;
        double dano;
        if (p2.getHP() > 0) {
            num1 = (int) (Math.random() * 3);
            num2 = (int) (Math.random() * 3);
            while (num1 == 0 || num2 == 0) {
                if (num1 == 0) {
                    num1 = (int) (Math.random() * 3);
                } else {
                    num2 = (int) (Math.random() * 3);
                }
            }
            if (jog.getP1().getHP() <= 0) {
                num1 = 2;

            } else {
                if (jog.getP2().getHP() <= 0) {
                    num1 = 1;
                }
            }
            switch (num1) {
                case 1:
                    switch (num2) {
                        case 1:
                            System.out.println("__Pokemon " + p2.getNome() + " do lider de ginasio atacou o seu " + jog.getP1().getNome() + " com " + p1.getAtq1().getNome());
                            dano = p2.ataque(jog.getP1(), p2.getAtq1().getValor());
                            jog.getP1().setHP(jog.getP1().getHP() - dano);
                            break;
                        case 2:
                            System.out.println("__Pokemon " + p2.getNome() + " do lider de ginasio atacou o seu " + jog.getP1().getNome() + " com " + p1.getAtq2().getNome() + "\n");
                            dano = p2.ataque(jog.getP1(), p2.getAtq2().getValor());
                            jog.getP1().setHP(jog.getP1().getHP() - dano);
                            break;
                    }
                    break;
                case 2:
                    switch (num2) {
                        case 1:
                            System.out.println("__Pokemon " + p2.getNome() + " do lider de ginasio atacou o seu " + jog.getP2().getNome() + " com " + p1.getAtq1().getNome());
                            dano = p2.ataque(jog.getP2(), p2.getAtq1().getValor());
                            jog.getP2().setHP(jog.getP2().getHP() - dano);
                            break;
                        case 2:
                            System.out.println("__Pokemon " + p2.getNome() + " do lider de ginasio atacou o seu " + jog.getP2().getNome() + " com " + p1.getAtq2().getNome());
                            dano = p2.ataque(jog.getP2(), p2.getAtq2().getValor());
                            jog.getP2().setHP(jog.getP2().getHP() - dano);
                            break;
                    }
                    break;
            }
        }
    }

    /*FUNCOES GETTERS*/
    public Pokemon getP1() {
        return p1;
    }

    public Pokemon getP2() {
        return p2;
    }

    public String getNome() {
        return nome;
    }


    /*FUNCOES SETTERS*/
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
