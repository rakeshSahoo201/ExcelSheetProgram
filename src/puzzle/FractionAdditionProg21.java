package puzzle;

public class FractionAdditionProg21 {

    public static void main(String[] args) {
        // Test case 1
        int[] result1 = addFractions(1, 3, 3, 9);
        System.out.println("Numerator_ans=" + result1[0] + ", Denominator_ans=" + result1[1]);  // Output: 2/3

        // Test case 2
        int[] result2 = addFractions(1, 2, 3, 2);
        System.out.println("Numerator_ans=" + result2[0] + ", Denominator_ans=" + result2[1]);  // Output: 2/1
    }

    public static int[] addFractions(int num1, int den1, int num2, int den2) {
        // Calculate common denominator
        int commonDen = den1 * den2;
        int adjustedNum1 = num1 * den2;
        int adjustedNum2 = num2 * den1;

        // Add numerators
        int sumNum = adjustedNum1 + adjustedNum2;

        // Simplify the result
        int gcd = gcd(sumNum, commonDen);
        int simplifiedNum = sumNum / gcd;
        int simplifiedDen = commonDen / gcd;

        return new int[] { simplifiedNum, simplifiedDen };
    }

    // Helper method to compute GCD using Euclidean algorithm
    private static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}

