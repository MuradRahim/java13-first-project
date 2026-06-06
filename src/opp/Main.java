package opp;

public class Main {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        Employee employee1 = new Employee();
        employee1.setID("1");
        employee1.setFirstName("Касым");
        employee1.setLastName("Жомарт уулу");
        employee1.setAddress("Москва");
        employeeService.setEmployee(employee1);

        Employee employee2 = new Employee();
        employee2.setID("2");
        employee2.setFirstName("Марат");
        employee2.setLastName("Кожомкулов");
        employee2.setAddress("Бишкек");
        employeeService.setEmployee(employee2);

        employeeService.infoOfAddress("2");



        //        Student student2 = new Student("Ажы", "Касымов", 24, "М", 2);
        //
        //        student2.setYearOfStudy("01.07.2023-01.07.2028");
        //        student2.setBirthDate("02.07.2000");
        //        student2.setFaculty("Programming");
        //        student2.setBudget(true);
        //
        //        student2.showInfo();
        //
        //        System.out.println("---------------------------------------");
        //        System.out.println("---------------------------------------");

    }
}