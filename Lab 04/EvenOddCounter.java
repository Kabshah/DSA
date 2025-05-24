public class EvenOddCounter {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};
        int evenCounter=0;int oddCounter=0;
        for(int number:arr){
            if(number % 2 == 0){
                evenCounter++;}
            else{oddCounter++;}}
        System.out.println("Even numbers:" + evenCounter);
        System.out.println("Odd numbers:" + oddCounter);}}
/*4. Given an array of integers, count how many numbers are even and how many are odd. */