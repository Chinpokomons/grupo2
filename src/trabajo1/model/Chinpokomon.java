package trabajo1.model;

import java.util.ArrayList;
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

    public void setAtaques(List<Ataque> ataques) {
        this.ataques = ataques;
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

    public abstract void ataque(Chinpokomon unPokemon);

}
