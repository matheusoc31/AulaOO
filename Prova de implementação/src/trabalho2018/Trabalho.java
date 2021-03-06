/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
TRABALHO DE ORIENTAÇÃO A OBJETOS- 2018.3


 */
package trabalho2018;

import java.awt.JobAttributes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import trabalho2018.treinador.*;
import trabalho2018.pokemons.*;
import trabalho2018.outras.*;
import trabalho2018.ginasio.*;
import javax.swing.JFrame;

/**
 *
 * @author Home
 */
public class Trabalho {

    private static JobAttributes.DestinationType arquivo;
    private static int w;
    private static JobAttributes.DestinationType File;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /*        
        Menu menu = new Menu();
        menu.setVisible(true);
         */
        /**
         * Instanciação de todos os objetos da classe Ataque utilizados no
         * codigo.
         */
        Ataque esmagar = new Ataque("Esmagar", 15);
        Ataque explosaoDeRocha = new Ataque("Explosao de Rocha", 12);
        Ataque tumuloDeRocha = new Ataque("Tumulo de Rocha", 12);

        Ataque armaDeAgua = new Ataque("Arma de Agua", 15);
        Ataque feixeDeBolhas = new Ataque("Feixe de Bolhas", 15);
        Ataque pulsoDeAgua = new Ataque("Pulso de Agua", 15);

        Ataque chicoteDeVinha = new Ataque("Chicote de Vinha", 15);
        Ataque poDoSono = new Ataque("Po do Sono", 10);
        Ataque folhaNavalha = new Ataque("Folha Navalha", 14);

        Ataque choqueDoTrovao = new Ataque("Choque do Trovao", 15);
        Ataque electroBall = new Ataque("ElectroBall", 15);
        Ataque faisca = new Ataque("Faisca", 15);

        Ataque presaDeFogo = new Ataque("Presa de Fogo", 14);
        Ataque estouroDeChamas = new Ataque("Estouro de Chamas", 15);
        Ataque lancaChamas = new Ataque("Lanca Chamas", 14);

        Ataque picadaDeVeneno = new Ataque("Picada de Veneno", 15);
        Ataque gunkShot = new Ataque("Gunk Shot", 10);
        Ataque presaVenenosa = new Ataque("Presa Venenosa", 15);
        Ataque venoshock = new Ataque("Venoshock", 15);

        Ataque psybeam = new Ataque("Psybeam", 15);
        Ataque truque = new Ataque("Truque", 15);
        Ataque visaoDoFuturo = new Ataque("Visao do Futuro", 15);

        Ataque bonemerang = new Ataque("Bonemerang", 12);
        Ataque birmaniaPisando = new Ataque("Birmania Pisando", 15);
        Ataque ataquedeAreia = new Ataque("Ataque de Areia", 15);
        Ataque escavacao = new Ataque("Escavacao", 15);

