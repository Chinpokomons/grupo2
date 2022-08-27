package trabajo1.model;

public abstract class Ataque {
    private int valorDeAtaque;

    public Ataque(int valorDeAtaque) {
        this.valorDeAtaque = valorDeAtaque;
    }

    public abstract void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2);

    public int getValorDeAtaque() {
        return valorDeAtaque;
    }

    public void setValorDeAtaque(int valorDeAtaque) {
        this.valorDeAtaque = valorDeAtaque;
    }
}
