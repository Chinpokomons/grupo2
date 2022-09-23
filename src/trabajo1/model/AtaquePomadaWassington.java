package trabajo1.model;

public class AtaquePomadaWassington extends Ataque{

    public AtaquePomadaWassington(int valorDeAtaque,GeneracionDeRandom random) {
        super(valorDeAtaque,random);
      //agregamos el danio extra que realiza este ataque si tiene ventaja de naturaleza
        this.setValorAtaqueNaturaleza(1);
    }
    @Override
    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2,Logger log) {
        log.warn("El chinpokomon recuperó: " + (this.getValorDeAtaque() + this.danioExtraNaturaleza(chinpokomon1, chinpokomon2)));
        chinpokomon1.setVida(chinpokomon1.getVida() + this.getValorDeAtaque());
    }
    @Override
    public String toString(){
        return "Ataque Pomada Wassington";
    }
}
