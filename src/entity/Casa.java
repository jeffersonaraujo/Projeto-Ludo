package entity;

/**
 * Classe Abstrata Casa representa a entidade Casa.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public abstract class Casa {

    private String id;
    private String parametro;
    private String nomeCasa;

    /**
     * Construtor da Classe Casa
     * 
     * @param id identificador da classe
     * @param nomeCasa nome da casa
     * @param parametro parametro que a casa executa
     */
    public Casa(String id, String nomeCasa, String parametro) {
        this.id = id;
        this.nomeCasa = nomeCasa;
        this.parametro = parametro;
    }

    /**
     * getId()
     * 
     * @return o idendificador da casa. 
     */
    public String getId() {
        return id;
    }

    /**
     * getName()
     * 
     * @return o nome da casa
     */
    public String getNomeCasa() {
        return nomeCasa;
    }

    /**
     * getParametro()
     * 
     * @return o parametro que a casa vai utilizar
     */
    public String getParametro() {
        return parametro;
    }
}
