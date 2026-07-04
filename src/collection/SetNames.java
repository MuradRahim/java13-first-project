package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetNames {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Давай проверим твою память на имена!");
        System.out.println("Как думаешь сколько имен ты знаешь?");
        int countName = Integer.parseInt(sc.nextLine());
        System.out.println("Отлично, поехали");
        int unicNames = countName;
        while (countName > 0) {
            System.out.println("Введи новое имя");
            String newGmail = sc.nextLine();

            if (names.contains(newGmail)) {
                System.out.println("Такое имя уже есть!");
                System.out.println("Попробуй еще раз.");
            } else {
                System.out.println("Это действительно новое уникальное имя!");
                countName--;
                names.add(newGmail);
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Ура ты действительно вспомнил " + unicNames + " уникальных имен!");
        names.forEach(System.out::println);
    }
}