        /**
         * Instanciação de objetos da classe Pokemon utilizados no codigo.
         */
        Brinquedo geodude = new Brinquedo("Geodude", 40, 60, 53, esmagar, explosaoDeRocha, "geodude", 15);
        Brinquedo onix = new Brinquedo("Onix", 30, 45, 50, esmagar, tumuloDeRocha, "oni", 15);
        Brinquedo staryu = new Brinquedo("Staryu", 30, 43, 50, armaDeAgua, feixeDeBolhas, "starr", 15);
        Brinquedo horsea = new Brinquedo("Horsea", 30, 41, 50, armaDeAgua, feixeDeBolhas, "horseaa", 13);
        Brinquedo bellsprout = new Brinquedo("Bellsprout", 50, 55, 35, chicoteDeVinha, poDoSono, "bells", 12);
        Brinquedo oddish = new Brinquedo("Oddish", 45, 47, 55, poDoSono, folhaNavalha, "oddishh", 12);
        Brinquedo pikachu = new Brinquedo("Pikachu", 35, 50, 40, choqueDoTrovao, electroBall, "pikaa", 20);
        Brinquedo magnemite = new Brinquedo("Magnemite", 42, 35, 45, choqueDoTrovao, faisca, "magnemite", 12);
        Brinquedo growlithe = new Brinquedo("Growlithe", 55, 56, 45, presaDeFogo, estouroDeChamas, "groww", 17);
        Brinquedo vulpix = new Brinquedo("Vulpix", 38, 41, 40, presaDeFogo, estouroDeChamas, "vulpixx", 17);
        Brinquedo ekans = new Brinquedo("Ekans", 35, 55, 44, picadaDeVeneno, gunkShot, "ekans", 13);
        Brinquedo zubat = new Brinquedo("Zubat", 40, 45, 35, presaVenenosa, venoshock, "zuba", 13);
        Brinquedo mrMime = new Brinquedo("Mr Mine", 40, 45, 50, psybeam, truque, "mine", 13);
        Brinquedo drowzee = new Brinquedo("Drowzee", 60, 48, 45, psybeam, visaoDoFuturo, "drow", 12);
        Brinquedo cubone = new Brinquedo("Cubone", 45, 45, 51, bonemerang, birmaniaPisando, "cubonee", 13);
        Brinquedo diglett = new Brinquedo("Diglett", 30, 50, 33, ataquedeAreia, escavacao, "digle", 12);
        Brinquedo charmander = new Brinquedo("Charmander", 38, 46, 38, presaDeFogo, lancaChamas, "charmandeer", 18);
        Brinquedo bulbasaur = new Brinquedo("Bulbasaur", 45, 45, 44, chicoteDeVinha, folhaNavalha, "bulbaa", 18);
        Brinquedo squirtle = new Brinquedo("Squirtle", 43, 48, 56, armaDeAgua, pulsoDeAgua, "squir", 18);

        /**
         * Instanciação de objetos da classe Treinador utilizados no codigo.
         */
        /*
        Treinador brock = new Treinador("Brock", geodude, onix);
        Treinador misty = new Treinador("Misty", staryu, horsea);
        Treinador surge = new Treinador("Surge", pikachu, magnemite);
        Treinador erika = new Treinador("Erika", bellsprout, oddish);
        Treinador sabrina = new Treinador("Sabrina", mrMime, drowzee);
        Treinador koga = new Treinador("Koga", ekans, zubat);
        Treinador blaine = new Treinador("Blaine", growlithe, vulpix);
        Treinador giovanni = new Treinador("Gioavanni", cubone, diglett);
         */
        /**
         * Instanciação de todos os objetos da classe Insginia utilizados no
         * codigo.
         */
        /*
        Insignia rocha = new Insignia("Rocha");
        Insignia cascata = new Insignia("Cascata");
        Insignia trovao = new Insignia("Trovão");
        Insignia arcoIris = new Insignia("Arco-Íris");
        Insignia alma = new Insignia("Alma");
        Insignia lama = new Insignia("Lama");
        Insignia vulcao = new Insignia("Vulcão");
        Insignia terra = new Insignia("Terra");

        /**
         * Instanciação de objeto da classe Treinador que sera utilizado pelo
         * usuario. Esse código não foi colocado no bloco try pois já que é um
         * jogo números podem fazer parte dele.
         */
        System.out.print("Digite o seu nome: ");
        String jogadorNome = ler.next();
        Treinador jogador = new Treinador(jogadorNome);

