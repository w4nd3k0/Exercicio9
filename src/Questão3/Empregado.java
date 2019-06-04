/*Crie uma classe Empregado, que herde da classe Pessoa. Atributos:
codigoSetor, salarioBase (vencimento base) e imposto (porcentagem retida dos
impostos). Métodos: calcularSalario (leve em consideração o salario base e o
imposto). Crie um construtor para setar todos os atributos da classe
Empregado. Crie os gets e sets.  */
package Questão3;

/**
 *
 * @author W4ND3K0
 */
public class Empregado extends Pessoa{
    
    private String CodigoSetor;
    private double SalarioBase;
    private double Imposto;
      
    public String getCodigoSetor(){
        return this.CodigoSetor;
    }
    
    public double getSalarioBase(){
        return this.SalarioBase;
    }
    
    public double getImposto(){
        return this.Imposto;
    }
    
    public void setCodigoSetor(String c){
        this.CodigoSetor = c;
    }
    
    public void setSalarioBase(double b){
        this.SalarioBase = b;
    }
    
    public void setImposto(double i){
        this.Imposto = i;
    }
    
    public Empregado(String n, String e, String t, String c, double b, double i){
        super(n, e, t);
        this.setCodigoSetor(c);
        this.setSalarioBase(b);
        this.setImposto(i);
    }
    
    public double CalcularSalario(double s){
        s = this.getSalarioBase()-((this.getSalarioBase()/100)*this.getImposto());
        return s;
    }
}
