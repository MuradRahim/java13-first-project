package opp;

public class Employee extends AbstractHuman {

    private String ID;
    private String position;
    private int experience;
    private int salary;

    public Employee() {
        super();
    }

    public Employee(String secondName, String firstName, String lastName, int age, String gender, String birthDate, String ID, String position, int experience,
        int salary) {
        super(firstName,lastName,secondName,age,gender,birthDate);
        this.ID = ID;
        this.position = position;
        this.experience = experience;
        this.salary = salary;
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + getFirstName() + " " + getLastName());
        System.out.println("My age is " + getAge());
        System.out.println("I was born in " + getBirthDate());
        System.out.println("I work like " + getPosition());
        System.out.println("I have experience " + getExperience());
        System.out.println("I have salary " + getSalary());
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
