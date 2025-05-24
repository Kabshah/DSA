public class Intern {
    public static void main(String[] args) {
        String literalString = "hello"; // string literal
        String newString = new String("hello"); // new keyword
        String internedString = newString.intern(); // intern method
        String modifiedString = literalString.concat(" world!");
        System.out.println("After concatenation, modifiedString: " + modifiedString);
        System.out.println("Original string still remains unchanged: " + literalString);
        System.out.println();

        String literalString2 = "Kit"; // string literal
        String newString2 = new String("Kit"); // new keyword
        String internedString2 = newString.intern(); // intern method
        String modifiedString2 = literalString2.concat(" Kat");
        System.out.println("After concatenation, modifiedString: " + modifiedString2);
        System.out.println("Original string still remains unchanged: " + literalString2);
        System.out.println();

        String literalString3 = "Java"; // string literal
        String newString3 = new String("Java"); // new keyword
        String internedString3 = newString.intern(); // intern method
        String modifiedString3 = literalString3.concat(" is a programming language");
        System.out.println("After concatenation, modifiedString: " + modifiedString3);
        System.out.println("Original string still remains unchanged: " + literalString3);
        System.out.println();

        String literalString4 = "Alice"; // string literal
        String newString4 = new String("Alice"); // new keyword
        String internedString4 = newString.intern(); // intern method
        String modifiedString4 = literalString4.concat(" in a wonder-land");
        System.out.println("After concatenation, modifiedString: " + modifiedString4);
        System.out.println("Original string still remains unchanged: " + literalString4);
        System.out.println();}}