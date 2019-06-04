
package Questão1;

/**
 *
 * @author W4ND3K0
 */
public class Cachorro extends Mamifero{
    
    private boolean LateAlto;
    
    public boolean getLateAlto(){
        return this.LateAlto;
    }
    
    public void setLateAlto(boolean l){
        this.LateAlto = l;
    }
    
    public void Talk(){
        System.out.println("Au,au");
    }
    
    public boolean isLateAlto(){
        return true;
    }
    
    public Cachorro(String n, int p, boolean l){
        super(n, p);
        this.setLateAlto(l);
    }
}
