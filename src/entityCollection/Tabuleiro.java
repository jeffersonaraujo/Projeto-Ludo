package entityCollection;

import entity.Casa;
import java.util.ArrayList;
import java.util.LinkedList;
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
    private List<Integer> jogadores;

    /**
     * Construtor tabuleiro
     */
    public Tabuleiro() {
        casas = new ArrayList<Casa>();
        jogadores = new LinkedList<Integer>();
    }
    
    

    /**
     * getCasas()
     * 
     * @return uma lista de casas que compõem o tabuleiro 
     */
    public List<Casa> getCasas() {
        return casas;
    }

    public void setCasas(List<Casa> casas) {
        this.casas = casas;
    }

    /**
     * getJogadores()
     * 
     * @return uma lista de jogadores
     */
    public List<Integer> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Integer> jogadores) {
        this.jogadores = jogadores;
    }
}
