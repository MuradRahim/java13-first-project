package collection;

import java.util.List;
import java.util.Scanner;

public class RiddleGame {
    private static List<String> riddles = List.of(
        "Нет ушей, а слышит. Нет рук, а пишет.",
        "Магнитофон",
        "Что проходит большое пространство, не двигаясь с места?",
        "Дорога",
        "Ни глаз, ни ушей, а слепцов водит.",
        "Палка"
    );

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Давай поиграем в загадки");
        System.out.println("--------------------------------------\n");
        int isLox = 0;
        while (riddles.size() > count) {
            System.out.println(riddles.get(count));
            String input = sc.nextLine();
            if (input.equalsIgnoreCase(riddles.get(++count))) {
                System.out.println("Правильно!\n");
                count++;
            } else if (input.equalsIgnoreCase("Сдаюсь")) {
                System.out.println("Эхх молодежь глупеет(\n");
                isLox++;
                count++;
            } else {
                System.out.println("Не правильно!\n");
                count--;
            }
        }
        if (isLox == 0) {
            System.out.println("Поздравляю!\nТы отгадал все загадки правильно!");
        } else {
            System.out.println("Увы ты не отгадал " + isLox + " кол загадок!");
        }
    }
}
