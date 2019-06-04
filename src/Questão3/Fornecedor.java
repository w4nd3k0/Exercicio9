/*a) Crie uma classe Fornecedor, que herde da classe Pessoa. Atributos:
valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e
valorDivida (montante da dívida para com o fornecedor). Métodos: obterSaldo()
que devolve a diferença entre os valores dos atributos valorCredito e
valorDivida. Crie um construtor para setar todos os atributos da classe
Fornecedor. Crie os gets e sets. */

package Questão3;

/**
 *
 * @author W4ND3K0
 */
public class Fornecedor extends Pessoa{
    
    private double ValorCredito;
    private double ValorDivida;
    
    public double getValorCredito(){
        return this.ValorCredito;
    }
    
    public double getValorDivida(){
        return this.ValorDivida;
    }
    
    public void setValorCredito(double c){
        this.ValorCredito = c;
    }
    
    public void setValorDivida(double d){
        this.ValorDivida = d;
    }
    
    public double obterSaldo(double s){
        s = this.ValorCredito - this.ValorDivida;
        return s;
    }
    
    public Fornecedor(String n, String e, String t, double c, double d){
        super(n, e, t);
        this.setValorCredito(c);
        this.setValorDivida(d);
    }
}
