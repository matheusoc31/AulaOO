/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladeheranca;

/**
 *
 * @author ice
 */
public class AulaDeHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal = new Animal(13,"azul","amarelo");
        animal.comer();
        animal.dormir();
        animal.som();
        
        Cachorro cao = new Cachorro();
        cao.comer();
        cao.dormir();
        cao.som();
        
        
        // TODO code application logic here
    }
    
}
