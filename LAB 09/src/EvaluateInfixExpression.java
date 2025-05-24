import java.util.Stack;
public class EvaluateInfixExpression {
    // Method to determine operator precedence
    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;}}
    // Method to perform an operation
    private static int applyOperation(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);}}
    // Method to evaluate an infix expression
    public static int evaluateInfix(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            // If the character is a digit, parse and push it to the operands stack
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;}
                i--; // Adjust for the next iteration
                operands.push(num);}
            // If the character is an opening parenthesis, push it to the operators stack
            else if (ch == '(') {
                operators.push(ch);}
            // If the character is a closing parenthesis, solve the sub-expression
            else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    int b = operands.pop();
                    int a = operands.pop();
                    char operator = operators.pop();
                    operands.push(applyOperation(a, b, operator));}
                operators.pop();} // Remove the '('
            // If the character is an operator
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    int b = operands.pop();
                    int a = operands.pop();
                    char operator = operators.pop();
                    operands.push(applyOperation(a, b, operator));}
                operators.push(ch);}}
        // Solve the remaining expression
        while (!operators.isEmpty()) {
            int b = operands.pop();
            int a = operands.pop();
            char operator = operators.pop();
            operands.push(applyOperation(a, b, operator));}
        return operands.pop();} // Final result
    public static void main(String[] args) {
        // Test the program with an example expression
        String expression = "3 + 5 * (2 - 8)";
        int result = evaluateInfix(expression);
        System.out.println("Result of the expression \"" + expression + "\": " + result);}}