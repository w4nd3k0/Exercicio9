/*Cria uma classe Pessoa. Atributos: nome, endereço, telefone. Crie um construtor
para setar todos os atributos da classe Pessoa. Crie os gets e sets. */

package Questão3;

/**
 *
 * @author W4ND3K0
 */
public class Pessoa {
    private String Nome;
    private String Endereço;
    private String Telefone;
    
    public String getNome(){
        return this.Nome;
    }
    
    public String getEndereco(){
        return this.Endereço;
    }
    
    public String getTelefone(){
        return this.Telefone;
    }
    
    public void setNome(String n){
        this.Nome = n;
    }
    
    public void setEndereco(String e){
        this.Endereço = e;
    }
    
    public void setTelefone(String t){
        this.Telefone = t;
    }
    
    public Pessoa(String n, String e, String t){
        this.setNome(n);;
        this.setEndereco(e);
        this.setTelefone(t);
    }
    
}
