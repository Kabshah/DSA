import java.util.Scanner;
public class ReverseVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String result = reverseVowels(input);
        System.out.println("String after reversing vowels: " + result);}
    public static String reverseVowels(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            // Move left pointer until we find a vowel
            while (left < right && !isVowel(chars[left])) {
                left++;}
            // Move right pointer until we find a vowel
            while (left < right && !isVowel(chars[right])) {
                right--;}// Swap the vowels
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;}}
        return new String(chars);}
    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';}}
/*4. Write a Java program to reverse only the vowels in a string. */
