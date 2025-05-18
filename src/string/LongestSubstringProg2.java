package string;

public class LongestSubstringProg2 {
    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String substringToSearch = "ODG";

        int maxLength = getLongestWordWithSubstring(dict, substringToSearch);
        System.out.println("Length of the longest word containing the substring \"" + substringToSearch + "\": " + maxLength);
    }

    public static int getLongestWordWithSubstring(String[] dict, String substring) {
        int maxLength = 0;

        for (String word : dict) {
            if (word.contains(substring)) {  // case-sensitive match
                maxLength = Math.max(maxLength, word.length());
            }
        }

        return maxLength;
    }
}


