package Arrays.Medium;

import java.util.Arrays;

public class Sort_an_array_of_0s_1s_and_2s {
    // leetcode 75
    public static void main(String[] args) {
//        int [] arr = {0,1,1,0,2,2,0,2};
        int [] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));

    }
     static void sortColors(int[] nums) {
        // Using Three variables
        int c0 =0;
        int c1 =0 , c2 =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                c0++;
            } else if (nums[i]==1) {
                c1++;
            }
            else {
                c2++;
            }
        }
        for (int i = 0; i <c0; i++) {
            nums[i]=0;
        }
        for (int i = c0; i <c0+c1 ; i++) {
            nums[i]=1;
        }
        for (int i = c0+c1; i < nums.length ; i++) {
            nums[i]=2;
        }

    }
}
