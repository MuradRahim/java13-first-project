package условныеОператоры;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchСase {

    public static void main(String[] args) {
        //---------------------------------------------------
        DayOfWeek enumDay = LocalDate.now().getDayOfWeek();

        switch (enumDay) {
            case MONDAY -> {
                System.out.println("KG: Дүйшөмбү");
                System.out.println("RU: Понедельник");
                System.out.println("ENG: Monday");
            }
            case TUESDAY -> {
                System.out.println("KG: Шейшемби");
                System.out.println("RU: Вторник");
                System.out.println("ENG: Tuesday");
            }
            case WEDNESDAY -> {
                System.out.println("KG: Шаршемби");
                System.out.println("RU: Среда");
                System.out.println("ENG: Wednesday");
            }
            case THURSDAY -> {
                System.out.println("KG: Бейшемби");
                System.out.println("RU: Четверг");
                System.out.println("ENG: Thursday");
            }
            case FRIDAY -> {
                System.out.println("KG: Жума");
                System.out.println("RU: Пятница");
                System.out.println("ENG: Friday");
            }
            case SATURDAY -> {
                System.out.println("KG: Ишемби");
                System.out.println("RU: Суббота");
                System.out.println("ENG: Saturday");
            }
            case SUNDAY -> {
                System.out.println("KG: Жекшемби");
                System.out.println("RU: Воскресенье");
                System.out.println("ENG: Sunday");
            }
            default -> {
                System.out.println("Сиз тандаган кун жок!");
                System.out.println("Такого дня недели нету!");
                System.out.println("Not found day of week!");
            }
        }
    }
}
