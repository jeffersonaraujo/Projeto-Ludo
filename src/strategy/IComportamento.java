package strategy;

/**
 * Interface IComportamento usada com base no padrão Strategy, é nesta classe 
 * que simula os diferentes comportamentos de uma casa no tabuleiro.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public interface IComportamento {

    /**
     * Método usado para definir o comportamento das casas do jogo. 
     * @return um comportamento válido para cada casa do jogo.
     */
    public String comportamentoCasa();
}
