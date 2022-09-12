package trabajo1.model;

import java.util.Random;

public class Ataque {
    private int valorDeAtaque;
    private int valorAtaqueNaturaleza = 0;
    Random random = new Random();

    public Ataque(int valorDeAtaque) {
        this.valorDeAtaque = valorDeAtaque;

    }

    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2){
        if(chinpokomon2.getVida()>0){
            chinpokomon2.setVida(chinpokomon2.getVida() - this.getValorDeAtaque() - this.danioExtraNaturaleza(chinpokomon1, chinpokomon2));
        }

    }

    public int getValorDeAtaque() {
        return valorDeAtaque;
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

    public int danioExtraNaturaleza(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2) {
        //determinamos si el chinpokomon1 tiene ventaja de naturaleza sobre el chinpokomon2
        // si tiene ventaja por naturaleza accedera a este if y aumentara el ataque instanciado al inicio + daño adicional
        if(chinpokomon1.getNaturaleza().tieneVentaja(chinpokomon2.getNaturaleza())) {
            return this.getValorAtaqueNaturaleza();
        }else {
            return 0;
        }
    }
}
