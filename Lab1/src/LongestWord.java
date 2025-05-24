import java.util.Scanner;
public class LongestWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String input =sc.nextLine();
        String [] words = input.split(" ");
        String longestWord = "";
        for(String word:words){
            if(word.length()>longestWord.length()){
                longestWord = word;}}
        System.out.println("The longest word is:"+longestWord);}}
/* Write a Java program to find the longest word in a sentence. */