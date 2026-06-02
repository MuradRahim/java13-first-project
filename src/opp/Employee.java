package opp;

public class Employee {
    private String firstName;
    private String lastName;
    private String secondName;
    private int age;
    private String gender;
    private String birthDate;
    private String ID;
    private String position;
    private int experience;
    private int salary;

    public Employee() {
    }

    public Employee(String secondName, String firstName, String lastName, int age, String gender, String birthDate, String ID, String position, int experience,
        int salary) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.birthDate = birthDate;
        this.ID = ID;
        this.position = position;
        this.experience = experience;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public void showInfo() {
        System.out.println("My name is " + getFirstName() + " " + getLastName());
        System.out.println("My age is " + getAge());
        System.out.println("I was born in " + getBirthDate());
        System.out.println("I work like " + getPosition());
        System.out.println("I have experience " + getExperience());
        System.out.println("I have salary " + getSalary());
    }

    //---get and set ----------------------

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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
