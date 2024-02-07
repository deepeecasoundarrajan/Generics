package CollectionInterfaces;

import java.util.Iterator;

public class LinkedList implements Iterable<Node> {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void add(Node n) {
        if(head == null) {
            head = n;
            tail = n;
        }
        else {
            tail.next = n;
            tail = n;
        }
    }

    public Iterator iterator() {
        return new NodeIterator(this.head);
    }

    static final class NodeIterator implements Iterator {
        Node current;

        public NodeIterator(Node current) {
            this.current = current;
        }

        public boolean hasNext() {
            return current != null;
        }

        public Node next() {
            if(hasNext()) {
                Node temp = current;
                current = current.next;
                return temp;
            }
            return null;
        }
    }
}
