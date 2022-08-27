package trabajo1.model;

import java.util.List;

public class Zapato extends Chinpokomon{
    public Zapato(String nombre, List<Ataque> ataques) {
        super(30, nombre, ataques);
    }

    @Override
    public void ataque(Chinpokomon unPokemon) {
        double aux = Math.random() * ( this.getAtaques().size() - (this.getAtaques().size() - 1 ));
        this.getAtaques().get((int) aux).generarEfecto(this, unPokemon);
    }
}
