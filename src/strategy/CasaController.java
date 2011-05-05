package strategy;

import exception.TabuleiroException;

/**
 * Classe CasaController é utilizada para realizar a estratégia das casas.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class CasaController {

    private Strategy strategy;

    public CasaController(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() throws TabuleiroException {
        strategy.execute();
    }
}
