package opp;

/**
 * Наследоваться от AbstractHuman
 * Добавить свои поля для описание студента
 * Это студент универа и мы должны
 * создать класс для учета студентов
 * */
public class Student extends AbstractHuman {
    private String course;
    private int IQ;
    private String facultet;

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    @Override
    public String getFullName() {
        return getFirstName()+ " " + getLastName() + " " + getSecondName();
    }
}
