import java.util.Scanner;

public class ForEach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";

        for (int i = 1; i <= 3; i++) {
            System.out.print("Как тебя зовут? ");
            name = sc.nextLine();
            if (name.equalsIgnoreCase("Альберт")) {
                System.out.println("Мы нашли его! Это же Альберт Эйнштейн");
                break;
            }
        }

        if (!name.equalsIgnoreCase("Альберт")) {
            System.out.println("Мы не нашли этого человека");
        }
    }
}