        /**
         * Instanciação de todos os objetos da classe Ginasio utilizados no
         * codigo.
         */
        /*
        Ginasio ginasioRocha = new Ginasio(jogador, brock, "GINASIO DE PEWTER()", rocha);
        Ginasio ginasioAgua = new Ginasio(jogador, misty, "GINASIO DE CERULEAN()", cascata);
        Ginasio ginasioRaio = new Ginasio(jogador, surge, "GINASIO DE VERMILIO()", trovao);
        Ginasio ginasioPlanta = new Ginasio(jogador, erika, "GINASIO DE CELADON()", arcoIris);
        Ginasio ginasioPsiquico = new Ginasio(jogador, sabrina, "GINASIO DE SAFFRON()", alma);
        Ginasio ginasioVeneno = new Ginasio(jogador, koga, "GINASIO DE FUSCHIA()", lama);
        Ginasio ginasioFogo = new Ginasio(jogador, blaine, "GINASIO DE CINNABAR()", vulcao);
        Ginasio ginasioTerra = new Ginasio(jogador, giovanni, "GINASIO DE VIRIDIAN()", terra);

        try {
            /**
             * Código utilizado para a escolha dos dois pokemons que serão
             * utilizados pelo usuário. O usuário deverá escolher entre os 8
             * Pokemons a sua escolha para montar a sua equipe.
         */
 /*
            System.out.print("1-Charmander 2-Bulbasaur 3-Squirtle 4-Geodude ");
            System.out.print("5-Pikachu 6-Ekans 7-MrMime 8-Cubone \n");
            System.out.print(jogadorNome + " escolha o seu primeiro Pokemon: ");
            while (jogador.getP1() == null) {
                int n = ler.nextInt();
                switch (n) {
                    case 1:
                        Pokemon charmander = new Fogo("Charmander", 38, 46, 38, presaDeFogo, lancaChamas);
                        jogador.setP1(charmander);
                        break;
                    case 2:
                        Pokemon bulbasaur = new Grama("Bulbasaur", 45, 45, 44, chicoteDeVinha, folhaNavalha);
                        jogador.setP1(bulbasaur);
                        break;
                    case 3:
                        Pokemon squirtle = new Agua("Squirtle", 43, 48, 56, armaDeAgua, pulsoDeAgua);
                        jogador.setP1(squirtle);
                        break;
                    case 4:
                        Pokemon geodude2 = new Pedra("Geodude", 40, 65, 58, esmagar, explosaoDeRocha);
                        jogador.setP1(geodude);
                        break;
                    case 5:
                        Pokemon pikachu2 = new Eletrico("Pikachu", 35, 50, 40, choqueDoTrovao, electroBall);
                        jogador.setP1(pikachu);
                        break;
                    case 6:
                        Pokemon ekans2 = new Venenoso("Ekans", 35, 55, 44, picadaDeVeneno, gunkShot);
                        jogador.setP1(ekans);
                        break;
                    case 7:
                        Pokemon mrMime2 = new Psiquico("Mr Mine", 40, 45, 50, psybeam, truque);
                        jogador.setP1(mrMime);
                        break;
                    case 8:
                        Pokemon cubone2 = new Terrestre("Cubone", 45, 45, 52, bonemerang, birmaniaPisando);
                        jogador.setP1(cubone);
                        break;
                    default:
                        System.out.print("NUMERO NAO CORRESPONDE A NENHUM POKEMON, DIGITE NOVAMENTE: ");
                        break;
                }
            }
            System.out.print("Agora escolha o seu segundo Pokemon: ");
            while (jogador.getP2() == null) {
                int n = ler.nextInt();
                switch (n) {
                    case 1:
                        Pokemon charmander = new Fogo("Charmander", 39, 52, 43, presaDeFogo, lancaChamas);
                        jogador.setP2(charmander);
                        break;
                    case 2:
                        Pokemon bulbasaur = new Grama("Bulbasaur", 45, 49, 49, chicoteDeVinha, folhaNavalha);
                        jogador.setP2(bulbasaur);
                        break;
                    case 3:
                        Pokemon squirtle = new Agua("Squirtle", 44, 48, 56, armaDeAgua, pulsoDeAgua);
                        jogador.setP2(squirtle);
                        break;
                    case 4:
                        Pokemon geodude2 = new Pedra("Geodude", 40, 65, 58, esmagar, explosaoDeRocha);
                        jogador.setP2(geodude);
                        break;
                    case 5:
                        Pokemon pikachu2 = new Eletrico("Pikachu", 35, 55, 40, choqueDoTrovao, electroBall);
                        jogador.setP2(pikachu);
                        break;
                    case 6:
                        Pokemon ekans2 = new Venenoso("Ekans", 35, 60, 44, picadaDeVeneno, gunkShot);
                        jogador.setP2(ekans);
                        break;
                    case 7:
                        Pokemon mrMime2 = new Psiquico("Mr Mine", 40, 45, 56, psybeam, truque);
                        jogador.setP2(mrMime);
                        break;
                    case 8:
                        Pokemon cubone2 = new Terrestre("Cubone", 45, 50, 57, bonemerang, birmaniaPisando);
                        jogador.setP2(cubone);
                        break;
                    default:
                        System.out.print("NUMERO NAO CORRESPONDE A NENHUM POKEMON, DIGITE NOVAMENTE: ");
                        break;
                }
            }
         */
 /*
            Set<Insignia> conjunto = new HashSet<>();
            boolean i;
            int cont = 0;
            /**
             * Código responsável pelo jogo em sí. Nele o usuário deverá
             * escolher um dos 8 ginásio que podem ser desafiados. Ao escolher
             * um ginásio ocorrerá a chamada da função 'luta' da classe ginásio,
             * se o usuário sair como vencedor da luta ele ganhará uma insignia
             * correspondente aquele ginásio. Se o usuário perder duas vezes
             * seguidas contra o mesmo líder ele podera trocar os seus pokemon e
             * tentar desafiar novamente. Ganha o jogo se o usuário conseguir
             * derrotar os 8 líderes de ginásio e conquistar as 8 insignias.
         */
 /*
            while (conjunto.size() < 8) {
                if (cont >= 2) {
                    String resp2;
                    System.out.println("\n<>DESEJA TROCAR DE POKEMONS?? (sim)(nao)<>");
                    resp2 = ler.next();
                    if ("sim".equals(resp2)) {
                        System.out.print("1-Charmander 2-Bulbasaur 3-Squirtle 4-Geodude \n");
                        System.out.print("5-Pikachu 6-Ekans 7-MrMime 8-Cubone 0-Manter o pokemon atual \n");
                        System.out.print("Qual pokemon voce deseja trocar pelo seu " + jogador.getP1().getNome() + " :");
                        int n = ler.nextInt();
                        switch (n) {
                            case 1:
                                Pokemon charmander3 = new Fogo("Charmander", 39, 52, 43, presaDeFogo, lancaChamas);
                                jogador.setP1(charmander3);
                                break;
                            case 2:
                                Pokemon bulbasaur3 = new Grama("Bulbasaur", 45, 49, 49, chicoteDeVinha, folhaNavalha);
                                jogador.setP1(bulbasaur3);
                                break;
                            case 3:
                                Pokemon squirtle3 = new Agua("Squirtle", 44, 48, 56, armaDeAgua, pulsoDeAgua);
                                jogador.setP1(squirtle3);
                                break;
                            case 4:
                                Pokemon geodude3 = new Pedra("Geodude", 40, 65, 58, esmagar, explosaoDeRocha);
                                jogador.setP1(geodude3);
                                break;
                            case 5:
                                Pokemon pikachu3 = new Eletrico("Pikachu", 35, 55, 40, choqueDoTrovao, electroBall);
                                jogador.setP1(pikachu3);
                                break;
                            case 6:
                                Pokemon ekans3 = new Venenoso("Ekans", 35, 60, 44, picadaDeVeneno, gunkShot);
                                jogador.setP1(ekans3);
                                break;
                            case 7:
                                Pokemon mrMime3 = new Psiquico("Mr Mine", 40, 45, 56, psybeam, truque);
                                jogador.setP1(mrMime3);
                                break;
                            case 8:
                                Pokemon cubone3 = new Terrestre("Cubone", 45, 50, 57, bonemerang, birmaniaPisando);
                                jogador.setP1(cubone3);
                                break;
                            default:
                                break;
                        }

                        System.out.print("Qual pokemon voce deseja trocar pelo seu " + jogador.getP2().getNome() + " :");
                        n = ler.nextInt();
                        switch (n) {
                            case 1:
                                Pokemon charmander3 = new Fogo("Charmander", 39, 52, 43, presaDeFogo, lancaChamas);
                                jogador.setP2(charmander3);
                                break;
                            case 2:
                                Pokemon bulbasaur3 = new Grama("Bulbasaur", 45, 49, 49, chicoteDeVinha, folhaNavalha);
                                jogador.setP2(bulbasaur3);
                                break;
                            case 3:
                                Pokemon squirtle3 = new Agua("Squirtle", 44, 48, 56, armaDeAgua, pulsoDeAgua);
                                jogador.setP2(squirtle3);
                                break;
                            case 4:
                                Pokemon geodude3 = new Pedra("Geodude", 40, 65, 58, esmagar, explosaoDeRocha);
                                jogador.setP2(geodude3);
                                break;
                            case 5:
                                Pokemon pikachu3 = new Eletrico("Pikachu", 35, 55, 40, choqueDoTrovao, electroBall);
                                jogador.setP2(pikachu3);
                                break;
                            case 6:
                                Pokemon ekans3 = new Venenoso("Ekans", 35, 60, 44, picadaDeVeneno, gunkShot);
                                jogador.setP2(ekans3);
                                break;
                            case 7:
                                Pokemon mrMime3 = new Psiquico("Mr Mine", 40, 45, 56, psybeam, truque);
                                jogador.setP2(mrMime3);
                                break;
                            case 8:
                                Pokemon cubone3 = new Terrestre("Cubone", 45, 50, 57, bonemerang, birmaniaPisando);
                                jogador.setP2(cubone3);
                                break;
                            default:
                                break;
                        }
                    }
                }
                System.out.println("\n ESCOLHA UM GINASIO PARA DESAFIAR: ");
                System.out.println("1:" + ginasioRocha.getNome() + " 2:" + ginasioAgua.getNome());
                System.out.println("3:" + ginasioRaio.getNome() + " 4:" + ginasioPlanta.getNome());
                System.out.println("5:" + ginasioPsiquico.getNome() + " 6:" + ginasioVeneno.getNome());
                System.out.println("7:" + ginasioFogo.getNome() + " 8:" + ginasioTerra.getNome());
                int resp = ler.nextInt();

                switch (resp) {
                    case 1:
                        System.out.println("--> LIDER " + brock.getNome() + " DESAFIADO!! <--");
                        i = ginasioRocha.luta();
                        if (i == true) {
                            System.out.println("LIDER DERROTADO!! INSIGNIA DA " + rocha.getNome() + " CONQUISTADA!");
                            ginasioRocha.setNome("GINASIO DE PEWTER(X)");
                            jogador.centroPokemon();
                            brock.centroPokemon();
                            conjunto.add(ginasioRocha.getInsignia());
                            cont = 0;
                        } else {
                            System.out.println("SEUS POKEMONS ESTAO FORA DE COMBATE! INDO PARA UM CENTRO POKEMON!!");
                            jogador.centroPokemon();
                            brock.centroPokemon();
                            cont++;
                        }
                        break;
                    case 2:
                        System.out.println("--> LIDER " + misty.getNome() + " DESAFIADO!! <--");
                        i = ginasioAgua.luta();
                        if (i == true) {
                            System.out.println("LIDER DERROTADO!! INSIGNIA DA " + cascata.getNome() + " CONQUISTADA!");
                            ginasioAgua.setNome("GINASIO DE CERULEAN(X)");
                            jogador.centroPokemon();
                            misty.centroPokemon();
                            conjunto.add(ginasioAgua.getInsignia());
                            cont = 0;

                        } else {
                            System.out.println("SEUS POKEMONS ESTAO FORA DE COMBATE! INDO PARA UM CENTRO POKEMON!!");
                            jogador.centroPokemon();
                            misty.centroPokemon();
                            cont++;
                        }
                        break;
                    case 3:
                        System.out.println("--> LIDER " + surge.getNome() + " DESAFIADO!! <--");
                        i = ginasioRaio.luta();
                        if (i == true) {
                            System.out.println("LIDER DERROTADO!! INSIGNIA DO " + trovao.getNome() + " CONQUISTADA!");
                            ginasioRaio.setNome("GINASIO DE VERMILIO(X)");
                            jogador.centroPokemon();
                            surge.centroPokemon();
                            conjunto.add(ginasioRaio.getInsignia());
                            cont = 0;

                        } else {
                            System.out.println("SEUS POKEMONS ESTAO FORA DE COMBATE! INDO PARA UM CENTRO POKEMON!!");
                            jogador.centroPokemon();
                            surge.centroPokemon();
                            cont++;
                        }
                        break;
                    case 4:
                        System.out.println("--> LIDER " + erika.getNome() + " DESAFIADO!! <--");
                        i = ginasioPlanta.luta();
                        if (i == true) {
                            System.out.println("LIDER DERROTADO!! INSIGNIA DO " + arcoIris.getNome() + " CONQUISTADA!");
                            ginasioPlanta.setNome("GINASIO DE CELADON(X)");
                            jogador.centroPokemon();
                            erika.centroPokemon();
                            conjunto.add(ginasioPlanta.getInsignia());
                            cont = 0;

                        } else {
                            System.out.println("SEUS POKEMONS ESTAO FORA DE COMBATE! INDO PARA UM CENTRO POKEMON!!");
                            jogador.centroPokemon();
                            erika.centroPokemon();
                            cont++;
                        }
                        break;
                    case 5:
                        System.out.println("--> LIDER " + sabrina.getNome() + " DESAFIADO!! <--");
                        i = ginasioPsiquico.luta();

                        if (i == true) {
                            System.out.println("LIDER DERROTADO!! INSIGNIA DA " + alma.getNome() + " CONQUISTADA!");
                            ginasioPsiquico.setNome("GINASIO DE SAFFRON(X)");
                            jogador.centroPokemon();
                            sabrina.centroPokemon();
                            conjunto.add(ginasioPsiquico.getInsignia());
                            cont = 0;

                        } else {
                            System.out.println("SEUS POKEMONS ESTAO FORA DE COMBATE! INDO PARA UM CENTRO POKEMON!!");
                            jogador.centroPokemon();
                            sabrina.centroPokemon();
                            cont++;
                        }
                        break;
                    case 6:
                        System.out.println("--> LIDER " + koga.getNome() + " DESAFIADO!! <--");
                        i = ginasioVeneno.luta();
                        if (i == true) {
                            System.out.println("LIDER DERROTADO!! INSIGNIA DA " + lama.getNome() + " CONQUISTADA!");
                            ginasioVeneno.setNome("GINASIO DE FUSCHIA(X)");
                            jogador.centroPokemon();
                            koga.centroPokemon();
                            conjunto.add(ginasioVeneno.getInsignia());
                            cont = 0;

                        } else {
                            System.out.println("SEUS POKEMONS ESTAO FORA DE COMBATE! INDO PARA UM CENTRO POKEMON!!");
                            jogador.centroPokemon();
                            koga.centroPokemon();
                            cont++;
                        }
                        break;
                    case 7:
                        System.out.println("--> LIDER " + blaine.getNome() + " DESAFIADO!! <--");
                        i = ginasioFogo.luta();
                        if (i == true) {
                            System.out.println("LIDER DERROTADO!! INSIGNIA DO " + vulcao.getNome() + " CONQUISTADA!");
                            ginasioFogo.setNome("GINASIO DE CINNABAR(X)");
                            jogador.centroPokemon();
                            blaine.centroPokemon();
                            conjunto.add(ginasioFogo.getInsignia());
                            cont = 0;

                        } else {
                            System.out.println("SEUS POKEMONS ESTAO FORA DE COMBATE! INDO PARA UM CENTRO POKEMON!!");
                            jogador.centroPokemon();
                            blaine.centroPokemon();
                            cont++;
                        }
                        break;
                    case 8:
                        System.out.println("--> LIDER " + giovanni.getNome() + " DESAFIADO!! <--");
                        i = ginasioTerra.luta();
                        if (i == true) {
                            System.out.println("LIDER DERROTADO!! INSIGNIA DA " + terra.getNome() + " CONQUISTADA!");
                            ginasioTerra.setNome("GINASIO DE VIRIDIAN(X)");
                            jogador.centroPokemon();
                            giovanni.centroPokemon();
                            conjunto.add(ginasioTerra.getInsignia());
                            cont = 0;

                        } else {
                            System.out.println("SEUS POKEMONS ESTAO FORA DE COMBATE! INDO PARA UM CENTRO POKEMON!!");
                            jogador.centroPokemon();
                            giovanni.centroPokemon();
                            cont++;
                        }
                        break;
                    default:
                        System.out.println("ESSE NUMERO NAO CORRESPONDE A NENHUM GINASIO, DIGITE NOVAMENTE: ");
                        break;

                }
            }

            System.out.println("\n PARABENS!! TODOS OS LIDERES DE GINASIO FORAM DERROTADOS!!");
            System.out.println("VOCE AGORA PODE ENTRAR NA LIGA POKEMON!! PARABENS");

        } catch (InputMismatchException e) {
            System.out.println("VALOR DIGITADO NAO CORRESPONDE AO PEDIDO!!");
        }
         */
        int valorTotal = 0;
        ArrayList<Brinquedo> compra = new ArrayList();

