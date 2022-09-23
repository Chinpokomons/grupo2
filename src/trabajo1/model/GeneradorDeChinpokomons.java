package trabajo1.model;
import java.util.ArrayList;
import java.util.List;

public class GeneradorDeChinpokomons {

    GeneracionDeRandom generator = GeneracionDeRandom.getInstance();
    public Chinpokomon crearZapato(BuilderOfChinpokomon builder){
        List<Ataque> listaAtaques = new ArrayList<Ataque>();
        CompuestoNatural naturalezas = new CompuestoNatural();
        AtaqueZapatazo ataqueZapatazo = this.crearAtaqueZapato();
        listaAtaques.add(ataqueZapatazo);
        Naturaleza cosa = this.crearNaturalezaCosa();
        naturalezas.agregar(cosa);
        builder.setNombre("Zapato");
        builder.setVida(30);
        builder.setAtaques(listaAtaques);
        builder.setRandom(generator);
        builder.setNaturaleza(naturalezas);

        return builder.chinpokomonResult();
    }
    public Chinpokomon crearZapatoConDosAtaques(BuilderOfChinpokomon builder){
        List<Ataque> listaAtaques = new ArrayList<Ataque>();
        CompuestoNatural naturalezas = new CompuestoNatural();
        AtaqueZapatazo ataqueZapatazo = this.crearAtaqueZapato();
        AtaquePomadaWassington ataquePomadaWassington = this.crearAtaquePomadaWassington();
        listaAtaques.add(ataqueZapatazo);
        listaAtaques.add(ataquePomadaWassington);
        Naturaleza cosa = this.crearNaturalezaCosa();
        naturalezas.agregar(cosa);
        builder.setNombre("Zapato con dos ataques");
        builder.setVida(30);
        builder.setAtaques(listaAtaques);
        builder.setRandom(generator);
        builder.setNaturaleza(naturalezas);

        return builder.chinpokomonResult();
    }

    public Chinpokomon crearCarnotron(BuilderOfChinpokomon builder){
        List<Ataque> listaAtaques = new ArrayList<Ataque>();
        CompuestoNatural naturalezas = new CompuestoNatural();
        listaAtaques.add(this.crearAtaqueRayoVeloz());
        listaAtaques.add(this.crearCanionSonico());
        Naturaleza animal = this.crearNaturalezaAnimal();
        naturalezas.agregar(animal);
        builder.setNombre("Carnotron");
        builder.setVida(20);
        builder.setAtaques(listaAtaques);
        builder.setRandom(generator);
        builder.setNaturaleza(naturalezas);

        return builder.chinpokomonResult();
    }

    public Chinpokomon crearGallotronix(BuilderOfChinpokomon builder){
        List<Ataque> listaAtaques = new ArrayList<Ataque>();
        CompuestoNatural naturalezas = new CompuestoNatural();
        listaAtaques.add(this.crearAtaqueGarraMecanica());
        Naturaleza robot = this.crearNaturalezaRobot();
        naturalezas.agregar(robot);
        builder.setNombre("Gallotronix");
        builder.setVida(25);
        builder.setAtaques(listaAtaques);
        builder.setRandom(generator);
        builder.setNaturaleza(naturalezas);

        return builder.chinpokomonResult();
    }
    public AtaqueCanionSonico crearCanionSonico(){
        return new AtaqueCanionSonico(4,generator);
    }
    public AtaqueRayoVeloz crearAtaqueRayoVeloz(){ return new AtaqueRayoVeloz(3,generator); }
    public AtaqueZapatazo crearAtaqueZapato(){
        return new AtaqueZapatazo(1,generator);
    }
    public AtaqueGarraMecanica crearAtaqueGarraMecanica(){ return new AtaqueGarraMecanica(2,generator); }
    public AtaquePomadaWassington crearAtaquePomadaWassington(){return new AtaquePomadaWassington(5,generator);}
    public RobotNaturaleza crearNaturalezaRobot(){return new RobotNaturaleza();}
    public AnimalNaturaleza crearNaturalezaAnimal(){return new AnimalNaturaleza();}
    public CosaNaturaleza crearNaturalezaCosa(){return new CosaNaturaleza();}
}
