public class Developer {
    private int id;
    private String firstName;
    private String lastName;
    private String specialty;
    private int experience;

    public Developer() {
    }

    public Developer(int id, String firstName, String lastName, String specialty, int experience) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Deceloper {"+
                "id="+id+
                ", firstName="+firstName+'\''+
                ", lastName="+lastName+'\''+
                ", specialty="+specialty+'\''+
                ", experience="+experience+'\''+
                '}';

    }
}
