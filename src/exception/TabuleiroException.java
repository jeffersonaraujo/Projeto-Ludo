package exception;

/**
 * Classe TabuleiroException responsável pelas exceções geradas no tabuleiro.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class TabuleiroException extends Exception {

    /**
     * Construtor que recebe uma Exception como parâmetro 
     * 
     * @param cause Exception
     */
    public TabuleiroException(Throwable cause) {
        super(cause);
    }

    /**
     * Construtor que recebe como parâmetro uma Exception e uma mensagem 
     * 
     * @param message mensagem da exceção
     * @param cause Exception
     */
    public TabuleiroException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Construtor que recebe como parametro uma mensagem
     * 
     * @param message mensagem da exceção
     */
    public TabuleiroException(String message) {
        super(message);
    }
}
