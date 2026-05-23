package динамическийМассивArrayList;

import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        List<String> person = new java.util.ArrayList<>();//Динамический массив
        Scanner scanner = new Scanner(System.in);
        int count = 2;// Потом увеличиваем
        System.out.print("Давай познакомимся? Да или Нет:");
        String choose = scanner.nextLine();

        if (!choose.equalsIgnoreCase("Да") && !choose.equalsIgnoreCase("Нет")) {
            System.out.println("Такой операции нету!!!");
        }

        if (choose.equalsIgnoreCase("Нет")) {
            System.out.println("Очень грустно(((");
        }

        while (choose.equalsIgnoreCase("Да") && count > 0) {
            System.out.print("Как тебя зовут? :");
            String name = scanner.nextLine();
            person.add("Тебя зовут: " + name);
            count--;

            System.out.print("Какой у тебя любимый цвет? :");
            String color = scanner.nextLine();
            person.add("Любимый цвет это: " + color);
            count--;
        }

        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i));
        }
    }
}
