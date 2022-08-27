package trabajo1.model;

public class AtaqueDanio extends Ataque{
    public AtaqueDanio(int valorDeAtaque) {
        super(valorDeAtaque);
    }

    @Override
    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2) {
        System.out.println("el chiponkmon1 es " + chinpokomon1 + " y el 2 es " + chinpokomon2);
        chinpokomon2.setVida(chinpokomon2.getVida() - this.getValorDeAtaque());
    }
}
