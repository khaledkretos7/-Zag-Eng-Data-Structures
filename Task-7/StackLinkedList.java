import java.util.NoSuchElementException;

public class StackLinkedList {
    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size = 0;

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (isEmpty())
            first = last = newNode;
        else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");

        Node temp = first;
        first = first.next;
        temp.next = null;
        size--;

        return temp.value;
    }

    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");

        return first.value;
    }

    @Override
    public String toString() {
        String result = "";
        Node current = first;
        while (current != null) {
            result += current.value + " ";
            current = current.next;
        }
        return result;
    }

    public int size() {
        return size;
    }

}