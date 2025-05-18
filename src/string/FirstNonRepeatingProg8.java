package string;
import java.util.LinkedHashMap;
import java.util.Map;
public class FirstNonRepeatingProg8 {

        public static Character findFirstNonRepeatingChar(String str) {
            // LinkedHashMap preserves insertion order
            Map<Character, Integer> charCount = new LinkedHashMap<>();

            // Step 1: Count frequency of each character
            for (char c : str.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            // Step 2: Find the first character with count == 1
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();  // first non-repeating character
                }
            }

            return null;  // no non-repeating character found
        }

        public static void main(String[] args) {
            String input = "aabbcdeff";
            Character result = findFirstNonRepeatingChar(input);

            if (result != null) {
                System.out.println("First non-repeating character: " + result);
            } else {
                System.out.println("No non-repeating character found.");
            }
        }
    }

