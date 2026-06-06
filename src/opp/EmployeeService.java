package opp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements PersonInfo {
    List<Employee> employees = new ArrayList<>();

    @Override
    public void infoOfAddress(String ID) {
        for (Employee emp : employees) {
            if (ID.equals(emp.getID())) {
                System.out.println("Имя: " + emp.getFirstName() + " " + emp.getLastName());
                System.out.println("Адрес: " + emp.getAddress());
            }
        }
    }

    @Override
    public void personalInfo(String ID) {

    }

    @Override
    public void infoOfPhoneNumber(String ID) {

    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployee(Employee employee) {
        this.employees.add(employee);
    }
}
