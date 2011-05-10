package exception;

/**
 * Classe JogadaException responsável pelas exceções geradas nas jogadas.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class JogadaException extends Exception {

    /**
     * Construtor que recebe uma Exception como parâmetro 
     * 
     * @param cause Exception
     */
    public JogadaException(Throwable cause) {
        super(cause);
    }

    /**
     * Construtor que recebe como parâmetro uma Exception e uma mensagem 
     * 
     * @param message mensagem da exceção
     * @param cause Exception
     */
    public JogadaException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Construtor que recebe como parametro uma mensagem
     * 
     * @param message mensagem da exceção
     */
    public JogadaException(String message) {
        super(message);
    }
}
