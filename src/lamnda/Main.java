package lamnda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Иван", 120000),
            new Employee("Анна", 90000),
            new Employee("Дмитрий", 150000),
            new Employee("Борис", 85000),
            new Employee("Артем", 185000)
        );

        // Реальное применение лямбда-выражений в Stream API
        employees.stream()
            .filter(emp -> emp.getSalary() > 100000)               // 1. Лямбда-фильтр
            .map(emp -> emp.getName())                             // 2. Лямбда-трансформация
            .sorted((name1, name2) -> name2.compareTo(name1))     // 3. Лямбда-компаратор (по убыванию)
            .forEach(System.out::println);            // 4. Лямбда-вывод
    }
}
