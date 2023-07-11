package com.mycompany.jogoforca;

/**Essa classe será utilizada para lançar uma exceção quando a senha digitada pelo usuário não estiver correta.
 *
 * @author Ana Beatriz Gomes Takehara, Heloísa Silveira Bula e Lara Cesquini Stopa
 */
public class SenhaIncorretaException extends Exception 
{
    public SenhaIncorretaException(String message)
    {
        super(message);
    }
}
