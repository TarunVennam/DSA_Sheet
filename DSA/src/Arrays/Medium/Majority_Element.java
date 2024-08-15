package Arrays.Medium;

public class Majority_Element {
    public static void main(String[] args) {
        int [] arr = {2,2,1,1,1};
        System.out.println(majorityElement(arr));

    }
    public static int majorityElement(int[] nums) {
        // Brute Force Apporach
        int n = nums.length;
        int mid = n/2;
        for(int i =0;i<n;i++){
            int c=0;
            for(int j =0;j<n;j++){
                if(nums[j]==nums[i]){
                    c++;
                }
            }
            if(c>mid){
                return nums[i];
            }
        }
        return -1;
    }
}
