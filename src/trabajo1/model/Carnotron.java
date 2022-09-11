package trabajo1.model;

import java.util.List;

public class Carnotron extends Chinpokomon{

    //Carnotron (tiene 20 de vida, dos ataques, rayo veloz que inflige 3 de daño, y cañón cónico que infringe 4 de daño)
    public Carnotron(String nombre, List<Ataque> ataques, Naturaleza naturaleza) {
        super(20, nombre, ataques, naturaleza);
    }

    @Override
    public void ataque(Chinpokomon unPokemon) {
        double aux = Math.random() * ( this.getAtaques().size() - (this.getAtaques().size() - 1 ));
        this.getAtaques().get((int) aux).generarEfecto(this, unPokemon);
    }

    @Override
    public String toString() {
        return "Carnotron llamado: " + this.getNombre();
    }
}
