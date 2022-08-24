package trabajo1.main;

import trabajo1.model.ArenaBatalla;
import trabajo1.model.Carnotron;
import trabajo1.model.Gallotronix;
import trabajo1.model.Zapato;

public class Main {
    public static void main(String []args) {
        Zapato zapato1 = new Zapato("zapato1");
        Zapato zapato2 = new Zapato("zapato2");
        ArenaBatalla arena1 = new ArenaBatalla(zapato1, zapato2);

        Carnotron carnotron = new Carnotron("carnotron");
        Gallotronix gallotronix = new Gallotronix("gallotronix");

        System.out.println(zapato2.getVida());
        arena1.pelea();
        System.out.println(zapato2.getVida());

    }
}
