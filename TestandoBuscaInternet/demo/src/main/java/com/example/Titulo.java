package com.example;

import com.google.gson.annotations.SerializedName;

public class Titulo {
    @SerializedName("Title")//Funcionam como interface, ensina o que a palavra está representando
    private String nome;//, ou seja, se ver Title, vai ser o nome
    @SerializedName("Year")
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvalaicoes;
    private int duracaoEmMinutos;

    
    public Titulo(String nome, int anoLancamento){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if(meuTituloOmdb.year().length() > 4){
            throw new AnoInvalidoException("Não foi possível converter o ano por ter mais de 4 caracteres")
;        }
        this.anoLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 3));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalDeAvalaicoes() {
        return totalDeAvalaicoes;
    }

    public void setTotalDeAvalaicoes(int totalDeAvalaicoes) {
        this.totalDeAvalaicoes = totalDeAvalaicoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return "[(nome =" + nome + ", anoLancamento =" + anoLancamento + ", duração =" + duracaoEmMinutos + ")" + "]";
    }

}
