package trabajo1.model;

public class AtaquePomadaWassington extends Ataque{

    public AtaquePomadaWassington(int valorDeAtaque) {
        super(valorDeAtaque);
      //agregamos el danio extra que realiza este ataque si tiene ventaja de naturaleza
        this.setValorAtaqueNaturaleza(1);
    }
    @Override
    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2) {
        System.out.println("Entre a pomada");
        chinpokomon1.setVida(chinpokomon1.getVida() + this.getValorDeAtaque());
    }
}
