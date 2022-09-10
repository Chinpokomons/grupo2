package trabajo1.main;

import trabajo1.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args) {

        AtaqueZapatazo ataqueZapatazo = new AtaqueZapatazo(1);
        AtaquePomadaWassington ataquePomadaWassington = new AtaquePomadaWassington(5);

        List<Ataque> listaAtaques1 = new ArrayList<Ataque>();
        List<Ataque> listaAtaques2 = new ArrayList<Ataque>();

        listaAtaques1.add(ataqueZapatazo);
        listaAtaques2.add(ataqueZapatazo);
        listaAtaques2.add(ataquePomadaWassington);

        Zapato zapato1 = new Zapato("zapato1", listaAtaques1);
        Zapato zapato2 = new Zapato("zapato2", listaAtaques2);

        ArenaBatalla arena1 = new ArenaBatalla(zapato1, zapato2);

        System.out.println("lA VIDA DEL ZAPATO 1 " + zapato1+ "AL EMPEZAR ES: " +zapato1.getVida());
        System.out.println("lA VIDA DEL ZAPATO 2 "+ zapato2+ "AL EMPEZAR ES: " +zapato2.getVida());
        arena1.pelea();
   }
}
