package trabajo1.model;

public abstract class Naturaleza implements Natural {
	private String nombre;
	
	public Naturaleza(String nombre) {
		this.nombre = nombre;
	}
	
	// asignar la ventaja de esta naturaleza sobre otra
	@Override
	public boolean tieneVentaja( Naturaleza naturaleza) {
		return true;
	}
	
	// obtener el nombre
	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString() {
		return "Naturaleza{" +
				"nombre='" + nombre + '\'' +
				'}';
	}
}