package lamnda;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream.of("name1", "name2", "name3", "name4", "name5", "name6")
            .sorted(new SortEmpName <String> () {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            })
            .forEach(System.out::println);
    }
}
