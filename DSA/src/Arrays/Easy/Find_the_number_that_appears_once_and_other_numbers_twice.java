package Arrays.Easy;

public class Find_the_number_that_appears_once_and_other_numbers_twice {
    //Leetcode 136.Single Number
    public static void main(String[] args) {
        int[] arr = {1,1,3,2,3,4,4};
        System.out.println(singleNumberUsingBitwiseLeetcode(arr));
        System.out.println(singleNumber(arr));

    }
    static int singleNumber(int[] nums) {
        //Brute Force Approach
        int n = nums.length;
        for(int i=0;i<n;i++){
            int arr = nums[i];
            int count =0;
            for(int j =0;j<n;j++){
                if(nums[j]==arr){
                    count++;
                }
            }
            if(count==1){
                return arr;
            }
        }
        return 0;
    }
    static int singleNumberUsingBitwiseLeetcode(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // Bitwise XOR operation
        }
        return result;
    }
}
