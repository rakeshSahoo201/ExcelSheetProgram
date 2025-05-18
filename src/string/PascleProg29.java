package string;
import java.util.ArrayList;
import java.util.List;
public class PascleProg29 {




        // Feature 1: Generate the full Pascal's Triangle up to numRows
        public List<List<Integer>> generateTriangle(int numRows) {
            List<List<Integer>> triangle = new ArrayList<>();

            for (int row = 0; row < numRows; row++) {
                List<Integer> currentRow = new ArrayList<>();
                for (int col = 0; col <= row; col++) {
                    if (col == 0 || col == row) {
                        currentRow.add(1);
                    } else {
                        int val = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                        currentRow.add(val);
                    }
                }
                triangle.add(currentRow);
            }

            return triangle;
        }

        // Feature 2: Generate a specific row (0-indexed)
        public List<Integer> getRow(int rowIndex) {
            List<Integer> row = new ArrayList<>();
            long value = 1;
            row.add(1); // First element is always 1

            for (int i = 1; i <= rowIndex; i++) {
                value = value * (rowIndex - i + 1) / i;
                row.add((int) value);
            }

            return row;
        }

        // Feature 3: Compute element at row and column (0-indexed)
        public int getElement(int row, int col) {
            if (col > row) return 0;
            return (int) binomialCoefficient(row, col);
        }

        // Helper: Compute binomial coefficient C(n, k)
        private long binomialCoefficient(int n, int k) {
            long res = 1;
            for (int i = 0; i < k; i++) {
                res = res * (n - i) / (i + 1);
            }
            return res;
        }

        // Driver code
        public static void main(String[] args) {
            PascleProg29 pt = new PascleProg29();

            // 1. Print full triangle
            System.out.println("Full Pascal's Triangle (first 5 rows):");
            List<List<Integer>> triangle = pt.generateTriangle(5);
            for (List<Integer> row : triangle) {
                System.out.println(row);
            }

            // 2. Print specific row
            int rowIndex = 4;
            System.out.println("\nRow " + rowIndex + ": " + pt.getRow(rowIndex));

            // 3. Print specific element
            int row = 5, col = 2;
            System.out.println("\nElement at row " + row + ", column " + col + ": " + pt.getElement(row, col));
        }
    }

