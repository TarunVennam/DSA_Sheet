package Arrays.Medium;

import java.util.ArrayList;

public class Leader_in_a_Array {
    public static void main(String[] args) {
        int n = 6;
        int arr[]=  {10, 22, 12, 3, 0, 6};


        ArrayList<Integer> ans= leaders(n,arr);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }

    }
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Brute Force Approach 
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean leader = true;
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    leader = false;
                    break;
                }
            }
            if (leader) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
