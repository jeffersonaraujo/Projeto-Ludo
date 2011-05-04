package ludo;

import exception.TabuleiroException;
import exception.JogadaException;

/**
 * Classe LudoTestFacade
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class LudoTestFacade {

    public void criarJogo(int numPecas, int tamanhoDado) {
        LudoFacade.getInstance().criarJogo(numPecas, tamanhoDado);
    }

    public int getNumPecas() {
        return LudoFacade.getInstance().getNumPecas();
    }

    public int getTamanhoDado() {
        return LudoFacade.getInstance().getTamanhoDado();
    }

    public int getTamanhoTabuleiro() {
        return LudoFacade.getInstance().getTamanhoTabuleiro();
    }

    public void adicionaCasa(String id, String nome, String param) throws TabuleiroException {
        // implementar
    }

    public void jogar(int jogador, int dado) throws JogadaException {
        // implementar
    }

    public String getStatusJogo() {
        // implementar
        return null;
    }

    public void sairJogo() {
        // Sair do Jogo
    }

    public void iniciarJogo() {
        // Iniciar o Jogo
    }
}
