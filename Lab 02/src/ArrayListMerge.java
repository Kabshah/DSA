import java.util.*;
public class ArrayListMerge {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6,7,8,9,10));
        numbers.addAll(list2);
        System.out.println(numbers);}}
/*6. Write a program to merge two ArrayLists into one.*/