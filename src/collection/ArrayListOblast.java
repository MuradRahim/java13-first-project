package collection;

import java.util.List;
import java.util.Scanner;

public class ArrayListOblast {
    private static List oblast = List.of(
        "Чуй", "Талас", "Баткен", "Ош",
        "Манас", "Нарын", "Ыссык-Кол"
    );

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        countOblast(sc);
        System.out.println("Давай перечислим название каждой области без ошибок!");
        System.out.println("При ошибке все начнется с начало!");
        int counter = oblast.size();
        while (counter > 0) {
            String oblName = sc.nextLine();
            if (oblast.contains(oblName)) {
                System.out.println("Верно!");
                counter--;
                System.out.println("Осталось еще название "+counter+"ти области");
            } else {
                System.out.println("Ты ответил не верно");
                System.out.println("Начнем все с начало");
                counter = oblast.size();
            }
        }
        System.out.println("Ура ты ответил на все вопросы верно!");
    }

    private static void countOblast(Scanner sc) {
        Integer count = 0;
        while (count != oblast.size()) {
            System.out.println("Сколько областей в Кыргызстане?");
            count = Integer.parseInt(sc.nextLine());
            if (count != oblast.size()) {
                System.out.println("Ответ не правильный, Давай попробуем еще раз!");
            }
        }
    }
}
