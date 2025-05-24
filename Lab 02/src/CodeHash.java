import java.util.Scanner;
public class CodeHash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        // \" is for double quotes in output
        System.out.println("Hash code value of \"" + userInput + "\": " + userInput.hashCode());}}