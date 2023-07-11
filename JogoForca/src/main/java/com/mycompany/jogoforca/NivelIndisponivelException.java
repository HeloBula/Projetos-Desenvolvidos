package com.mycompany.jogoforca;

/**Essa classe será utilizada para lançar uma exceção quando o usuário já tiver zerado o nível selecionado.
 *
 * @author Ana Beatriz Gomes Takehara, Heloísa Silveira Bula e Lara Cesquini Stopa
 */
public class NivelIndisponivelException extends Exception
{
    public NivelIndisponivelException(String message)
    {
        super(message);
    }
}
