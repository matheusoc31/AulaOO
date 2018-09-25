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
public class Cachorro extends Canino {

    public Cachorro(int idade, String raca, String nome) {
        super(idade, raca, nome);
    }

    public Cachorro(String nome) {
        super(nome);
    }

        
    public Cachorro() {
    }

    public void som() {
        System.out.println("Latindo");
    }

}
