package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {

    }
    static int[] twoSum(int[] nums, int target) {
        // HashMAP Approach
        int n = nums.length;
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<n;i++){
            int sum = target-nums[i];
            if(numMap.containsKey(sum)){
                return new int[] {numMap.get(sum),i};
            }
            numMap.put(nums[i],i);
        }
        return null;
    }
    static int[] twoSumUsingTwo_Pointer(int[] nums, int target) {
        //Brute Froce Approach 
        int n = nums.length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(nums[j] + nums[i]==target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
