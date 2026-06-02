package opp;

public class Student {
    private String firstName;
    private String lastName;
    private String secondName;
    private int age;
    private String gender;
    private String birthDate;
    private String ID;
    private int course;
    private String faculty;
    private boolean isBudget;
    private String yearOfStudy;
    private String address;

    public Student() {
    }

    public Student(String firstName, String lastName, String secondName, int age, String gender,
        String birthDate, String ID, int course, String faculty, Boolean isBudget, String yearOfStudy, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
        this.birthDate = birthDate;
        this.ID = ID;
        this.course = course;
        this.faculty = faculty;
        this.isBudget = isBudget;
        this.yearOfStudy = yearOfStudy;
        this.address = address;
    }

    public Student(String firstName, String lastName, int age, String gender, int course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.course = course;
    }

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public void showInfo() {
        System.out.println("My name is " + getFirstName() + " " + getLastName());
        System.out.println("My age is " + getAge());
        System.out.println("I was born in " + getBirthDate());
        System.out.println("I study on " + getCourse() + " course");
        System.out.println("My faculty is " + getFaculty());
        System.out.println("My year of study is " + getYearOfStudy());
        System.out.println("I study like " + (isBudget ? "buget" : "contract"));
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

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
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

    public boolean isBudget() {
        return isBudget;
    }

    public void setBudget(boolean budget) {
        isBudget = budget;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
