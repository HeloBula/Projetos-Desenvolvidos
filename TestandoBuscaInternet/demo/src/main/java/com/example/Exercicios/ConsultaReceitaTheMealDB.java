package com.example.Exercicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaReceitaTheMealDB {//Não importa a refeição, retorna null

    public static void main(String[] args) throws IOException, InterruptedException {
        @SuppressWarnings("resource")
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome da receita para a busca: ");
        var nomeCategoria = leitura.nextLine();
        //Buscando as receitas de uma categoria
        String endereco = "https://www.themealdb.com/api/json/v1/1/filter.php?c=" + nomeCategoria;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}