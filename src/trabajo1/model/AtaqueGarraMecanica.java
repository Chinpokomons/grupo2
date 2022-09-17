package trabajo1.model;
public class AtaqueGarraMecanica extends Ataque{
    public AtaqueGarraMecanica(int valorDeAtaque) {
        super(valorDeAtaque);
        //agregamos el danio extra que realiza este ataque si tiene ventaja de naturaleza
        this.setValorAtaqueNaturaleza(2);
    }

    @Override
    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2) {

            int random = this.generarRandom(10);
            if(random == 1){
                System.out.println("ENTRE ACA");
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
