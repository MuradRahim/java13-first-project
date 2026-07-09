package lamnda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class WithOutLamda {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Иван", 120000),
            new Employee("Анна", 90000),
            new Employee("Дмитрий", 150000),
            new Employee("Дмитрий", 1020000),
            new Employee("Борис", 85000)
        );

        // Переписано без лямбд — через явные анонимные классы
        employees.stream()
            // 1. Фильтр (интерфейс Predicate)
            .filter(new Predicate<Employee>() {
                @Override
                public boolean test(Employee emp) {
                    return emp.getSalary() > 100000;
                }
            })
            // 2. Трансформация (интерфейс Function)
            .map(new Function<Employee, String>() {
                @Override
                public String apply(Employee emp) {
                    return emp.getName();
                }
            })
            // 3. Компаратор (интерфейс Comparator)
            .sorted(new SortEmpName<String>() {
                @Override
                public int compare(String name1, String name2) {
                    return name2.compareTo(name1);
                }
            })
            // 4. Вывод (интерфейс Consumer)
            .forEach(new Consumer<String>() {
                @Override
                public void accept(String name) {
                    System.out.println(name);
                }
            });
    }
}
