package Arrays.Hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class array_3Sum {
    public static void main(String[] args) {

    }
    static List<List<Integer>> threeSum(int[] arr) {
        //Better Solution
        int n = arr.length;
        Set<List<Integer>> st = new HashSet<>();

        for(int i =0;i<n;i++){
            Set<Integer> hashset = new HashSet<>();
            for (int j = i+1; j <n; j++) {
                int third = -(arr[i]+arr[j]);

                if(hashset.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(arr[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}
