package lamnda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * todo Document type AnonimClass
 */
public class AnonimClass {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Александр");
        employees.add("Ян");
        employees.add("Дмитрий");

        // Использование анонимного класса для создания компаратора
        Collections.sort(employees, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                // Сравниваем сотрудников по длине их имён
                return Integer.compare(name1.length(), name2.length());
            }
        });

        // Выведет: [Ян, Дмитрий, Александр]
        System.out.println(employees);
    }
}
