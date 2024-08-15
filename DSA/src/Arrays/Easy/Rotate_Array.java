package Arrays.Easy;

public class Rotate_Array {
    // leetcode 189
    public static void main(String[] args) {

    }
    public void rotate(int[] nums, int k) {
        int [] ans = rot(nums,k);
        for(int i = 0;i<ans.length;i++){
            nums[i] = ans[i];
        }

    }
    static int[] rot(int []nums,int k){
        int n = nums.length;
        k = k%n;
        int j =0;
        int[] ans = new int[n];
        for(int i = n-k;i<n;i++){
            ans[j] = nums[i];
            j++;
        }
        for(int i=0;i<n-k;i++){
            ans[j]=nums[i];
            j++;
        }
        return ans;
    }
}
