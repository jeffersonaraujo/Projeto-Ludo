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
        casas.add(casa);
    }

    public void isDuplicate(String id) throws TabuleiroException {
        for (Casa casa : casas) {
            if (casa.getId().equals(id)) {
                throw new TabuleiroException("Ja existe uma casa com ID 'C0'");
            }
        }
    }
}
