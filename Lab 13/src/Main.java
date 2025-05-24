import java.util.LinkedList;
class CustomHashMap<K, V> {
    private static class Node<K, V> {
        K key;V value;
        Node(K key, V value) {this.key = key;this.value = value;}}
    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<Node<K, V>>[] buckets;
    public CustomHashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];}
    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % buckets.length;}
    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = new LinkedList<>();}
        for (Node<K, V> node : buckets[bucketIndex]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;}}
        buckets[bucketIndex].add(new Node<>(key, value));}
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[bucketIndex];
        if (bucket != null) {
            for (Node<K, V> node : bucket) {
                if (node.key.equals(key)) {
                    return node.value;}}}
        return null;}}
public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("kabshah", 1);
        map.put("ferrari", 3);
        System.out.println("Kabshah: " + map.get("kabshah"));
        System.out.println("Ferrari " + map.get("ferrari"));}}
/*2. Design a HashMap without using any built-in hash table libraries.*/