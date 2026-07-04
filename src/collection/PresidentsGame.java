package collection;

import java.util.Scanner;

import static collection.PresidentsKG.presidents;

public class PresidentsGame {

    public static void main(String[] args) {
        System.out.println("Насколько хорошо ты знаешь новую историю Кыргызстана.");
        System.out.println("Давай проверим это!");
        System.out.println("Ты должен последовательно написать ИМЯ и ФАМИЛЮ президента");
        System.out.println("Начиная с первого президента по текущий");
        System.out.println("Если ты ошибёшься в последовательности или в имени начнем все с начало");
        Scanner scanner = new Scanner(System.in);

        int count = presidents.size();
        while (count > 0) {

            int countPres = presidents.size() - count;

            System.out.println("Кто был "+(countPres + 1) +"й президент?");
            String presidentName = scanner.nextLine().trim();
            if (presidents.get(countPres).equalsIgnoreCase(presidentName)) {
                System.out.println("Правильно!");
                count--;
            } else {
                System.out.println("Не правильно( начнем с начало");
                count = presidents.size();
            }
        }
        System.out.println("УРА ТЫ НА ВСЕ ВОПРОСЫ ОТВЕТИЛ ПРАВИЛЬНО!");

    }
}
