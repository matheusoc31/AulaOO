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
public class Funcionario {

    private int matricula;
    private String nome;
    private int idade;
    private String cargo;
    private int salario;
    private int numFuncionario;

    public Funcionario() {
        salario = 1500;
        numFuncionario++;

    }

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        numFuncionario++;
    }

    public Funcionario(int matricula, String nome, int salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        numFuncionario++;

    }

    
    
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSalario() {
        return salario;
    }

    
    
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    
    public void numeroFuncionario()
    {
        System.out.println("EXISTE " + numFuncionario + " FUNCIONARIOS");
    }
}
