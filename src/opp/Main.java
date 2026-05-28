package opp;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstName("John");
        student1.setAge(23);
        student1.setBirthDate("21.12.2006");
        student1.setGender("Male");
        student1.setCourse(3);
        student1.setFaculty("Programming");

        Employee employee = new Employee();
        employee.setFirstName("Mark");
        employee.setAge(22);
        employee.setBirthDate("21.12.2005");
        employee.setExperience(3);
        employee.setPosition("Taxi Driver");


        student1.showInfo();
        System.out.println("--------------------------------");
        employee.showInfo();

    }
}
