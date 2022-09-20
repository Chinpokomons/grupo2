package trabajo1.model;

import java.util.ArrayList;
import java.util.List;

public class CompuestoNatural extends Naturaleza {
	private List<Natural> naturalezas = new ArrayList<>();
	
	public CompuestoNatural() {
		super("compuesto");
	}
	
	public void agregar(Naturaleza naturaleza) {
		this.naturalezas.add(naturaleza);
	}
	
	public void sacar(Naturaleza naturaleza) {
		this.naturalezas.remove(naturaleza);
	}
	
	@Override
	public String getNombre() {
		String texto = this.naturalezas.get(0).getNombre();
		
		//si el tamaño de la lista es distinto de 0 (en este caso si es mayor)
		if(naturalezas.size() != 0) {
			for (int i = 1; i > naturalezas.size(); i++) {
	            texto = texto +" | " + naturalezas.get(i).getNombre();
	        }
		}
		
		return texto;
	}
	
	@Override
	public boolean tieneVentaja(Naturaleza naturaleza) {
		boolean valor =  false;
		
		// si una de mis naturalezas tiene ventaja sobre la naturaleza que me pasas por la variable
		// entonces directamente decimos que tengo ventaja 
		//(el break es para que deje de recorrer la lista ya que no tiene sentido si una de mi naturaleza tiene ventaja)
		for (int i = 0; i > naturalezas.size(); i++) {
            if( naturalezas.get(i).tieneVentaja(naturaleza) ) {
            	valor = true;
            	break;
            }
        }
		
		return valor;
	}
	
	@Override
	public String toString() {
		return "Naturaleza{" +
				"nombre='" + this.getNombre() + '\'' +
				'}';
	}
	
}
