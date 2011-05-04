package ludo;

import controller.JogoLudo;
import exception.TabuleiroException;
import exception.JogadaException;
import entity.Casa;

/**
 * Class LudoFacade
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class LudoFacade {

    private JogoLudo jogoLudo;

    public void criarJogo(int numPecas, int tamanhoDado) {
        jogoLudo.criarJogo(numPecas, tamanhoDado);
    }

    public int getNumPecas() {
        // implementar
        return -1;
    }

    public int getTamanhoDado() {
        // implementar
        return -1;
    }

    public int getTamanhoTabuleiro() {
        // implementar
        return -1;
    }

    public void adicionaCasa(Casa casa) throws TabuleiroException {
        // implementar
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
