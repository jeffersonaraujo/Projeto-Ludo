package controller;

import entity.Casa;
import exception.TabuleiroException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe Tabuleiro, onde é composto por várias casas e vai ser usado par os 
 * jogadores poderem jogar.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class Tabuleiro {

    private List<Casa> casas;

    /**
     * Construtor tabuleiro
     */
    public Tabuleiro() {
        casas = new ArrayList<Casa>();
    }

    public void adicionaCasa(Casa casa) throws TabuleiroException {
        if (casa.getId() == null || casa.getId().equals("")) {
            throw new TabuleiroException("ID Invalido: '" + casa.getId() + "'");
        }
        if (casa.getTipoCasa() == null || casa.getTipoCasa().equals("")) {
            throw new TabuleiroException("Tipo de casa invalido: '" + casa.getTipoCasa() + "'");
        }
        if (isDuplicate(casa.getId())) {
            throw new TabuleiroException("Ja existe uma casa com ID '" + casa.getId() + "'");
        }
        casas.add(casa);
    }
    /**
     * getTamanhoTabuleiro retorna o tamnho do tabuleiro.
     * @return quantidade de casas
     */
    public int getTamanhoTabuleiro() {
        return casas.size();
    }

    public boolean isDuplicate(String id) {
        boolean retorno = false;
        for (Casa casa : casas) {
            if (casa.getId().equals(id)) {
                retorno = true;
            }
        }
        return retorno;
    }
}
