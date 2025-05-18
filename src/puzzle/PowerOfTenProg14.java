package puzzle;

public class PowerOfTenProg14 {
        public static boolean isPowerOfTen(int n) {
            if (n <= 0) return false;

            while (n % 10 == 0) {
                n /= 10;
            }

            return n == 1;
        }

        public static void main(String[] args) {
            int num = 1000;
            System.out.println(num + " is power of 10: " + isPowerOfTen(num));
        }
    }

