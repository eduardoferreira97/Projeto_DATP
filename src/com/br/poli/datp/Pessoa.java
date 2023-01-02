package com.br.poli.datp;

//Classe que extende para professor
public class Pessoa {
    
    //Variável
    private String nome;
    
    //Método especial (Construtor) 
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    //Métodos get e set da variável nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
