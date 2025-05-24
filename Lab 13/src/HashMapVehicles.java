import java.util.LinkedList;
class MyHashMap<K, V> {
    private static class Node<K, V> {
        K key;V value;
        Node(K key, V value) {
            this.key = key;this.value = value;}}
    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<Node<K, V>>[] buckets;
    public MyHashMap() { buckets = new LinkedList[INITIAL_CAPACITY];}
    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % buckets.length;}
    public void add(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        if (buckets[bucketIndex] == null) {buckets[bucketIndex] = new LinkedList<>();}
        for (Node<K, V> node : buckets[bucketIndex]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;}}
        buckets[bucketIndex].add(new Node<>(key, value));}
    public V search(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[bucketIndex];
        if (bucket != null) {
            for (Node<K, V> node : bucket) {
                if (node.key.equals(key)) {
                    return node.value;}}}
        return null;}
    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[bucketIndex];
        if (bucket != null) {
            for (Node<K, V> node : bucket) {
                if (node.key.equals(key)) {
                    bucket.remove(node);
                    return;}}}}}
public class HashMapVehicles {
    public static void main(String[] args) {
        MyHashMap<String, String> Vehicles = new MyHashMap<>();
        Vehicles.add("Car", "BYD Sealion");
        Vehicles.add("Bike", "Yamaha R3");
        Vehicles.add("Truck", "Cyber Truck");
        System.out.println("Car: " + Vehicles.search("Car"));
        System.out.println("Bike: " + Vehicles.search("Bike"));
        System.out.println("Truck: " + Vehicles.search("Truck"));
        Vehicles.remove("Truck");
        System.out.println("Truck: " + Vehicles.search("Truck"));}}
/*4.Given an array of integers, write a Java program to find the most frequent element in the array. If there are multiple elements
with the same frequency, return the one with the smallest value. Use a HashMap to count the frequency of each element and identify the most frequent one*/