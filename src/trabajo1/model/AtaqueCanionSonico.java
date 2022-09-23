package trabajo1.model;

public class AtaqueCanionSonico extends Ataque{
    public AtaqueCanionSonico(int valorDeAtaque,GeneracionDeRandom random) {
        super(valorDeAtaque,random);
      //agregamos el danio extra que realiza este ataque si tiene ventaja de naturaleza
        this.setValorAtaqueNaturaleza(1);
    }
    @Override
    public String toString(){
        return "Canion Sonico";
    }
}