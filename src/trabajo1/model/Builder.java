package trabajo1.model;

import java.util.List;


public interface Builder {
    public void setNombre(String nombre);
    public void setAtaques(List<Ataque> ataques);
    public void setVida(int vida);
    public void setNaturaleza(Naturaleza naturaleza);
    public void setRandom(GeneracionDeRandom random);
}
