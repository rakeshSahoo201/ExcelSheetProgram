public class LongestCharRun {
    public static void main(String[] args) {
        String str = "aabbbbCCddd";
        int[] result = findLongestRun(str);
        System.out.println("Starting Index: " + result[0]);
        System.out.println("Length: " + result[1]);
        System.out.println("Substring: " + str.substring(result[0], result[0] + result[1]));
    }



    public static int[] findLongestRun(String str) {
        int currentLen=1;
        int currentIndex=0;
        int maxLen=1;
        int maxIndex=0;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(i-1))
                currentLen++;
            else {
                currentLen=1;
                currentIndex=i;
            }
         if(currentLen>maxLen){
             maxLen=currentLen;
             maxIndex = currentIndex;
         }

        }
return  new int[]{maxIndex,maxLen};
    }
    }
