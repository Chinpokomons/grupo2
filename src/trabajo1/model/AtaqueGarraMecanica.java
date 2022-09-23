package trabajo1.model;
public class AtaqueGarraMecanica extends Ataque{
    public AtaqueGarraMecanica(int valorDeAtaque,GeneracionDeRandom random) {
        super(valorDeAtaque,random);
        //agregamos el danio extra que realiza este ataque si tiene ventaja de naturaleza
        this.setValorAtaqueNaturaleza(2);
    }

    @Override
    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2,Logger log) {

            int random = this.getRandom().generarRandom(10);
            if(random == 1){
                this.sacarMitadDeLaVidaQueLeQueda(chinpokomon2,log);
            }else{
                super.generarEfecto(chinpokomon1, chinpokomon2,log);
            }

    }
    private int obtenerVidaRestanteDeChinpokomon(Chinpokomon chinpokomon){
        return chinpokomon.getVida();
    }
    private void sacarMitadDeLaVidaQueLeQueda(Chinpokomon chinpokomon,Logger log){
        log.warn("El ataque Garra Mecanica fue especial y le saco la mitad de la vida que le quedaba al chinpokomon");
        chinpokomon.setVida(this.obtenerVidaRestanteDeChinpokomon(chinpokomon) - this.obtenerVidaRestanteDeChinpokomon(chinpokomon)/2);
    }
    @Override
    public String toString(){
        return "Ataque Garra Mecanica";
    }
}
