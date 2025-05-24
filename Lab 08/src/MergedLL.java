import java.util.LinkedList;
public class MergedLL {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        LinkedList<String> countries = new LinkedList<>();
        cities.add("Istanbul");
        cities.add("Seoul");
        cities.add("Sydney");
        countries.add("Turkey");
        countries.add("South Korea");
        countries.add("Australia");
        System.out.println("Merged list is: " + merge(cities, countries));}
    public static LinkedList<String> merge(LinkedList<String> cities, LinkedList<String> countries) {
        LinkedList<String> merged = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (i < cities.size() && j < countries.size()) {
            merged.add(cities.get(i));
            merged.add(countries.get(j));
            i++;
            j++;}
        return merged;}}
/*2. Write a java program to merge two equal linkedlists using runner technique.*/