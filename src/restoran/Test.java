package restoran;

public class Test {

    public static void main(String[] args) {
        printName("John", 23);
        printName("Boris", 23);

        System.out.println(buildFullName("Чынгыз", "Айтматов"));
    }

    public static String buildFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void printName(String name, int age) {
        System.out.println(name + " " + age);
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
