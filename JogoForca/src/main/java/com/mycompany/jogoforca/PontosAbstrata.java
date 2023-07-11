package com.mycompany.jogoforca;

/**Essa classe implementa a interface Pontos e utiliza generics para representar a quantidade de pontos e tentativas.
 *
 * @author Ana Beatriz Gomes Takehara, Heloísa Silveira Bula e Lara Cesquini Stopa
 * @param <T> Tipo genérico que deve herdar de número.
 */
public abstract class PontosAbstrata<T extends Number> implements Pontos 
{
    private T quantidade;
    private T tentativas;
   
    @Override
    public abstract void adicionarPontosFacil(Usuario contaLogada);
    
    @Override
    public abstract void adicionarPontosMedio(Usuario contaLogada);
    
    @Override
    public abstract void adicionarPontosDificil(Usuario contaLogada);
    
    @Override
    public abstract void removerPontos(Usuario contaLogada, Number quantidade);

    /**Esse método retorna a quantidade de pontos.
     * 
     * @return Quantidade de pontos.
     */
    public T getQuantidade() 
    {
        return quantidade;
    }

    /**Esse método seta a quantidade de pontos.
    * 
    * @param quantidade Quantidade de pontos.
    */
    public void setQuantidade(T quantidade) 
    {
        this.quantidade = quantidade;
    }
    
    /**Esse método retorna a quantidade de tentativas.
    * 
    * @return Quantidade de tentativas.
    */
    public T getTentativas() 
    {
        return tentativas;
    }

    /**Esse método seta a quantidade de tentativas.
    * 
     * @param tentativa Quantidade de tentativas
    */
    public void setTentativas(T tentativa) 
    {
        this.tentativas = tentativa;
    }
}
