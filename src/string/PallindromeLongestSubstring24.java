package string;

public class PallindromeLongestSubstring24 {

    static String longestPalindrome(String s)
    {
        int  n = s.length();
        if(n==0) return  " ";
        int start=0, maxlen=1;
        for(int i=0; i<n; i++){

            for(int j=0; j<=1; j++){
                int low =i;
                int high = i + j;

                while(low>0 && high<n && s.charAt(low)==s.charAt(high)){
                         int currLen= high - low +1;
                         if(currLen > maxlen){
                             start = low;
                             maxlen = currLen;
                         }
                         low--;
                         high++;
                }
            }
        }
        return s.substring(start, start + maxlen);
    }














    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(longestPalindrome(s));
    }

}
