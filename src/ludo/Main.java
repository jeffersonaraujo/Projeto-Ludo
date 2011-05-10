package ludo;

import controller.JogoLudo;
import exception.TabuleiroException;

/**
 * Class Main
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Paulo Cesar, eu@paulolira.net
 *
 * Copyright (C) 2011 Equipe Bangladesh.
 */
public class Main {

    public static void main(String[] args) throws TabuleiroException {

        LudoTestFacade testFacade = new LudoTestFacade();

        testFacade.criarJogo(5, 10);
        //JogoLudo ludo = new JogoLudo(5, 10);

        //testFacade.adicionaCasa(null, "INICIO", null);
        //testFacade.adicionaCasa("", "INICIO", null);
        //testFacade.adicionaCasa("C0", null, null);
        //testFacade.adicionaCasa("C0", "", null);
        //testFacade.adicionaCasa("C0", "XYZ", null);
        //testFacade.adicionaCasa("C0", "inicio", null);


        testFacade.adicionaCasa("C0", "INICIO", null);

        //testFacade.adicionaCasa("C0", "NADA", null);

        //testFacade.adicionaCasa("C1", "VOLTA", "xyz");
        //testFacade.adicionaCasa("C1", "VOLTA", "");
        //testFacade.adicionaCasa("C1", "VOLTA", null);

        //testFacade.adicionaCasa("C4", "AVANCA", "xyz");
        //testFacade.adicionaCasa("C4", "AVANCA", "");
        //testFacade.adicionaCasa("C4", "AVANCA", null);

        //testFacade.adicionaCasa("C6", "IR_PARA", "");
        //testFacade.adicionaCasa("C6", "IR_PARA", null);

        //testFacade.adicionaCasa("C6", "IR_PARA", "xyz");
        
        testFacade.adicionaCasa("C1", "REPETE", null);
        testFacade.adicionaCasa("C2", "NADA", null);
        testFacade.adicionaCasa("C3", "FIM", null);
        
        testFacade.iniciarJogo();
        System.out.println(testFacade.getStatusJogo());
        //System.out.println(ludo.idCasa());
        //testFacade.getStatusJogo();


    }
}
