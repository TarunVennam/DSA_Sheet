package Arrays.Medium;

import java.util.ArrayList;

public class Rearrange_Array_Elements_by_Sign {
    //leetcode 2149
    public static void main(String[] args) {

    }
    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg =new ArrayList<>();
        for(int i =0;i<n;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }
            else{
                pos.add(nums[i]);
            }
        }
        for(int i =0;i<n/2;i++){
            nums[2*i] = pos.get(i);
            nums[2*i+1] = neg.get(i);

        }
        return nums;
    }
    public static int[] alternateNumbers(int []arr) {
        // optimal Apporach
        int n = arr.length;
        int[] ans = new int[n];
        int pos =0,neg = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                ans[neg] =arr[i];
                neg+=2;
            }
            else{
                ans[pos] = arr[i];
                pos+=2;
            }
        }
        return ans;
    }
}
