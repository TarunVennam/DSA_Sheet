package Arrays;

public class Remove_Duplicates_from_Sorted_Array {
    // leetcode 26
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        // int count =0;
        // int n = nums.length;
        // for(int i =0;i<n;i++){
        //     if(i<n-1 && nums[i]==nums[i+1]){
        //         continue;
        //     }
        //     else{
        //         nums[count]= nums[i];
        //         count++;
        //     }
        // }
        // return count;
        int i =0;
        // Two pointer Approach
        int n = nums.length;
        for(int j=0;j<n;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
}
