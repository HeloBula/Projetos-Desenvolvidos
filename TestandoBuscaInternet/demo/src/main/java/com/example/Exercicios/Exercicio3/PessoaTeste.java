package com.example.Exercicios.Exercicio3;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PessoaTeste {
    public static void main(String[] args) {
        String texto = """
        {
            "Nome": "Heloisa",
            "Cidade": "Tanabi",
            "Telefone": 263548459
        } 
     """;

     Gson json = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .create();

    Pessoa_imuta pesso = json.fromJson(texto, Pessoa_imuta.class);
    Pessoa pessoa = new Pessoa(pesso);
    System.out.println("Classe pessoa:");
    System.out.println(pessoa);            
    }
}
