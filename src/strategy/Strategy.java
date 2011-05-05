package strategy;

import exception.TabuleiroException;

/**
 * Interface que é responsável por fazer a estratégia de cada casa.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public interface Strategy {

    public void execute() throws TabuleiroException;
}
