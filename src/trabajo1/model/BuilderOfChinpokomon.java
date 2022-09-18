package trabajo1.model;

import java.util.List;


public class BuilderOfChinpokomon implements Builder{
    private String nombre;
    private List<Ataque> listaDeAtaques;
    private int vida;
    private CompuestoNatural naturalezas;
    private GeneracionDeRandom genRandom;

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setAtaques(List<Ataque> ataques) {
        this.listaDeAtaques = ataques;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setNaturaleza(CompuestoNatural naturaleza) {
        this.naturalezas = naturaleza;
    }

    @Override
    public void setRandom(GeneracionDeRandom genRandom) {
        this.genRandom = genRandom;
    }
    //agregar random
    public Chinpokomon chinpokomonResult(){
        return new Chinpokomon(vida, nombre, listaDeAtaques, naturalezas,genRandom);
    }
}
