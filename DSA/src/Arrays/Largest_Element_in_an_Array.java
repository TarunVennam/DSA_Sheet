package Arrays;

public class Largest_Element_in_an_Array {
    //https://bit.ly/3Pld280

    public static void main(String[] args) {

    }
    static int largest(int n, int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
