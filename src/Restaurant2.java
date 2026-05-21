import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Restaurant2 {
    private static int priceCocaColaBig = 80;
    private static int priceCocaColaSmall = 50;
    private static int priceFantaBig = 75;
    private static int priceFantaSmall = 45;
    private static int priceIceCream = 50;
    private static int priceBurgerBig = 220;
    private static int priceBurgerSmall = 120;
    private static int priceChickenBig = 240;
    private static int priceChickenSmall = 130;

    private static int totalSumCola = 0;
    private static int totalSumFanta = 0;
    private static int totalSumIceCream = 0;
    private static int totalSumBurger = 0;
    private static int totalSumChicken = 0;

    private static int presentDishes;
    private static String promoCode;

    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private static Random rand = new Random();

    public static void main(String[] args) {
        presentDishes = rand.nextInt(0, 10);
        System.out.println("Добро пожаловать в наш Ресторан");

        //Принимаем заказ Колы
        totalSumCola = orderItem("Кока-Колы", priceCocaColaSmall, priceCocaColaBig);
        //Принимаем заказ Фанты
        totalSumFanta = orderItem("Фанты", priceFantaSmall, priceFantaBig);
        //Принимаем заказ Мороженного
        System.out.print("Сколько мороженого хотите: ");
        int countIceCream = scanner.nextInt();
        if (countIceCream > 0) {
            totalSumIceCream = countIceCream * priceIceCream;
            System.out.println("- Мороженого = " + countIceCream + " штук : стоимость " + totalSumIceCream);
        }
        //Принимаем заказ Бургер
        totalSumBurger = orderItem("Бургер", priceBurgerSmall, priceBurgerBig);
        //Принимаем заказ Курица в азиятском соусе
        totalSumChicken = orderItem("Курица", priceChickenSmall, priceChickenBig);

        System.out.println("- За " + presentDishes + " рублей вы можете выбрать подарок!");

        int totalSum = totalSumCola + totalSumFanta + totalSumIceCream + totalSumBurger + totalSumChicken + presentDishes;
        double ndsRate = 0.22;
        double ndsSum = totalSum * ndsRate;

        System.out.println("Сумма без НДС: " + totalSum);
        System.out.println("К оплате с НДС: " + (totalSum + ndsSum));
    }

    private static int orderItem(String itemName, int smallPrice, int bigPrice) {
        System.out.print("Какое количество " + itemName + ": ");
        int count = scanner.nextInt();
        int total = 0;
        if (count > 0) {
            System.out.print("У нас есть объемы 0.5 / 1.0\nКакую выбираете: 1 или 2 : ");
            int size = scanner.nextInt();
            int tmpPrice = size == 1 ? smallPrice : bigPrice;
            total = tmpPrice * count;
            System.out.println("- " + itemName + " = " + (size == 1 ? "0.5" : "1.0") + " объем " + count + " штук : стоимость " + total);
        }
        return total;
    }
}
