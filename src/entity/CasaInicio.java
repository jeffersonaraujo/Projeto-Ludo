package entity;

import exception.TabuleiroException;
import strategy.Strategy;

/**
 * Classe CasaInicio é a classe que herda de Classe e tem um comportamento para
 * executar.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class CasaInicio extends Casa implements Strategy {

    public CasaInicio(String id, String nomeCasa, String param) {
        super(id, nomeCasa, param);
    }

    public void execute() throws TabuleiroException {
        
        
    }
}
