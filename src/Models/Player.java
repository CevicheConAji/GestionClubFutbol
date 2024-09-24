package Models;

public class Player extends Selection {
    private int bibNumber;
    private String demarcation;

    public Player(int id, String name, String lastName,
                  int age, int bibNumber, String demarcation) {
        super(id, name, lastName, age);
        this.bibNumber = bibNumber;
        this.demarcation = demarcation;
    }

    public Player() {}

    public int getDorsal() {
        return bibNumber;
    }

    public void setDorsal(int dorsal) {
        this.bibNumber = dorsal;
    }

    public String getDemarcation() {
        return demarcation;
    }

    public void setDemarcation(String demarcation) {
        this.demarcation = demarcation;
    }

    /**
     * Metodo para iniciar una Partida
     */
    public void jugarPartido(){
        System.out.printf(getName() +" - Jugando Partido");
    }
    /**
     * Metodo para iniciar Entranamiento
     */
    public void entrenar(){
        System.out.printf(getName() +" - Entrenando Futbolista");
    }

    @Override
    public String toString() {
        return super.toString()+ " " + this.getClass().getName() +
                " dorsal=" + bibNumber +
                ", demarcacion='" + demarcation + '\'' +
                '}';
    }
}
