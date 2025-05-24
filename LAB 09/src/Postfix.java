import java.util.Stack;
public class Postfix {
    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            // If the character is a digit, push it to the stack
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert char to int
            } else if (ch == ' ') {
                continue;
            } else {
                // Pop two elements and perform the operation
                int val2 = stack.pop();
                int val1 = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(val1 + val2);
                        break;
                    case '-':
                        stack.push(val1 - val2);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;
                    case '/':
                        stack.push(val1 / val2);
                        break;}}}
        return stack.pop();}
    public static void main(String[] args) {
        // Postfix expression
        String postfix = "2 3 1 * + 9 -";
        // Evaluate the postfix expression
        int result = evaluatePostfix(postfix);
        System.out.println("Evaluation Result: " + result);}}