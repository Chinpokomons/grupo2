package trabajo1.model;

import java.util.Random;

public class AtaqueZapatazo extends AtaqueDanio{
    Random random = new Random();
    public AtaqueZapatazo(int valorDeAtaque) {
        super(valorDeAtaque);
    }

    @Override
    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2) {
        super.generarEfecto(chinpokomon1, chinpokomon2);
        /*
        var aux = Math.random() * ( 3 - 1 );
        if(aux == 1) {
            super.generarEfecto(chinpokomon1, chinpokomon2);
        }

         */
        //devuelve entre 0(inclusivo) y el valor pasado(Exclusivo) [0;n) || [O;n-1]
        int randomIndex = random.nextInt(2);
        if(randomIndex==1){
            super.generarEfecto(chinpokomon1, chinpokomon2);
        }
    }
}
