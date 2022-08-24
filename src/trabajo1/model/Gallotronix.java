package trabajo1.model;

public class Gallotronix extends Chinpokomon{
    public Gallotronix(String nombre) {
        super(25, nombre);
    }

    @Override
    public void ataque(Chinpokomon unPokemon) {
        this.ataqueGallotronix(unPokemon);
    }


    public void ataqueGallotronix(Chinpokomon unPokemon) {
        if(Math.random() * ( 11 - 1 ) == 1) {
            unPokemon.setVida((unPokemon.getVida() / 2));
        } else {
            unPokemon.setVida(unPokemon.getVida() - 2);
        }
    }
}
