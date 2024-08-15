package Arrays.Easy;

public class Missing_Number {
    public static void main(String[] args) {
        //leetcode 268 Problem
        int [] arr = {9,6,4,2,3,5,7,0,1};
//        int []nums ={}
        System.out.println(missingNumber(arr));
    }
    static int missing(int [] nums){
        // better solution
        int n = nums.length;
        int[] hash = new int[n+1];
        for (int i = 0; i <n ; i++) {
            hash[nums[i]]=1;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i]==0){
                return i;
            }
        }
        return -1;
    }
    static int missingNumber(int[] nums) {
        // optimal solution
        /*
        Using Sum method
        taking sum of array length and subtract with sum of arrays element
         */
        int n = nums.length;
        int sum = n*(n+1)/2;
        int s = 0;
        for(int i =0;i<n;i++){
            s +=nums[i];
        }
        return sum-s;
    }
    static int missingNumberusingXor(int[] nums) {
        // Xor Approach
        int n = nums.length;
        int xor=0;
        for(int i =1;i<=n;i++){
            xor ^= i;
        }
        for(int i=0;i<n;i++){
            xor^=nums[i];
        }
        return xor;
    }
}
