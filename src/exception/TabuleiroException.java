package exception;

/**
 * Classe TabuleiroException
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class TabuleiroException extends Exception {

    public TabuleiroException(Throwable cause) {
        super(cause);
    }

    public TabuleiroException(String message, Throwable cause) {
        super(message, cause);
    }

    public TabuleiroException(String message) {
        super(message);
    }
}
