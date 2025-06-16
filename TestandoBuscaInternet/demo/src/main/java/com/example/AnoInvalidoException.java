package com.example;

public class AnoInvalidoException extends RuntimeException{
    private String mensagem;

    public AnoInvalidoException(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMessage(){
        return this.mensagem;
    }
}
