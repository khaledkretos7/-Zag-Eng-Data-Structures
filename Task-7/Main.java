import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        QueueArray queue = new QueueArray(size);
        for (int i = 0; i < size; i++) {
            String s = in.next();
            queue.enqueue(s);
        }
        int n = in.nextInt();
        while (queue.count > 1) {
            for (int i = 0; i < n - 1; i++) {
                queue.enqueue(queue.dequeue());
            }
            queue.dequeue();
        }
        System.out.println(queue.dequeue());
        in.close();
    }
}
