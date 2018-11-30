/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2018.outras;

/**
 * Classe para objetos do tipo Insiginia onde serão contidos valores e metodos
 * para o mesmo
 *
 * @author Matheus de Oliveira Carvalho
 */
public class Insignia {

    private String nome;

    /**
     * Metodo para instanciar um objeto da classe Insignia
     *
     * @param nome string-Nome da insigina.
     */
    public Insignia(String nome) {
        this.nome = nome;
    }

    /*
    FUNÇÃO GET
     */
    public String getNome() {
        return nome;
    }

    /*
    FUNÇÃO SET
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}
