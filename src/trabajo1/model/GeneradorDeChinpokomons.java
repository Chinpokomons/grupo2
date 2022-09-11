package trabajo1.model;
import java.util.List;

public class GeneradorDeChinpokomons {

    GeneracionDeRandom generator = GeneracionDeRandom.getInstance();
    public Chinpokomon crearZapato(BuilderOfChinpokomon builder,List<Ataque> listaAtaque){
        Naturaleza cosa = new CosaNaturaleza();
        builder.setNombre("Zapato");
        builder.setVida(30);
        builder.setAtaques(listaAtaque);
        builder.setRandom(generator);
        builder.setNaturaleza(cosa);

        return builder.chinpokomonResult();
    }

    public Chinpokomon crearCarnotron(BuilderOfChinpokomon builder,List<Ataque> listaAtaque){
        Naturaleza animal = new AnimalNaturaleza();
        builder.setNombre("Carnotron");
        builder.setVida(20);
        builder.setAtaques(listaAtaque);
        builder.setRandom(generator);
        builder.setNaturaleza(animal);

        return builder.chinpokomonResult();
    }

    public Chinpokomon crearGallotronix(BuilderOfChinpokomon builder,List<Ataque> listaAtaque){

        Naturaleza robot = new RobotNaturaleza();
        builder.setNombre("Gallotronix");
        builder.setVida(25);
        builder.setAtaques(listaAtaque);
        builder.setRandom(generator);
        builder.setNaturaleza(robot);

        return builder.chinpokomonResult();
    }
    public AtaqueCanionSonico crearCanionSonico(){
        return new AtaqueCanionSonico(4);
    }
    public AtaqueRayoVeloz crearAtaqueRVeloz(){
        return new AtaqueRayoVeloz(3);
    }
    public AtaqueZapatazo crearAtaqueZapato(){
        return new AtaqueZapatazo(1);
    }
    public AtaqueGarraMecanica crearAtaqueGarraMecanica(){
        return new AtaqueGarraMecanica(2);
    }
}