        System.out.println("-->Boa tarde, " + jogadorNome + " deseja comprar alguma coisa??");
        String resp;
        resp = ler.next();

        while ("sim".equals(resp) || "SIM".equals(resp) || "s".equals(resp) || "S".equals(resp)) {
            try {
                System.out.println("1-" + geodude.getNome() + "--$" + geodude.getPreco() + "  2-" + onix.getNome() + "--$" + onix.getPreco() + "  3-" + staryu.getNome() + "--$ " + staryu.getPreco());
                System.out.println("4-" + horsea.getNome() + "--$" + horsea.getPreco() + "  5-" + oddish.getNome() + "--$" + oddish.getPreco() + "  6-" + bellsprout.getNome() + "--$" + bellsprout.getPreco());
                System.out.println("7-" + pikachu.getNome() + "--$" + pikachu.getPreco() + "  8-" + magnemite.getNome() + "--$" + magnemite.getPreco() + "  9-" + growlithe.getNome() + "--$ " + growlithe.getPreco());
                System.out.println("10-" + vulpix.getNome() + "--$" + vulpix.getPreco() + "  11-" + ekans.getNome() + "--$" + ekans.getPreco() + "  12-" + zubat.getNome() + "--$" + zubat.getPreco());
                System.out.println("13-" + mrMime.getNome() + "--$" + mrMime.getPreco() + "  14-" + drowzee.getNome() + "--$" + drowzee.getPreco() + "  15-" + cubone.getNome() + "--$ " + cubone.getPreco());
                System.out.println("16-" + diglett.getNome() + "--$" + diglett.getPreco() + "  17-" + charmander.getNome() + "--$" + charmander.getPreco() + "  18-" + bulbasaur.getNome() + "--$" + bulbasaur.getPreco());
                System.out.println("19-" + squirtle.getNome() + "--$" + squirtle.getPreco()+"\n");

                System.out.println("Oque deseja? ");
                int n1, n2;
                n1 = ler.nextInt();
                switch (n1) {
                    case 1:
                        System.out.println("Voce escolheu um " + geodude.getNome() + " quantos desse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(geodude);
                            valorTotal = valorTotal + geodude.getPreco();
                        }
                        break;
                    case 2:
                        System.out.println("Voce escolheu um " + onix.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(onix);
                            valorTotal = valorTotal + onix.getPreco();
                        }

                        break;
                    case 3:
                        System.out.println("Voce escolheu um " + staryu.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(staryu);
                            valorTotal = valorTotal + staryu.getPreco();
                        }

                        break;
                    case 4:
                        System.out.println("Voce escolheu um " + horsea.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(horsea);
                            valorTotal = valorTotal + horsea.getPreco();
                        }

                        break;
                    case 5:
                        System.out.println("Voce escolheu um " + oddish.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(oddish);
                            valorTotal = valorTotal + oddish.getPreco();
                        }

                        break;
                    case 6:
                        System.out.println("Voce escolheu um " + bellsprout.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(bellsprout);
                            valorTotal = valorTotal + bellsprout.getPreco();
                        }

                        break;
                    case 7:
                        System.out.println("Voce escolheu um " + pikachu.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(pikachu);
                            valorTotal = valorTotal + pikachu.getPreco();
                        }

                        break;
                    case 8:
                        System.out.println("Voce escolheu um " + magnemite.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(magnemite);
                            valorTotal = valorTotal + magnemite.getPreco();
                        }

                        break;
                    case 9:
                        System.out.println("Voce escolheu um " + growlithe.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(growlithe);
                            valorTotal = valorTotal + growlithe.getPreco();
                        }

                        break;
                    case 10:
                        System.out.println("Voce escolheu um " + vulpix.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(vulpix);
                            valorTotal = valorTotal + vulpix.getPreco();
                        }

                        break;
                    case 11:
                        System.out.println("Voce escolheu um " + ekans.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(ekans);
                            valorTotal = valorTotal + ekans.getPreco();
                        }

                        break;
                    case 12:
                        System.out.println("Voce escolheu um " + zubat.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(zubat);
                            valorTotal = valorTotal + zubat.getPreco();
                        }

                        break;
                    case 13:
                        System.out.println("Voce escolheu um " + mrMime.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(mrMime);
                            valorTotal = valorTotal + mrMime.getPreco();
                        }

                        break;
                    case 14:
                        System.out.println("Voce escolheu um " + drowzee.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(drowzee);
                            valorTotal = valorTotal + drowzee.getPreco();
                        }

                        break;
                    case 15:
                        System.out.println("Voce escolheu um " + cubone.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(cubone);
                            valorTotal = valorTotal + cubone.getPreco();
                        }

                        break;
                    case 16:
                        System.out.println("Voce escolheu um " + diglett.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(diglett);
                            valorTotal = valorTotal + diglett.getPreco();
                        }

                        break;
                    case 17:
                        System.out.println("Voce escolheu um " + charmander.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(charmander);
                            valorTotal = valorTotal + charmander.getPreco();
                        }

                        break;
                    case 18:
                        System.out.println("Voce escolheu um " + bulbasaur.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(bulbasaur);
                            valorTotal = valorTotal + bulbasaur.getPreco();
                        }

                        break;
                    case 19:
                        System.out.println("Voce escolheu um " + squirtle.getNome() + " quantos de esse produto voce ira levar?");
                        n2 = ler.nextInt();
                        if (n2 < 0) {
                            throw new ValorInvalidoException();
                        }
                        for (int i = 0; i < n2; i++) {
                            compra.add(squirtle);
                            valorTotal = valorTotal + squirtle.getPreco();
                        }

                    default:
                        System.out.println("NAO TEMOS ESSE PRODUTO NA NOSSA LOJA, FAVOR ESCOLHER UM QUE TEMOS");

                        break;
                }
                if (valorTotal < 0) {
                    throw new ValorInvalidoException();
                }

                System.out.println("*Deseja comprar algo mais??");
                resp = ler.next();
            } catch (ValorInvalidoException e) {
                System.out.println("VALOR INVALIDO!! FAVOR DEGITAR OUTRO!");
            }
        }
        System.out.println("OBRIGADO POR COMPRAR COM A GENTE! TENHA UM OTIMO DIA!!");

        File file = new File("Arquivo de texto");
        try (FileWriter w = new FileWriter(file)) {
            w.write("SUA COMPRA: ");
            for (int i = 0; i < compra.size(); i++) {
                w.write(compra.get(i).getNome()+" ");
            }
            w.write("   VALOR DA SUA COMPRA:");
            w.write(valorTotal);
            w.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}


/*
Uma forma de resolver seria criando objetos que não possuam os atributos dos pokemons em si.
Tento apenas os nomes em comum, pois assim iria diferenciar os brinquedos(que nao presicam)
ter ataque, hp...) dos pokemons usados nas batalhas.
*/