package trabajo1.model;

public class RobotNaturaleza extends Naturaleza {

	public RobotNaturaleza() {
		// agregamos el nombre de la naturaleza al constructor
		super("Robot");
	}
	
	// La naturaleza Robot tiene ventaja sobre la naturaleza Animal
	@Override
	public boolean tieneVentaja(Naturaleza naturaleza) {
		return naturaleza.getNombre() == "Animal" ? true : false ;
	}
}
