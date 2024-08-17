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

    static int majorityElement2(int[] nums) {
        /*
         Optimal Apporach
         Using Moore's Voting Algoff
         */
        int n = nums.length;
        int count =0;
        int el =0;
        for(int i=0;i<n;i++){
            if(count==0){
                count = 1;
                el = nums[i];
            }
            else if(nums[i]==el){
                count++;
            }
            else{
                count--;
            }
        }
        int c1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el){
                c1++;
            }
        }
        if(c1>n/2){
            return el;
        }
        return -1;
    }
}
