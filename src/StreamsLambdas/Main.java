package StreamsLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            public void add(int a, int b) {
                System.out.println(a+b);
            }

            public void diff(int a, int b) {
                System.out.println(a-b);
            }
        };

        cal.add(3, 4);
        cal.diff(5, 2);

        Square sq = (x) -> x*x;

        System.out.println(sq.squared(4));

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream().filter(x -> x%2 == 0)
                     .map(x -> x*x)
                     .forEach(x -> System.out.println(x));
        String[] arr = new String[]{"hi", "hello", "welcome"};
        Arrays.stream(arr).forEach(x -> System.out.println(x));
;    }
}
