package CollectionInterfaces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(1);
        LinkedList list = new LinkedList();

        list.add(n1);
        list.add(n2);
        list.add(n3);

        for(Node n: list) {
            System.out.println(n.data);
        }

        Pair p1 = new Pair(3, "aa");
        Pair p2 = new Pair(2, "bb");
        Pair p3 = new Pair(1, "cc");

        List<Pair> plist = new ArrayList<Pair>(List.of(p1, p2, p3));


        Collections.sort(plist);

        for(Pair p : plist) {
            System.out.println(p.data);
        }
    }
}
