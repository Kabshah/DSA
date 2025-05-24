import java.util.LinkedList;
public class LL_Empty_or_Not {
    public static void main(String[] args) {
        LinkedList<String> keera = new LinkedList<>();
        if(keera.isEmpty()){
            System.out.println("List is empty.");
        }else{System.out.println("List isn't empty.");}
        keera.add("lizard");
        keera.add("machar");
        if(keera.isEmpty()){
            System.out.println("List is empty.");
        }else{System.out.println("List isn't empty.");}}}
/*3. Write a program to check whether the linkedlist is empty or not.*/