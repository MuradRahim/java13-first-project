import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1 - Играть");
            System.out.println("2 - Выйти");
            choice = scanner.nextInt();
            // обработка выбора
        } while (choice != 2);
        scanner.close();

    }
}
