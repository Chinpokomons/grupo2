package trabajo1.model;

public abstract class Naturaleza {
	private String nombre;
	
	public Naturaleza(String nombre) {
		this.nombre = nombre;
	}
	
	// asignar la ventaja de esta naturaleza sobre otra
	public abstract boolean tieneVentaja( Naturaleza naturaleza);
	
	// obtener el nombre
	public String getNombre() {
		return this.nombre;
	}
}