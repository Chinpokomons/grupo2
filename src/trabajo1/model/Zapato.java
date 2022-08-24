package trabajo1.model;

public class Zapato extends Chinpokomon{
    public Zapato(String nombre) {
        super(30, nombre);
    }

    @Override
    public void ataque(Chinpokomon unPokemon) {
        var aux = Math.random() * ( 3 - 1 );
        if(aux == 1) {
            this.ataqueZapato(unPokemon);
            this.ataqueZapato(unPokemon);
        } else {
            this.ataqueZapato(unPokemon);
        }

    }

    public void ataqueZapato(Chinpokomon unPokemon) {
        unPokemon.setVida(unPokemon.getVida() - 1);
    }
}
