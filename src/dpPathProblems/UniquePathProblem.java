package dpPathProblems;

public class UniquePathProblem {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        //first fill with 1 when we know that in first row and first column can be filled in only one
        //way that is either from the left or from top
        // Fill first row with 1 (only one way to go right)
        for (int j = 0; j < n; j++)
            dp[0][j] = 1;

        // Fill rest of the grid using the relation:
        // dp[i][j] = dp[i-1][j] + dp[i][j-1]
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // Return value in bottom-right corner
        return dp[m - 1][n - 1];
    }


    public static void main(String[] args) {
        UniquePathProblem up = new UniquePathProblem();
        int m1 = 3, n1 = 7;
        System.out.println("Unique Paths for grid " + m1 + "x" + n1 + ": " + up.uniquePaths(m1, n1));  // Output: 28
    }
}
