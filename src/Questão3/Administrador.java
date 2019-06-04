/*c) Cria uma classe Administrador que herde da classe Empregado. Atributos:
ajudaDeCusto (ajudas referentes a estadia, viagens, etc). Na classe
Administrador o método calcularSalario deve ser redefinido de tal forma que o
cálculo leve em consideração a ajudaDeCusto. Crie um construtor para setar
todos os atributos da classe Administrador. Crie os gets e sets  */
package Questão3;

/**
 *
 * @author W4ND3K0
 */
public class Administrador extends Empregado{
    
    private double AjudadeCusto;
    
    public double getAjudadeCusto(){
        return this.AjudadeCusto;
    }
    
    public void setAjudadeCusto(double a){
        this.AjudadeCusto = a;
    }
    
    public Administrador(String n, String e, String t, String c, double b, double i, double a){
        super(n, e, t, c, b, i);
        this.setAjudadeCusto(a);
    }
    
    public double CalcularSalario(double s){
        s = this.getSalarioBase() + this.AjudadeCusto -(((this.getSalarioBase()+this.AjudadeCusto)/100)*this.getImposto());
        return s;
    }
    
}
