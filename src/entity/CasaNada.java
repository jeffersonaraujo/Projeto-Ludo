/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import exception.TabuleiroException;
import strategy.Strategy;

/**
 * Classe CasaNada é a classe que herda de Classe e tem um comportamento para
 * executar.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class CasaNada extends Casa implements Strategy{

   public CasaNada(String id, String nomeCasa, String param) {
        super(id, nomeCasa, param);
    }
    
    
    public void execute() throws TabuleiroException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
    
}
