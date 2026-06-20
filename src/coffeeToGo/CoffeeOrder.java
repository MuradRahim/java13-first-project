package coffeeToGo;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrder {
    private String clientName;
    private CoffeeType coffeeType;
    private CoffeeSize coffeeSize;
    private List<String> toppings = new ArrayList<>();

    public CoffeeOrder(String clientName, CoffeeType coffeeType, CoffeeSize coffeeSize) {
        this.clientName = clientName;
        this.coffeeType = coffeeType;
        this.coffeeSize = coffeeSize;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    // Здесь во всей красе используем StringBuilder
    public String generateReceipt() {
        StringBuilder receipt = new StringBuilder();
        double finalPrice
            = coffeeType.getBasePrice() * coffeeSize.getMultiplier() + (toppings.size() * 30);

        receipt.append("=============================\n")
            .append("        КОФЕ-ЧЕК            \n")
            .append("=============================\n")
            .append("Клиент: ").append(clientName).append("\n")
            .append("Напиток: ").append(coffeeSize.getName()).append(" ")
            .append(coffeeType.getName()).append("\n");

        if (!toppings.isEmpty()) {
            receipt.append("Топпинги: ").append(String.join(", ", toppings)).append("\n");
        }

        receipt.append("-----------------------------\n")
            .append("Итого к оплате: ").append(finalPrice).append(" руб.\n")
            .append("=============================");

        return receipt.toString();
    }
}
