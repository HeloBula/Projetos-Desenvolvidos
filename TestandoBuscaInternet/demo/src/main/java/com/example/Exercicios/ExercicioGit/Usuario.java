package com.example.Exercicios.ExercicioGit;

public class Usuario {
    private String login;
    private String id;
    private String bio;
    private String url;
    private String local;

    public Usuario(Perfil perfil){
        this.login = perfil.login();
        this.id = perfil.id();
        this.bio = perfil.bio();
        url = perfil.html_url();
        local = perfil.location();
    }

    // Getters (ou toString para simplificar)
    @Override
    public String toString() {
        return "Usuário: " + login +
               "\nId: " + id +
               "\nBio: " + bio +
               "\nURL: " + url +
               "\nLocal: " + local;
    }
}
