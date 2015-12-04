import java.util.HashMap;

public class WordPattern {

    /*
     * pattern = "abba", str = "dog cat cat dog" should return true.
     * pattern = "abba", str = "dog cat cat fish" should return false.
     * pattern = "aaaa", str = "dog cat cat dog" should return false.
     * pattern = "abba", str = "dog dog dog dog" should return false.
     */
    public static boolean check(String pattern, String str) {
        String[] strArray = str.split("\\s+");
        if (strArray.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> charToWord = new HashMap<Character, String>();
        HashMap<String, Character> wordToChar = new HashMap<String, Character>();
        for (int i = 0; i < strArray.length; i += 1) {
            char currentChar = pattern.charAt(i);
            String currentWord = strArray[i];
            if (charToWord.containsKey(currentChar) && !charToWord.get(currentChar).equals(currentWord)) {
                return false;
            } else if (wordToChar.containsKey(currentWord) && !wordToChar.get(currentWord).equals(currentChar)) {
                return false;
            } else {
                charToWord.put(currentChar, currentWord);
                wordToChar.put(currentWord, currentChar);
            }
        }
        return true;
    }
}
