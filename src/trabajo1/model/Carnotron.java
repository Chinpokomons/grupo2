package trabajo1.model;

public class Carnotron extends Chinpokomon{


    public Carnotron(String nombre) {
        super(20, nombre);
    }

    @Override
    public void ataque(Chinpokomon unPokemon) {
        var aux = Math.random() * ( 3 - 1 );
        if(aux == 1) {
            this.ataqueRayoVeloz(unPokemon);
        } else {
            this.ataqueCanioConico(unPokemon);
        }
    }

    public void ataqueRayoVeloz(Chinpokomon unPokemon) {
        unPokemon.setVida(unPokemon.getVida() - 3);
    }

    public void ataqueCanioConico(Chinpokomon unPokemon) {
        unPokemon.setVida(unPokemon.getVida() - 4);
    }
}
