package com.mycompany.jogoforca;

/**Essa classe vai herdar de Pontos Abstrata e representa os pontos usados para comprar chances.
 *
 * @author Ana Beatriz Gomes Takehara, Heloísa Silveira Bula e Lara Cesquini Stopa
 */
public class PontosChance extends PontosAbstrata 
{    
    /**Esse método será utilizado para calcular a quantidade de pontos que o usuário vai ganhar quando acertar uma palavra fácil.
     * 
     * @param contaLogada Conta do usuário que está jogando.
     */
    @Override
    public void adicionarPontosFacil(Usuario contaLogada) 
    {
        contaLogada.getPontoChance().setQuantidade((Integer)contaLogada.getPontoChance().getQuantidade() + ((Integer)super.getTentativas()*2));
    }

    /**Esse método será utilizado para calcular a quantidade de pontos que o usuário vai ganhar quando acertar uma palavra médio.
     * 
     * @param contaLogada Conta do usuário que está jogando.
     */
    @Override
    public void adicionarPontosMedio(Usuario contaLogada) 
    {
        contaLogada.getPontoChance().setQuantidade((Integer)contaLogada.getPontoChance().getQuantidade() + ((Integer)super.getTentativas()*5));
    }
    
    /**Esse método será utilizado para calcular a quantidade de pontos que o usuário vai ganhar quando acertar uma palavra difícil.
     * 
     * @param contaLogada Conta do usuário que está jogando.
     */
    @Override
    public void adicionarPontosDificil(Usuario contaLogada) 
    {
        contaLogada.getPontoChance().setQuantidade((Integer)contaLogada.getPontoChance().getQuantidade() + ((Integer)super.getTentativas()*7));
    }
    
    /**Esse método será utilizado para calcular a quantidade de pontos que serão removidos do usuário quando ele comprar uma chance.
     * 
     * @param contaLogada Conta do usuário que está jogando.
     * @param quantidade Quantidade de pontos que serão removidos.
     */
    @Override
    public void removerPontos(Usuario contaLogada, Number quantidade) 
    {      
        contaLogada.getPontoChance().setQuantidade((Integer)contaLogada.getPontoChance().getQuantidade() - (Integer)quantidade);
    }
}
