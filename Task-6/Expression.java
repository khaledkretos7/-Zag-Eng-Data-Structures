public class Expression {
    public static boolean isValidExpression(String S){
        LinkedListStack<Character> stack = new LinkedListStack<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (isOpenBracket(ch))
                stack.push(ch);

            else if (isCloseBracket(ch)){
                if (stack.isEmpty())
                    return false;

                char chopen = stack.pop();
                if (!isMatch(chopen,ch))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpenBracket(char element){
        return element == '(' ||
                element == '{' ||
                element == '[' ||
                element == '<' ;
    }

    private static boolean isCloseBracket(char element){
        return element == ')' ||
                element == '}' ||
                element == ']' ||
                element == '>' ;
    }

    private static boolean isMatch(char openBracket,char closeBracket){
        return closeBracket == (char) (openBracket + 1) ||
                closeBracket == (char) (openBracket + 2);
    }
}