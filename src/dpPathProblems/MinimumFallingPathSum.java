package dpPathProblems;


    public class MinimumFallingPathSum {
        public int minFallingPathSum(int[][] matrix) {
            int n = matrix.length;

            // Start from second last row and go upwards
            for (int i = n - 2; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    int down = matrix[i + 1][j];
                    int leftDiagonal = (j > 0) ? matrix[i + 1][j - 1] : Integer.MAX_VALUE;
                    int rightDiagonal = (j < n - 1) ? matrix[i + 1][j + 1] : Integer.MAX_VALUE;

                    matrix[i][j] += Math.min(down, Math.min(leftDiagonal, rightDiagonal));
                }
            }

            // Find the min in the first row (top row)
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                min = Math.min(min, matrix[0][j]);
            }

            return min;
        }

        // Example usage
        public static void main(String[] args) {
            MinimumFallingPathSum solver = new MinimumFallingPathSum();
            int[][] matrix = {
                    {2, 1, 3},
                    {6, 5, 4},
                    {7, 8, 9}
            };
            int result = solver.minFallingPathSum(matrix);
            System.out.println("Minimum Falling Path Sum: " + result);
        }
    }

