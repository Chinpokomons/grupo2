package trabajo1.model;
import java.util.ArrayList;
import java.util.List;

public class GeneradorDeChinpokomons {

    GeneracionDeRandom generator = GeneracionDeRandom.getInstance();
    public Chinpokomon crearZapato(BuilderOfChinpokomon builder){
        List<Ataque> listaAtaques = new ArrayList<Ataque>();
        AtaqueZapatazo ataqueZapatazo = this.crearAtaqueZapato();
        listaAtaques.add(ataqueZapatazo);
        Naturaleza cosa = this.crearNaturalezaCosa();
        builder.setNombre("Zapato");
        builder.setVida(30);
        builder.setAtaques(listaAtaques);
        builder.setRandom(generator);
        builder.setNaturaleza(cosa);

        return builder.chinpokomonResult();
    }
    public Chinpokomon crearZapatoConDosAtaques(BuilderOfChinpokomon builder){
        List<Ataque> listaAtaques = new ArrayList<Ataque>();
        AtaqueZapatazo ataqueZapatazo = this.crearAtaqueZapato();
        AtaquePomadaWassington ataquePomadaWassington = this.crearAtaquePomadaWassington();
        listaAtaques.add(ataqueZapatazo);
        listaAtaques.add(ataquePomadaWassington);
        Naturaleza cosa = this.crearNaturalezaCosa();
        builder.setNombre("Zapato con dos ataques");
        builder.setVida(30);
        builder.setAtaques(listaAtaques);
        builder.setRandom(generator);
        builder.setNaturaleza(cosa);

        return builder.chinpokomonResult();
    }

    public Chinpokomon crearCarnotron(BuilderOfChinpokomon builder){
        List<Ataque> listaAtaques = new ArrayList<Ataque>();
        listaAtaques.add(this.crearAtaqueRayoVeloz());
        listaAtaques.add(this.crearCanionSonico());
        Naturaleza animal = this.crearNaturalezaAnimal();
        builder.setNombre("Carnotron");
        builder.setVida(20);
        builder.setAtaques(listaAtaques);
        builder.setRandom(generator);
        builder.setNaturaleza(animal);

        return builder.chinpokomonResult();
    }

    public Chinpokomon crearGallotronix(BuilderOfChinpokomon builder){
        List<Ataque> listaAtaques = new ArrayList<Ataque>();
        listaAtaques.add(this.crearAtaqueGarraMecanica());
        Naturaleza robot = this.crearNaturalezaRobot();
        builder.setNombre("Gallotronix");
        builder.setVida(25);
        builder.setAtaques(listaAtaques);
        builder.setRandom(generator);
        builder.setNaturaleza(robot);

        return builder.chinpokomonResult();
    }
    public AtaqueCanionSonico crearCanionSonico(){
        return new AtaqueCanionSonico(4);
    }
    public AtaqueRayoVeloz crearAtaqueRayoVeloz(){ return new AtaqueRayoVeloz(3); }
    public AtaqueZapatazo crearAtaqueZapato(){
        return new AtaqueZapatazo(1);
    }
    public AtaqueGarraMecanica crearAtaqueGarraMecanica(){
        return new AtaqueGarraMecanica(2);
    }
    public AtaquePomadaWassington crearAtaquePomadaWassington(){return new AtaquePomadaWassington(5);}
    public RobotNaturaleza crearNaturalezaRobot(){return new RobotNaturaleza();}
    public AnimalNaturaleza crearNaturalezaAnimal(){return new AnimalNaturaleza();}
    public CosaNaturaleza crearNaturalezaCosa(){return new CosaNaturaleza();}
}
