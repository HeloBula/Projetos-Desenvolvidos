package com.example.Exercicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {//AIzaSyBmOL98UD7cjIIq0iykHrr6a9sbAkeMesw
    public static void main(String[] args) throws IOException, InterruptedException {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um Livro:");
        var busca = scan.nextLine();//Com isso consigo inferir qual o tipo que quero
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca +
            "&langRestrict=pt&key=AIzaSyBmOL98UD7cjIIq0iykHrr6a9sbAkeMesw";//Busca pelo que a pessoa deseja

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(endereco))//A url
                .build();

        HttpResponse<String> resposta = cliente
                .send(requisicao, HttpResponse.BodyHandlers.ofString());

        System.out.println(resposta.body());
    }
}
