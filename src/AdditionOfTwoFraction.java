public class AdditionOfTwoFraction {
    public static void main(String[] args) {
        int[] result1 = addFraction(1, 3, 3, 9);
        System.out.println("Numerator_ans = " + result1[0] + ", Denominator_ans =" +result1[1]);

        int[] result2 = addFraction(1, 2, 3, 2);
        System.out.println("Numerator_ans = " + result2[0] + ", Denominator_ans =" + result2[1]);
    }

    private static int[] addFraction(int num1, int den1, int num2, int den2) {

        int commonDen = den1 * den2;
        int adjustedSum1 = num1 * den2;
        int adjustedSum2 = num2 * den1;

        int sumNum = adjustedSum1 + adjustedSum2;
        int gcd = gcd(sumNum, commonDen);
        int simplifiedNum = sumNum/gcd;
        int simplifiedDen=  commonDen/gcd;

        return  new int[]{simplifiedNum,simplifiedDen};
    }

    private static int gcd(int a, int b) {
        {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;

            }
            return a;
        }
    }

}






