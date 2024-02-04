import java.util.Stack;

public class QueueStack {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void enqueue(int value) {
        s1.push(value);
    }
    public boolean isEmpty() {
        return s1.size()==0 && s2.size()==0;
    }

    public void move(Stack s1 , Stack s2) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
    }

    public int dequeue(){
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        if (s2.isEmpty()) {
            move(s1, s2);
        }
        return s2.pop();
    }

    public int peek(){
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        if (s2.isEmpty()) {
            move(s1, s2);
        }
        return s2.peek();
    }

    
}
