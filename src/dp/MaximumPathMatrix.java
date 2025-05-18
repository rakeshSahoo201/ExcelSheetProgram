//package dp;
//
//import java.util.Arrays;
//
//public class MaximumPathMatrix {
//
//    private static int maximumPath(int[][] mat) {
//        int n = mat.length, m = mat[0].length;
//
//        int res = Arrays.stream(mat[0]).max().getAsInt();
//
//        for(int i=1; i<n; i++){
//            for(int j=0; j<m; j++){
//                //get max value from the previous row positions
//                int up = mat[i-1][j];
//                int left = (j>0)? mat[i-1][j-1]:0;
//                int right = (j<m-1)? mat[i-1][j+1]:0;
//            }
//        }
//    }
//
//
//
//
//
//
//    public static void main(String[] args) {
//
//        // Input matrix
//        int[][] mat = {
//                {10, 10,  2,  0, 20,  4},
//                { 1,  0,  0, 30,  2,  5},
//                { 0, 10,  4,  0,  2,  0},
//                { 1,  0,  2, 20,  0,  4}
//        };
//
//        // Output the maximum path sum
//        System.out.println(maximumPath(mat));
//    }
//
//
//
//}
