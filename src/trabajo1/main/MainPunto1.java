package trabajo1.main;

import trabajo1.model.*;

import java.util.ArrayList;
import java.util.List;

public class MainPunto1 {
    public static void main(String []args) {
        //ataques de carnotron
        AtaqueRayoVeloz ataqueRayoVeloz =  new AtaqueRayoVeloz(3);
        AtaqueCanionConico ataqueCanionConico = new AtaqueCanionConico(4);
        List<Ataque> ataquesCarnotron = new ArrayList<Ataque>();
        ataquesCarnotron.add(ataqueCanionConico);
        ataquesCarnotron.add(ataqueRayoVeloz);

        //ataques de zapato
        AtaqueZapatazo ataqueZapatazo = new AtaqueZapatazo(1);
        List<Ataque> ataquesZapato = new ArrayList<Ataque>();
        ataquesZapato.add(ataqueZapatazo);

        //instancias de zapato y carnotron
        Zapato zapato1 = new Zapato("zapato1", ataquesZapato);
        Carnotron carnotron1 = new Carnotron("Carnotron", ataquesCarnotron);

        //instancia arena batalla
        ArenaBatalla arena1 = new ArenaBatalla(zapato1, carnotron1);
        arena1.pelea();
    }

}
