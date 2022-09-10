package trabajo1.model;

import java.util.List;
import java.util.Random;

public class Zapato extends Chinpokomon{
    Random random = new Random();
    public Zapato(String nombre, List<Ataque> ataques) {
        super(30, nombre, ataques);
    }


    @Override
    public void ataque(Chinpokomon unPokemon) {

        int randomIndex = random.nextInt(this.getAtaques().size());
        //double aux = Math.random() * ( this.getAtaques().size() )
        this.getAtaques().get(randomIndex).generarEfecto(this, unPokemon);
    }

    @Override
    public String toString() {
        return "Zapato llamado: " + this.getNombre();
    }
}
