package coffeeToGo;

public class Main {
    public static void main(String[] args) {
        CoffeeOrder order
            = new CoffeeOrder("Алексей", CoffeeType.RAF, CoffeeSize.SMALL);
        order.addTopping("Ванильный сироп");
        order.addTopping("Карамельный сироп");

        System.out.println(order.generateReceipt());
    }
}
