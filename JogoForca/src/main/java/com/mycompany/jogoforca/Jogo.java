package com.mycompany.jogoforca;

import java.util.ArrayList;
import java.util.Random;

/**Essa classe será utilizada para fazer as operações do Jogo.
 *
 * @author Ana Beatriz Gomes Takehara, Heloísa Silveira Bula e Lara Cesquini Stopa
 */
public class Jogo 
{
    private ArrayList<Palavras> palavras = new ArrayList<>();
    private Partida partidaAtual = new Partida();
    private Usuario contaLogada;
    
    /**Essa método irá criar e adicionar as palavras que estarão disponíveis na lista de palavras de jogo.
     * 
     * @param palavra Palavra.
     * @param dificuldade Dificuldade de palavra.
     * @param categoria Categoria da palavra.
     * @param dicaUm Dica um da palavra.
     * @param dicaDois Dica dois da palavra.
     */
    public void cadastrarPalavra(String palavra, String dificuldade, String categoria, String dicaUm, String dicaDois)
    {
        Palavras novo = new Palavras();
        novo.setCategoria(categoria);
        novo.setDicaDois(dicaDois);
        novo.setDicaUm(dicaUm);
        novo.setDificuldade(dificuldade);
        novo.setPalavra(palavra);
        palavras.add(novo);
    }
    
    /**Esse método irá fazer o sorteio de palavras quando o usuário começar uma partida. Nele, uma palavra do nível escolhido pelo usuário será sorteada, e caso todas as palavras daquele nível já tiverem sido sorteadas uma exceção do tipo NivelIndisponivelException será lançada.
     * 
     * @param dificuldade Dificuldade escolhida pelo usuário.
     * @return Palavra sorteada.
     * @throws NivelIndisponivelException Será lançada quando as palavras do nível escolhido acabarem.
     */
    public Palavras palavraJogo(String dificuldade) throws NivelIndisponivelException 
    {
        Random rand = new Random();
        int indicePalavra;
        int[] indicesSorteados = new int[palavras.size()];
        int i = 0, k = 0, verifica = 0;
        
        for(int j=0; j < palavras.size(); j++)
        {
            indicesSorteados[j] = -1;
        }
        
        do
        {
            indicePalavra = rand.nextInt(palavras.size());
            
            
            for(int j=0; j < palavras.size(); j++)
            {
                if(indicesSorteados[j] == indicePalavra)
                {
                    i--;
                    verifica = 1;
                }
            }
            
            if(verifica == 0)
            {
                indicesSorteados[k] = indicePalavra;
                k++;
            }
                
            verifica = 0;
            i++;
            
            
            if(i >= palavras.size())
            {
                throw new NivelIndisponivelException ("Você zerou esse nível!");
            }
            
        } while(verificaPalavra(indicePalavra, dificuldade) == false);
       
        return palavras.get(indicePalavra);
     
    }
    
    /**Esse método irá verificar se a palavra sorteada já foi jogada.
     * 
     * @param indicePalavra Índice da palavra sorteada.
     * @param dificuldade Dificuldade Dificuldade da palavra sorteada.
     * @return FALSE, se a palavra já tiver sido jogada pelo usuário, ou TRUE se a palavra não tiver sido jogada ainda.
     */
    public boolean verificaPalavra(int indicePalavra, String dificuldade)
    {
        for(Integer percorreIndices : contaLogada.getIndicesPalavras())
        {
            if(indicePalavra == percorreIndices)
            {
                return false;
            }
        }
        
        if(palavras.get(indicePalavra).getDificuldade().equals(dificuldade))
        {
            return true;
        }
        
        return false;
    }
    
    /**Esse método atribui a conta passada como parâmetro para contaLogada.
     * 
     * @param usuario Usuário que será logado.
     */
    public void logarUsuario(Usuario usuario)
    {
        contaLogada = usuario;
    }
    
    /**Esse método verifica se a senha digitada pelo usuário é igual a senha atribuida por ele a hora do cadastro.
     * 
     * @param senhaUser Senha atribuída na hora do cadastro.
     * @param senhaDigitada Senha digitada na hora do login.
     * @throws SenhaIncorretaException Esse exceção é lançada quando o usuário digitar uma senha que não é correta.
     */
    public void verificaSenha(String senhaUser, String senhaDigitada) throws SenhaIncorretaException
    {
        if(senhaUser.equals(senhaDigitada))
        {
            return;
        }
        
        throw new SenhaIncorretaException("Senha incorreta");
    }
    
    /**Esse método retorna um objeto do tipo Usuário que representa a conta logado no jogo.
     * 
     * @return Usuário logado.
     */
    public Usuario getUsuario()
    {
        return contaLogada;
    }
    
    /**Esse método retorna a partida que será jogada pelo usuário.
     * 
     * @return Um objto do tipo Partida que representa a partida atual.
     */
    public Partida getPartida()
    {
        return partidaAtual;
    }
    
    /**Esse método retorna a lista de palavras disponíveis.
     * 
     * @return Lista de palavras.
     */
    public ArrayList<Palavras> getPalavras()
    {
        return palavras;
    }
    
}
