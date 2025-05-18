package puzzle;

public class StairCaseWaysProg22 {


        public static void main(String[] args) {
            int n = 5;  // Example: number of stairs
            int ways = countWays(n);
            System.out.println("Number of ways to reach stair " + n + " is: " + ways);
        }

        public static int countWays(int n) {
            if (n == 0 || n == 1)
                return 1;

            int[] dp = new int[n + 1];
            dp[0] = 1;  // 1 way to stay at the base
            dp[1] = 1;  // 1 way to reach first stair

            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            return dp[n];
        }
    }



