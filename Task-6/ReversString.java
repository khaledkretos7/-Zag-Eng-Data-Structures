public class ReversString {
    public static String reverseString(String S){
        LinkedListStack<Character> stack = new LinkedListStack<>();
        String reverse = "";

        for (int i = 0; i < S.length(); i++)
            stack.push(S.charAt(i));

        while (!stack.isEmpty())
            reverse += stack.pop();

        return reverse;
    }
}
