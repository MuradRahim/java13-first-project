package equalsHashCode;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setID(1);
        human1.setName("Марат");

        Human human2 = new Human();
        human2.setID(2);
        human2.setName("Марат");

        System.out.println(human1.equals(human2));
    }
}
