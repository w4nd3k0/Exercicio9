
package Questão1;

/**
 *
 * @author W4ND3K0
 */
public class Ave extends Animal{
    
    private boolean Voa;
    
    public boolean getVoa(){
        return this.Voa;
    }
    
    public void setVoa(boolean v){
        this.Voa = v;
    }
    
    public Ave(String n, boolean v){
        super(n);
        this.setVoa(v);
    }
    
    public void talk(){
        System.out.println("Piu-Piu");
    }
}
