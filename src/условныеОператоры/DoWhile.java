package условныеОператоры;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("1 - Играть");
            System.out.println("2 - Выйти");
            choice = scanner.nextLine();
            if (choice.equals("1")) play(scanner);
        } while (!choice.equals("2"));
        scanner.close();

    }

    public static void play(Scanner scanner) {
        System.out.println("Кем был 1й президент Кыргызстана?");
        String fullName = scanner.nextLine();
        if (fullName.equalsIgnoreCase("Аскар Акаев")) {
            System.out.println("Вы выйграли!");
        } else {
            System.out.println("Вы проиграли!");
        }
    }
}
