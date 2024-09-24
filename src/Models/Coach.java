package Models;

public class Coach extends Selection {
    private String idFederation;

    public Coach(int id, String name, String lastName, int age, String idFederation) {
        super(id, name, lastName, age);
        this.idFederation = idFederation;
    }

    public Coach() {
    }

    public String getIdFederation() {
        return idFederation;
    }

    public void setIdFederation(String idFederation) {
        this.idFederation = idFederation;
    }

    /**
     * Metodo para iniciar direcion de un Partido
     */
    public void dirigirPartido(){
        System.out.printf(getName()+" - dirginedo el partido");
    }

    /**
     * Metodo para iniciar un Entrenamiento
     */
    public void dirigirEntrenamiento(){
        System.out.printf(getName()+" - dirigiendo el entrenamiento");
    }

    @Override
    public String toString() {
        return super.toString()+ " " + this.getClass().getName() +
                " idFederacion='" + idFederation + '\'' +
                '}';
    }
}
