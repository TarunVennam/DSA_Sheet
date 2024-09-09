package TwoPointers_SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String str = "takeUforward";
        System.out.println("The length of the longest substring without repeating" +
                " characters is "+ lengthOfLongestSubstring_Twopointer(str));
    }
    static int lengthOfLongestSubstring(String s) {
        // Brute force
        int n = s.length();
        if(n==0){
            return 0;
        }
        int maxlen = 0;
        for(int i = 0;i<n;i++){
            Set<Character> se = new HashSet<>();
            for(int j =i;j<n;j++){
                if(se.contains(s.charAt(j))){
                    maxlen = Math.max(maxlen,j-i);
                    break;
                }
                se.add(s.charAt(j));
            }
        }
        return maxlen;
    }
    static int lengthOfLongestSubstring_Twopointer(String s) {
        int n = s.length();
        HashMap<Character,Integer> se = new HashMap<>();
        int left = 0 , right =0;
        int len =0;
        while(right<n){
            if(se.containsKey(s.charAt(right))){
                left = Math.max(se.get(s.charAt(right))+1,left);
            }
            se.put(s.charAt(right),right);
            len = Math.max(len,right-left+1);
            right++;
        }
        return len;
    }
}
