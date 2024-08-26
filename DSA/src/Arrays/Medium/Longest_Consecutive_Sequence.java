package Arrays.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    // leetcode 128
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
//        int ans = longestConsecutive(a);
//        int ans = longestConsecutive_Better(a);
          int ans = longestConsecutive_Optimal(a);
        System.out.println("The longest consecutive sequence is " + ans);

    }
    static int longestConsecutive(int[] nums) {
        //Brute Force Apporach
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int longest =1;
        for(int i=0;i<n;i++){
            int x = nums[i];
            int c =1;
            while(linear(nums,x+1)==true){
                x = x+1;
                c=c+1;
            }
            longest = Math.max(longest,c);
        }
        return longest;
    }
    static boolean linear(int[] arr,int num){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
    static int longestConsecutive_Better(int[] nums) {
        // Better Apporach
        int n =nums.length;
        Arrays.sort(nums);
        if(n==0){
            return 0;
        }
        int longest =1 , count =0,lastSmall=Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(nums[i]-1==lastSmall){
                count +=1;
                lastSmall = nums[i];
            }
            else if(nums[i]!=lastSmall){
                count =1;
                lastSmall = nums[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
    static int longestConsecutive_Optimal(int[] nums) {
        // Optimal Approach
        int n =nums.length;
        int longest = 1;
        if(n==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++){
            set.add(nums[i]);
        }
        for(int it : set){
            if(!set.contains(it-1)){
                int c =1;
                int x =it;
                while(set.contains(x+1)){
                    x  = x+1;
                    c+=1;
                }
                longest = Math.max(longest,c);
            }
        }

        return longest;
    }
}
