package com.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BuscadorFilmes {
    // Preciso ter um cliente
    HttpClient cliente = HttpClient.newHttpClient();
    // Transformar a resposta em uma classe que possamos usar, inclusive o toString.
    // Para isso usamos uma biblioteca
    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()//Organizar de forma bonita
            .create();     
    
    public Titulo buscarTitulo(String nome) throws IOException, InterruptedException{
        String endereco = "https://www.omdbapi.com/?t=" + nome + "&apikey=88b4d6f1";// Busca o que quer
        HttpRequest requisicao = HttpRequest.newBuilder()// E para onde a requisição
                    .uri(URI.create(endereco))// A url
                    .build();
         HttpResponse<String> resposta = cliente
                    .send(requisicao, HttpResponse.BodyHandlers.ofString());
        
        TituloOmdb meuTituloOmdb = gson.fromJson(resposta.body(), TituloOmdb.class);
        return new Titulo(meuTituloOmdb);//Retorna o titulo
    }

           


         
}
