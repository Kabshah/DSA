import java.util.*;
public class WordLadder {
public int ladderLength(String start, String end, Set<String> wordDict) {
    if (start.equals(end)) {return 0; }
    Queue<String> queue = new LinkedList<>();
    queue.add(start);
    Set<String> visited = new HashSet<>();
    visited.add(start);
    int level = 1;
    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        for (int i = 0; i < levelSize; i++) {
            String currentWord = queue.poll();
            char[] wordArray = currentWord.toCharArray();
            for (int j = 0; j < currentWord.length(); j++) {
                char originalChar = wordArray[j];
                for (char c = 'a'; c <= 'z'; c++) {
                    wordArray[j] = c;
                    String newWord = new String(wordArray);
                    if (newWord.equals(end)) {return level + 1;}
                    if (wordDict.contains(newWord) && !visited.contains(newWord)) {
                        queue.add(newWord);
                        visited.add(newWord);}}
                wordArray[j] = originalChar;}}
        level++;}
    return 0;}
public static void main(String[] args) {
    WordLadder wordLadder = new WordLadder();
    String start = "rat";
    String end = "bat";
    Set<String> wordDict = new HashSet<>(Arrays.asList("lotion", "dot", "dog", "lot", "log", "bat"));
    int result = wordLadder.ladderLength(start, end, wordDict);
    System.out.println("The shortest transformation sequence length is: " + result);}}
/*3. Find the shortest transformation sequence from a start word to an end word, changing one letter at a time such that each transformed word exists in a given dictionary.
a)	Use BFS to explore all possible transformations and keep track of the sequence length.
b)	Each word must be connected by a single letter change, and BFS ensures the shortest sequence is found*/
