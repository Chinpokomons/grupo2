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

        List<Ataque> ataques1 = new ArrayList<Ataque>();
        ataques1.add(ataqueZapatazo);
        List<Ataque> ataques2 = new ArrayList<Ataque>();

        ataques2.add(ataqueZapatazo);
        ataques2.add(ataquePomadaWassington);

        Zapato zapato1 = new Zapato("zapato1", ataques1);
        Zapato zapato2 = new Zapato("zapato2", ataques2);

        ArenaBatalla arena1 = new ArenaBatalla(zapato1, zapato2);

        System.out.println(zapato2.getVida());
        arena1.pelea();
        System.out.println(zapato2.getVida());
   }
}
