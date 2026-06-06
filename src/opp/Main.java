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
    }
}