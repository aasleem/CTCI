package examples;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String expression) {
        Stack<Character> symbols = new Stack();

        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case '{':
                    symbols.push('}');
                    break;
                case '(':
                    symbols.push(')');
                    break;
                case '[':
                    symbols.push(']');
                    break;
                default:
                    if (symbols.empty() || expression.charAt(i) != symbols.peek())
                        return false;
                    symbols.pop();
            }
        }
        return symbols.empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);

            if(answer)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
