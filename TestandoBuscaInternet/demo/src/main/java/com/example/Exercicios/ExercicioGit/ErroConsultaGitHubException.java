package com.example.Exercicios.ExercicioGit;

public class ErroConsultaGitHubException extends RuntimeException{
    private String mensagem;

    public ErroConsultaGitHubException(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMessage(){
        return this.mensagem;
    }
}
