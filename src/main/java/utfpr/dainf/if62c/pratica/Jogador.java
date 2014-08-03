/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.dainf.if62c.pratica;

/**
 *
 * @author Geovana
 */
public class Jogador implements Comparable<Jogador> {
    int numero;
    String nome;

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }
    
    public Jogador(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return numero + " - " + nome;
    }

    @Override
    public int compareTo(Jogador jogador) {
        return numero - jogador.numero;
    }
}
