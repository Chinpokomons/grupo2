package trabajo1.model;

import java.util.Random;

public abstract class Ataque {
    private int valorDeAtaque;
    private int valorAtaqueNaturaleza = 0;
    Random random = new Random();

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
    
    public int getValorAtaqueNaturaleza() {
    	return valorAtaqueNaturaleza;
    }
    
    public void setValorAtaqueNaturaleza(int valorAtaqueNatural) {
    	this.valorAtaqueNaturaleza = valorAtaqueNatural;
    }
    
    public int generarRandom(int valorMaximoExcluyente){
        return random.nextInt(valorMaximoExcluyente);
    }
}
