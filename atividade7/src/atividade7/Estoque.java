/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade7;

/**
 *
 * @author Ufjf
 */
public class Estoque {

    private String nome;
    private int quantMinima;
    private int quantAtual;

    public Estoque(String nome, int quantMinima, int quantAtual) {
        this.nome = nome;
        this.quantMinima = quantMinima;
        this.quantAtual = quantAtual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantMinima(int quantMinima) {
        this.quantMinima = quantMinima;
    }

    public void repor(int produtos) {
        quantAtual = quantAtual + produtos;

    }

    public void baixa(int vendidos) {
        if (quantAtual == 0) {
            System.out.println("Nao existe produto no estoque. Favor repor imediatamente \n");
        } else {
            if (quantAtual - vendidos < 0) {
                System.out.println("Nao existe produtos suficientes no estoque.\n");
            } else {
                quantAtual = quantAtual - vendidos;
            }
        }
    }

    public void situacao() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Quantidade Minima: " + quantMinima);
        System.out.println("Qauntidade Atual: " + quantAtual + "\n");
    }
    
    public void precisaRepor()
    {
        if(quantAtual <= quantMinima)
        {
            System.out.println("Quantidade atual do " + nome + " menor ou igual que a minima!!");
            System.out.println("Favor repor com urgência \n");
        }
        
    }

}
