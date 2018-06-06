package com.github.andreendo.testgenerationexamples.ex3;

/**
 *
 * @author andreendo
 */
public class Pessoa {

    String nome;
    double peso, altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
}
