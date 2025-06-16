package com.example.Exercicios.ExercicioGit;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TesteExcecaoGit {
    public static void main(String[] args) throws IOException, InterruptedException {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o usuário buscado:");
        String user = scan.nextLine();

        String endereco = "https://api.github.com/users/" + user;

        try{

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            if(response.statusCode()==404){
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub");
            }

            System.out.println(response.body());

            // Para isso usamos uma biblioteca
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create();
            
            Perfil perfil = gson.fromJson(response.body(), Perfil.class);
            System.out.println("Login: " + perfil.login());
            System.out.println("ID: " + perfil.id());
            System.out.println("Bio: " + perfil.bio());
            System.out.println("URL: " + perfil.html_url());
            System.out.println("Localização: " + perfil.location());

        }catch(ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }catch(IOException | InterruptedException e){
            System.out.println("Erro ao consultar API" + e.getMessage());
        }
        
         
    }
    
}
