package trabajo1.model;
import java.util.List;

public abstract class Chinpokomon {
    private int vida;
    private String nombre;
    private List<Ataque> ataques;
    private Naturaleza naturaleza;

    public Chinpokomon(int vida, String nombre, List<Ataque> ataques, Naturaleza naturaleza) {
        this.vida = vida;
        this.nombre = nombre;
        this.ataques = ataques;
        this.naturaleza = naturaleza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public Naturaleza getNaturaleza() {
    	return naturaleza;
    }

    public void ataque(Chinpokomon unPokemon) {
        double aux = Math.random() * ( this.getAtaques().size() - (this.getAtaques().size() - 1 ));
        this.getAtaques().get((int) aux).generarEfecto(this, unPokemon);
    }

    @Override
    public String toString() {
        return "Chinpokomon{" +
                "vida=" + vida +
                ", nombre='" + nombre + '\'' +
                ", naturaleza=" + naturaleza +
                '}';
    }
}
