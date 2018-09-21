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
public class Trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pokemon poke = new Pokemon();
        
        int d1 = poke.danoBonus();
        System.out.println(d1);

        int d2 = poke.danoBonus();
        System.out.println(d2);

   

    }

}
