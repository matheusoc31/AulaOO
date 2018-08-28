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
public class Cachorro {
    
    private String raca;
    private String cor;
    private int idade;
    
    
    public Cachorro(String raca, String cor, int idade)
    {
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
    }
    
    public Cachorro()
    {
        
    }
    
    public String getRaca()
    {
      return raca; 
    }
    
     public String getCor()
    {
        return cor;
    }
     
     public int getIdade()
    {
        return idade;
    }
     
     public void setRaca(String raca)
     {
       this.raca = raca;
     }
     
       public void setCor(String cor)
     {
         this.cor = cor;
     }
    
       public void setIdade(int idade)
     {
       this.idade = idade;
     }


}
