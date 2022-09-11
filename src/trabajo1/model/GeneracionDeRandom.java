package trabajo1.model;

import java.util.Random;

public class GeneracionDeRandom {
    private final Random random = new Random();
    private static GeneracionDeRandom instance;
    private GeneracionDeRandom() {}
    public int generarRandom(int limiteExcluyente){
        return this.random.nextInt(limiteExcluyente);
    }
    public static GeneracionDeRandom getInstance() {
        if (instance == null) {
            instance = new GeneracionDeRandom();
        }
        return instance;
    }
}
