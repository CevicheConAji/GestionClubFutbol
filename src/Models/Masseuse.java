package Models;

public class Masseuse extends Selection {
    private String qualification;
    private int yearsOfExperience;

    public Masseuse(int id, String name, String lastName,
                    int age, String qualification, int yearsOfExperience) {
        super(id, name, lastName, age);
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Masseuse() {
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public void darMasaje(){
        System.out.printf(getName() +" - dando masaje");
    }

    @Override
    public String toString() {
        return super.toString() +" " +this.getClass().getName() +
                " titulacion='" + qualification + '\'' +
                ", aniosExperiencia=" + yearsOfExperience +
                '}';
    }
}
