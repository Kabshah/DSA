import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        if( isPalindrome(word,0,word.length()-1)){
            System.out.println("YES");
        } else{
            System.out.println("NO");}}
    public static boolean isPalindrome(String word, int start, int end){
        if(start == end) {
            return true;}
        if(word.charAt(start) != word.charAt(end)) {
            return false;}
        return isPalindrome(word,start+1,end-1);}}
/*3. Write a java program to check whether a given string is a palindrome or not. A
palindrome is a string that reads the same forwards and backwards.Print "YES" if the
string is a palindrome, otherwise print "NO" */