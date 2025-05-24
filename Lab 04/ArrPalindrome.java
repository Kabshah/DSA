public class ArrPalindrome {
    public static void main(String[] args) {
        String [] arr = {"hello","level","noon","madam","java"};
        for(String array:arr){
            if(isPalindrome(array,0,array.length()-1)){
                System.out.println(array + " is a palindrome");}
            else{
                System.out.println(array+" is not a palindrome");}}}
    public static boolean isPalindrome(String str,int start,int end){
        if(start >= end){
            return true;}
        if(str.charAt(start) != str.charAt(end)){
            return false;}
        return isPalindrome(str, start+1,end-1);}}
/*3. Take an array of type string and then check whether the strings are palindrome or not.*/