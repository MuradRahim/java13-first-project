package opp;

public class Car {
    private String name;
    private String model;
    private String color;
    private String skin;

    public Car(String name, String model, String color, String skin) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.skin = skin;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void drive() {
        System.out.println(this.model);
        System.out.println("Машина едет");
    }
}
