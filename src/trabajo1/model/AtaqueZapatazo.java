package trabajo1.model;

public class AtaqueZapatazo extends AtaqueDanio{
    public AtaqueZapatazo(int valorDeAtaque) {
        super(valorDeAtaque);
    }

    @Override
    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2) {
        super.generarEfecto(chinpokomon1, chinpokomon2);
        var aux = Math.random() * ( 3 - 1 );
        if(aux == 1) {
            super.generarEfecto(chinpokomon1, chinpokomon2);
        }
    }
}
