import java.util.Scanner;
public class ReverseName {
    public static String reverse(String name){
        if(name.isEmpty()){
            return name;}
        else{
            return reverse(name.substring(1)) + name.charAt(0) ;}}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.println(reverse(name));}}
/*2. Write a program to reverse your full name using Recursion.*/