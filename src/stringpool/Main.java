package stringpool;

/**
 * todo Document type Main
 */
public class Main {

    public static void main(String[] args) {
        String str1 = "fghjkljhhfgvl;khjg;khjgvjhjjghj;lkjhklkjhgfgkkljkjhfgghj;lkhfgghjk;lkjhfghjk;lkjghgjlk;lkjhg;lkjgjlkhgjhjhj";
        String str2 = "fghjkljhhfgvl;khjg;khjgvjhjjghj;lkjhklkjhgfgkkljkjhfgghj;lkhfgghjk;lkjhfghjk;lkjghgjlk;lkjhg;lkjgjlkhgjhjhj";

        Runtime runtime = Runtime.getRuntime();
        String res;
        while (true) {
            res = str1 + str2;
            long usedMemory =
                (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024;

            System.out.println("Used memory: " + usedMemory + " MB");
        }

//        StringBuilder stringBuilder = new StringBuilder();
//        while (true) {
//            stringBuilder.append(str1).append(str2);
//            System.out.println(stringBuilder);
//        }


//        StringBuilder stringBuilder = new StringBuilder("Привет");
//        stringBuilder.append(" Как дела?");
//        stringBuilder.append(" Откуда ты?");
//
//        System.out.println(stringBuilder);
//
//        StringBuffer buffer = new StringBuffer("Салам");
//        buffer.append(" Кандайсын?");
//        buffer.append(" Кай жерден болосун?");
//
//        System.out.println(buffer);
    }
}
