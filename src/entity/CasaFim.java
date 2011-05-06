package entity;

/**
 * Classe Casa representa a entidade Casa.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class CasaFim implements ICasa {

    /**
     * getComportamento()
     * 
     * @return o comportamento da casa FIM
     */
    @Override
    public String getComportamento() {
        return "Encerrar jogo";
    }
}
