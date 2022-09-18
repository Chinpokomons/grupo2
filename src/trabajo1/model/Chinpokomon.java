package trabajo1.model;
import java.util.List;

public class Chinpokomon {
    private int vida;
    private String nombre;
    private List<Ataque> ataques;
    private Naturaleza naturaleza;
    private GeneracionDeRandom genRandom;

    public Chinpokomon(int vida, String nombre, List<Ataque> ataques, Naturaleza naturaleza, GeneracionDeRandom genRandom) {
        this.vida = vida;
        this.nombre = nombre;
        this.ataques = ataques;
        this.naturaleza = naturaleza;
        this.genRandom = genRandom;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }

    public int getVida() {
        return vida;
    }

    public GeneracionDeRandom getGenRandom() { return genRandom;}

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public Naturaleza getNaturaleza() {
    	return naturaleza;
    }

    public void ataque(Chinpokomon unChiPokomon) {
        if(this.noEstaMuertoElChinpokomonAtacar(unChiPokomon) && this.estoyVivo()){
            this.atacarSegunAtaqueSeleccionado(unChiPokomon);
        }
    }

    private void atacarSegunAtaqueSeleccionado(Chinpokomon unChiPokomonAAtacar){
        if(this.getAtaques().size() == 1){
            this.getAtaques().get(0).generarEfecto(this, unChiPokomonAAtacar);
        }else{
            int ataqueElegido = genRandom.generarRandom(this.getAtaques().size());
            this.getAtaques().get(ataqueElegido).generarEfecto(this, unChiPokomonAAtacar);
        }
    }
    private boolean estoyVivo(){return this.getVida() >0;}
    private boolean noEstaMuertoElChinpokomonAtacar(Chinpokomon unChiPokomon){
        return unChiPokomon.getVida()>0;
    }
    @Override
    public String toString() { return "Chinpokomon{" + "vida=" + vida + ", nombre='" + nombre + '\'' + ", naturaleza=" + naturaleza + '}';
    }
}
