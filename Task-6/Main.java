
public class Main {
    public static void main(String[] args) {
        DynamicArrayStack<Integer> stack = new DynamicArrayStack<>(5);

        stack.push(11);
        stack.push(50);
        stack.push(90);
        stack.push(78);
        stack.push(0);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(ReversString.reverseString("Abdo"));
        System.out.println(Expression.isValidExpression("<(abdo>)"));

    }
}