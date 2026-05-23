package random;

import java.util.Random;

public class RandomTask {

    public static void main(String[] args) {
        Random rand = new Random();
        /**
         * На экран выводим 10 рандомные значении
         * */
        for (int i = 0; i < 10; i++) {
            int randomInt = rand.nextInt(-51, 2);
            System.out.println(randomInt);
        }
    }
}
