package trabajo1.model;

import java.util.List;

public class Gallotronix extends Chinpokomon{
    public Gallotronix(String nombre, List<Ataque> ataques, Naturaleza naturaleza,GeneracionDeRandom genRandom) {
        super(25, nombre, ataques, naturaleza, genRandom);
    }

    @Override
    public void ataque(Chinpokomon unPokemon) {
        double aux = Math.random() * ( this.getAtaques().size() - (this.getAtaques().size() - 1 ));
        this.getAtaques().get((int) aux).generarEfecto(this, unPokemon);
    }

    @Override
    public String toString() {
        return "Gallotronix llamado: "+ this.getNombre();
    }
}
