/*Escreva o código para implementar a seguinte hierarquia de classes */

package Questão1;

/**
 *
 * @author W4ND3K0
 */
public class Animal {
    private String Nome_Animal;
    
    public String getNome_Animal(){
        return this.Nome_Animal;
    }
    
    public void setNome_Animal(String n){
        this.Nome_Animal = n;
    }
    
    public Animal(String n){
        this.setNome_Animal(n);
    }
    
    public void Imprime(){
        System.out.println("Nome:" + this.getNome_Animal());
    }
    
    public void talk(){
        
    }
}
