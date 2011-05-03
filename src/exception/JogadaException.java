package exception;

/**
 * Classe JogadaException
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class JogadaException extends Exception {

    public JogadaException(Throwable cause) {
        super(cause);
    }

    public JogadaException(String message, Throwable cause) {
        super(message, cause);
    }

    public JogadaException(String message) {
        super(message);
    }
}
