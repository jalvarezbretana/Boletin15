/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import persoal.Persoal;

/**
 *
 * @author jalvarezbretana
 */
public class Academica {

    private int numReferencia;
    public static int referencia = 2020;
    private String nome;
    private float nota;
    private Persoal alum = new Persoal();

    public Academica() {
        numReferencia = referencia;
        referencia++;
    }

    public Academica(String nome, float nota, Persoal alum) {
        numReferencia = referencia;
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
        referencia++;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return ("nome = " + nome + "\nnumReferencia = " + numReferencia + "\nnota = " + nota + alum.toString());
    }
}
