package puzzle;

public class Program26 {


        public static int electPresident(int n, int k) {
            int result = 0; // Josephus position in 0-based indexing
            for (int i = 2; i <= n; i++) {
                result = (result + k) % i;
            }
            return result + 1; // Convert to 1-based index
        }

        public static void main(String[] args) {
            int n = 4; // Number of students
            int k = 2; // Song length
            int president = electPresident(n, k);
            System.out.println("The elected class president is student #" + president);
        }
    }
