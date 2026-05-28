package opp;

public class Employee extends Human implements PersonInfo {
    private String position;
    private int experience;

    @Override
    public void showInfo() {
        System.out.println("My name is " + getFirstName());
        System.out.println("My age is " + getAge());
        System.out.println("I was born in " + getBirthDate());
        System.out.println("I work like " + getPosition());
        System.out.println("I have experience " + getExperience());
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
}
