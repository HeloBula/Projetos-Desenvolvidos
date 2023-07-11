package com.mycompany.jogoforca;

/**Essa interface define os métodos para adicionar e remover pontos do usuário.
 *
 * @author Ana Beatriz Gomes Takehara, Heloísa Silveira Bula e Lara Cesquini Stopa
 */
public interface Pontos 
{    
    public void adicionarPontosFacil(Usuario contaLogada);
    public void adicionarPontosMedio(Usuario contaLogada);
    public void adicionarPontosDificil(Usuario contaLogada);
    public void removerPontos(Usuario contaLogada, Number quantidade);   
}
