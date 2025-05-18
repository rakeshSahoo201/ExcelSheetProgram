package string;

public class CustomAtoiProg10 {


        public static int customAtoi(String str) {
            if (str == null || str.isEmpty()) return 0;

            int i = 0, n = str.length();
            int sign = 1;
            int result = 0;

            // Step 1: Skip leading whitespaces
            while (i < n && Character.isWhitespace(str.charAt(i))) {
                i++;
            }

            // Step 2: Handle optional sign
            if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
                sign = (str.charAt(i) == '-') ? -1 : 1;
                i++;
            }

            // Step 3: Process numeric digits only
            while (i < n && Character.isDigit(str.charAt(i))) {
                int digit = str.charAt(i) - '0';

                // Optional: Prevent integer overflow
                if (result > (Integer.MAX_VALUE - digit) / 10) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                result = result * 10 + digit;
                i++;
            }

            return result * sign;
        }

        public static void main(String[] args) {
            String[] inputs = {"123", "-123", "abc123", "12a34", "+45xyz", "--12", "  -56"};

            for (String str : inputs) {
                int converted = customAtoi(str);
                System.out.println("Input: \"" + str + "\" → Output: " + converted);
            }
        }
    }
