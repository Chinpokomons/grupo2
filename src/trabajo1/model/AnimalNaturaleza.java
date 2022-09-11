package trabajo1.model;

public class AnimalNaturaleza extends Naturaleza {
	
	public AnimalNaturaleza() {
		// agregamos el nombre de la naturaleza al constructor
		super("Animal");
	}

	// La naturaleza Animal tiene ventaja sobre la naturaleza Cosa
	@Override
	public boolean tieneVentaja(Naturaleza naturaleza) {
		return naturaleza.getNombre() == "Cosa" ? true : false ;
	}
}

