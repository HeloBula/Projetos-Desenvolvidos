package com.mycompany.jogoforca;

/**Essa classe será utilizada para armazenar os dados da partida atual do usuário.
 *
 * @author Ana Beatriz Gomes Takehara, Heloísa Silveira Bula e Lara Cesquini Stopa
 */
public class Partida 
{
    private Palavras palavra;
    
    /**Esse método retorna um objeto do tipo Palavras que está sendo utilizado na partida atual.
     * 
     * @return Objeto do tipo Palavras.
     */
    public Palavras getPalavra() 
    {
        return palavra;
    }

    /**Esse método seta o objeto Palavras da partida.
     * 
     * @param palavra Objeto Palavras da partida atual.
     */
    public void setPalavra(Palavras palavra) 
    {
        this.palavra = palavra;
    }
}
