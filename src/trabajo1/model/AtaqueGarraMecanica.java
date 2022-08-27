package trabajo1.model;

public class AtaqueGarraMecanica extends AtaqueDanio{
    public AtaqueGarraMecanica(int valorDeAtaque) {
        super(valorDeAtaque);
    }

    @Override
    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2) {
        super.generarEfecto(chinpokomon1, chinpokomon2);
        if(Math.random() * ( 11 - 1 ) == 1) {
            super.generarEfecto(chinpokomon1, chinpokomon2);
        } else {
            super.generarEfecto(chinpokomon1, chinpokomon2);
        }
    }
}
