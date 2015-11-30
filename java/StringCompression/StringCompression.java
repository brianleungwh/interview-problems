import java.lang.StringBuilder;

public class StringCompression {

    /* A method to perform basic string compression using counts of repeated
     * characters
     * compress(aabcccccaaa) // a2b1c5a3
     * compress(abc) // abc 
     */
    public static String compress(String str) {
        int originalSize = str.length();
        int compressedSize = countCompression(str);
        if (compressedSize > originalSize) {
            return str;
        }

        StringBuilder compressed = new StringBuilder(str.length());
        char last = str.charAt(0);
        int count = 1;
        for (int i = 0; i < str.length(); i += 1) {
            if (last == str.charAt(i)) {
                count += 1;
            } else {
                compressed.append(last);
                compressed.append(count);
                last = str.charAt(i);
                count = 1;
            }
        }
        compressed.append(last);
        compressed.append(count);
        return compressed.toString();
    }


    public static int countCompression(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        char last = str.charAt(0);
        int size = 0;
        int count = 1;
        for (int i = 1; i < str.length(); i += 1) {
            if (str.charAt(i) == last) {
                count += 1;
            } else {
                last = str.charAt(i);
                size += 1 + String.valueOf(count).length();
                count = 1;
            }
        }
        size += 1 + String.valueOf(count).length();
        return size;
    }

    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa"));
        System.out.println(compress("abc"));
    }
}
