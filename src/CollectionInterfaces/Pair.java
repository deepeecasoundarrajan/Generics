package CollectionInterfaces;

public class Pair implements Comparable<Pair>{
    int data;
    String name;

    public Pair(int data, String name) {
        this.data = data;
        this.name = name;
    }

    public int compareTo(Pair other) {
        return this.data - other.data;
    }
}
