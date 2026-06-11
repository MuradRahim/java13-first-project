package wrapper;

import opp.Student;

import java.util.ArrayList;

public class Main {
    public Integer f;

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student();
        student1.setFirstName("John");
        student1.setSecondName("Malkovich");

        students.add(student1);// индекс 0

        System.out.println(students.get(0).getFirstName());
        System.out.println(students.get(0).getSecondName());
    }
}