package lamnda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithMethodsOnly {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Иван", 120000),
            new Employee("Анна", 90000),
            new Employee("Дмитрий", 150000),
            new Employee("Дмитрий", 1020000),
            new Employee("Борис", 85000),
            new Employee("Борис", 285000)
        );

        // Последовательный вызов методов (цепочка преобразований)
        List<Employee> filtered = filterBySalary(employees, 100000);
        List<String> names = extractNames(filtered);
        sortNamesDesc(names);
        printNames(names);
    }

    // 1. Отдельный метод для фильтрации сотрудников по зарплате
    public static List<Employee> filterBySalary(List<Employee> list, double minSalary) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : list) {
            if (emp.getSalary() > minSalary) {
                result.add(emp);
            }
        }
        return result;
    }

    // 2. Отдельный метод для трансформации (извлечения имён)
    public static List<String> extractNames(List<Employee> list) {
        List<String> result = new ArrayList<>();
        for (Employee emp : list) {
            result.add(emp.getName());
        }
        return result;
    }

    // 3. Отдельный метод для сортировки списка строк по убыванию (пузырьком для наглядности)
    public static void sortNamesDesc(List<String> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Сравниваем строки. Если текущая меньше следующей — меняем местами (сортировка по убыванию)
                if (list.get(j).compareTo(list.get(j + 1)) < 0) {
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    // 4. Отдельный метод для вывода списка в консоль
    public static void printNames(List<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
    }
}
