package array;

import java.util.HashSet;
import java.util.Set;

public class LoopChecker {

    // Function to check if there exists a loop in the array
    public static String checkLoop(int[] arr) {
     int n = arr.length;
     Set<Integer> visited = new HashSet<>();
     int curr=0;
     while(true){
         if(visited.contains(curr)){
             return  "yes";
         }
         if(arr[curr]==0 && curr == (curr + arr[curr])%n){
             return  "no";
         }
         visited.add(curr);
         curr = (curr + arr[curr])%n;

     }
    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 1, 2, 2};
        String result = checkLoop(arr); // Check for a loop in the array
        System.out.println(result);
    }
}

// This code is contributed by akshitaguprzj3






