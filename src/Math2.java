import java.util.Random;
import java.util.Scanner;

public class Math2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Привет, это генератор пароля.");
        System.out.print("Какой длинны должен быть пароль: ");
        byte lenth = scanner.nextByte();

        System.out.print("Ваш пароль: ");
        for (int i = 0; i < lenth; i++) {
            System.out.print(random.nextInt(lenth));
        }
    }
}
