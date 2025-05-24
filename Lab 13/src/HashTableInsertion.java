import java.util.Hashtable;
public class HashTableInsertion {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Kabshah");
        hashtable.put(2, "Tayyab");
        hashtable.put(3, "Eshah");
        hashtable.put(4, "Abdullah");
        hashtable.put(5, "Huzaifa");
        System.out.println("Elements in the Hashtable:");
        for (Integer key : hashtable.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));}}}
/*1. Write a java program which shows the insertion of the elements in a hashtable.*/