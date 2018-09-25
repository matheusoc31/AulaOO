/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladeheranca;

import java.util.ArrayList;

/**
 *
 * @author ice
 */
public class AulaDeHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal animal = new Canino(13, "azul", "amarelo");
        animal.comer();
        animal.dormir();
        animal.som();
        System.out.println("\n");

        //Cachorro cao = new Cachorro();
        //cao.comer();
        //cao.dormir();
        //cao.som();
        
        
        ArrayList<Animal> animais = new ArrayList();
        animais.add(new Cachorro("cachoro"));
        animais.add(new Gato("gato"));
        animais.add(new Leao("leao"));
        animais.add(new Lobo("lobo"));
        for (int i = 0; i < animais.size(); i++) {
            animais.get(i).som();
            System.out.println(animais.get(i).toString());
        }
  
        Gato gato1 = new Gato();
        gato1.setINome("Tobias");
        Gato gato2 = new Gato();
        gato2.setINome("Tobias");
        
        System.out.println("\n" + gato1.equals(gato2));

        
        
    }

}
