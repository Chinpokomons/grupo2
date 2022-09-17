package trabajo1.model;

public class ArenaBatalla {

    private Chinpokomon chinpokomon1;
    private Chinpokomon chinpokomon2;

    public ArenaBatalla(Chinpokomon chinpokomon1, Chinpokomon chinpokomon2) {
        this.chinpokomon1 = chinpokomon1;
        this.chinpokomon2 = chinpokomon2;
    }
    /*
     * proposito: obtener el chinpokomon 1
     * precondicion, ninguna
     * tipo: Chinpokomon
     * parametro: ninguno
     * */
    public Chinpokomon getChinpokomon1() {
        return chinpokomon1;
    }
    /*
     * proposito: obtener el chinpokomon 2
     * precondicion, ninguna
     * tipo: Chinpokomon
     * parametro: ninguno
     * */
    public Chinpokomon getChinpokomon2() {
        return chinpokomon2;
    }
    /*
     * proposito: hacer que dos chinpokomons peleen entre si
     * precondicion, debe haber dos chinpokomons en la arena de batalla
     * tipo: void
     * parametro: ninguno
     * */
    public void pelea() {

        while(this.noTerminoLaPelea()) {
                this.getChinpokomon1().ataque(this.getChinpokomon2());
                System.out.println("Ataco el M1," + " La vida de m1 es: "+ this.getChinpokomon1().getVida() + " y la vida de m2 es " + this.getChinpokomon2().getVida() );
                this.getChinpokomon2().ataque(this.getChinpokomon1());
                System.out.println("Ataco el M2," + " La vida de m2 es: "+ this.getChinpokomon2().getVida() + " y la vida de m1 es " + this.getChinpokomon1().getVida() );
        }
        this.imprimirChinpokomonGanador(this.chinpokomonGanador());
    }
    /*
     * proposito: indicar si termino la pelea entre chinpokomons
     * precondicion: debe haber dos Chinpokomon en la arena de batalla
     * tipo: Boolean
     * parametro: ninguno
     * */
    private boolean noTerminoLaPelea(){
        return !this.murioChinpokomon1() || !this.murioChinpokomon2();
    }

    private boolean murioChinpokomon1(){
        return this.getChinpokomon1().getVida()<=0;
    }
    private boolean murioChinpokomon2(){
        return getChinpokomon2().getVida()<=0;
    }
    /*
     * proposito: obtener el Chinpokomon que gano la pelea
     * precondicion: debe haber dos Chinpokomon en la arena de batalla
     * tipo: Chinpokomon
     * parametro: ninguno
     * */
    private Chinpokomon chinpokomonGanador(){
        if(this.getChinpokomon1().getVida() <= 0) {
            return this.getChinpokomon2();
        } else {
            return this.getChinpokomon1();
        }
    }

    @Override
    public String toString() {
        return "ArenaBatalla{" +
                "chinpokomon1=" + chinpokomon1 +
                ", chinpokomon2=" + chinpokomon2 +
                '}';
    }

    /*
    * proposito: imprimir el Chinpokomon que gano la pelea
    * precondicion: ninguna
    * tipo: void
    * parametro: chinpokomongGnador: Chinpokomon - el chinpokomon que gano la pelea
    * */
    private void imprimirChinpokomonGanador(Chinpokomon chinpokomongGnador){
        System.out.println("El Chinpokomon Ganador es: " + chinpokomongGnador);
    }

}
