package com.example.ArquivoEmJava;

public class Veiculo {
    private String nome;
    private String marca;
    private int ano;
    private int chassi;
    
    public Veiculo(String nome, String marca, int ano, int chassi) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.chassi = chassi;
    }

    public Veiculo() {
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public int getChassi() {
        return chassi;
    }

    
}
