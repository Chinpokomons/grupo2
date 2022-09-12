package trabajo1.model;

public class AtaqueZapatazo extends Ataque{

    public AtaqueZapatazo(int valorDeAtaque) {
        super(valorDeAtaque);
      //agregamos el danio extra que realiza este ataque si tiene ventaja de naturaleza
        this.setValorAtaqueNaturaleza(3);
    }

    @Override

    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2,int probabilidad) {
        super.generarEfecto(chinpokomon1, chinpokomon2,probabilidad);
        if(this.generarRandom(probabilidad)==1){
            super.generarEfecto(chinpokomon1, chinpokomon2,probabilidad);
        }
    }
}
