package CollectionInterfaces;

import java.util.Iterator;

public class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }


}
