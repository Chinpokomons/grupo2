package trabajo1.model;

public class CosaNaturaleza extends Naturaleza {
	
	public CosaNaturaleza() {
		// agregamos el nombre de la naturaleza al constructor
		super("Cosa");
	}

	// La naturaleza Cosa tiene ventaja sobre la naturaleza Robot
	@Override
	public boolean tieneVentaja(Naturaleza naturaleza) {
		return naturaleza.getNombre() == "Robot" ? true : false ;
	}
}