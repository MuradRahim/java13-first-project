import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько вам лет: ");
        int age = scanner.nextInt();

        if (age < 0 && age > 120) {
            System.out.println("Некорректный возраст");
        } else if (age <= 17) {
            System.out.println("Вы еще несовершеннолетний, идите домой!");
        } else if (age <= 29) {
            System.out.println("Вам пора в армию!");
        } else if (age <= 59) {
            System.out.println("Вам уже поздно идти в армию!");
            System.out.println("Идите работать!");
        } else if (age <= 90) {
            System.out.println("Вам пора на пенсию!");
        } else {
            System.out.println("Вы уже умерли(");
        }
    }
}
