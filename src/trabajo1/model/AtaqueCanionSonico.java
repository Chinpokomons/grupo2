package trabajo1.model;

public class AtaqueCanionSonico extends AtaqueDanio{
    public AtaqueCanionSonico(int valorDeAtaque) {
        super(valorDeAtaque);
      //agregamos el danio extra que realiza este ataque si tiene ventaja de naturaleza
        this.setValorAtaqueNaturaleza(1);
    }

}
