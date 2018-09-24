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
public class Canino extends Animal {

    public Canino(int idade, String raca, String nome) {
        super(idade, raca, nome);
    }

    public Canino(String nome) {
        super(nome);
    }

    
    public Canino() {
    }

    public void som() {
        System.out.println("");
    }

}
