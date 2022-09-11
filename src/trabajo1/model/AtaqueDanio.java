package trabajo1.model;

public class AtaqueDanio extends Ataque{
    public AtaqueDanio(int valorDeAtaque) {
        super(valorDeAtaque);
    }

    @Override
    public void generarEfecto(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2) {
        System.out.println("el chiponkmon1 es " + chinpokomon1 + " y el 2 es " + chinpokomon2);
        chinpokomon2.setVida(chinpokomon2.getVida() - this.getValorDeAtaque() - this.danioExtraNaturaleza(chinpokomon1, chinpokomon2));
    }
    
    public int danioExtraNaturaleza(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2) {
    	//determinamos si el chinpokomon1 tiene ventaja de naturaleza sobre el chinpokomon2
    	// si tiene ventaja por naturaleza accedera a este if y aumentara el ataque instanciado al inicio + daño adicional
    	
    	if(chinpokomon1.getNaturaleza().tieneVentaja(chinpokomon2.getNaturaleza())) {
    		return this.getValorAtaqueNaturaleza();
    	}else {
    		return 0;
    	}
	}
}
