import java.util.Stack;
public class InfixToPostfix {
    static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        for (char ch : infix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch); // Append operands directly
            } else if (ch == '(') {
                stack.push(ch); // Push opening parenthesis
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());}
                if (!stack.isEmpty()) stack.pop(); // Pop '('
            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    postfix.append(stack.pop());}
                stack.push(ch);}} // Push current operator
        // Pop remaining operators
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());}
        return postfix.toString();}
    // Evaluate postfix expression
    static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();
        for (char ch : postfix.toCharArray()) {
            if (Character.isLetter(ch)) {
                stack.push((int) ch - 'A' + 1); // Assign A=1, B=2, etc.
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (ch) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                    case '|': stack.push(a | b); break;}}}
        return stack.pop();}
    // Check if character is an operator
    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '|';}
    // Operator precedence
    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '|') return 0; // Lower precedence for '|'
        return -1;}
    public static void main(String[] args) {
        String infix = "A + ( B * C - ( D / E | F ) * G ) * H";
        try {
            String postfix = infixToPostfix(infix);
            System.out.println("Postfix: " + postfix);
            int result = evaluatePostfix(postfix);
            System.out.println("Evaluation Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());}}}