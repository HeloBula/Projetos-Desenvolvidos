package com.mycompany.jogoforca;

/**Essa classe será utilizada para guardar as palavras que estarão disponíveis no jogo e suas características.
 *
 * @author Ana Beatriz Gomes Takehara, Heloísa Silveira Bula e Lara Cesquini Stopa
 */
public class Palavras 
{
    private String palavra;
    private String dificuldade;
    private String categoria;
    private String dicaUm;
    private String dicaDois;
    private int tentativas = 7;

    /**Esse método retorna a qual é palavra.
     * 
     * @return Palavra.
     */
    public String getPalavra() 
    {
        return palavra;
    }
    
    /**Esse método vai setar a palavra.
     * 
     * @param palavra Palavra. 
     */
    public void setPalavra(String palavra) 
    {
        this.palavra = palavra;
    }

    /**Esse método retorna a qual é a dificuldade da palavra.
     * 
     * @return Dificuldade da palavra.
     */
    public String getDificuldade() 
    {
        return dificuldade;
    }

    /**Esse método vai setar a dificuldad da palavra.
     * 
     * @param dificuldade Dificuldade da palavra. 
     */
    public void setDificuldade(String dificuldade) 
    {
        this.dificuldade = dificuldade;
    }

    /**Esse método retorna a qual é a categoria da palavra.
     * 
     * @return Categoria da palavra.
     */
    public String getCategoria() 
    {
        return categoria;
    }

    /**Esse método vai setar a categoria da palavra.
     * 
     * @param categoria Categoria da palavra. 
     */
    public void setCategoria(String categoria) 
    {
        this.categoria = categoria;
    }

    /**Esse método retorna a primeira dica da palavra.
     * 
     * @return Primeira dica da palavra.
     */
    public String getDicaUm() 
    {
        return dicaUm;
    }

    /**Esse método vai setar a primeira dica da palavra.
     * 
     * @param dicaUm Primeira dica. 
     */
    public void setDicaUm(String dicaUm) 
    {
        this.dicaUm = dicaUm;
    }

    /**Esse método retorna a segunda dica da palavra.
     * 
     * @return Segunda dica da palavra.
     */
    public String getDicaDois() 
    {
        return dicaDois;
    }

    /**Esse método vai setar a segunda dica da palavra.
     * 
     * @param dicaDois Segunda dica. 
     */
    public void setDicaDois(String dicaDois) 
    {
        this.dicaDois = dicaDois;
    }
    
    /**Esse método retorna a quantidade de tentativas que o usuário ainda tem para esta palavra.
     * 
     * @return Quantidade de tentativas.
     */
    public int getTentativa()
    {
        return tentativas;
    }
    
    /**Esse método vai setar a quantidade de tentativas
     * 
     * @param tentativa Quantidade de tentativas. 
     */
    public void setTentativa(int tentativa)
    {
        this.tentativas = tentativa;
    }
}
