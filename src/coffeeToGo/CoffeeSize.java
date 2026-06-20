package coffeeToGo;

public enum CoffeeSize {
    SMALL(1.0, "Маленький"),
    MEDIUM(1.3, "Средний"),
    LARGE(1.6, "Большой");

    private final double multiplier;
    private final String name;

    CoffeeSize(double multiplier, String name) {
        this.multiplier = multiplier;
        this.name = name;
    }

    public double getMultiplier() { return multiplier; }
    public String getName() { return name; }
}
