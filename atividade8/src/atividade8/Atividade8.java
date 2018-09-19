/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade8;

/**
 *
 * @author Ufjf
 */
public class Atividade8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salario: " + f1.getSalario());
        System.out.println("Idade: " + f1.getIdade());
        System.out.println("Cargo: " + f1.getCargo());
        System.out.println("Matricula: " + f1.getMatricula() + "\n");
        
        Funcionario f2= new Funcionario("CAIO", 25);
         System.out.println("Nome: " + f1.getNome());
        System.out.println("Salario: " + f1.getSalario());
        System.out.println("Idade: " + f1.getIdade());
        System.out.println("Cargo: " + f1.getCargo());
        System.out.println("Matricula: " + f1.getMatricula() + "\n");
        
        Funcionario f3 = new Funcionario(201665568, "MATHEUS", 1600);
         System.out.println("Nome: " + f1.getNome());
        System.out.println("Salario: " + f1.getSalario());
        System.out.println("Idade: " + f1.getIdade());
        System.out.println("Cargo: " + f1.getCargo());
        System.out.println("Matricula: " + f1.getMatricula() + "\n");
        
        f1.numeroFuncionario();

    }

}
