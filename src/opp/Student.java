package opp;

public class Student extends Human implements PersonInfo {
    private int course;
    private String faculty;

    @Override
    public void showInfo() {
        System.out.println("My name is " + getFirstName());
        System.out.println("My age is " + getAge());
        System.out.println("I was born in " + getBirthDate());
        System.out.println("I study on " + getCourse());
        System.out.println("My faculty is " + getFaculty());
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
}
