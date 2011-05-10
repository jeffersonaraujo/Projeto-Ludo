package entity;

import exception.TabuleiroException;

/**
 * Interface ICasa representa a lógica da estratégia
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public interface ICasa {

    /**
     * getComportamento()
     * 
     * @return o comportamento da casa
     */
    public String getComportamento() throws TabuleiroException;
}
