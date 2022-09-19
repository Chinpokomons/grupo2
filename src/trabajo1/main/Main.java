package trabajo1.main;

import trabajo1.estados.Error;
import trabajo1.estados.Info;
import trabajo1.estados.Warn;
import trabajo1.model.*;


public class Main {
    public static void main(String []args) {
    //punto 1
        Info info = new Info();
        Warn warn = new Warn();
        Error error = new Error();


        Logger loggerSingleton = Logger.getInstance();
        BuilderOfChinpokomon builder = new BuilderOfChinpokomon();
        GeneradorDeChinpokomons generador = new GeneradorDeChinpokomons();

        Chinpokomon zapatito = generador.crearZapato(builder);
        Chinpokomon gallotronix = generador.crearGallotronix(builder);
        System.out.println("!-------------------punto 1-------------------------------------!");
        loggerSingleton.info("lA VIDA DEL ZAPATO " + zapatito+ " AL EMPEZAR ES: " +zapatito.getVida());
        System.out.println("-------------");
        loggerSingleton.info("lA VIDA DEL gallotronix "+ gallotronix+ " AL EMPEZAR ES: " + gallotronix.getVida());

        System.out.println("-------------");

        ArenaBatalla arena1 = new ArenaBatalla(zapatito,gallotronix);
        System.out.println(arena1);
        arena1.pelea(loggerSingleton);

        //punto 4
        System.out.println("!-------------------punto 4-------------------------------------!");
        Chinpokomon zapatoEspecial = generador.crearZapatoConDosAtaques(builder);

        loggerSingleton.info("lA VIDA DEL ZAPATO " + zapatoEspecial+ " AL EMPEZAR ES: " +zapatito.getVida());
        System.out.println("-------------");
        loggerSingleton.info("lA VIDA DEL gallotronix "+ gallotronix+ " AL EMPEZAR ES: " + gallotronix.getVida());

        System.out.println("-------------");

        ArenaBatalla arena2 = new ArenaBatalla(zapatoEspecial,gallotronix);
        System.out.println(arena2);
        arena2.pelea(loggerSingleton);

    }

}
