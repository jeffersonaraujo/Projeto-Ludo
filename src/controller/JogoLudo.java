package controller;

import exception.JogadaException;

/**
 * Classe JogoLudo tem os principais métodos para controlar o jogo.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class JogoLudo {

    private int tamanhoDado;
    private int numPecas;
    private Tabuleiro tabuleiro;

    /**
     * Construtor JogoLudo
     * 
     * @param tamanhoDado representa o tamanho máximo que o dado pode ter.
     * @param numPecas representa a quantidade de jogadores que tem no jogo,
     * no mínimo 1 jogador.
     */
    public JogoLudo(int tamanhoDado, int numPecas) {
        this.tamanhoDado = tamanhoDado;
        this.numPecas = numPecas;
        tabuleiro = new Tabuleiro();
    }

    /**
     * Método para iniciar o jogo.
     * 
     */
    public void iniciarJogo() {
    }

    /**
     * Método para sair do Jogo
     * 
     */
    public void sairJogo() {
    }

    /**
     * Método que representa uma jogada.
     * 
     * @param jogador jogador que esta realizando a jogada.
     * @param dado número do dado jogado.
     * @throws JogadaException 
     */
    public void jogar(int jogador, int dado) throws JogadaException {
    }

    /**
     * getNumPecas()
     * 
     * @return quantidade de peças(jogadores) que tem no jogo. 
     */
    public int getNumPecas() {
        return numPecas;
    }

    /**
     * getTamanhoDado()
     * 
     * @return tamanho do dado.
     */
    public int getTamanhoDado() {
        return tamanhoDado;
    }

    /**
     * getTabuleiro()
     * 
     * @return a instancia do tabuleiro
     */
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
