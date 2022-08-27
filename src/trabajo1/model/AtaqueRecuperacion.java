package trabajo1.model;

public class AtaqueRecuperacion extends Ataque{
    public AtaqueRecuperacion(int valorDeAtaque) {
        super(valorDeAtaque);
    }

    @Override
    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2) {
        System.out.println("el chiponkmon1 es " + chinpokomon1 + " y el 2 es " + chinpokomon2);
        chinpokomon1.setVida(chinpokomon1.getVida() + this.getValorDeAtaque());
    }
}
