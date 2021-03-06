package ludo;

import entity.Casa;
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
        Casa casa = new Casa(id, nome, param);
        LudoFacade.getInstance().adicionaCasa(casa);
    }

    public void jogar(int jogador, int dado) throws JogadaException {
        // implementar
    }

    public String getStatusJogo() {
        return LudoFacade.getInstance().getStatusJogo();
    }

    public void sairJogo() {
        // Sair do Jogo
    }

    public void iniciarJogo() {
        LudoFacade.getInstance().iniciarJogo();
    }
}
