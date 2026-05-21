package opp;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setFirstName("Келдибек");
        employee1.setLastName("Камалов");
        employee1.setSecondName("Торокулович");
        employee1.setPosition("Seller");

        Human human1 = new Human();
        human1.setFirstName("Азат");
        human1.setLastName("Азатович");
        human1.setCity("Бишкек");

        human1.setColorOfHair("Черный");

        //===============================
        //===============================

        human1.setColorOfHair("Серый");

        //===============================
        //===============================

        human1.setColorOfHair("Белый");

        System.out.println(human1.getColorOfHair());

//        employee1.sayAboutYourself();
//        System.out.println("----------------------");
//        human1.sayAboutYourself();
    }
}
