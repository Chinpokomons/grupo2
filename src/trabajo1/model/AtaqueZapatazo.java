package trabajo1.model;

public class AtaqueZapatazo extends Ataque{

    public AtaqueZapatazo(int valorDeAtaque) {
        super(valorDeAtaque);
        this.setValorAtaqueNaturaleza(3);
    }

    @Override
    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2,Logger log) {

            super.generarEfecto(chinpokomon1, chinpokomon2,log);
            if(this.generarRandom(2)==1){
                log.warn("El ataque Zapatazo fue especial y atacó dos veces");
                super.generarEfecto(chinpokomon1, chinpokomon2,log);
            }
    }
    @Override
    public String toString(){
        return "Ataque Zapatazo";
    }
}
