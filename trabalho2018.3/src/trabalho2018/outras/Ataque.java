/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2018.outras;

/**
 * Classe para objetos do tipo Ataque onde serão contidos valores e metodos para
 * o mesmo
 *
 * @author Matheus de Oliveira Carvalho
 */
public class Ataque {

    private String nome;
    private int valor;

    /**
     * Metodo para intanciar um objeto da classe Ataque.
     *
     * @param nome string-Nome do ataque.
     * @param valor int-Força do ataque.
     */
    public Ataque(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    /* FUNÇÕES GETTER */
    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }

}
