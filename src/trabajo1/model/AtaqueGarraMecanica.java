package trabajo1.model;

import java.util.Random;

public class AtaqueGarraMecanica extends AtaqueDanio{
    public AtaqueGarraMecanica(int valorDeAtaque) {
        super(valorDeAtaque);
    }

    @Override
    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2) {
        int random = this.generarRandom(10);
        if(random == 1){
            this.sacarMitadDeLaVidaQueLeQueda(chinpokomon2);
        }else{
            super.generarEfecto(chinpokomon1, chinpokomon2);
        }
    }
    private int obtenerVidaRestanteDeChinpokomon(Chinpokomon chinpokomon){
        return chinpokomon.getVida();
    }
    private void sacarMitadDeLaVidaQueLeQueda(Chinpokomon chinpokomon){
        chinpokomon.setVida(this.obtenerVidaRestanteDeChinpokomon(chinpokomon) - this.obtenerVidaRestanteDeChinpokomon(chinpokomon)/2);
    }
}
