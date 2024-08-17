package Arrays.Medium;

public class Kadanes_Algorithm_maximum_subarray_sum {
    public static void main(String[] args) {

    }
    static int maxSubArray(int[] arr) {
        int n = arr.length;
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int it : arr){
            sum +=it;
            max = Math.max(sum,max);
            if(sum<0) sum =0;
        }
        return max;
    }
}
