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
public class Petshop {  
    
    
    private int quantidade =0;
    
    
    public void setQuantidade(int n)
    {
        this.quantidade = n;
    }
    
    public int getQuantidade()
    {
        return quantidade;
    }
    
    public void venda(Cachorro c)
    {
        c = null;
        quantidade--;
    }
    
    public void compra(Cachorro c,String raca, String cor, int idade)
    {
        c = new Cachorro("raca","cor", idade); 
        quantidade++;
    }
            

}