/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author ice
 */
public class Main {
    
    public static void main(String[] args) 
    {
        Petshop p = new Petshop(); 
        Cachorro c1 = new Cachorro("poodle","branco",3);
        Cachorro c2 = new Cachorro("pinscher","pret'",5);
        Cachorro c3 = new Cachorro("vira-lata","marrom",9);
        Cachorro c4 = new Cachorro("maltes","branco",1);
        Cachorro c5 = new Cachorro("vira-lata","cinza",3);
        int n = 5;
        
        p.setQuantidade(n);
        
        p.venda(c1);
        p.venda(c2);
        
        Cachorro c6 = new Cachorro();
        p.compra(c6, "vira-lata", "preto", 5);
       
        p.venda(c4);
        
        
        
        
        
        System.out.println("EXISTEM " + p.getQuantidade() + " CACHORRO(S) NA PETSHOP ");
        
        
    }
    
    
}
