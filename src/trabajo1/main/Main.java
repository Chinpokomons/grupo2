package trabajo1.main;


import trabajo1.estados.Debug;
import trabajo1.estados.Error;
import trabajo1.estados.Info;
import trabajo1.estados.Warn;
import trabajo1.model.*;
import trabajo1.model.ArenaBatalla;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args) {
/*
        Info info = new Info();
        Warn warn = new Warn();
        Error error = new Error();


        Logger loggerSingleton = Logger.getInstance();

        //parte3: Queremos crear 2 zapatos, y hacerlos pelear. El primer Zapato solo conoce zapatazo, como se mencionó antes,
        //        pero el segundo conoce Zapatazo y "Pomada Wassington",
       //     un ataque que le recupera 5 puntos de vida a si mismo, en lugar de dañar al oponente.

        //builder
        BuilderOfChinpokomon builder = new BuilderOfChinpokomon();
        GeneradorDeChinpokomons generador = new GeneradorDeChinpokomons();

        AtaqueZapatazo ataqueZapatazo = new AtaqueZapatazo(1);
        AtaquePomadaWassington ataquePomadaWassington = new AtaquePomadaWassington(5);
        AtaqueGarraMecanica ataqueGarraMecanica = new AtaqueGarraMecanica(2);

        System.out.println(ataqueZapatazo.getRandom());
        System.out.println(ataquePomadaWassington.getRandom());
        System.out.println(".-------");
        List<Ataque> listaAtaques1 = new ArrayList<Ataque>();
        List<Ataque> listaAtaques2 = new ArrayList<Ataque>();
        List<Ataque> listaAtaques3 = new ArrayList<Ataque>();


        //creamos las naturalezas
        RobotNaturaleza robot = new RobotNaturaleza();
        AnimalNaturaleza animal = new AnimalNaturaleza();
        CosaNaturaleza cosa = new CosaNaturaleza();

        listaAtaques1.add(ataqueZapatazo);
        listaAtaques2.add(ataqueZapatazo);
        listaAtaques2.add(ataquePomadaWassington);
        listaAtaques3.add(ataqueGarraMecanica);
        
        // los chinpokomon pueden tener diferentes naturaleza respecto a sus especies
        // depende de la naturale sera mas efectivos contra otros
        // robot --> animal || animal --> cosa || cosa --> robot
        //Zapato zapato1 = new Zapato("zapato1", listaAtaques1, animal);
        //Zapato zapato2 = new Zapato("zapato2", listaAtaques2, animal);
        //Zapato nuevo
        Chinpokomon zapatito = generador.crearZapato(builder);
        Chinpokomon zapatitoEspecial = generador.crearZapatoConDosAtaques(builder);

        System.out.println("lA VIDA DEL ZAPATO 1 " + zapatito+ " AL EMPEZAR ES: " +zapatito.getVida());
        System.out.println("-------------");
        loggerSingleton.info("lA VIDA DEL ZAPATO 2 "+ zapatitoEspecial+ " AL EMPEZAR ES: " + zapatitoEspecial.getVida());

        System.out.println("-------------");
        ArenaBatalla arena1 = new ArenaBatalla(zapatito, zapatitoEspecial);
        System.out.println(arena1);
        arena1.pelea();

        System.out.println("------cambio de nivel-------");
        loggerSingleton.setNivel(warn);
        System.out.println(loggerSingleton.getEstado());
        loggerSingleton.warn("lA VIDA DEL ZAPATO 2 "+ zapatitoEspecial+ " AL EMPEZAR ES: " + zapatitoEspecial.getVida());
        //System.out.println(zapatitoEspecial);
   }

 */
    //punto 1
        Info info = new Info();
        Warn warn = new Warn();
        Error error = new Error();


        Logger loggerSingleton = Logger.getInstance();
        BuilderOfChinpokomon builder = new BuilderOfChinpokomon();
        GeneradorDeChinpokomons generador = new GeneradorDeChinpokomons();

        Chinpokomon zapatito = generador.crearZapato(builder);
        Chinpokomon gallotronix = generador.crearGallotronix(builder);

        loggerSingleton.info("lA VIDA DEL ZAPATO " + zapatito+ " AL EMPEZAR ES: " +zapatito.getVida());
        System.out.println("-------------");
        loggerSingleton.info("lA VIDA DEL gallotronix 2 "+ gallotronix+ " AL EMPEZAR ES: " + gallotronix.getVida());

        System.out.println("-------------");
        ArenaBatalla arena1 = new ArenaBatalla(zapatito, gallotronix);
        System.out.println(arena1);
        arena1.pelea();
    }
}
