package string;

import java.util.*;

public class LongestPalindromeFinder {


    public static Map<String, Object> longestPalindromeWithLength(String s) {
        int n = s.length();
        if (n == 0) {
            Map<String, Object> result = new HashMap<>();
            result.put("palindrome", "");
            result.put("length", 0);
            return result;
        }

        int start = 0, maxLen = 1;

        for (int i = 0; i < n; i++) {
            // Odd length palindrome
            int[] odd = expandAroundCenter(s, i, i);
            // Even length palindrome
            int[] even = expandAroundCenter(s, i, i + 1);

            if (odd[1] > maxLen) {
                start = odd[0];
                maxLen = odd[1];
            }

            if (even[1] > maxLen) {
                start = even[0];
                maxLen = even[1];
            }
        }

        String longest = s.substring(start, start + maxLen);

        Map<String, Object> result = new HashMap<>();
        result.put("palindrome", longest);
        result.put("length", maxLen);
        return result;
    }

    private static int[] expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return [start index, length]
        return new int[]{left + 1, right - left - 1};
    }

    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        Map<String, Object> result = longestPalindromeWithLength(str);

        System.out.println("Longest Palindromic Substring: " + result.get("palindrome"));
        System.out.println("Length: " + result.get("length"));
    }
}
