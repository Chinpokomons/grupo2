package trabajo1.main;

import trabajo1.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args) {
        //parte3: Queremos crear 2 zapatos, y hacerlos pelear. El primer Zapato solo conoce zapatazo, como se mencionó antes,
        //        pero el segundo conoce Zapatazo y "Pomada Wassington",
       //     un ataque que le recupera 5 puntos de vida a si mismo, en lugar de dañar al oponente.

        AtaqueZapatazo ataqueZapatazo = new AtaqueZapatazo(1);
        AtaquePomadaWassington ataquePomadaWassington = new AtaquePomadaWassington(5);
        AtaqueGarraMecanica ataqueGarraMecanica = new AtaqueGarraMecanica(2);

        List<Ataque> listaAtaques1 = new ArrayList<Ataque>();
        List<Ataque> listaAtaques2 = new ArrayList<Ataque>();
        List<Ataque> listaAtaques3 = new ArrayList<Ataque>();

        listaAtaques1.add(ataqueZapatazo);
        listaAtaques2.add(ataqueZapatazo);
        listaAtaques2.add(ataquePomadaWassington);
        listaAtaques3.add(ataqueGarraMecanica);

        Zapato zapato1 = new Zapato("zapato1", listaAtaques1);
        Zapato zapato2 = new Zapato("zapato2", listaAtaques2);

        Gallotronix gallotronix = new Gallotronix("Gallo",listaAtaques3);
        //ArenaBatalla arena1 = new ArenaBatalla(zapato1, zapato2);
        ArenaBatalla arena2 = new ArenaBatalla(zapato1, gallotronix);
        System.out.println("lA VIDA DEL ZAPATO 1 " + zapato1+ "AL EMPEZAR ES: " +zapato1.getVida());
        //System.out.println("lA VIDA DEL ZAPATO 2 "+ zapato2+ "AL EMPEZAR ES: " +zapato2.getVida());
        System.out.println("lA VIDA DEL gallotronix " + gallotronix+ "AL EMPEZAR ES: " +gallotronix.getVida());
        arena2.pelea();

   }
}
