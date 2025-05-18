package string;

public class ConvertStringProgram1 {


        public static String compress(String str) {
            if (str == null || str.isEmpty()) {
                return "";
            }

            StringBuilder result = new StringBuilder();
            int count = 1;

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++;
                } else {
                    result.append(str.charAt(i - 1)).append(count);
                    count = 1;
                }
            }

            // Append the last character and its count
            result.append(str.charAt(str.length() - 1)).append(count);

            return result.toString();
        }

        public static void main(String[] args) {
            System.out.println(compress("aabbb")); // Output: a2b3
            System.out.println(compress("aaaa"));  // Output: a4
            System.out.println(compress("abc"));
        }
    }

