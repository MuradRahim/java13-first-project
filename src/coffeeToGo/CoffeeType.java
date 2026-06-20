package coffeeToGo;

public enum CoffeeType {
    ESPRESSO("Эспрессо", 120),
    LATTE("Латте", 180),
    CAPPUCCINO("Капучино", 160),
    RAF("Раф", 180);

    private final String name;
    private final double basePrice;

    CoffeeType(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }
}
