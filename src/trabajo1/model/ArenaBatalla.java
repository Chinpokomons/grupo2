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

        while(noTerminoLaPelea()) {
                this.getPokemon1().ataque(this.getPokemon2());
                System.out.println("La vida del m1" + pokemon1 +" es " + pokemon1.getVida() );
                this.getPokemon2().ataque(this.getPokemon1());
                System.out.println("La vida del m2" + pokemon2 +" es " + pokemon2.getVida() );
        }
        System.out.println("El ganador es: " + this.chinpokomonGanador());
    }
    private boolean noTerminoLaPelea(){
        return this.pokemon1.getVida()>0 && pokemon2.getVida()>0;
    }
    private Chinpokomon chinpokomonGanador(){
        if(this.pokemon1.getVida() == 0) {
            return this.getPokemon2();
        } else {
            return this.getPokemon1();
        }
    }

}
