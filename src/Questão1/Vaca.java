
package Questão1;

/**
 *
 * @author W4ND3K0
 */
public class Vaca extends Mamifero{
    
    private boolean TemLeite;
    
    public boolean getTemLeite(){
       return this.TemLeite;
    }
    
    public void setTemLeite(boolean t){
        this.TemLeite = t;
    }
    
    public boolean isTemLeite(){
        return true;
    }
    
    public void Talk(){
        System.out.println("Muuu");
    }
    
    public Vaca(String n, int p, boolean t){
        super(n, p);
        this.setTemLeite(t);
    }
    
}
