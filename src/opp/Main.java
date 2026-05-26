package opp;

public class Main {

    public static void main(String[] args) {
        AbstractHuman student = new Student();
        student.setAge(21);
        student.setGender("male");
        student.setFirstName("Аза");
        student.setLastName("Азамат");
        student.setSecondName("Азатович");

        AbstractHuman employee = new Employee();
        employee.setAge(23);
        employee.setGender("male");
        employee.setFirstName("Расул");
        employee.setLastName("Расулович");

        System.out.println(student.getFullName());
        System.out.println(employee.getFullName());

    }
}
