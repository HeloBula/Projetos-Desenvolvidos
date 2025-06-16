package com.example.ArquivoEmJava;

import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConstroiVeiculo {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Mobi", "FIAT", 2021, 1234);

        Gson gs = new GsonBuilder()
            .setPrettyPrinting()
            .create();

        String car = gs.toJson(carro);//COnvert3e para json
        System.out.println(car);

        try{
            FileWriter arquivo = new FileWriter("carro.json");
            arquivo.write(car);//Salva o json no arquivo
            arquivo.close();
        }catch(Exception e){
            System.out.println("Erro ao salvar no arquivo!");
        }
    }
}
