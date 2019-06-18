
package Questão1;

/**
 *
 * @author W4ND3K0
 */
public abstract class Mamifero extends Animal{
    
    private int Patas;
    
    public int getPatas(){
        return this.Patas;
    }
    
    public void setPatas(int p){
        this.Patas = p;
    }
    
    public Mamifero(String n, int p){
        super(n);
        this.setPatas(p);
    }
    public abstract void talk();
}
