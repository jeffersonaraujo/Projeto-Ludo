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
//        if (getId() == null) {
//            throw new TabuleiroException("ID Invalido: 'null'");
//        }
//        if (getId().equals("")) {
//            throw new TabuleiroException("ID Invalido: ''");
//        }
//        if (getNomeCasa() == null) {
//            throw new TabuleiroException("Tipo de casa invalido: 'null'");
//        }
//        if (getNomeCasa().equals("")) {
//            throw new TabuleiroException("Tipo de casa invalido: ''");
//        }
//        if (!getNomeCasa().equals(Casa.Casas.INICIO.name())) {
//            throw new TabuleiroException("Tipo de casa invalido: '" + getNomeCasa() + "'");
//        }
//        if (getId().equals("C0")){
//            throw new TabuleiroException("Ja existe uma casa com ID 'C0'");
//        }
    }
}
