import java.lang.StringBuilder;

public class StringCompression {

    /* A method to perform basic string compression using counts of repeated
     * characters
     * compress(aabcccccaaa) // a2b1c5a3
     * compress(abc) // abc 
     */
    public static String compress(String str) {

        StringBuilder compressed = new StringBuilder(str.length());
        compressed.append(str.charAt(0));
        int count = 1;
        for (int i = 1; i < str.length(); i += 1) {
            int lastCharIndex = compressed.length() - 1;
            if (compressed.charAt(lastCharIndex) == str.charAt(i)) {
                count += 1;
            } else {
                compressed.append(count);
                compressed.append(str.charAt(i));
                count = 1;
            }
        }
        compressed.append(count);
        if (compressed.length() < str.length()) {
            return compressed.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa"));
        System.out.println(compress("abc"));
    }
}
