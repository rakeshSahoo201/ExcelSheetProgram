package string;

public class LongestPallindrome {
        public static String longestPalindrome(String s) {
            if (s == null || s.length() < 1) return "";

            int start = 0, end = 0;

            for (int i = 0; i < s.length(); i++) {
                // Odd length
                int l = i, r = i;
                while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                    if (r - l > end - start) {
                        start = l;
                        end = r;
                    }
                    l--;
                    r++;
                }

                // Even length
                l = i;
                r = i + 1;
                while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                    if (r - l > end - start) {
                        start = l;
                        end = r;
                    }
                    l--;
                    r++;
                }
            }

            return s.substring(start, end + 1);
        }

        public static void main(String[] args) {
            String input = "babad";
            System.out.println("Longest Palindromic Substring: " + longestPalindrome(input));
        }
    }


