/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
TRABALHO DE ORIENTAÇÃO A OBJETOS- 2018.3


*/

package trabalho2018;

import trabalho2018.treinador.Treinador;
import trabalho2018.pokemons.*;
import java.util.Scanner;
import trabalho2018.ataques.Ataques;


/**
 *
 * @author Home
 */
public class Trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Pokemon geodude = new Pedra("Geodude",40,65,58,"Esmagar","Explosao de Rocha");
        Pokemon onix = new Pedra("Onix",30,45,60,"Esmagar","Tumulo de Rocha");
        Pokemon staryu = new Agua("Staryu",30,45,55,"Arma de Agua","Feixe de Bolhas");
        Pokemon horsea = new Agua("Horsea",30,40,57,"Arma de Agua","Feixe de Bolhas");
        Pokemon bellsprout = new Grama("Bellsprout",50,60,35,"Chicote de Vinha", "Po do Sono");
        Pokemon oddish = new Grama("Oddish",45,50,55,"Po de Sono","Folha Navalha");
        Pokemon pikachu = new Eletrico("Pikachu",35,55,40,"Choque do Trovao","ElectroBall");
        Pokemon magnemite = new Eletrico("Magnemite",45,35,45,"Choque do Trovao","Faisca");
        Pokemon growlithe = new Fogo("Growlithe",55,63,45,"Presa de Fogo","Estouro de Chamas");
        Pokemon vulpix = new Fogo("Vulpix",38,41,40,"Estouro de Chamas","Presa de Fogo");
        Pokemon ekans = new Venenoso("Ekans",35,60,44,"Picada de Veneno","Gunk Shot");
        Pokemon zubat = new Venenoso("Zubat",40,45,35,"Presa Venenosa","Venoshock");
        Pokemon mrMime = new Psiquico("Mr Mine",40,45,56,"Psybeam","Truque");
        Pokemon drowzee = new Psiquico("Drowzee",60,48,45,"Psybeam","Visao do Futuro");
        Pokemon cubone = new Terrestre("Cubone",45,50,57,"Bonemerang","Birmania Pisando");
        Pokemon diglett = new Terrestre("Diglett",30,55,33,"Aatque de Areia","Escavacao");

        Treinador brock = new Treinador("Brock",geodude,onix);
        Treinador misty = new Treinador("Misty",staryu,horsea);
        Treinador blaine = new Treinador("Blaine",growlithe,vulpix);
        Treinador erika = new Treinador("Erika",bellsprout,oddish);
        Treinador koga = new Treinador("Koga",ekans,zubat);
        Treinador giovanni = new Treinador("Gioavanni",cubone,diglett);
        Treinador surge = new Treinador("Surge",pikachu,magnemite);
        Treinador sabrina = new Treinador("Sabrina",mrMime,drowzee);
        
        System.out.print("Digite o seu nome: ");
        String jogadorNome = ler.next();
        Treinador jogador = new Treinador(jogadorNome);
        jogador.escolhaDePokemon();

    }

}
