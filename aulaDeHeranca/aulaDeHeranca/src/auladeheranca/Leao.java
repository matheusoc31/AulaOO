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
public class Leao extends Felino {

    public Leao() {
    }

    public Leao(int idade, String raca, String nome) {
        super(idade, raca, nome);
    }

    public Leao(String nome) {
        super(nome);
    }

    
    public void som() {
        System.out.println("Rugido");
    }

}
