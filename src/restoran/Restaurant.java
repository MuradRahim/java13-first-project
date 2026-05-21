package restoran;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Restaurant {
    private static int presentDishes = 0;
    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private static Random rand = new Random();

    public static void main(String[] args) {
        Waiter nurlan = new Waiter();
        Waiter kairat = new Waiter();
        kairat.name = "Кайрат";
        nurlan.name = "Нурлан";

        presentDishes = rand.nextInt(0, 10);
        System.out.println("========== Добро пожаловать Кафе Манас ======== \n");

        System.out.println("Меня зовут " + nurlan.name + " Я примнимаю заказ напитков");
        Dto dtoCola = nurlan.методКоторыйПринимаетЗаказНапиков(scanner,"Кока-Кола", 50, 80);
        Dto dtoFanta = nurlan.методКоторыйПринимаетЗаказНапиков(scanner, "Фанта", 50, 80);

        System.out.println("Меня зовут " + kairat.name + " Я примнимаю заказ супов");
        Dto tomYam = kairat.методКоторыйПринимаетЗаказСупы(scanner, "Том-Ям", 200, 400);
        Dto borsh = kairat.методКоторыйПринимаетЗаказСупы(scanner,"Борщ", 200, 400);

        System.out.println("Вы заказали:");
        System.out.println("- Кока-Колы = " + (dtoCola.size == 1 ? "0.5" : "1.0") + " объем " + dtoCola.count + " штук : стоимость " + dtoCola.totalSum);
        System.out.println("- Фанта = " + (dtoFanta.size == 1 ? "0.5" : "1.0") + " объем " + dtoFanta.count + " штук : стоимость " + dtoFanta.totalSum);
        System.out.println("- Том-Ям = " + (tomYam.size == 1 ? "0.45" : "0.7") + " объем " + tomYam.count + " порции : стоимость " + tomYam.totalSum);
        System.out.println("- Борщ = " + (borsh.size == 1 ? "0.45" : "0.7") + " объем " + borsh.count + " порции : стоимость " + borsh.totalSum);
        System.out.println("- За " + presentDishes + " рублей вы можете выбрать подарок!");

        double originSum = dtoCola.totalSum + dtoFanta.totalSum + tomYam.totalSum + borsh.totalSum + presentDishes;
        System.out.println("Сумма к оплате: " + originSum);
    }
}