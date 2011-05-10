package ludo;

import controller.JogoLudo;
import entity.Casa;
import exception.TabuleiroException;
import exception.JogadaException;

/**
 * Classe LudoFacade representa a fachada do sistema 
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class LudoFacade {

    private static LudoFacade ludoFacade;
    private JogoLudo jogoLudo;

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
     * @param numPecas representa a quantidade de jogadores que tem no jogo
     * @param tamanhoDado representa o tamanho máximo que o dado pode ter.
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
        return jogoLudo.getTabuleiro().getTamanhoTabuleiro();
    }

    /**
     * Método que adiciona casa ao tabuleiro.
     * 
     * @param casa casa que será adicionada
     * @throws TabuleiroException  lança exceção se não conseguir adicionar.
     */
    public void adicionaCasa(Casa casa) throws TabuleiroException {
        jogoLudo.getTabuleiro().adicionaCasa(casa);
    }

    /**
     * Método que representa uma jogada.
     * 
     * @param jogador jogador que esta realizando a jogada.
     * @param dado número do dado jogado.
     * @throws JogadaException 
     */
    public void jogar(int jogador, int dado) throws JogadaException {
        // implementar
    }

    /**
     * getStatusJogo
     * 
     * @return o estado atual do jogo.
     */
    public String getStatusJogo() {
        return jogoLudo.getStatusJogo();
    }

    /**
     * Método para iniciar o jogo, tem que ter no minimo um jogador.
     * 
     */
    public void iniciarJogo() {
        jogoLudo.iniciarJogo();
    }

    /**
     * Método para sair do Jogo
     * 
     */
    public void sairJogo() {
        // Sair do Jogo
    }
}
