package приложениеКалькулятор;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== Калькулятор ===");
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): "); // <--- Добавить оператор %
        char operation = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.println("Результат:");
        switch (operation) {
            case '+' -> System.out.printf("%.1f + %.1f = %.1f%n", a, b, a + b);
            case '-' -> System.out.printf("%.1f - %.1f = %.1f%n", a, b, a - b);
            case '*' -> System.out.printf("%.1f * %.1f = %.1f%n", a, b, a * b);
            case '/' -> System.out.printf("%.1f / %.1f = %.1f%n", a, b, a / b);
            default -> System.out.println("Ошибка: Операция '" + operation + "' не поддерживается");
        }
    }
}
