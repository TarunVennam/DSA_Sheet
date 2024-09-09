package TwoPointers_SlidingWindow;

public class longest_subarray_with_sum_k {
    public static void main(String[] args) {
        int[] arr = {2 , 5 , 1 , 10 , 10};
        System.out.println(subarraySum(arr,14));

    }
    static int subarraySum(int[] arr,int k){
        int maxlen = 0;
        int n = arr.length;
        int l=0;
        int r = 0;
        int sum = 0;
        while (r<n){
            sum = sum + arr[r];
            while (sum>k){
                sum = sum -arr[l];
                l++;
            }
            if (sum<=k){
                maxlen = Math.max(maxlen,r-l+1);
            }
            r++;

        }
        return maxlen;
    }
}
