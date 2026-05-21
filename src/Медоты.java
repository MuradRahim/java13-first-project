import java.util.Random;

public class Медоты {

    public static void main(String[] args) {
        int day = 876543;

        switch (day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Выходной");
            case 7 -> System.out.println("Выходной");
            default -> System.out.println("Андай кун жок!");
        }
    }






    public static PersonData printDataPerson(String firstName, String lastName,  double money) {
        PersonData result = printDataPerson("Расул", "Чабдаров", 2000.3);
        System.out.println(result);
        PersonData personData = new PersonData();
        personData.fullName = firstName + " " + lastName;
        personData.money = money;
        return personData;
    }

    public static void printDataPerson(String firstName, String lastName, int age) {
        System.out.println("ФИО: " + firstName + " " + lastName);
        System.out.println("Возраст: " + age);
    }

    public static void printDataPerson(String firstName, String lastName) {
        System.out.println("ФИО: " + firstName + " " + lastName);
    }

    public static void printDataPerson(String firstName, String lastName, String email) {
        System.out.println("ФИО: " + firstName + " " + lastName);
        System.out.println("email: " + email);
    }


    public static String checkName(String name) {
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!Character.isLetter(c)) {
                System.out.println("Ты ввел неправильное имя!");
                return null;  // ← сразу выходим из метода, если нашли цифру
            }
        }
        return name;
    }

    public static void printName(String name) {
        System.out.println("Приятно познакомиться! " + name);
    }
}