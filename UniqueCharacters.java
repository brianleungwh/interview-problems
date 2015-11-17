public class UniqueCharacters {


    /* An algorithm to determine if a string has all unique characters
     * isUnique("apple") // false
     * isUnique("orange") // true
     */
    public static boolean isUnique(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] characterSet = new boolean[256];
        for (int i = 0; i < str.length(); i += 1) {
            int val = str.charAt(i);
            if (characterSet[val]) {
                return false;
            }
            characterSet[val] = true;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isUnique("apple"));
        System.out.println(isUnique("orange"));
    }
}
