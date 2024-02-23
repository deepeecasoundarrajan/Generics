package StreamsLambdas;

import java.util.Comparator;

public class Pair implements Comparable<Pair>{
    int price;
    String name;

    public Pair(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int compareTo(Pair other) {
        return this.price - other.price;
    }



    public static class PairComparator implements Comparator<Pair> {

        public int compare(Pair a, Pair b) {
            return a.price - b.price;
        }

    }
}
