import java.util.NoSuchElementException;

public class QueueArray<E> {
    int size = 0;
    int count = 0;
    int last = 0;
    int frist = 0;
    Object [] arr;

    public QueueArray(int size) {
        this.size = size;
        arr = new Object[size];
    }
    public boolean isFull() {
        return count == size;
    }

    public int size() {
        return count;
    }

    public void enqueue(E value) {
        if (isFull()) {
            throw new NoSuchElementException("is full");
        }
        arr[last] = value;
        last = (last + 1) % size;
        count++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("is empty");
        }
        Object temp = arr[frist];
        frist = (frist + 1) % size;
        count--;
        return temp;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("is empty");
        }
        return arr[last];
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public void print() {
        System.out.print("[");
        if(!isEmpty()) {
            System.out.print(arr[frist]);
            int curr = (frist + 1) % size;
            while (curr != last) {
                System.out.print(", " + arr[curr]);
                curr = (curr + 1)% size;
            }
        }
        System.out.print("]");
    }
}