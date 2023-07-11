package com.mycompany.jogoforca;

import java.util.ArrayList;

/**Essa classe foi criada para armazenar informações sobre o usuário.
 *
 * @author Ana Beatriz Gomes Takehara, Heloísa Silveira Bula e Lara Cesquini Stopa
 */
public class Usuario 
{
    private String nome;
    private String senha;
    private String nomeUser;
    private String email;
    private PontosAbstrata<Double> pontoDica = new PontosDicas();
    private PontosAbstrata<Integer> pontoChance = new PontosChance();
    private ArrayList<Integer> indicesPalavra = new ArrayList<>();
    
    /**Esse método irá retornar o nome do usuário.
     * 
     * @return nome do usuário.
     */
    public String getNome() 
    {
        return nome;
    }

    /**Esse método irá setar o nome do usuário.
     * 
     * @param nome nome do usuário.
     */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    /**Esse método irá retornar a senha do usuário.
     * 
     * @return senha do usuário.
     */
    public String getSenha() 
    {
        return senha;
    }

    /**Esse método irá setar o nome do usuário.
     * 
     * @param senha nome do usuário.
     */
    public void setSenha(String senha) 
    {
        this.senha = senha;
    }

    /**Esse método irá retornar o nome do user do usuário.
     * 
     * @return nome do user do usuário.
     */
    public String getNomeUser() 
    {
        return nomeUser;
    }

    /**Esse método irá setar o nome de user do usuário.
     * 
     * @param nomeUsuario nome de user do usuário.
     */
    public void setNomeUser(String nomeUsuario) 
    {
        this.nomeUser = nomeUsuario;
    }

    /**Esse método irá retornar o email do usuário.
     * 
     * @return nome do usuário.
     */
    public String getEmail() 
    {
        return email;
    }

    /**Esse método irá setar o email do usuário.
     * 
     * @param email email do usuário.
     */
    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    /**Esse método irá retornar um objeto do tipo pontos dica.
     * 
     * @return objetos do ponto dica.
     */
    public PontosAbstrata getPontoDica() 
    {
        return pontoDica;
    }

    /**Esse método irá setar o objeto pontos dica do usuário.
     * 
     * @param pontoDica  um objeto do tipo pontos dica do usuário.
     */
    public void setPontoDica(PontosAbstrata pontoDica) 
    {
        this.pontoDica = pontoDica;
    }

    /**Esse método irá retornar um objeto do tipo pontos chance.
     * 
     * @return objetos do ponto chance.
     */
    public PontosAbstrata getPontoChance() 
    {
        return pontoChance;
    }

    /**Esse método irá setar o objeto pontos chance do usuário.
     * 
     * @param pontoChance um objeto do tipo pontos chance do usuário.
     */
    public void setPontoChance(PontosAbstrata pontoChance) 
    {
        this.pontoChance = pontoChance;
    }

    /**Esse método irá retornar a lista de índices das palavras que já foram jogadas.
     * 
     * @return lista de índices das palavras jogadas.
     */
    public ArrayList<Integer> getIndicesPalavras() 
    {
        return indicesPalavra;
    }

     /**Esse método irá adionar o índice das palavras jogadas pelo usuário.
     * 
     * @param indice índice da palavra.
     */
    public void setIndicePalavra(int indice) 
    {
        indicesPalavra.add(indice);
    }
}
