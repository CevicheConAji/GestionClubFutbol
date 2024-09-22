package models;

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

    public void dirigirPartido(){
        System.out.printf(getName()+" - diirginedo el partido");
    }
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
