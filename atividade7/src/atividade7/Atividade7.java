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
public class Atividade7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Estoque p1 = new Estoque("Impressora Jato de Tinta",6,13);
     Estoque p2 = new Estoque("Monitor LCD",13,11);
     Estoque p3 = new Estoque("Mouse Optico",2,6);
     Estoque p4 = new Estoque("Placa de video",2,4);
     
     p1.situacao();
     p2.situacao();
     p3.situacao();
     
     p1.baixa(5);
     p2.repor(7);
     p3.baixa(4);
     p1.precisaRepor();
     p2.precisaRepor();
     p3.precisaRepor();
     
     p1.situacao();
     p2.situacao();
     p3.situacao();
     
     
     
        
    }
    
}
