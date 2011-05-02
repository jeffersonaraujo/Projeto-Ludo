package entity;

import strategy.IComportamento;

/**
 * Class Casa
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class Casa {

    private String id;
    private IComportamento comportamento;

    /**
     * Construtor da classe Casa
     * 
     * @param id Identificado da casa.
     * @param comportamento Comportamento que a casa vai executar.
     */
    public Casa(String id, IComportamento comportamento) {
        this.id = id;
        this.comportamento = comportamento;
    }

    /**
     * Método que executa o comportamento da casa no tabuleiro.
     * 
     * @return o nome referente ao comportamento da casa.
     */
    public String comportamentoCasa() {
        return comportamento.comportamentoCasa();
    }

    /**
     * getComportamento()
     * 
     * @return o comportamento da casa no tabuleiro.
     */
    public IComportamento getComportamento() {
        return comportamento;
    }

    public void setComportamento(IComportamento comportamento) {
        this.comportamento = comportamento;
    }

    /**
     * getId()
     * 
     * @return o idendificador da casa. 
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
