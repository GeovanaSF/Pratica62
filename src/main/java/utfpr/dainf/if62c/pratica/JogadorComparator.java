/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author Geovana
 */
public class JogadorComparator implements Comparator<Jogador>{
    String s1;
    String s2;
    public JogadorComparator(String s1,String s2){
        this.s1 = s1;
        this.s2 = s2;
    }
    @Override
    /*public int compare(Jogador j1, Jogador j2) {
        
        //if (j1.compareTo(j2)==0)
        //    return j1.getNome().compareTo(j2.getNome());
        if(j1.getNome().compareTo(j2.getNome())==0)
            return j1.numero - j2.numero;
        else
            return j2.getNome().compareTo(j1.getNome());
    }*/
    
    public int compare(Jogador j1, Jogador j2) {
        if (s1.compareTo("nome")==0) {
            if(s1.compareTo("cres")==0){
                if(j1.getNome().compareTo(j2.getNome())==0)
                    return j1.numero - j2.numero;
                else
                    return j1.getNome().compareTo(j2.getNome());
            }else{
                if(j1.getNome().compareTo(j2.getNome())==0)
                    return j2.numero - j1.numero;
                else
                    return j2.getNome().compareTo(j1.getNome());
            }
        }else{
            if(s1.compareTo("cres")==0){
                if(j1.compareTo(j2)==0)
                    return j1.getNome().compareTo(j2.getNome());
                else
                    return j1.numero - j2.numero;
            }else{
                if(j1.compareTo(j2)==0)
                    return j2.getNome().compareTo(j1.getNome());
                else
                    return j2.numero - j1.numero;
            }
        }
    }
}
