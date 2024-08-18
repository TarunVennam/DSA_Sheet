package Arrays.Medium;

public class Longest_Consecutive_Sequence {
    // leetcode 128
    public static void main(String[] args) {

    }
    static int longestConsecutive(int[] nums) {
        //Brute Force Apporach
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int largest =1;
        for(int i=0;i<n;i++){
            int x = nums[i];
            int c =1;
            while(linear(nums,x+1)==true){
                x = x+1;
                c=c+1;
            }
            largest = Math.max(largest,c);
        }
        return largest;
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
}
