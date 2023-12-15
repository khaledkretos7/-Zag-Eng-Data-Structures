import java.util.NoSuchElementException;

public class LinkedListStack<E> { //Stack by using LinkedList
    class Node{
        E value;
        Node buttom ;
        public Node(E value){
            this.value = value;
        }
    }
    Node top;
    public void push(E value){
        Node node = new Node(value);
        node.buttom = top;
        top = node;
    }

    public E peek(){
        if (isEmpty())
            throw new NoSuchElementException("Stack Is Empty");

        return top.value;
    }

    public E pop(){
        if (isEmpty())
            throw new NoSuchElementException("Stack Is Empty");

        E newValue = top.value;
        top = top.buttom;
        return newValue;
    }
    public boolean isEmpty(){
        return top == null;
    }
}
