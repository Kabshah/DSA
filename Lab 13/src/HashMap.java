import java.util.LinkedList;
class HashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] table;
    private int size;
    public HashMap() {
        table = new LinkedList[INITIAL_CAPACITY];
        size = 0;}
    // Define the Entry class
    private static class Entry<K, V> {
        K key;
        V value;
        Entry(K key, V value) {
            this.key = key;
            this.value = value;}}
    // Hash function to calculate index
    private int hash(K key) {
        return key.hashCode() % table.length;}
    // Put key-value pair into the HashMap
    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();}
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;  // Update value if key already exists
                return;}}
        table[index].add(new Entry<>(key, value));
        size++;}
    // Get value for a key from the HashMap
    public V get(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return null;}
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value;}}
        return null;}
    // Remove a key-value pair from the HashMap
    public void remove(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return;}
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                table[index].remove(entry);
                size--;
                return;}}}
    // Check if the HashMap contains a key
    public boolean containsKey(K key) {
        int index = hash(key);
        if (table[index] == null) {return false;}
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                return true;}}
        return false;}
    public int size() {return size;}
    public boolean isEmpty() {return size == 0;}
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Value for key 'One': " + map.get("One"));
        System.out.println("Value for key 'Two': " + map.get("Two"));
        map.remove("Two");
        System.out.println("Contains key 'Two' after removal: " + map.containsKey("Two"));
        System.out.println("Size after removal: " + map.size());}}