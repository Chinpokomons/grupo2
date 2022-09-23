package trabajo1.model;

public class AtaqueRayoVeloz extends Ataque{
    public AtaqueRayoVeloz(int valorDeAtaque) {
        super(valorDeAtaque);
      //agregamos el danio extra que realiza este ataque si tiene ventaja de naturaleza
        this.setValorAtaqueNaturaleza(1);
    }
    @Override
    public String toString(){
        return "Ataque Rayo Veloz";
    }
}
