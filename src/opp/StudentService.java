package opp;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements PersonInfo {
    List<Student> students = new ArrayList<>();

    @Override
    public void infoOfAddress(String ID) {
        for (Student s : students) {
            if (ID.equals(s.getID())) {
                System.out.println("Имя: " + s.getFirstName() + " " + s.getLastName());
                System.out.println("Адрес: " + s.getAddress());
            }
        }
    }

    @Override
    public void personalInfo(String ID) {
        for (Student s : students) {
            if (ID.equals(s.getID())) {
                System.out.println("Имя: " + s.getFirstName() + " " + s.getLastName());
                System.out.println("Адрес: " + s.getAddress());
                System.out.println("Курс: " + s.getCourse());
                System.out.println("Факультет: " + s.getFaculty());
            }
        }
    }

    @Override
    public void infoOfPhoneNumber(String ID) {
        for (Student s : students) {
            if (ID.equals(s.getID())) {
                System.out.println("Имя: " + s.getFirstName() + " " + s.getLastName());
                System.out.println("Номер телефона: " + s.getPhoneNumber());
            }
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
