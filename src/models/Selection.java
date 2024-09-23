package models;

public class Selection implements Comparable<Selection> {
    private int id;
    private String name;
    private String lastName;
    private int age;

    public Selection(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Selection() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void concentrarse(){
        System.out.printf(getName() + " - Concentracion ");
    }
    public void viajar(){
        System.out.printf(getName()+" - Viajar ");
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                " id=" + id +
                ", nombre='" + name + '\'' +
                ", apellido='" + lastName + '\'' +
                ", edad=" + age +
                '}';
    }

    @Override
    public int compareTo(Selection o) {
        int edadDiff = this.age - o.age;
        int nameDiff = this.name.compareTo(o.name);
        int idDiff = this.id - o.id;

        if (edadDiff != 0) {
            return edadDiff;
        }
        if (nameDiff != 0) {
            return nameDiff;
        }
        if (idDiff != 0) {
            return idDiff;
        }
        return ;
    }
}
