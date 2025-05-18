package string;

public class MinDistanceBetweenWordsProg9 {


        public static int findMinDistance(String sentence, String word1, String word2) {
            String[] words = sentence.split("\\s+");  // Split sentence by whitespace
            int minDistance = Integer.MAX_VALUE;
            int lastPosWord1 = -1;
            int lastPosWord2 = -1;

            for (int i = 0; i < words.length; i++) {
                String current = words[i];

                if (current.equals(word1)) {
                    lastPosWord1 = i;
                    if (lastPosWord2 != -1) {
                        minDistance = Math.min(minDistance, Math.abs(lastPosWord1 - lastPosWord2));
                    }
                }

                if (current.equals(word2)) {
                    lastPosWord2 = i;
                    if (lastPosWord1 != -1) {
                        minDistance = Math.min(minDistance, Math.abs(lastPosWord1 - lastPosWord2));
                    }
                }
            }

            return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
        }

        public static void main(String[] args) {
            String sentence = "the quick brown fox jumps over the lazy dog";
            String word1 = "quick";
            String word2 = "dog";

            int distance = findMinDistance(sentence, word1, word2);
            if (distance != -1) {
                System.out.println("Minimum distance between '" + word1 + "' and '" + word2 + "' is " + distance);
            } else {
                System.out.println("One or both words not found.");
            }
        }
    }


