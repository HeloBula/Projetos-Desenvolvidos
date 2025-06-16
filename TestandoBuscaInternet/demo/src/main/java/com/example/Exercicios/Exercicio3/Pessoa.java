package com.example.Exercicios.Exercicio3;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String cidade;

    public Pessoa(String nome, int idade, String cidade){
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public Pessoa(Pessoa_imuta pesso) {
        this.nome = pesso.nome();
        this.idade = pesso.idade();
        this.cidade = pesso.cidade();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", idade=" + idade + ", cidade=" + cidade + "]";
    }

    
}
