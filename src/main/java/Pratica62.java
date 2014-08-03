
import java.util.ArrayList;
import java.util.Collections;
import utfpr.dainf.if62c.pratica.Jogador;
import utfpr.dainf.if62c.pratica.JogadorComparator;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica62 {
    public static void main(String[] args) {
        ArrayList<Jogador> time = new ArrayList<>();
        time.add(new Jogador(12, "Júlio César"));
        time.add(new Jogador(10, "Neymar"));
        time.add(new Jogador(8, "David Luiz"));
        time.add(new Jogador(11, "Oscar"));
        //Collections.sort(time);
        for(Jogador j: time){
            System.out.println(j);
        }
        System.out.println("\n");
        String s1 = "nome";
        String s2 = "cres";
        Collections.sort(time, new JogadorComparator(s1,s2));
        for(Jogador j: time){
            System.out.println(j);
        }
    }
}
