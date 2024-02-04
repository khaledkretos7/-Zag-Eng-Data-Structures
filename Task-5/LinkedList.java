import java.util.NoSuchElementException;

public class LinkedList<E> {
    class Node {
        public Node(E item) {
            this.item = item;
        }
        E item;
        Node nextNode;
    }

    Node first;
    Node last;
    int size = 0;
    
    private boolean isEmpty() {
        return first == null;
    }

    public void addFirst(E item) {
        Node node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        }
        else {
            node.nextNode = first;
            first = node;
        }
        size++;
    }

    public void addLast(E item) {
        Node node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        }
        else {
            last.nextNode = node;
            last = node;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException("LINKED IS EMPTY");

        if (first == last ) {
            first = last = null;
        }
        else {
            Node temp = first;
            first = first.nextNode;
            temp.nextNode = null;
        }

        size--;
    }

    private Node getBeforeLast() {
        Node beforeLast = first;
        Node current = first;
        while (current.nextNode != null) {
            beforeLast = current;
            current = current.nextNode;
        }
        return beforeLast;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException("LINKED IS EMPTY");

        if (first == last ) {
            first = last = null;
        }else {
            last = getBeforeLast();
            last.nextNode = null;
        }

        size--;
    }

    private int getSize() {
        return size;
    }

    public int indexOf(E item) {
        Node current = first;
        int index = 0;

        while (current != null) {
            if (current.item == item)
                return index;

            index++;
            current = current.nextNode;
        }
        return -1;
    }

    public boolean contain(E item) {
        int index = indexOf(item);
        return index != -1;
    }

    public void printItems() {
        Node current = first;
        System.out.print("[ ");

        while (current != null) {
            System.out.print(current.item + " ");
            current = current.nextNode;
        }
        System.out.println("]");
    }

    public void reverseItems() {
        Node previous = null;
        Node current = first;
        Node next;

        while (current != null) {
            next = current.nextNode;
            current.nextNode = previous;
            previous = current;
            current = next;
        }

        last = first;
        first = previous;
    }

}