package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ArquivoFilme {
    private final Gson gson = new GsonBuilder()
            .setPrettyPrinting()//Organizar de forma bonita
            .create(); 

    public void salvarFilmes(List<Titulo> titulos) throws IOException{
        FileWriter escrita = new FileWriter("filmes.json");//Abre um arquivo, ou cria se não existe
        escrita.write(gson.toJson(titulos));//Converte a lista em json
        escrita.close();
    }
}
