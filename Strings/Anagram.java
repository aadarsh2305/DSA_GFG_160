package Strings;

import java.util.Arrays;

public class Anagram {
        public static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        String one = sortString(s1);
        String two = sortString(s2);
        
        for (int i = 0; i < s1.length(); i++) {
            if (one.charAt(i) != two.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static String sortString(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean result = areAnagrams(s1, s2);
        System.out.println("Are the two strings anagrams? " + result);
        
        String s3 = "hello";
        String s4 = "world";
        System.out.println("Are the two strings anagrams? " + areAnagrams(s3, s4));
    }
}
