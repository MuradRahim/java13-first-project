package restoran;

import java.util.Scanner;

public class Waiter {
    public String name;

    public Dto методКоторыйПринимаетЗаказСупы(Scanner scanner, String nameSup, int smallPrice, int bigPrice) {
        int count;
        do {
            System.out.print("Принимаем заказ супов.");
            System.out.print("Хотите " + nameSup + ": ");
            count = scanner.nextInt();
        } while (count < 1 || count > 10);
        System.out.print("У нас есть размер 0.45 / 0.7\nКакую выбираете: 1 или 2 : ");
        int size = scanner.nextInt();
        int tmpPrice = (size == 1) ? smallPrice : bigPrice;

        String s = new String();
        Dto dto = new Dto();
        dto.totalSum =  tmpPrice * count;
        dto.count = count;
        dto.size = size;
        return dto;
    }

    public Dto методКоторыйПринимаетЗаказНапиков(Scanner scanner, String nameDrink, int smallPrice, int bigPrice) {
        int count;
        do {
            System.out.println("Вы можете заказать за раз только до 10 штук");
            System.out.print("Какое количество " + nameDrink + ": ");
            count = scanner.nextInt();
        } while (count < 1 || count > 10);
        System.out.print("У нас есть размер 0.5 / 1.0\nКакую выбираете: 1 или 2 : ");
        int size = scanner.nextInt();
        int tmpPrice = (size == 1) ? smallPrice : bigPrice;

        String s = new String();
        Dto dto = new Dto();
        dto.totalSum =  tmpPrice * count;
        dto.count = count;
        dto.size = size;
        return dto;
    }
}
