package приложениеБанкомат;

import java.util.Scanner;
import java.util.ArrayList;

public class Bankomat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int CORRECT_PIN = 1234; // пин код
        int attempts = 0; // попытка
        int writeCorrectPinCode = 0; // Введен ли правильный пароль

        // ============ ЧАСТЬ 1: while - ввод PIN-кода (3 попытки) ============
        System.out.println("=== Добро пожаловать в банкомат ===");

        int enteredPin;

        while (attempts < 3 && writeCorrectPinCode != 1) { // Ноль это не равно 1
            System.out.print("Введите PIN-код (попытка " + (attempts + 1) + " из 3): ");
            enteredPin = scanner.nextInt();

            if (enteredPin == CORRECT_PIN) {
                writeCorrectPinCode = 1;
                System.out.println("PIN-код верный! Доступ разрешен.\n");
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("Неверный PIN-код. Осталось попыток: " + (3 - attempts));
                }
            }
        }

        // Проверка: если 3 попытки исчерпаны
        if (writeCorrectPinCode != 1) {
            System.out.println("Три неверные попытки. Карта заблокирована. Обратитесь в банк.");
            scanner.close();
            return;
        }

        // ============ ЧАСТЬ 2: do-while - выбор операции ============
        int choice;
        double balance = 5000.0; // начальный баланс
        ArrayList<String> history = new ArrayList<>(); // история операций
        history.add("Начальный баланс: " + balance + " руб.");

        do {
            System.out.println("\n=== Меню операций ===");
            System.out.println("1. Проверить баланс");
            System.out.println("2. Снять наличные");
            System.out.println("3. Пополнить счет");
            System.out.println("4. Показать историю операций (последние 5)");
            System.out.println("5. Выход");
            System.out.print("Выберите операцию (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Проверка баланса
                    System.out.println("Ваш баланс: " + balance + " руб."); ///
                    history.add("Проверка баланса: " + balance + " руб.");
                    break;

                case 2: // Снятие наличных
                    System.out.print("Введите сумму для снятия: ");
                    double withdrawAmount = scanner.nextDouble();

                    if (withdrawAmount <= 0) {
                        System.out.println("Ошибка: сумма должна быть положительной!");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Ошибка: недостаточно средств!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Вы сняли " + withdrawAmount + " руб.");
                        System.out.println("Остаток на счете: " + balance + " руб.");
                        history.add("Снятие: " + withdrawAmount + " руб. Остаток: " + balance);
                    }
                    break;

                case 3: // Пополнение счета
                    System.out.print("Введите сумму для пополнения: ");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Ошибка: сумма должна быть положительной!");
                    } else {
                        balance += depositAmount;
                        System.out.println("Вы пополнили счет на " + depositAmount + " руб.");
                        System.out.println("Текущий баланс: " + balance + " руб.");
                        history.add("Пополнение: +" + depositAmount + " руб. Баланс: " + balance);
                    }
                    break;

                case 4: // Показать историю (последние 5)
                    System.out.println("\n=== Последние 5 операций ===");
                    // ============ ЧАСТЬ 3: for - вывод истории последних 5 операций ============
                    int historySize = history.size();
                    int startIndex = Math.max(0, historySize - 8);
                    int counter = 1;

                    for (int i = startIndex; i < historySize; i++) {
                        System.out.println(counter + ". " + history.get(i));
                        counter++;
                    }

                    if (historySize == 0) {
                        System.out.println("История операций пуста.");
                    }
                    System.out.println("===========================");
                    break;

                case 5: // Выход
                    System.out.println("Спасибо за использование банкомата! До свидания!");
                    break;

                default:
                    System.out.println("Неверный выбор! Пожалуйста, выберите операцию от 1 до 5.");
            }

        } while (choice != 5);
    }
}
