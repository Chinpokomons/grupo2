package trabajo1.model;

public abstract class Chinpokomon {
    private int vida;
    private String nombre;

    public Chinpokomon(int vida, String nombre) {
        this.vida = vida;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public abstract void ataque(Chinpokomon unPokemon);



}
