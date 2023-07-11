package com.mycompany.jogoforca;

/**Essa classe vai herdar de Pontos Abstrata e representa os pontos usados para comprar dicas.
 *
 * @author Ana Beatriz Gomes Takehara, Heloísa Silveira Bula e Lara Cesquini Stopa
 */
public class PontosDicas extends PontosAbstrata
{
    /**Esse método será utilizado para calcular a quantidade de pontos que o usuário vai ganhar quando acertar uma palavra fácil.
     * 
     * @param contaLogada Conta do usuário que está jogando.
     */
    @Override
    public void adicionarPontosFacil(Usuario contaLogada) 
    {
        contaLogada.getPontoDica().setQuantidade((Double)contaLogada.getPontoDica().getQuantidade() + 10.0);
    }
    
    /**Esse método será utilizado para calcular a quantidade de pontos que o usuário vai ganhar quando acertar uma palavra média.
     * 
     * @param contaLogada Conta do usuário que está jogando.
     */
    @Override
    public void adicionarPontosMedio(Usuario contaLogada) 
    {
        contaLogada.getPontoDica().setQuantidade((Double)contaLogada.getPontoDica().getQuantidade() + 20.0);
    }

    /**Esse método será utilizado para calcular a quantidade de pontos que o usuário vai ganhar quando acertar uma palavra difícil.
     * 
     * @param contaLogada Conta do usuário que está jogando.
     */
    @Override
    public void adicionarPontosDificil(Usuario contaLogada) 
    {
        contaLogada.getPontoDica().setQuantidade((Double)contaLogada.getPontoDica().getQuantidade() + 30.0);
    }
    
    /**Esse método será utilizado para calcular a quantidade de pontos que serão removidos do usuário quando ele comprar uma dica.
     * 
     * @param contaLogada Conta do usuário que está jogando.
     * @param quantidade Quantidade de pontos que serão removidos.
     */
    @Override
    public void removerPontos(Usuario contaLogada, Number quantidade) 
    {
        contaLogada.getPontoDica().setQuantidade((Double)contaLogada.getPontoDica().getQuantidade() - (Double)quantidade);
    }   
}
