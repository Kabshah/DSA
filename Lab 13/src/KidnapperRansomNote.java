import java.util.HashMap;
public class KidnapperRansomNote {
    public static void main(String[] args) {
        String magazine = "attack at dawn";
        String note = "Attack at dawn";
        if (canReplicateRansomNote(magazine, note)) {System.out.println("Yes");
        } else {System.out.println("No");}}
    public static boolean canReplicateRansomNote(String magazine, String note) {
        String[] magazineWords = magazine.split(" ");
        String[] noteWords = note.split(" ");
        HashMap<String, Integer> magazineMap = new HashMap<>();
        HashMap<String, Integer> noteMap = new HashMap<>();
        for (String word : magazineWords) {
            magazineMap.put(word, magazineMap.getOrDefault(word, 0) + 1);}
        for (String word : noteWords) {
            noteMap.put(word, noteMap.getOrDefault(word, 0) + 1);}
        for (String word : noteWords) {
            if (!magazineMap.containsKey(word) || magazineMap.get(word) < noteMap.get(word)) {
                return false; }}
        return true;}}

/*2. Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting.
He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note.
 The words in his note are case-sensitive and he must use only whole words available in the magazine. He cannot use substrings or concatenation
 to create the words he needs.Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly
 using whole words from the magazine; otherwise, print No.
Example:
magazine = "attack at dawn" note = "Attack at dawn"
The magazine has all the right words, but there is a case mismatch. The answer is No.*/