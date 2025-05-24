import java.util.LinkedList;
public class Main {
    public static void unsorted(LinkedList<Integer> list,int value){
        list.add(value);}
    public static void sorted(LinkedList<Integer> list,int value){
        if (list.isEmpty()){
            list.add(value);}else{
            int index = 0;
            while (index < list.size() && list.get(index) < value) {
                index++;}
            list.add(index, value);}}
    public static void main(String[] args) {
        LinkedList<Integer> unsortedList = new LinkedList<>();
        unsorted( unsortedList,67);
        unsorted(unsortedList,88);
        System.out.println("Unsorted List is: " + unsortedList);
        LinkedList<Integer> sortedList = new LinkedList<>();
        sorted(sortedList, 5);
        sorted(sortedList, 3);
        sorted(sortedList, 8);
        sorted(sortedList, 1);
        System.out.println("Sorted LinkedList: " + sortedList);}}
/*1. Write a program to create Unsorted LinkedList as well as Sorted LinkedList.*/