package TwoPointers_SlidingWindow;

public class Max_Consecutive_Ones_III {
    // leetcode 1004
    public static void main(String[] args) {
        int [] arr = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(arr,2));

    }
     static int longestOnes(int[] nums, int k) {
        // brute force approach
        int n = nums.length;
        int maxlen = 0;

        for(int i =0;i<n;i++){
            int zeros = 0;
            for(int j =i;j<n;j++){
                if(nums[j]==0){
                    zeros++;
                }
                else if(zeros<=k){
                    int len = j-i+1;
                    maxlen = Math.max(maxlen,len);
                }
                else{
                    break;
                }
            }
        }
        return maxlen;
    }
    static int longestOnes_TwoPointer(int[] nums, int k) {
        // Sliding Window approach
        int n = nums.length;
        int maxlen = 0 , l = 0, r = 0 , zeros = 0;

        while(r<n){
            if(nums[r]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[l]==0){
                    zeros--;
                }
                l++;
            }
            if(zeros<=k){
                int len = r-l+1;
                maxlen = Math.max(maxlen,len);
            }
            r++;
        }
        return maxlen;
    }
    static int longestOnes_Optimal(int[] nums, int k) {
        // Sliding Window approach
        int n = nums.length;
        int maxlen = 0 , l = 0, r = 0 , zeros = 0;

        while(r<n){
            if(nums[r]==0){
                zeros++;
            }
            if(zeros>k){
                if(nums[l]==0){
                    zeros--;
                }
                l++;
            }
            if(zeros<=k){
                int len = r-l+1;
                maxlen = Math.max(maxlen,len);
            }
            r++;
        }
        return maxlen;
    }
}
