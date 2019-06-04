/*Crie uma classe TestaAnimais que contenha o main e:
a) Crie um papagaio, dê valor aos seus atributos e chame o método talk e
imprime;
b) Crie uma arara, dê valor aos seus atributos e chame o método talk e imprime;
c) Crie um cachorro, dê valor aos seus atributos e chame o método talk e imprime;
d) Crie uma vaca, dê valor aos seus atributos e chame o método talk e imprime. */

package Questão2;
import Questão1.Papagaio;
import Questão1.Arara;
import Questão1.Cachorro;
import Questão1.Vaca;

/**
 *
 * @author W4ND3K0
 */
public class TestaAnimais {
    
    public static void main(String[] args) {
        Papagaio p1 = new Papagaio("Loro", true, "Biscoito!");
        p1.Imprime();
        p1.Talk();
        
        Arara a1 = new Arara("Ara", true);
        a1.Imprime();
        a1.Talk();
        
        Cachorro c1 = new Cachorro("Hunter", 4, true);
        c1.Imprime();
        c1.Talk();
        
        Vaca v1 = new Vaca("Pachola", 4, true);
        v1.Imprime();
        v1.Talk();
    }
}
