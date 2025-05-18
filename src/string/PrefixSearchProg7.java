package string;

import java.util.*;

public class PrefixSearchProg7 {

    // Function to get all words that start with the given prefix
    public static List<String> getWordsWithPrefix(String[] arr, String prefix) {
        List<String> result = new ArrayList<>();

        for (String word : arr) {
            if (word.startsWith(prefix)) {
                result.add(word);
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";

        List<String> matches = getWordsWithPrefix(arr, prefix);
        System.out.println("Words starting with \"" + prefix + "\": " + matches);
    }
}
