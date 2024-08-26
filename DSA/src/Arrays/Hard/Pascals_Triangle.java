package Arrays.Hard;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalsTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }
    static List<List<Integer>> pascalsTriangle(int numRows) {
        List<List<Integer>> lst = new ArrayList<>();
        int n = numRows;
        // if(numRows==1){
        //     return 1;
        // }
        for(int row = 1 ;row<=n;row++){
            List<Integer> templst = new ArrayList<>();
            for(int col = 1;col<=row;col++){
                templst.add(ncr(row-1,col-1));
            }
            lst.add(templst);
        }
        return lst;
    }
    static int ncr(int n,int col){
        long res = 1;
        for(int i =0;i<col;i++){
            res = res * (n-i);
            res = res / (i+1);
        }
        return (int) res;
    }
}
