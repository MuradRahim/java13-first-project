package условныеОператоры;

import java.util.Scanner;

/**
 * todo Document type условныеОператоры.While
 */
public class While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Сколько вам лет? : ");
            int age = sc.nextInt();
            if (age != 50) {
                System.out.println("Добро пожаловать в наше компанию");
                break;
            } else {
                System.out.println("Мы вам позвоним!");
            }
        }

    }
}
