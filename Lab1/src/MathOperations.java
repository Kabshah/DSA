public class MathOperations {
    public static void main(String[] args) {
        double primitiveNum = -19;
        Double num = primitiveNum;
        Double absVal = Math.abs(num.doubleValue());
        Double sqrt = Math.sqrt(absVal);
        Double pwrVal = Math.pow(absVal,2);
        System.out.println("Absolute value: "+absVal);
        System.out.println("Square root: "+sqrt);
        System.out.println("Power of 2: "+pwrVal);}}
/*Write a Java program to find the absolute value, square root, and power of a number using Math
class methods, while utilizing Autoboxing and Wrapper classes.*/