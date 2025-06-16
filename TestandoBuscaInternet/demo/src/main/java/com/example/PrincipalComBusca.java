package com.example;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        BuscadorFilmes buscador = new BuscadorFilmes();
        ArquivoFilme arquivo = new ArquivoFilme();
        

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Insira um filme:");
            busca = scan.nextLine();// Com isso consigo inferir qual o tipo que quero

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            try{
                Titulo meuTitulo = buscador.buscarTitulo(busca);
                titulos.add(meuTitulo);//Adiciona na lista
                System.out.println(meuTitulo);
            }catch(Exception e){
                System.out.println("Erro de conversão");
            }
            
            try{
                arquivo.salvarFilmes(titulos);//Salva no arquivo "filmes.json"
            }catch(IOException e){
                System.out.println("Erro ao salvar arquivo!");
            }

        }

        System.out.println("O programa finalizou corretamente");
        
    }

}
