package ludo;

import controller.JogoLudo;
import controller.Tabuleiro;
import entity.Casa;
import exception.TabuleiroException;
import exception.JogadaException;

/**
 * Class LudoFacade
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class LudoFacade {

    private static LudoFacade ludoFacade;
    private JogoLudo jogoLudo;
    private Tabuleiro tabuleiro;

    private LudoFacade() {
        tabuleiro = new Tabuleiro();
    }

    /**
     * Padrão de projeto Singleton, instancia única no sistema para a fachada.
     * 
     * @return uma instancia da classe LudoFacade
     */
    public static LudoFacade getInstance() {
        if (ludoFacade == null) {
            ludoFacade = new LudoFacade();
        }
        return ludoFacade;
    }

    /**
     * Método para criar um novo jogo.
     * 
     * @param numPecas representa a quantidade de jogadores que tem no jogo,
     * no mínimo 1 jogador.
     * @param tamanhoDado representa o tamanho máximo que o dado pode ter.
     * @return um novo jogo.
     */
    public void criarJogo(int numPecas, int tamanhoDado) {
        jogoLudo = new JogoLudo(tamanhoDado, numPecas);
    }

    /**
     * getNumPecas()
     * 
     * @return quantidades de peças
     */
    public int getNumPecas() {
        return jogoLudo.getNumPecas();
    }

    /**
     * getTamanhoDado
     * 
     * @return o tamanho do dado
     */
    public int getTamanhoDado() {
        return jogoLudo.getTamanhoDado();
    }

    /**
     * getTamanhoTabuleiro
     * 
     * @return o tamanho do tabuleiro
     */
    public int getTamanhoTabuleiro() {
        return tabuleiro.getTamanhoTabuleiro();
    }

    public void adicionaCasa(Casa casa) throws TabuleiroException {
        tabuleiro.adicionaCasa(casa);
    }

    public void jogar(int jogador, int dado) throws JogadaException {
        // implementar
    }

    public String getStatusJogo() {
        // implementar
        return null;
    }

    public void iniciarJogo() {
        // Iniciar o Jogo
    }

    public void sairJogo() {
        // Sair do Jogo
    }
}
