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
public class Animal {

    private int idade;
    private String raca;
    private String nome;
    

    public Animal() {

    }

    public Animal(int idade, String raca, String nome) {
        this.idade = idade;
        this.raca = raca;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setINome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void comer() {
        System.out.println("Estou comendo ");
    }

    public void dormir() {
        System.out.println("Estou dormindo ");
    }

    public void som() {
        System.out.println("Estou emitindo som ");
    }

}
