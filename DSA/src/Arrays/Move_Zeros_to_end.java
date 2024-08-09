package Arrays;

import java.util.Arrays;

public class Move_Zeros_to_end {
    public static void main(String[] args) {
        int [] arr ={0,2,3,5,0,0,1};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void moveZeroes(int[] nums) {
        // brutte force Approach
        int n = nums.length;
        int [] temp = new int[n];
        int z=0;
        int k =0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }
            else{
                temp[k] = nums[i];
                k++;
            }
        }
        for(int i=0;i<z;i++){
            temp[k]= 0;
            k++;
        }
        for(int i=0;i<temp.length;i++){
            nums[i]=temp[i];
        }
    }
}
