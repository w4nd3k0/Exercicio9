/* Cria uma Classe Operario que herde de Empregado. Atributos: valorProducao
(valor monetário dos artigos efetivamente produzidos pelo operario) e comissao
(porcentagem do valorProducao que será adicionado ao salário do operário).
Redefina o método calcularSalario para levar em consideração a comissao. Crie
um construtor para setar todos os atributos da classe Operario. Crie os gets e
sets.  */

package Questão3;

/**
 *
 * @author W4ND3K0
 */
public class Operario extends Empregado{
    
    private double ValorProducao;
    private double Comissão;
    
    public double getValorProducao(){
        return this.ValorProducao;
    }
    
    public double getComissão(){
        return this.Comissão;
    }
    
    public void setValorProducao(double p){
        this.ValorProducao = p;
    }
    
    public void setComissão(double o){
        this.Comissão = o;
    }
    
    public Operario(String n, String e, String t, String c, double b, double i, double p, double o){
        super(n, e, t, c, b, i);
        this.setValorProducao(p);
        this.setComissão(o);
    }
    
    public double CalcularSalario(double s, double p){
        
        p = ((this.getValorProducao()/100)*this.getComissão());
        
        s = this.getSalarioBase()+p-(((p+this.getSalarioBase())/100)*this.getImposto());
        return s;
    }
}
