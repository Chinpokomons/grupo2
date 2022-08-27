package trabajo1.model;

import java.util.List;

public class Gallotronix extends Chinpokomon{
    //Gallotronix (tiene 25 de vida y un ataque garra mecánica, que hace 2 de daño)
    //parte3: Queremos crear 2 zapatos, y hacerlos pelear. El primer Zapato solo conoce zapatazo, como se mencionó antes, pero el segundo conoce Zapatazo y "Pomada Wassington",
    // un ataque que le recupera 5 puntos de vida a si mismo, en lugar de dañar al oponente.
    public Gallotronix(String nombre, List<Ataque> ataques) {
        super(25, nombre, ataques);
    }

    @Override
    public void ataque(Chinpokomon unPokemon) {
        double aux = Math.random() * ( this.getAtaques().size() - (this.getAtaques().size() - 1 ));
        this.getAtaques().get((int) aux).generarEfecto(this, unPokemon);
    }

}
