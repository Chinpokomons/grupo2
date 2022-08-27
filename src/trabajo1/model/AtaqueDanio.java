package trabajo1.model;

public class AtaqueDanio extends Ataque{
    public AtaqueDanio(int valorDeAtaque) {
        super(valorDeAtaque);
    }

    @Override
    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2) {
        chinpokomon1.setVida(chinpokomon1.getVida() + this.getValorDeAtaque());
    }
}
