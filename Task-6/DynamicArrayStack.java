import java.util.NoSuchElementException;

public class DynamicArrayStack<E>  { //stack by using Dynamic Array
    private Object [] items;
    private int size = 0;
    private int lastItem =0;

    public DynamicArrayStack() {
        items = new Object[100];
        size = 100;
    }

    public DynamicArrayStack(int ArraySize){
        size = ArraySize;
        items =  new Object[size];
    }

    public void push(E item){
        if (isFull())
            creatNewStack();

        items [lastItem] = item;
        lastItem++;
    }

    public Object peek(){
        if (isEmpty())
            throw new NoSuchElementException("Stack Is Empty");
        return items[lastItem-1];
    }

    public Object pop(){
        if (isEmpty())
            throw new NoSuchElementException("Stack Is Empty");

        int last = lastItem-1;
        lastItem--;
        return items[last];
    }


    private void creatNewStack(){
        size *= 2;
        Object [] newStack =  new Object[size];

        for (int i = 0; i < lastItem-1; i++)
            newStack[i] = items[i];

        items = newStack;
    }

    private boolean isFull(){
        return lastItem == size;
    }

    private  boolean isEmpty(){
        return lastItem == 0;
    }

}