public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hi!";
        String str2 = "my";
        String str3 = "name";
        String str4 = "is";
        String str5 = "Kabshah";
        String concatenatedString = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("Concatenated String: " + concatenatedString);
        String upperCaseStr4 = str4.toUpperCase();
        System.out.println("Fourth String in Uppercase: " + upperCaseStr4);
        // Find the substring from the concatenated string from index 8 onward
        String substring = concatenatedString.substring(8);
        System.out.println("Substring from index 8 onward: " + substring);}}