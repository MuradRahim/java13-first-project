package opp;

public class Student extends AbstractHuman {

    private String ID;
    private int course;
    private String faculty;
    private boolean isBudget;
    private String yearOfStudy;

    public Student(String firstName, String lastName, String secondName) {
        super(firstName,lastName,secondName);
    }

    public Student(String firstName, String lastName, String secondName, int age, String gender,
        String birthDate, String ID, int course, String faculty, Boolean isBudget, String yearOfStudy, String address, String phoneNumber) {
        super(firstName,lastName,secondName,age,gender,birthDate, address, phoneNumber);
        this.ID = ID;
        this.course = course;
        this.faculty = faculty;
        this.isBudget = isBudget;
        this.yearOfStudy = yearOfStudy;
    }

    public Student() {
        super();
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + getFirstName() + " " + getLastName());
        System.out.println("My age is " + getAge());
        System.out.println("I was born in " + getBirthDate());
        System.out.println("I study on " + getCourse() + " course");
        System.out.println("My faculty is " + getFaculty());
        System.out.println("My year of study is " + getYearOfStudy());
        System.out.println("I study like " + (isBudget ? "buget" : "contract"));
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public boolean isBudget() {
        return isBudget;
    }

    public void setBudget(boolean budget) {
        isBudget = budget;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}
