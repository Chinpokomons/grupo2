package trabajo1.model;

public class AtaqueZapatazo extends Ataque{

    public AtaqueZapatazo(int valorDeAtaque) {
        super(valorDeAtaque);
        this.setValorAtaqueNaturaleza(3);
    }

    @Override
    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2) {
        if(super.sePuedeAtacar(chinpokomon1,chinpokomon2)){
            super.generarEfecto(chinpokomon1, chinpokomon2);
            if(this.generarRandom(2)==1){
                super.generarEfecto(chinpokomon1, chinpokomon2);
            }
        }

    }
}
