package trabajo1.model;

public class ArenaBatalla {

    private Chinpokomon pokemon1;
    private Chinpokomon pokemon2;

    public ArenaBatalla(Chinpokomon pokemon1, Chinpokomon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }

    public Chinpokomon getPokemon1() {
        return pokemon1;
    }

    public Chinpokomon getPokemon2() {
        return pokemon2;
    }

    public void setPokemon1(Chinpokomon pokemon1) {
        this.pokemon1 = pokemon1;
    }

    public void setPokemon2(Chinpokomon pokemon2) {
        this.pokemon2 = pokemon2;
    }

    public void pelea() {

        while(this.pokemon1.getVida()>0 || pokemon2.getVida()>0) {

                this.pokemon2.ataque(this.pokemon1);
                System.out.println(pokemon2.getVida());
                this.pokemon1.ataque(this.pokemon2);
                System.out.println(pokemon1.getVida());
        }
        if(this.pokemon1.getVida() == 0) {
            System.out.println("Ganó: " + this.pokemon2.getNombre());
        } else {
            System.out.println("Ganó: " + this.pokemon1.getNombre());
        }
    }

}
